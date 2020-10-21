/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.perfilusuario.cliente;

import java.util.List;
import pe.gob.mimp.bean.UsuarioModuloBean;
import pe.gob.mimp.seguridad.modelo.PerfilUsuario;

/**
 *
 * @author Omar
 */
public interface PerfilUsuarioCallService {

    void crearPerfilUsuario(PerfilUsuario perfilUsuarioNuevo);

    List<PerfilUsuario> obtenerPerfilUsuarioPorModulo(UsuarioModuloBean usuarioModuloBean);

    void remove(PerfilUsuario perfilUsuarioEliminado);
}
