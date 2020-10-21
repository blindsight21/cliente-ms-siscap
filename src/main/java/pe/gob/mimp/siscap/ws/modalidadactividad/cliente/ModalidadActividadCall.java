/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.modalidadactividad.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ModalidadActividadBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface ModalidadActividadCall {

    @POST("/modalidadactividad/crearModalidadActividad")
    Call<ResponseData<Object>> crearModalidadActividad(@Body ModalidadActividadBean modalidadActividadBean);

    @POST("/modalidadactividad/editarModalidadActividad")
    Call<ResponseData<Object>> editarModalidadActividad(@Body ModalidadActividadBean modalidadActividadBean);

    @GET("/modalidadactividad/obtenerModalidadActividadPorId/{nidModalidadActividad}")
    Call<ResponseData<String>> obtenerModalidadActividadPorId(@Path("nidModalidadActividad") BigDecimal nidModalidadActividad);

    @POST("/modalidadactividad/loadModalidadActividadList")
    Call<ResponseData<List<ModalidadActividadBean>>> loadModalidadActividadList(@Body FindByParamBean findByParamBean);

    @POST("/modalidadactividad/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/modalidadactividad/find/{id}")
    Call<ResponseData<ModalidadActividadBean>> find(@Path("id") BigDecimal id);

}
