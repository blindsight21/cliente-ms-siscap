/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.perfilusuario.cliente;

import java.util.List;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.UsuarioModuloBean;
import pe.gob.mimp.seguridad.bean.entidades.PerfilUsuarioBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface PerfilUsuarioCall {

    @POST("/seguridad/perfilusuario/crearPerfilUsuario")
    Call<ResponseData<Object>> crearPerfilUsuario(@Body PerfilUsuarioBean perfilUsuarioNuevo);

    @POST("/seguridad/perfilusuario/obtenerPerfilUsuarioPorModulo")
    Call<ResponseData<List<PerfilUsuarioBean>>> obtenerPerfilUsuarioPorModulo(@Body UsuarioModuloBean usuarioModuloBean);

    @POST("/seguridad/perfilusuario/remove")
    Call<ResponseData<Object>> remove(@Body PerfilUsuarioBean perfilUsuarioEliminado);

}
