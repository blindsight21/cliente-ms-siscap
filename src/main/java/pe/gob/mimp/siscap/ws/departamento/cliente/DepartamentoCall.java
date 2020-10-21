/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.departamento.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.DepartamentoBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface DepartamentoCall {

    @GET("/general/departamento/obtenerDepartamentos")
    Call<ResponseData<List<DepartamentoBean>>> obtenerDepartamentos();
    
    @GET("/general/departamento/obtenerActivos")
    Call<ResponseData<List<DepartamentoBean>>> obtenerActivos();

    @GET("/general/departamento/find/{id}")
    Call<ResponseData<DepartamentoBean>> find(@Path("id") BigDecimal id);
    
    @POST("/general/departamento/findAllByField")
    Call<ResponseData<List<DepartamentoBean>>> findAllByField(@Body FindAllByFieldBean findAllByFieldBean);

}
