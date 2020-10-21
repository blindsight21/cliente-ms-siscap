/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.perfil.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.UsuarioModuloBean;
import pe.gob.mimp.seguridad.bean.entidades.ModuloBean;
import pe.gob.mimp.seguridad.bean.entidades.PerfilBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface PerfilCall {

    @POST("/seguridad/perfil/obtenerPerfiles")
    Call<ResponseData<List<PerfilBean>>> obtenerPerfiles(@Body UsuarioModuloBean usuarioModuloBean);
    
    @POST("/seguridad/perfil/obtenerPerfilesDelModulo")
    Call<ResponseData<List<PerfilBean>>> obtenerPerfilesDelModulo(@Body ModuloBean modulo);
    
    @GET("/seguridad/perfil/findAll")
    Call<ResponseData<List<PerfilBean>>> findAll();
    
    @GET("/seguridad/perfil/find/{id}")
    Call<ResponseData<PerfilBean>> find(@Path("id") BigDecimal id);

}
