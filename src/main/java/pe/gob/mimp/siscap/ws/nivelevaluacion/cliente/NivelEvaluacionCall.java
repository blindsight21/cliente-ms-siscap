/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.nivelevaluacion.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.NivelEvaluacionBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface NivelEvaluacionCall {

//    @POST("/nivelevaluacion/crearNivelEvaluacion")
//    Call<ResponseData<Object>> crearNivelEvaluacion(@Body NivelEvaluacionBean archivoActividadBean);
//
//    @POST("/nivelevaluacion/editarNivelEvaluacion")
//    Call<ResponseData<Object>> editarNivelEvaluacion(@Body NivelEvaluacionBean archivoActividadBean);
    @POST("/nivelevaluacion/loadNivelEvaluacionList")
    Call<ResponseData<List<NivelEvaluacionBean>>> loadNivelEvaluacionList(@Body FindByParamBean findByParamBean);

//    @POST("/nivelevaluacion/getRecordCount")
//    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);
    @GET("/nivelevaluacion/find/{id}")
    Call<ResponseData<NivelEvaluacionBean>> find(@Path("id") BigDecimal id);

}
