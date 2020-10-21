/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.PerfilBean;
import pe.gob.mimp.seguridad.modelo.Perfil;

/**
 *
 * @author Omar
 */
public class PerfilCast {

    public static PerfilBean castPerfilToPerfilBean(Perfil perfil) {

        if (perfil == null) {
            return null;
        }

        PerfilBean perfilBean = new PerfilBean();

        perfilBean.setNidPerfil(perfil.getNidPerfil());
        perfilBean.setTxtPerfil(perfil.getTxtPerfil());
        perfilBean.setFlgActivo(perfil.getFlgActivo());
        perfilBean.setTxtPc(perfil.getTxtPc());
        perfilBean.setTxtIp(perfil.getTxtIp());
        perfilBean.setFecEdicion(perfil.getFecEdicion());
        perfilBean.setModuloBean(ModuloCast.castModuloToModuloBean(perfil.getModulo()));
        perfilBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(perfil.getUsuario()));

        return perfilBean;
    }

    public static Perfil castPerfilBeanToPerfil(PerfilBean perfilBean) {

        if (perfilBean == null) {
            return null;
        }

        Perfil perfil = new Perfil();

        perfil.setNidPerfil(perfilBean.getNidPerfil());
        perfil.setTxtPerfil(perfilBean.getTxtPerfil());
        perfil.setFlgActivo(perfilBean.getFlgActivo());
        perfil.setTxtPc(perfilBean.getTxtPc());
        perfil.setTxtIp(perfilBean.getTxtIp());
        perfil.setFecEdicion(perfilBean.getFecEdicion());
        perfil.setModulo(ModuloCast.castModuloBeanToModulo(perfilBean.getModuloBean()));
        perfil.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(perfilBean.getUsuarioBean()));

        return perfil;
    }
}
