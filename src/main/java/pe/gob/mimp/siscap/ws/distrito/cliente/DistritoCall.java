/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.distrito.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.DistritoBean;
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
public interface DistritoCall {

    @POST("/general/distrito/obtenerDistritos")
    Call<ResponseData<List<DistritoBean>>> obtenerDistritos(ProvinciaBean provinciaBean);
    
    @GET("/general/distrito/obtenerActivos")
    Call<ResponseData<List<DistritoBean>>> obtenerActivos();

    @GET("/general/distrito/find/{id}")
    Call<ResponseData<DistritoBean>> find(@Path("id") BigDecimal id);
    
    @POST("/general/distrito/findAllByField")
    Call<ResponseData<List<DistritoBean>>> findAllByField(@Body FindAllByFieldBean findAllByFieldBean);

}
