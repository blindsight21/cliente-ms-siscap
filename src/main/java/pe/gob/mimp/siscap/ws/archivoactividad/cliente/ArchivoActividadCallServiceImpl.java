/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.archivoactividad.cliente;

import pe.gob.mimp.siscap.ws.actividadgob.cliente.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ArchivoActividadBean;
import pe.gob.mimp.converter.ArchivoActividadCast;
import pe.gob.mimp.siscap.modelo.ArchivoActividad;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ArchivoActividadCallServiceImpl implements ArchivoActividadCallService {

    private ArchivoActividadCall archivoActividadCall = ArchivoActividadServiceGenerator.createService(ArchivoActividadCall.class);

    @Override
    public void crearArchivoActividad(ArchivoActividad archivoActividad) {

        ArchivoActividadBean archivoActividadBean = ArchivoActividadCast.castArchivoActividadToArchivoActividadBean(archivoActividad);

        Call<ResponseData<Object>> callSync = archivoActividadCall.crearArchivoActividad(archivoActividadBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarArchivoActividad(ArchivoActividad archivoActividad) {

        ArchivoActividadBean archivoActividadBean = ArchivoActividadCast.castArchivoActividadToArchivoActividadBean(archivoActividad);

        Call<ResponseData<Object>> callSync = archivoActividadCall.editarArchivoActividad(archivoActividadBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

//    @Override
//    public String obtenerArchivoActividadPorId(BigDecimal nidArchivoActividad) {
//
//        Call<ResponseData<String>> callSync = archivoActividadCall.obtenerArchivoActividadPorId(nidArchivoActividad);
//
//        try {
//            Response<ResponseData<String>> response = callSync.execute();
//            return response.body().getResultado();
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//    }
    @Override
    public List<ArchivoActividad> loadArchivoActividadList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<ArchivoActividadBean>>> callSync = archivoActividadCall.loadArchivoActividadList(findByParamBean);

        try {
            Response<ResponseData<List<ArchivoActividadBean>>> response = callSync.execute();

            List<ArchivoActividadBean> loadArchivoActividadBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadArchivoActividadBeanList)) {
                return null;
            }

            return loadArchivoActividadBeanList.stream().map(archivoActividadBean -> {
                return ArchivoActividadCast.castArchivoActividadBeanToArchivoActividad(archivoActividadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = archivoActividadCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

//    @Override
//    public ArchivoActividad find(BigDecimal id) {
//
//        Call<ResponseData<ArchivoActividadBean>> callSync = archivoActividadCall.find(id);
//
//        try {
//            Response<ResponseData<ArchivoActividadBean>> response = callSync.execute();
//            ArchivoActividadBean archivoActividadBean = response.body().getResultado();
//
//            return ArchivoActividadCast.castArchivoActividadBeanToArchivoActividad(archivoActividadBean);
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//
//    }
}
