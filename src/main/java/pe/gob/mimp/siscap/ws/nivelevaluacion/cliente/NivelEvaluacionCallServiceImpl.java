/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.nivelevaluacion.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.NivelEvaluacionBean;
import pe.gob.mimp.converter.NivelEvaluacionCast;
import pe.gob.mimp.siscap.modelo.NivelEvaluacion;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class NivelEvaluacionCallServiceImpl implements NivelEvaluacionCallService {

    private NivelEvaluacionCall nivelEvaluacionCall = NivelEvaluacionServiceGenerator.createService(NivelEvaluacionCall.class);

//    @Override
//    public void crearNivelEvaluacion(NivelEvaluacion nivelEvaluacion) {
//
//        NivelEvaluacionBean nivelEvaluacionBean = NivelEvaluacionCast.castNivelEvaluacionToNivelEvaluacionBean(nivelEvaluacion);
//
//        Call<ResponseData<Object>> callSync = nivelEvaluacionCall.crearNivelEvaluacion(nivelEvaluacionBean);
//
//        try {
//            callSync.execute();
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//        }
//    }
//    @Override
//    public void editarNivelEvaluacion(NivelEvaluacion nivelEvaluacion) {
//
//        NivelEvaluacionBean nivelEvaluacionBean = NivelEvaluacionCast.castNivelEvaluacionToNivelEvaluacionBean(nivelEvaluacion);
//
//        Call<ResponseData<Object>> callSync = nivelEvaluacionCall.editarNivelEvaluacion(nivelEvaluacionBean);
//
//        try {
//            callSync.execute();
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//        }
//    }
//    @Override
//    public String obtenerNivelEvaluacionPorId(BigDecimal nidNivelEvaluacion) {
//
//        Call<ResponseData<String>> callSync = nivelEvaluacionCall.obtenerNivelEvaluacionPorId(nidNivelEvaluacion);
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
    public List<NivelEvaluacion> loadNivelEvaluacionList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<NivelEvaluacionBean>>> callSync = nivelEvaluacionCall.loadNivelEvaluacionList(findByParamBean);

        try {
            Response<ResponseData<List<NivelEvaluacionBean>>> response = callSync.execute();

            List<NivelEvaluacionBean> loadNivelEvaluacionBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadNivelEvaluacionBeanList)) {
                return null;
            }

            return loadNivelEvaluacionBeanList.stream().map(nivelEvaluacionBean -> {
                return NivelEvaluacionCast.castNivelEvaluacionBeanToNivelEvaluacion(nivelEvaluacionBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

//    @Override
//    public Integer getRecordCount(FindByParamBean findByParamBean) {
//        Call<ResponseData<Integer>> callSync = nivelEvaluacionCall.getRecordCount(findByParamBean);
//
//        try {
//            Response<ResponseData<Integer>> response = callSync.execute();
//            return response.body().getResultado();
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//    }
    @Override
    public NivelEvaluacion find(BigDecimal id) {

        Call<ResponseData<NivelEvaluacionBean>> callSync = nivelEvaluacionCall.find(id);

        try {
            Response<ResponseData<NivelEvaluacionBean>> response = callSync.execute();
            NivelEvaluacionBean nivelEvaluacionBean = response.body().getResultado();

            return NivelEvaluacionCast.castNivelEvaluacionBeanToNivelEvaluacion(nivelEvaluacionBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
