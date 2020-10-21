/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipomodalidad.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoModalidadBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface TipoModalidadCall {

    @POST("/tipomodalidad/crearTipoModalidad")
    Call<ResponseData<Object>> crearTipoModalidad(@Body TipoModalidadBean tipoModalidadBean);

    @POST("/tipomodalidad/editarTipoModalidad")
    Call<ResponseData<Object>> editarTipoModalidad(@Body TipoModalidadBean tipoModalidadBean);

    @GET("/tipomodalidad/obtenerTipoModalidadPorId/{nidTipoModalidad}")
    Call<ResponseData<String>> obtenerTipoModalidadPorId(@Path("nidTipoModalidad") BigDecimal nidTipoModalidad);

    @POST("/tipomodalidad/loadTipoModalidadList")
    Call<ResponseData<List<TipoModalidadBean>>> loadTipoModalidadList(@Body FindByParamBean findByParamBean);

    @POST("/tipomodalidad/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/tipomodalidad/find/{id}")
    Call<ResponseData<TipoModalidadBean>> find(@Path("id") BigDecimal id);

}
