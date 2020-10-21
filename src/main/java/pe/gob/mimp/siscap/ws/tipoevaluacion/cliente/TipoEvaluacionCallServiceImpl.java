/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipoevaluacion.cliente;

import pe.gob.mimp.siscap.ws.tipoobjetivo.cliente.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoEvaluacionBean;
import pe.gob.mimp.converter.TipoEvaluacionCast;
import pe.gob.mimp.siscap.modelo.TipoEvaluacion;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class TipoEvaluacionCallServiceImpl implements TipoEvaluacionCallService {

    private TipoEvaluacionCall tipoEvaluacionCall = TipoEvaluacionServiceGenerator.createService(TipoEvaluacionCall.class);

    @Override
    public void crearTipoEvaluacion(TipoEvaluacion tipoEvaluacion) {

        TipoEvaluacionBean tipoEvaluacionBean = TipoEvaluacionCast.castTipoEvaluacionToTipoEvaluacionBean(tipoEvaluacion);

        Call<ResponseData<Object>> callSync = tipoEvaluacionCall.crearTipoEvaluacion(tipoEvaluacionBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarTipoEvaluacion(TipoEvaluacion tipoEvaluacion) {

        TipoEvaluacionBean tipoEvaluacionBean = TipoEvaluacionCast.castTipoEvaluacionToTipoEvaluacionBean(tipoEvaluacion);

        Call<ResponseData<Object>> callSync = tipoEvaluacionCall.editarTipoEvaluacion(tipoEvaluacionBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerTipoEvaluacionPorId(BigDecimal nidTipoEvaluacion) {

        Call<ResponseData<String>> callSync = tipoEvaluacionCall.obtenerTipoEvaluacionPorId(nidTipoEvaluacion);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<TipoEvaluacion> loadTipoEvaluacionList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<TipoEvaluacionBean>>> callSync = tipoEvaluacionCall.loadTipoEvaluacionList(findByParamBean);

        try {
            Response<ResponseData<List<TipoEvaluacionBean>>> response = callSync.execute();

            List<TipoEvaluacionBean> loadTipoEvaluacionBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadTipoEvaluacionBeanList)) {
                return null;
            }

            return loadTipoEvaluacionBeanList.stream().map(tipoEvaluacionBean -> {
                return TipoEvaluacionCast.castTipoEvaluacionBeanToTipoEvaluacion(tipoEvaluacionBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = tipoEvaluacionCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public TipoEvaluacion find(BigDecimal id) {

        Call<ResponseData<TipoEvaluacionBean>> callSync = tipoEvaluacionCall.find(id);

        try {
            Response<ResponseData<TipoEvaluacionBean>> response = callSync.execute();
            TipoEvaluacionBean tipoEvaluacionBean = response.body().getResultado();

            return TipoEvaluacionCast.castTipoEvaluacionBeanToTipoEvaluacion(tipoEvaluacionBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
