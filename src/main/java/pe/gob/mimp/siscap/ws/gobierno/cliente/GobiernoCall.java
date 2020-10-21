/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.gobierno.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.GobiernoBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface GobiernoCall {

    @POST("/gobierno/crearGobierno")
    Call<ResponseData<Object>> crearGobierno(@Body GobiernoBean gobiernoBean);

    @POST("/gobierno/editarGobierno")
    Call<ResponseData<Object>> editarGobierno(@Body GobiernoBean gobiernoBean);

    @GET("/gobierno/obtenerGobiernoPorId/{nidGobierno}")
    Call<ResponseData<String>> obtenerGobiernoPorId(@Path("nidGobierno") BigDecimal nidGobierno);

    @POST("/gobierno/loadGobiernoList")
    Call<ResponseData<List<GobiernoBean>>> loadGobiernoList(@Body FindByParamBean findByParamBean);

    @POST("/gobierno/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/gobierno/find/{id}")
    Call<ResponseData<GobiernoBean>> find(@Path("id") BigDecimal id);

}
