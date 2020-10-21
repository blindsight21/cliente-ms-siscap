/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.UsuarioBean;
import pe.gob.mimp.seguridad.modelo.Usuario;

/**
 *
 * @author Omar
 */
public class UsuarioCast {

    public static UsuarioBean castUsuarioToUsuarioBean(Usuario usuario) {

        if (usuario == null) {
            return null;
        }

        UsuarioBean usuarioBean = new UsuarioBean();

        usuarioBean.setNidUsuario(usuario.getNidUsuario());
        usuarioBean.setTxtUsuario(usuario.getTxtUsuario());
        usuarioBean.setTxtPassword(usuario.getTxtPassword());
        usuarioBean.setFlgActivo(usuario.getFlgActivo());
        usuarioBean.setNidUsuario2(usuario.getNidUsuario2());
        usuarioBean.setTxtPc(usuario.getTxtPc());
        usuarioBean.setTxtIp(usuario.getTxtIp());
        usuarioBean.setFecEdicion(usuario.getFecEdicion());
        usuarioBean.setNidEstadoUsuario(usuario.getNidEstadoUsuario());
        usuarioBean.setFecUltimo(usuario.getFecUltimo());
        usuarioBean.setPersonaBean(PersonaCast.castPersonaToPersonaBean(usuario.getPersona()));

        return usuarioBean;
    }

    public static Usuario castUsuarioBeanToUsuario(UsuarioBean usuarioBean) {

        if (usuarioBean == null) {
            return null;
        }

        Usuario usuario = new Usuario();

        usuario.setNidUsuario(usuarioBean.getNidUsuario());
        usuario.setTxtUsuario(usuarioBean.getTxtUsuario());
        usuario.setTxtPassword(usuarioBean.getTxtPassword());
        usuario.setFlgActivo(usuarioBean.getFlgActivo());
        usuario.setNidUsuario2(usuarioBean.getNidUsuario2());
        usuario.setTxtPc(usuarioBean.getTxtPc());
        usuario.setTxtIp(usuarioBean.getTxtIp());
        usuario.setFecEdicion(usuarioBean.getFecEdicion());
        usuario.setNidEstadoUsuario(usuarioBean.getNidEstadoUsuario());
        usuario.setFecUltimo(usuarioBean.getFecUltimo());
        usuario.setPersona(PersonaCast.castPersonaBeanToPersona(usuarioBean.getPersonaBean()));

        return usuario;
    }
}
