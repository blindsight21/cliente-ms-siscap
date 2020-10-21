/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.gobierno.cliente;

import pe.gob.mimp.siscap.ws.tipogobierno.cliente.*;
import pe.gob.mimp.siscap.ws.tipoobjetivo.cliente.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.GobiernoBean;
import pe.gob.mimp.converter.GobiernoCast;
import pe.gob.mimp.siscap.modelo.Gobierno;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class GobiernoCallServiceImpl implements GobiernoCallService {

    private GobiernoCall gobiernoCall = GobiernoServiceGenerator.createService(GobiernoCall.class);

    @Override
    public void crearGobierno(Gobierno gobierno) {

        GobiernoBean gobiernoBean = GobiernoCast.castGobiernoToGobiernoBean(gobierno);

        Call<ResponseData<Object>> callSync = gobiernoCall.crearGobierno(gobiernoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarGobierno(Gobierno gobierno) {

        GobiernoBean gobiernoBean = GobiernoCast.castGobiernoToGobiernoBean(gobierno);

        Call<ResponseData<Object>> callSync = gobiernoCall.editarGobierno(gobiernoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerGobiernoPorId(BigDecimal nidGobierno) {

        Call<ResponseData<String>> callSync = gobiernoCall.obtenerGobiernoPorId(nidGobierno);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<Gobierno> loadGobiernoList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<GobiernoBean>>> callSync = gobiernoCall.loadGobiernoList(findByParamBean);

        try {
            Response<ResponseData<List<GobiernoBean>>> response = callSync.execute();

            List<GobiernoBean> loadGobiernoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadGobiernoBeanList)) {
                return null;
            }

            return loadGobiernoBeanList.stream().map(gobiernoBean -> {
                return GobiernoCast.castGobiernoBeanToGobierno(gobiernoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = gobiernoCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Gobierno find(BigDecimal id) {

        Call<ResponseData<GobiernoBean>> callSync = gobiernoCall.find(id);

        try {
            Response<ResponseData<GobiernoBean>> response = callSync.execute();
            GobiernoBean gobiernoBean = response.body().getResultado();

            return GobiernoCast.castGobiernoBeanToGobierno(gobiernoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
