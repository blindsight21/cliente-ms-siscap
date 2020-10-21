/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipoobjetivo.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoObjetivoBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface TipoObjetivoCall {

    @POST("/tipoobjetivo/crearTipoObjetivo")
    Call<ResponseData<Object>> crearTipoObjetivo(@Body TipoObjetivoBean tipoObjetivoBean);

    @POST("/tipoobjetivo/editarTipoObjetivo")
    Call<ResponseData<Object>> editarTipoObjetivo(@Body TipoObjetivoBean tipoObjetivoBean);

    @GET("/tipoobjetivo/obtenerTipoObjetivoPorId/{nidTipoObjetivo}")
    Call<ResponseData<String>> obtenerTipoObjetivoPorId(@Path("nidTipoObjetivo") BigDecimal nidTipoObjetivo);

    @POST("/tipoobjetivo/loadTipoObjetivoList")
    Call<ResponseData<List<TipoObjetivoBean>>> loadTipoObjetivoList(@Body FindByParamBean findByParamBean);

    @POST("/tipoobjetivo/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/tipoobjetivo/find/{id}")
    Call<ResponseData<TipoObjetivoBean>> find(@Path("id") BigDecimal id);

}
