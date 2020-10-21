/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.funciontransferida.cliente;

import pe.gob.mimp.siscap.ws.funciontransferida.cliente.*;
import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.FuncionTransferidaBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface FuncionTransferidaCall {

    @POST("/funciontransferida/crearFuncionTransferida")
    Call<ResponseData<Object>> crearFuncionTransferida(@Body FuncionTransferidaBean funcionTransferidaBean);

    @POST("/funciontransferida/editarFuncionTransferida")
    Call<ResponseData<Object>> editarFuncionTransferida(@Body FuncionTransferidaBean funcionTransferidaBean);

    @GET("/funciontransferida/obtenerFuncionTransferidaPorId/{nidFuncionTransferida}")
    Call<ResponseData<String>> obtenerFuncionTransferidaPorId(@Path("nidFuncionTransferida") BigDecimal nidFuncionTransferida);

    @POST("/funciontransferida/loadFuncionTransferidaList")
    Call<ResponseData<List<FuncionTransferidaBean>>> loadFuncionTransferidaList(@Body FindByParamBean findByParamBean);

    @POST("/funciontransferida/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/funciontransferida/find/{id}")
    Call<ResponseData<FuncionTransferidaBean>> find(@Path("id") BigDecimal id);

}
