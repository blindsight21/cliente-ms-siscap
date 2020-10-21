/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.estadoactividadgob.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.EstadoActividadGobBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface EstadoActividadGobCall {

    @POST("/estadoactividadgob/crearEstadoActividadGob")
    Call<ResponseData<Object>> crearEstadoActividadGob(@Body EstadoActividadGobBean estadoActividadGobBean);

    @POST("/estadoactividadgob/editarEstadoActividadGob")
    Call<ResponseData<Object>> editarEstadoActividadGob(@Body EstadoActividadGobBean estadoActividadGobBean);

    @GET("/estadoactividadgob/obtenerEstadoActividadGobPorId/{nidEstadoActividadGob}")
    Call<ResponseData<String>> obtenerEstadoActividadGobPorId(@Path("nidEstadoActividadGob") BigDecimal nidEstadoActividadGob);

    @POST("/estadoactividadgob/loadEstadoActividadGobList")
    Call<ResponseData<List<EstadoActividadGobBean>>> loadEstadoActividadGobList(@Body FindByParamBean findByParamBean);

    @POST("/estadoactividadgob/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/estadoactividadgob/find/{id}")
    Call<ResponseData<EstadoActividadGobBean>> find(@Path("id") BigDecimal id);

}
