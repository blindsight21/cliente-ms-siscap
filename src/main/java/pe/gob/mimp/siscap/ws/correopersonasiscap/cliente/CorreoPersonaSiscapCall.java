/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.correopersonasiscap.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.CorreoPersonaSiscapBean;
import pe.gob.mimp.bean.PersonaSiscapBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface CorreoPersonaSiscapCall {

    @POST("/correopersonasiscap/crearCorreoPersonaSiscap")
    Call<ResponseData<Object>> crearCorreoPersonaSiscap(@Body CorreoPersonaSiscapBean correoPersonaSiscapBean);

    @POST("/correopersonasiscap/editarCorreoPersonaSiscap")
    Call<ResponseData<Object>> editarCorreoPersonaSiscap(@Body CorreoPersonaSiscapBean coreoPersonaSiscapBean);

    @POST("/correopersonasiscap/obtenerCorreos")
    Call<ResponseData<List<CorreoPersonaSiscapBean>>> obtenerCorreos(@Body PersonaSiscapBean personaSiscapBean);

    @GET("/correopersonasiscap/find/{id}")
    Call<ResponseData<CorreoPersonaSiscapBean>> find(@Path("id") BigDecimal id);

}
