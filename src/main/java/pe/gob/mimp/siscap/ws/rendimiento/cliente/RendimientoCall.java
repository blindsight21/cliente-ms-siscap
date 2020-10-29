/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.rendimiento.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.RendimientoBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface RendimientoCall {

    @POST("/rendimiento/crearRendimiento")
    Call<ResponseData<Object>> crearRendimiento(@Body RendimientoBean rendimientoBean);
    
    @POST("/rendimiento/editarRendimiento")
    Call<ResponseData<Object>> editarRendimiento(@Body RendimientoBean rendimientoBean);

    @POST("/rendimiento/loadRendimientoList")
    Call<ResponseData<List<RendimientoBean>>> loadRendimientoList(@Body FindByParamBean findByParamBean);

    @GET("/rendimiento/find/{id}")
    Call<ResponseData<RendimientoBean>> find(@Path("id") BigDecimal id);

}
