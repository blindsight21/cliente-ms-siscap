/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.provincia.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.DepartamentoBean;
import pe.gob.mimp.general.bean.entidades.ProvinciaBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface ProvinciaCall {

    @POST("/general/provincia/obtenerProvincias")
    Call<ResponseData<List<ProvinciaBean>>> obtenerProvincias(@Body DepartamentoBean departamentoBean);
    
    @GET("/general/provincia/obtenerActivos")
    Call<ResponseData<List<ProvinciaBean>>> obtenerActivos();

    @GET("/general/provincia/find/{id}")
    Call<ResponseData<ProvinciaBean>> find(@Path("id") BigDecimal id);
    
    @POST("/general/provincia/findAllByField")
    Call<ResponseData<List<ProvinciaBean>>> findAllByField(@Body FindAllByFieldBean findAllByFieldBean);

}
