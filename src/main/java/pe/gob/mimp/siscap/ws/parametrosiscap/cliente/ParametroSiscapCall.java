/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.parametrosiscap.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ParametroSiscapBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface ParametroSiscapCall {

    @POST("/parametrosiscap/crearParametroSiscap")
    Call<ResponseData<Object>> crearParametroSiscap(@Body ParametroSiscapBean tipoObjetivoBean);

    @POST("/parametrosiscap/editarParametroSiscap")
    Call<ResponseData<Object>> editarParametroSiscap(@Body ParametroSiscapBean tipoObjetivoBean);

    @GET("/parametrosiscap/obtenerParametroSiscapPorId/{nidParametroSiscap}")
    Call<ResponseData<String>> obtenerParametroSiscapPorId(@Path("nidParametroSiscap") BigDecimal nidParametroSiscap);

    @POST("/parametrosiscap/findAllByField")
    Call<ResponseData<List<ParametroSiscapBean>>> findAllByField(@Body FindAllByFieldBean findAllByFieldBean);

    @GET("/parametrosiscap/find/{id}")
    Call<ResponseData<ParametroSiscapBean>> find(@Path("id") BigDecimal id);

}
