/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.publicoobjetivo.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.PublicoObjetivoBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface PublicoObjetivoCall {

    @POST("/publicoobjetivo/crearPublicoObjetivo")
    Call<ResponseData<Object>> crearPublicoObjetivo(@Body PublicoObjetivoBean publicoObjetivoBean);

    @POST("/publicoobjetivo/editarPublicoObjetivo")
    Call<ResponseData<Object>> editarPublicoObjetivo(@Body PublicoObjetivoBean publicoObjetivoBean);

    @GET("/publicoobjetivo/obtenerPublicoObjetivoPorId/{nidPublicoObjetivo}")
    Call<ResponseData<String>> obtenerPublicoObjetivoPorId(@Path("nidPublicoObjetivo") BigDecimal nidPublicoObjetivo);

    @POST("/publicoobjetivo/loadPublicoObjetivoList")
    Call<ResponseData<List<PublicoObjetivoBean>>> loadPublicoObjetivoList(@Body FindByParamBean findByParamBean);

    @POST("/publicoobjetivo/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/publicoobjetivo/find/{id}")
    Call<ResponseData<PublicoObjetivoBean>> find(@Path("id") BigDecimal id);

}
