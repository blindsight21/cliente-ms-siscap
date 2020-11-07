/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgpo.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ActividadGobPubliObjeBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface ActividadGPOCall {

    @POST("/actividadgpo/crearActividadGPO")
    Call<ResponseData<ActividadGobPubliObjeBean>> crearActividadGPO(@Body ActividadGobPubliObjeBean actividadGobPubliObjeBean);

    @POST("/actividadgpo/editarActividadGPO")
    Call<ResponseData<ActividadGobPubliObjeBean>> editarActividadGPO(@Body ActividadGobPubliObjeBean actividadGobPubliObjeBean);

//    @GET("/actividadgpo/obtenerActividadGPOPorId/{nidActividadGPO}")
//    Call<ResponseData<String>> obtenerActividadGPOPorId(@Path("nidActividadGPO") BigDecimal nidActividadGPO);

    @POST("/actividadgpo/loadActividadGPOList")
    Call<ResponseData<List<ActividadGobPubliObjeBean>>> loadActividadGPOList(@Body FindByParamBean findByParamBean);

    @POST("/actividadgpo/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

//    @GET("/actividadgpo/find/{id}")
//    Call<ResponseData<ActividadGPOBean>> find(@Path("id") BigDecimal id);

}
