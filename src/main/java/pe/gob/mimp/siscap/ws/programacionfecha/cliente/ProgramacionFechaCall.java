/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.programacionfecha.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ProgramacionFechaBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface ProgramacionFechaCall {

    @POST("/programacionfecha/crearProgramacionFecha")
    Call<ResponseData<Object>> crearProgramacionFecha(@Body ProgramacionFechaBean programacionFechaBean);

    @POST("/programacionfecha/editarProgramacionFecha")
    Call<ResponseData<Object>> editarProgramacionFecha(@Body ProgramacionFechaBean programacionFechaBean);

//    @GET("/programacionfecha/obtenerProgramacionFechaPorId/{nidProgramacionFecha}")
//    Call<ResponseData<String>> obtenerProgramacionFechaPorId(@Path("nidProgramacionFecha") BigDecimal nidProgramacionFecha);

    @POST("/programacionfecha/loadProgramacionFechaList")
    Call<ResponseData<List<ProgramacionFechaBean>>> loadProgramacionFechaList(@Body FindByParamBean findByParamBean);

    @POST("/programacionfecha/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/programacionfecha/find/{id}")
    Call<ResponseData<ProgramacionFechaBean>> find(@Path("id") BigDecimal id);

}
