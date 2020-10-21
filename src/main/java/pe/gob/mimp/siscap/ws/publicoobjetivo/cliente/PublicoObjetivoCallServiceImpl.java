/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.publicoobjetivo.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.PublicoObjetivoBean;
import pe.gob.mimp.converter.PublicoObjetivoCast;
import pe.gob.mimp.siscap.modelo.PublicoObjetivo;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class PublicoObjetivoCallServiceImpl implements PublicoObjetivoCallService {

    private PublicoObjetivoCall publicoObjetivoCall = PublicoObjetivoServiceGenerator.createService(PublicoObjetivoCall.class);

    @Override
    public void crearPublicoObjetivo(PublicoObjetivo publicoObjetivo) {

        PublicoObjetivoBean publicoObjetivoBean = PublicoObjetivoCast.castPublicoObjetivoToPublicoObjetivoBean(publicoObjetivo);

        Call<ResponseData<Object>> callSync = publicoObjetivoCall.crearPublicoObjetivo(publicoObjetivoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarPublicoObjetivo(PublicoObjetivo publicoObjetivo) {

        PublicoObjetivoBean publicoObjetivoBean = PublicoObjetivoCast.castPublicoObjetivoToPublicoObjetivoBean(publicoObjetivo);

        Call<ResponseData<Object>> callSync = publicoObjetivoCall.editarPublicoObjetivo(publicoObjetivoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerPublicoObjetivoPorId(BigDecimal nidPublicoObjetivo) {

        Call<ResponseData<String>> callSync = publicoObjetivoCall.obtenerPublicoObjetivoPorId(nidPublicoObjetivo);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<PublicoObjetivo> loadPublicoObjetivoList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<PublicoObjetivoBean>>> callSync = publicoObjetivoCall.loadPublicoObjetivoList(findByParamBean);

        try {
            Response<ResponseData<List<PublicoObjetivoBean>>> response = callSync.execute();

            List<PublicoObjetivoBean> loadPublicoObjetivoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadPublicoObjetivoBeanList)) {
                return null;
            }

            return loadPublicoObjetivoBeanList.stream().map(publicoObjetivoBean -> {
                return PublicoObjetivoCast.castPublicoObjetivoBeanToPublicoObjetivo(publicoObjetivoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = publicoObjetivoCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public PublicoObjetivo find(BigDecimal id) {

        Call<ResponseData<PublicoObjetivoBean>> callSync = publicoObjetivoCall.find(id);

        try {
            Response<ResponseData<PublicoObjetivoBean>> response = callSync.execute();
            PublicoObjetivoBean publicoObjetivoBean = response.body().getResultado();

            return PublicoObjetivoCast.castPublicoObjetivoBeanToPublicoObjetivo(publicoObjetivoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
