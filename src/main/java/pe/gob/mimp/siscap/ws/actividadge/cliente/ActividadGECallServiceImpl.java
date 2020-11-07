/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadge.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ActividadGobEActGobBean;
import pe.gob.mimp.converter.ActividadGobEActGobCast;
import pe.gob.mimp.siscap.modelo.ActividadGobEActGob;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ActividadGECallServiceImpl implements ActividadGECallService {

    private ActividadGECall actividadGobEActGobCall = ActividadGEServiceGenerator.createService(ActividadGECall.class);

    @Override
    public void crearActividadGE(ActividadGobEActGob actividadGobEActGob) {

        ActividadGobEActGobBean actividadGobEActGobBean = ActividadGobEActGobCast.castActividadGobEActGobToActividadGobEActGobBean(actividadGobEActGob);

        Call<ResponseData<ActividadGobEActGobBean>> callSync = actividadGobEActGobCall.crearActividadGE(actividadGobEActGobBean);

        try {
            Response<ResponseData<ActividadGobEActGobBean>> execute = callSync.execute();

            ActividadGobEActGob actividadGobEActGobNuevo = ActividadGobEActGobCast.castActividadGobEActGobBeanToActividadGobEActGob(execute.body().getResultado());
            actividadGobEActGob.setNidActividadGobEActGob(actividadGobEActGobNuevo.getNidActividadGobEActGob());
        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarActividadGE(ActividadGobEActGob actividadGobEActGob) {

        ActividadGobEActGobBean actividadGobEActGobBean = ActividadGobEActGobCast.castActividadGobEActGobToActividadGobEActGobBean(actividadGobEActGob);

        Call<ResponseData<ActividadGobEActGobBean>> callSync = actividadGobEActGobCall.editarActividadGE(actividadGobEActGobBean);

        try {
            Response<ResponseData<ActividadGobEActGobBean>> execute = callSync.execute();

            ActividadGobEActGob actividadGobEActGobNuevo = ActividadGobEActGobCast.castActividadGobEActGobBeanToActividadGobEActGob(execute.body().getResultado());
            actividadGobEActGob.setNidActividadGobEActGob(actividadGobEActGobNuevo.getNidActividadGobEActGob());
        
        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

//    @Override
//    public String obtenerActividadGobEActGobPorId(BigDecimal nidActividadGobEActGob) {
//
//        Call<ResponseData<String>> callSync = actividadGobEActGobCall.obtenerActividadGobEActGobPorId(nidActividadGobEActGob);
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
    public List<ActividadGobEActGob> loadActividadGEList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<ActividadGobEActGobBean>>> callSync = actividadGobEActGobCall.loadActividadGEList(findByParamBean);

        try {
            Response<ResponseData<List<ActividadGobEActGobBean>>> response = callSync.execute();

            List<ActividadGobEActGobBean> loadActividadGobEActGobBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadActividadGobEActGobBeanList)) {
                return null;
            }

            return loadActividadGobEActGobBeanList.stream().map(actividadGobEActGobBean -> {
                return ActividadGobEActGobCast.castActividadGobEActGobBeanToActividadGobEActGob(actividadGobEActGobBean);
            }).collect(Collectors.toList());

        } catch (Exception ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = actividadGobEActGobCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

//    @Override
//    public ActividadGobEActGob find(BigDecimal id) {
//
//        Call<ResponseData<ActividadGobEActGobBean>> callSync = actividadGobEActGobCall.find(id);
//
//        try {
//            Response<ResponseData<ActividadGobEActGobBean>> response = callSync.execute();
//            ActividadGobEActGobBean actividadGobEActGobBean = response.body().getResultado();
//
//            return ActividadGobEActGobCast.castActividadGobEActGobBeanToActividadGobEActGob(actividadGobEActGobBean);
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//
//    }
}
