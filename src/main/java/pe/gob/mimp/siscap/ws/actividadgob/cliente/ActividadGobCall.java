/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgob.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ActividadGobBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface ActividadGobCall {

    @POST("/actividadgob/crearActividadGob")
    Call<ResponseData<Object>> crearActividadGob(@Body ActividadGobBean actividadGobBean);

    @POST("/actividadgob/editarActividadGob")
    Call<ResponseData<Object>> editarActividadGob(@Body ActividadGobBean actividadGobBean);

    @POST("/actividadgob/loadActividadGobList")
    Call<ResponseData<List<ActividadGobBean>>> loadActividadGobList(@Body FindByParamBean findByParamBean);

    @POST("/actividadgob/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);
    
    @GET("/actividadgob/find/{id}")
    Call<ResponseData<ActividadGobBean>> find(@Path("id") BigDecimal id);

}
