/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgpp.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ActividadGobPubliProcBean;
import pe.gob.mimp.converter.ActividadGobPubliProcCast;
import pe.gob.mimp.siscap.modelo.ActividadGobPubliProc;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ActividadGPPCallServiceImpl implements ActividadGPPCallService {

    private ActividadGPPCall actividadGobPubliProcCall = ActividadGPPServiceGenerator.createService(ActividadGPPCall.class);

    @Override
    public void crearActividadGPP(ActividadGobPubliProc actividadGobPubliProcGob) {

        ActividadGobPubliProcBean actividadGobPubliProcGobBean = ActividadGobPubliProcCast.castActividadGobPubliProcToActividadGobPubliProcBean(actividadGobPubliProcGob);

        Call<ResponseData<Object>> callSync = actividadGobPubliProcCall.crearActividadGPP(actividadGobPubliProcGobBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarActividadGPP(ActividadGobPubliProc actividadGobPubliProcGob) {

        ActividadGobPubliProcBean actividadGobPubliProcGobBean = ActividadGobPubliProcCast.castActividadGobPubliProcToActividadGobPubliProcBean(actividadGobPubliProcGob);

        Call<ResponseData<Object>> callSync = actividadGobPubliProcCall.editarActividadGPP(actividadGobPubliProcGobBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

//    @Override
//    public String obtenerActividadGobPubliProcPorId(BigDecimal nidActividadGobPubliProc) {
//
//        Call<ResponseData<String>> callSync = actividadGobPubliProcGobCall.obtenerActividadGobPubliProcPorId(nidActividadGobPubliProc);
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
    public List<ActividadGobPubliProc> loadActividadGPPList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<ActividadGobPubliProcBean>>> callSync = actividadGobPubliProcCall.loadActividadGPPList(findByParamBean);

        try {
            Response<ResponseData<List<ActividadGobPubliProcBean>>> response = callSync.execute();

            List<ActividadGobPubliProcBean> loadActividadGobPubliProcBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadActividadGobPubliProcBeanList)) {
                return null;
            }

            return loadActividadGobPubliProcBeanList.stream().map(actividadGobPubliProcGobBean -> {
                return ActividadGobPubliProcCast.castActividadGobPubliProcBeanToActividadGobPubliProc(actividadGobPubliProcGobBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = actividadGobPubliProcCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

//    @Override
//    public ActividadGobPubliProc find(BigDecimal id) {
//
//        Call<ResponseData<ActividadGobPubliProcBean>> callSync = actividadGobPubliProcGobCall.find(id);
//
//        try {
//            Response<ResponseData<ActividadGobPubliProcBean>> response = callSync.execute();
//            ActividadGobPubliProcBean actividadGobPubliProcGobBean = response.body().getResultado();
//
//            return ActividadGobPubliProcCast.castActividadGobPubliProcBeanToActividadGobPubliProc(actividadGobPubliProcGobBean);
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//
//    }
}
