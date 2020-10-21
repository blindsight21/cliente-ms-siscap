/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.modalidadactividad.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ModalidadActividadBean;
import pe.gob.mimp.converter.ModalidadActividadCast;
import pe.gob.mimp.siscap.modelo.ModalidadActividad;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ModalidadActividadCallServiceImpl implements ModalidadActividadCallService {

    private ModalidadActividadCall modalidadActividadCall = ModalidadActividadServiceGenerator.createService(ModalidadActividadCall.class);

    @Override
    public void crearModalidadActividad(ModalidadActividad modalidadActividad) {

        ModalidadActividadBean modalidadActividadBean = ModalidadActividadCast.castModalidadActividadToModalidadActividadBean(modalidadActividad);

        Call<ResponseData<Object>> callSync = modalidadActividadCall.crearModalidadActividad(modalidadActividadBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarModalidadActividad(ModalidadActividad modalidadActividad) {

        ModalidadActividadBean modalidadActividadBean = ModalidadActividadCast.castModalidadActividadToModalidadActividadBean(modalidadActividad);

        Call<ResponseData<Object>> callSync = modalidadActividadCall.editarModalidadActividad(modalidadActividadBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerModalidadActividadPorId(BigDecimal nidModalidadActividad) {

        Call<ResponseData<String>> callSync = modalidadActividadCall.obtenerModalidadActividadPorId(nidModalidadActividad);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<ModalidadActividad> loadModalidadActividadList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<ModalidadActividadBean>>> callSync = modalidadActividadCall.loadModalidadActividadList(findByParamBean);

        try {
            Response<ResponseData<List<ModalidadActividadBean>>> response = callSync.execute();

            List<ModalidadActividadBean> loadModalidadActividadBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadModalidadActividadBeanList)) {
                return null;
            }

            return loadModalidadActividadBeanList.stream().map(modalidadActividadBean -> {
                return ModalidadActividadCast.castModalidadActividadBeanToModalidadActividad(modalidadActividadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = modalidadActividadCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public ModalidadActividad find(BigDecimal id) {

        Call<ResponseData<ModalidadActividadBean>> callSync = modalidadActividadCall.find(id);

        try {
            Response<ResponseData<ModalidadActividadBean>> response = callSync.execute();
            ModalidadActividadBean modalidadActividadBean = response.body().getResultado();

            return ModalidadActividadCast.castModalidadActividadBeanToModalidadActividad(modalidadActividadBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
