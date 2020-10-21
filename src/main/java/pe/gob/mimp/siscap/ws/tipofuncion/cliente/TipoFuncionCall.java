/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipofuncion.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoFuncionBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface TipoFuncionCall {

    @POST("/tipofuncion/crearTipoFuncion")
    Call<ResponseData<Object>> crearTipoFuncion(@Body TipoFuncionBean tipoFuncionBean);

    @POST("/tipofuncion/editarTipoFuncion")
    Call<ResponseData<Object>> editarTipoFuncion(@Body TipoFuncionBean tipoFuncionBean);

    @GET("/tipofuncion/obtenerTipoFuncionPorId/{nidTipoFuncion}")
    Call<ResponseData<String>> obtenerTipoFuncionPorId(@Path("nidTipoFuncion") BigDecimal nidTipoFuncion);

    @POST("/tipofuncion/loadTipoFuncionList")
    Call<ResponseData<List<TipoFuncionBean>>> loadTipoFuncionList(@Body FindByParamBean findByParamBean);

    @POST("/tipofuncion/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/tipofuncion/find/{id}")
    Call<ResponseData<TipoFuncionBean>> find(@Path("id") BigDecimal id);

}
