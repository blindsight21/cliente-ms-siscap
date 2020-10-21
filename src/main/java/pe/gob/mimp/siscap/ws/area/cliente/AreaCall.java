/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.area.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.AreaBean;
import pe.gob.mimp.seguridad.bean.entidades.UsuarioBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface AreaCall {
    
    @GET("/seguridad/area/findAll")
    Call<ResponseData<List<AreaBean>>> findAll();
    
    @GET("/seguridad/area/find/{id}")
    Call<ResponseData<AreaBean>> find(@Path("id") BigDecimal id);

    @POST("/seguridad/area/findAllByField")
    Call<ResponseData<List<AreaBean>>> findAllByField(@Body FindAllByFieldBean findAllByFieldBean);

}
