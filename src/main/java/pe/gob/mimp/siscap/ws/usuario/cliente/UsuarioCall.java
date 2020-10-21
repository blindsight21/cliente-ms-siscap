/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.usuario.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.UsuarioModuloBean;
import pe.gob.mimp.bean.ValidarBean;
import pe.gob.mimp.seguridad.bean.entidades.FuncionalidadBean;
import pe.gob.mimp.seguridad.bean.entidades.ModuloBean;
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
public interface UsuarioCall {

    @POST("/seguridad/usuario/crearUsuario")
    Call<ResponseData<Object>> crearUsuario(@Body UsuarioBean usuarioBeanNuevo);

    @POST("/seguridad/usuario/editarUsuario")
    Call<ResponseData<Object>> editarUsuario(@Body UsuarioBean usuarioBeanEditado);

    @GET("/seguridad/usuario/findAll")
    Call<ResponseData<List<UsuarioBean>>> findAll();

    @GET("/seguridad/usuario/find/{id}")
    Call<ResponseData<UsuarioBean>> find(@Path("id") BigDecimal id);

    @POST("/seguridad/usuario/findAllByField")
    Call<ResponseData<List<UsuarioBean>>> findAllByField(@Body FindAllByFieldBean findAllByFieldBean);

    @POST("/seguridad/usuario/getEntidadesModulo")
    Call<ResponseData<List<UsuarioBean>>> getEntidadesModulo(@Body ModuloBean moduloBean);

    @POST("/seguridad/usuario/validar")
    Call<ResponseData<List<UsuarioBean>>> validar(@Body ValidarBean validarBean);

    @POST("/seguridad/usuario/obtenerFuncionalidades")
    Call<ResponseData<List<FuncionalidadBean>>> obtenerFuncionalidades(@Body UsuarioModuloBean usuarioModuloBean);

    @POST("/seguridad/usuario/getEntidadesModuloTodos")
    Call<ResponseData<List<UsuarioBean>>> getEntidadesModuloTodos(@Body ModuloBean moduloBean);

}
