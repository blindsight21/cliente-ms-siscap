/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipoobjetivo.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoObjetivoBean;
import pe.gob.mimp.converter.TipoObjetivoCast;
import pe.gob.mimp.siscap.modelo.TipoObjetivo;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class TipoObjetivoCallServiceImpl implements TipoObjetivoCallService {

    private TipoObjetivoCall tipoObjetivoCall = TipoObjetivoServiceGenerator.createService(TipoObjetivoCall.class);

    @Override
    public void crearTipoObjetivo(TipoObjetivo tipoObjetivo) {

        TipoObjetivoBean tipoObjetivoBean = TipoObjetivoCast.castTipoObjetivoToTipoObjetivoBean(tipoObjetivo);

        Call<ResponseData<Object>> callSync = tipoObjetivoCall.crearTipoObjetivo(tipoObjetivoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarTipoObjetivo(TipoObjetivo tipoObjetivo) {

        TipoObjetivoBean tipoObjetivoBean = TipoObjetivoCast.castTipoObjetivoToTipoObjetivoBean(tipoObjetivo);

        Call<ResponseData<Object>> callSync = tipoObjetivoCall.editarTipoObjetivo(tipoObjetivoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerTipoObjetivoPorId(BigDecimal nidTipoObjetivo) {

        Call<ResponseData<String>> callSync = tipoObjetivoCall.obtenerTipoObjetivoPorId(nidTipoObjetivo);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<TipoObjetivo> loadTipoObjetivoList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<TipoObjetivoBean>>> callSync = tipoObjetivoCall.loadTipoObjetivoList(findByParamBean);

        try {
            Response<ResponseData<List<TipoObjetivoBean>>> response = callSync.execute();

            List<TipoObjetivoBean> loadTipoObjetivoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadTipoObjetivoBeanList)) {
                return null;
            }

            return loadTipoObjetivoBeanList.stream().map(tipoObjetivoBean -> {
                return TipoObjetivoCast.castTipoObjetivoBeanToTipoObjetivo(tipoObjetivoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = tipoObjetivoCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public TipoObjetivo find(BigDecimal id) {

        Call<ResponseData<TipoObjetivoBean>> callSync = tipoObjetivoCall.find(id);

        try {
            Response<ResponseData<TipoObjetivoBean>> response = callSync.execute();
            TipoObjetivoBean tipoObjetivoBean = response.body().getResultado();

            return TipoObjetivoCast.castTipoObjetivoBeanToTipoObjetivo(tipoObjetivoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
