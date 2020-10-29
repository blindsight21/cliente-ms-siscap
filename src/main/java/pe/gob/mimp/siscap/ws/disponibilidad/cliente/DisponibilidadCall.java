/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.disponibilidad.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.DisponibilidadBean;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface DisponibilidadCall {

    @POST("/disponibilidad/crearDisponibilidad")
    Call<ResponseData<Object>> crearDisponibilidad(@Body DisponibilidadBean disponibilidadBean);
    
    @POST("/disponibilidad/editarDisponibilidad")
    Call<ResponseData<Object>> editarDisponibilidad(@Body DisponibilidadBean disponibilidadBean);

    @POST("/disponibilidad/loadDisponibilidadList")
    Call<ResponseData<List<DisponibilidadBean>>> loadDisponibilidadList(@Body FindByParamBean findByParamBean);

    @GET("/disponibilidad/find/{id}")
    Call<ResponseData<DisponibilidadBean>> find(@Path("id") BigDecimal id);

}
