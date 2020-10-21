/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgpo.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ActividadGobPubliObjeBean;
import pe.gob.mimp.converter.ActividadGobPubliObjeCast;
import pe.gob.mimp.siscap.modelo.ActividadGobPubliObje;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ActividadGPOCallServiceImpl implements ActividadGPOCallService {

    private ActividadGPOCall actividadGobPubliObjeGobCall = ActividadGPOServiceGenerator.createService(ActividadGPOCall.class);

    @Override
    public void crearActividadGPO(ActividadGobPubliObje actividadGobPubliObjeGob) {

        ActividadGobPubliObjeBean actividadGobPubliObjeGobBean = ActividadGobPubliObjeCast.castActividadGobPubliObjeToActividadGobPubliObjeBean(actividadGobPubliObjeGob);

        Call<ResponseData<Object>> callSync = actividadGobPubliObjeGobCall.crearActividadGPO(actividadGobPubliObjeGobBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarActividadGPO(ActividadGobPubliObje actividadGobPubliObjeGob) {

        ActividadGobPubliObjeBean actividadGobPubliObjeGobBean = ActividadGobPubliObjeCast.castActividadGobPubliObjeToActividadGobPubliObjeBean(actividadGobPubliObjeGob);

        Call<ResponseData<Object>> callSync = actividadGobPubliObjeGobCall.editarActividadGPO(actividadGobPubliObjeGobBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

//    @Override
//    public String obtenerActividadGobPubliObjePorId(BigDecimal nidActividadGobPubliObje) {
//
//        Call<ResponseData<String>> callSync = actividadGobPubliObjeGobCall.obtenerActividadGobPubliObjePorId(nidActividadGobPubliObje);
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
    public List<ActividadGobPubliObje> loadActividadGPOList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<ActividadGobPubliObjeBean>>> callSync = actividadGobPubliObjeGobCall.loadActividadGPOList(findByParamBean);

        try {
            Response<ResponseData<List<ActividadGobPubliObjeBean>>> response = callSync.execute();

            List<ActividadGobPubliObjeBean> loadActividadGobPubliObjeBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadActividadGobPubliObjeBeanList)) {
                return null;
            }

            return loadActividadGobPubliObjeBeanList.stream().map(actividadGobPubliObjeGobBean -> {
                return ActividadGobPubliObjeCast.castActividadGobPubliObjeBeanToActividadGobPubliObje(actividadGobPubliObjeGobBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = actividadGobPubliObjeGobCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

//    @Override
//    public ActividadGobPubliObje find(BigDecimal id) {
//
//        Call<ResponseData<ActividadGobPubliObjeBean>> callSync = actividadGobPubliObjeGobCall.find(id);
//
//        try {
//            Response<ResponseData<ActividadGobPubliObjeBean>> response = callSync.execute();
//            ActividadGobPubliObjeBean actividadGobPubliObjeGobBean = response.body().getResultado();
//
//            return ActividadGobPubliObjeCast.castActividadGobPubliObjeBeanToActividadGobPubliObje(actividadGobPubliObjeGobBean);
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//
//    }
}
