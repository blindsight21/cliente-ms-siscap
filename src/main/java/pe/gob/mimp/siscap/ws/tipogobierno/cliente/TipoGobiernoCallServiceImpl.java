/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipogobierno.cliente;

import pe.gob.mimp.siscap.ws.tipoobjetivo.cliente.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoGobiernoBean;
import pe.gob.mimp.converter.TipoGobiernoCast;
import pe.gob.mimp.siscap.modelo.TipoGobierno;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class TipoGobiernoCallServiceImpl implements TipoGobiernoCallService {

    private TipoGobiernoCall tipoGobiernoCall = TipoGobiernoServiceGenerator.createService(TipoGobiernoCall.class);

    @Override
    public void crearTipoGobierno(TipoGobierno tipoGobierno) {

        TipoGobiernoBean tipoGobiernoBean = TipoGobiernoCast.castTipoGobiernoToTipoGobiernoBean(tipoGobierno);

        Call<ResponseData<Object>> callSync = tipoGobiernoCall.crearTipoGobierno(tipoGobiernoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarTipoGobierno(TipoGobierno tipoGobierno) {

        TipoGobiernoBean tipoGobiernoBean = TipoGobiernoCast.castTipoGobiernoToTipoGobiernoBean(tipoGobierno);

        Call<ResponseData<Object>> callSync = tipoGobiernoCall.editarTipoGobierno(tipoGobiernoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerTipoGobiernoPorId(BigDecimal nidTipoGobierno) {

        Call<ResponseData<String>> callSync = tipoGobiernoCall.obtenerTipoGobiernoPorId(nidTipoGobierno);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<TipoGobierno> loadTipoGobiernoList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<TipoGobiernoBean>>> callSync = tipoGobiernoCall.loadTipoGobiernoList(findByParamBean);

        try {
            Response<ResponseData<List<TipoGobiernoBean>>> response = callSync.execute();

            List<TipoGobiernoBean> loadTipoGobiernoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadTipoGobiernoBeanList)) {
                return null;
            }

            return loadTipoGobiernoBeanList.stream().map(tipoGobiernoBean -> {
                return TipoGobiernoCast.castTipoGobiernoBeanToTipoGobierno(tipoGobiernoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = tipoGobiernoCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public TipoGobierno find(BigDecimal id) {

        Call<ResponseData<TipoGobiernoBean>> callSync = tipoGobiernoCall.find(id);

        try {
            Response<ResponseData<TipoGobiernoBean>> response = callSync.execute();
            TipoGobiernoBean tipoGobiernoBean = response.body().getResultado();

            return TipoGobiernoCast.castTipoGobiernoBeanToTipoGobierno(tipoGobiernoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
