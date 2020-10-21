/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.PerfilUsuarioBean;
import pe.gob.mimp.seguridad.modelo.PerfilUsuario;

/**
 *
 * @author Omar
 */
public class PerfilUsuarioCast {

    public static PerfilUsuarioBean castPerfilUsuarioToPerfilUsuarioBean(PerfilUsuario perfilUsuario) {

        if (perfilUsuario == null) {
            return null;
        }

        PerfilUsuarioBean perfilUsuarioBean = new PerfilUsuarioBean();

        perfilUsuarioBean.setPerfilUsuarioPKBean(null);
        perfilUsuarioBean.setNidUsuario2(perfilUsuario.getNidUsuario2());
        perfilUsuarioBean.setTxtPc(perfilUsuario.getTxtPc());
        perfilUsuarioBean.setTxtIp(perfilUsuario.getTxtIp());
        perfilUsuarioBean.setFecModificacion(perfilUsuario.getFecModificacion());
        perfilUsuarioBean.setFlgActivo(perfilUsuario.getFlgActivo());
        perfilUsuarioBean.setPerfilBean(PerfilCast.castPerfilToPerfilBean(perfilUsuario.getPerfil()));
        perfilUsuarioBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(perfilUsuario.getUsuario()));

        return perfilUsuarioBean;
    }

    public static PerfilUsuario castPerfilUsuarioBeanToPerfilUsuario(PerfilUsuarioBean perfilUsuarioBean) {

        if (perfilUsuarioBean == null) {
            return null;
        }

        PerfilUsuario perfilUsuario = new PerfilUsuario();

        perfilUsuario.setPerfilUsuarioPK(null);
        perfilUsuario.setNidUsuario2(perfilUsuarioBean.getNidUsuario2());
        perfilUsuario.setTxtPc(perfilUsuarioBean.getTxtPc());
        perfilUsuario.setTxtIp(perfilUsuarioBean.getTxtIp());
        perfilUsuario.setFecModificacion(perfilUsuarioBean.getFecModificacion());
        perfilUsuario.setFlgActivo(perfilUsuarioBean.getFlgActivo());
        perfilUsuario.setPerfil(PerfilCast.castPerfilBeanToPerfil(perfilUsuarioBean.getPerfilBean()));
        perfilUsuario.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(perfilUsuarioBean.getUsuarioBean()));

        return perfilUsuario;
    }
}
