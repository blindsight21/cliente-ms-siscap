/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipogobierno.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoGobiernoBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface TipoGobiernoCall {

    @POST("/tipogobierno/crearTipoGobierno")
    Call<ResponseData<Object>> crearTipoGobierno(@Body TipoGobiernoBean tipoGobiernoBean);

    @POST("/tipogobierno/editarTipoGobierno")
    Call<ResponseData<Object>> editarTipoGobierno(@Body TipoGobiernoBean tipoGobiernoBean);

    @GET("/tipogobierno/obtenerTipoGobiernoPorId/{nidTipoGobierno}")
    Call<ResponseData<String>> obtenerTipoGobiernoPorId(@Path("nidTipoGobierno") BigDecimal nidTipoGobierno);

    @POST("/tipogobierno/loadTipoGobiernoList")
    Call<ResponseData<List<TipoGobiernoBean>>> loadTipoGobiernoList(@Body FindByParamBean findByParamBean);

    @POST("/tipogobierno/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/tipogobierno/find/{id}")
    Call<ResponseData<TipoGobiernoBean>> find(@Path("id") BigDecimal id);

}
