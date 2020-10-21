/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.telefonopersonasiscap.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.PersonaSiscapBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TelefonoPersonaSiscapBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface TelefonoPersonaSiscapCall {

    @POST("/telefonopersonasiscap/crearTelefonoPersonaSiscap")
    Call<ResponseData<Object>> crearTelefonoPersonaSiscap(@Body TelefonoPersonaSiscapBean telefonoPersonaSiscapBean);

    @POST("/telefonopersonasiscap/editarTelefonoPersonaSiscap")
    Call<ResponseData<Object>> editarTelefonoPersonaSiscap(@Body TelefonoPersonaSiscapBean telefonoPersonaSiscapBean);

    @POST("/telefonopersonasiscap/obtenerTelefonos")
    Call<ResponseData<List<TelefonoPersonaSiscapBean>>> obtenerTelefonos(@Body PersonaSiscapBean personaSiscapBean);

    @GET("/telefonopersonasiscap/find/{id}")
    Call<ResponseData<TelefonoPersonaSiscapBean>> find(@Path("id") BigDecimal id);

}
