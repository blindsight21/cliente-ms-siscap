/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgob.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ActividadGobBean;
import pe.gob.mimp.converter.ActividadGobCast;
import pe.gob.mimp.siscap.modelo.ActividadGob;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ActividadGobCallServiceImpl implements ActividadGobCallService {

    private ActividadGobCall actividadGobCall = ActividadGobServiceGenerator.createService(ActividadGobCall.class);

    @Override
    public void crearActividadGob(ActividadGob actividadGob) {

        ActividadGobBean actividadGobBean = ActividadGobCast.castActividadGobToActividadGobBean(actividadGob);

        Call<ResponseData<ActividadGobBean>> callSync = actividadGobCall.crearActividadGob(actividadGobBean);

        try {
            Response<ResponseData<ActividadGobBean>> execute = callSync.execute();

            ActividadGob actividadGobNuevo = ActividadGobCast.castActividadGobBeanToActividadGob(execute.body().getResultado());
            actividadGob.setNidActividadGob(actividadGobNuevo.getNidActividadGob());
        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarActividadGob(ActividadGob actividadGob) {

        ActividadGobBean actividadGobBean = ActividadGobCast.castActividadGobToActividadGobBean(actividadGob);

        Call<ResponseData<ActividadGobBean>> callSync = actividadGobCall.editarActividadGob(actividadGobBean);

        try {
            Response<ResponseData<ActividadGobBean>> execute = callSync.execute();

            ActividadGob actividadGobNuevo = ActividadGobCast.castActividadGobBeanToActividadGob(execute.body().getResultado());
            actividadGob.setNidActividadGob(actividadGobNuevo.getNidActividadGob());
        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

//    @Override
//    public String obtenerActividadGobPorId(BigDecimal nidActividadGob) {
//
//        Call<ResponseData<String>> callSync = actividadGobCall.obtenerActividadGobPorId(nidActividadGob);
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
    public List<ActividadGob> loadActividadGobList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<ActividadGobBean>>> callSync = actividadGobCall.loadActividadGobList(findByParamBean);

        try {
            Response<ResponseData<List<ActividadGobBean>>> response = callSync.execute();

            List<ActividadGobBean> loadActividadGobBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadActividadGobBeanList)) {
                return null;
            }

            return loadActividadGobBeanList.stream().map(actividadGobBean -> {
                return ActividadGobCast.castActividadGobBeanToActividadGob(actividadGobBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = actividadGobCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public ActividadGob find(BigDecimal id) {

        Call<ResponseData<ActividadGobBean>> callSync = actividadGobCall.find(id);

        try {
            Response<ResponseData<ActividadGobBean>> response = callSync.execute();
            ActividadGobBean actividadGobBean = response.body().getResultado();

            return ActividadGobCast.castActividadGobBeanToActividadGob(actividadGobBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
