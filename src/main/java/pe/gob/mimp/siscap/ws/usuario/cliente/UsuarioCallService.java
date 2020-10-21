/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.usuario.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.UsuarioModuloBean;
import pe.gob.mimp.bean.ValidarBean;
import pe.gob.mimp.seguridad.modelo.Funcionalidad;
import pe.gob.mimp.seguridad.modelo.Modulo;
import pe.gob.mimp.seguridad.modelo.Usuario;

/**
 *
 * @author Omar
 */
public interface UsuarioCallService {

    void crearUsuario(Usuario usuarioNuevo);

    void editarUsuario(Usuario usuarioEditado);
    
    List<Usuario> findAll();

    Usuario find(BigDecimal id);

    List<Usuario> findAllByField(FindAllByFieldBean findAllByFieldBean);

    List<Usuario> getEntidadesModulo(Modulo modulo);

    List<Usuario> validar(ValidarBean validarBean);

    List<Funcionalidad> obtenerFuncionalidades(UsuarioModuloBean usuarioModuloBean);

    List<Usuario> getEntidadesModuloTodos(Modulo modulo);

}
