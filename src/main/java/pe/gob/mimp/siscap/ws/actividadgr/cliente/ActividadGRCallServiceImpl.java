/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgr.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.ActividadGobResultadoBean;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.converter.ActividadGobResultadoCast;
import pe.gob.mimp.siscap.modelo.ActividadGobResultado;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ActividadGRCallServiceImpl implements ActividadGRCallService {

    private ActividadGRCall actividadGobResultadoCall = ActividadGRServiceGenerator.createService(ActividadGRCall.class);

    @Override
    public void crearActividadGR(ActividadGobResultado actividadGobResultado) {

        ActividadGobResultadoBean actividadGobResultadoBean = ActividadGobResultadoCast.castActividadGobResultadoToActividadGobResultadoBean(actividadGobResultado);

        Call<ResponseData<Object>> callSync = actividadGobResultadoCall.crearActividadGR(actividadGobResultadoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarActividadGR(ActividadGobResultado actividadGobResultado) {

        ActividadGobResultadoBean actividadGobResultadoBean = ActividadGobResultadoCast.castActividadGobResultadoToActividadGobResultadoBean(actividadGobResultado);

        Call<ResponseData<Object>> callSync = actividadGobResultadoCall.editarActividadGR(actividadGobResultadoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

//    @Override
//    public String obtenerActividadGobResultadoPorId(BigDecimal nidActividadGobResultado) {
//
//        Call<ResponseData<String>> callSync = actividadGobResultadoCall.obtenerActividadGobResultadoPorId(nidActividadGobResultado);
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
    public List<ActividadGobResultado> loadActividadGRList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<ActividadGobResultadoBean>>> callSync = actividadGobResultadoCall.loadActividadGRList(findByParamBean);

        try {
            Response<ResponseData<List<ActividadGobResultadoBean>>> response = callSync.execute();

            List<ActividadGobResultadoBean> loadActividadGobResultadoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadActividadGobResultadoBeanList)) {
                return null;
            }

            return loadActividadGobResultadoBeanList.stream().map(actividadGobResultadoBean -> {
                return ActividadGobResultadoCast.castActividadGobResultadoBeanToActividadGobResultado(actividadGobResultadoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = actividadGobResultadoCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

//    @Override
//    public ActividadGobResultado find(BigDecimal id) {
//
//        Call<ResponseData<ActividadGobResultadoBean>> callSync = actividadGobResultadoCall.find(id);
//
//        try {
//            Response<ResponseData<ActividadGobResultadoBean>> response = callSync.execute();
//            ActividadGobResultadoBean actividadGobResultadoBean = response.body().getResultado();
//
//            return ActividadGobResultadoCast.castActividadGobResultadoBeanToActividadGobResultado(actividadGobResultadoBean);
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//
//    }
}
