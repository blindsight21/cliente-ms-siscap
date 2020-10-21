/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipoevaluacion.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoEvaluacionBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface TipoEvaluacionCall {

    @POST("/tipoevaluacion/crearTipoEvaluacion")
    Call<ResponseData<Object>> crearTipoEvaluacion(@Body TipoEvaluacionBean tipoEvaluacionBean);

    @POST("/tipoevaluacion/editarTipoEvaluacion")
    Call<ResponseData<Object>> editarTipoEvaluacion(@Body TipoEvaluacionBean tipoEvaluacionBean);

    @GET("/tipoevaluacion/obtenerTipoEvaluacionPorId/{nidTipoEvaluacion}")
    Call<ResponseData<String>> obtenerTipoEvaluacionPorId(@Path("nidTipoEvaluacion") BigDecimal nidTipoEvaluacion);

    @POST("/tipoevaluacion/loadTipoEvaluacionList")
    Call<ResponseData<List<TipoEvaluacionBean>>> loadTipoEvaluacionList(@Body FindByParamBean findByParamBean);

    @POST("/tipoevaluacion/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/tipoevaluacion/find/{id}")
    Call<ResponseData<TipoEvaluacionBean>> find(@Path("id") BigDecimal id);

}
