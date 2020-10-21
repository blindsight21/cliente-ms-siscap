/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.funciontransferida.cliente;

import pe.gob.mimp.siscap.ws.tipofuncion.cliente.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.FuncionTransferidaBean;
import pe.gob.mimp.converter.FuncionTransferidaCast;
import pe.gob.mimp.siscap.modelo.FuncionTransferida;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class FuncionTransferidaCallServiceImpl implements FuncionTransferidaCallService {

    private FuncionTransferidaCall funcionTransferidaCall = FuncionTransferidaServiceGenerator.createService(FuncionTransferidaCall.class);

    @Override
    public void crearFuncionTransferida(FuncionTransferida funcionTransferida) {

        FuncionTransferidaBean funcionTransferidaBean = FuncionTransferidaCast.castFuncionTransferidaToFuncionTransferidaBean(funcionTransferida);

        Call<ResponseData<Object>> callSync = funcionTransferidaCall.crearFuncionTransferida(funcionTransferidaBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarFuncionTransferida(FuncionTransferida funcionTransferida) {

        FuncionTransferidaBean funcionTransferidaBean = FuncionTransferidaCast.castFuncionTransferidaToFuncionTransferidaBean(funcionTransferida);

        Call<ResponseData<Object>> callSync = funcionTransferidaCall.editarFuncionTransferida(funcionTransferidaBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerFuncionTransferidaPorId(BigDecimal nidFuncionTransferida) {

        Call<ResponseData<String>> callSync = funcionTransferidaCall.obtenerFuncionTransferidaPorId(nidFuncionTransferida);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<FuncionTransferida> loadFuncionTransferidaList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<FuncionTransferidaBean>>> callSync = funcionTransferidaCall.loadFuncionTransferidaList(findByParamBean);

        try {
            Response<ResponseData<List<FuncionTransferidaBean>>> response = callSync.execute();

            List<FuncionTransferidaBean> loadFuncionTransferidaBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadFuncionTransferidaBeanList)) {
                return null;
            }

            return loadFuncionTransferidaBeanList.stream().map(funcionTransferidaBean -> {
                return FuncionTransferidaCast.castFuncionTransferidaBeanToFuncionTransferida(funcionTransferidaBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = funcionTransferidaCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public FuncionTransferida find(BigDecimal id) {

        Call<ResponseData<FuncionTransferidaBean>> callSync = funcionTransferidaCall.find(id);

        try {
            Response<ResponseData<FuncionTransferidaBean>> response = callSync.execute();
            FuncionTransferidaBean funcionTransferidaBean = response.body().getResultado();

            return FuncionTransferidaCast.castFuncionTransferidaBeanToFuncionTransferida(funcionTransferidaBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
