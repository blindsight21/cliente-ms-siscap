/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadge.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ActividadGobEActGobBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface ActividadGECall {

    @POST("/actividadge/crearActividadGE")
    Call<ResponseData<ActividadGobEActGobBean>> crearActividadGE(@Body ActividadGobEActGobBean actividadGEBean);

    @POST("/actividadge/editarActividadGE")
    Call<ResponseData<ActividadGobEActGobBean>> editarActividadGE(@Body ActividadGobEActGobBean actividadGEBean);

//    @GET("/actividadge/obtenerActividadGEPorId/{nidActividadGE}")
//    Call<ResponseData<String>> obtenerActividadGEPorId(@Path("nidActividadGE") BigDecimal nidActividadGE);

    @POST("/actividadge/loadActividadGEList")
    Call<ResponseData<List<ActividadGobEActGobBean>>> loadActividadGEList(@Body FindByParamBean findByParamBean);

    @POST("/actividadge/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

//    @GET("/actividadge/find/{id}")
//    Call<ResponseData<ActividadGEBean>> find(@Path("id") BigDecimal id);

}
