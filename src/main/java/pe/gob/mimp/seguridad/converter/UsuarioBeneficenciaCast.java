/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.UsuarioBeneficenciaBean;
import pe.gob.mimp.seguridad.modelo.UsuarioBeneficencia;

/**
 *
 * @author Omar
 */
public class UsuarioBeneficenciaCast {

    public static UsuarioBeneficenciaBean castUsuarioBeneficenciaToUsuarioBeneficenciaBean(UsuarioBeneficencia usuarioBeneficencia) {

        if (usuarioBeneficencia == null) {
            return null;
        }

        UsuarioBeneficenciaBean usuarioBeneficenciaBean = new UsuarioBeneficenciaBean();

        usuarioBeneficenciaBean.setUsuarioBeneficenciaId(usuarioBeneficencia.getUsuarioBeneficenciaId());
        usuarioBeneficenciaBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(usuarioBeneficencia.getUsuario()));
        usuarioBeneficenciaBean.setBeneficenciaId(usuarioBeneficencia.getBeneficenciaId());
        usuarioBeneficenciaBean.setActivo(usuarioBeneficencia.getActivo());
        usuarioBeneficenciaBean.setUsuarioRegistroId(usuarioBeneficencia.getUsuarioRegistroId());
        usuarioBeneficenciaBean.setFechaRegistro(usuarioBeneficencia.getFechaRegistro());
        usuarioBeneficenciaBean.setUsuarioEdicionId(usuarioBeneficencia.getUsuarioEdicionId());
        usuarioBeneficenciaBean.setFechaEdicion(usuarioBeneficencia.getFechaEdicion());
        usuarioBeneficenciaBean.setPc(usuarioBeneficencia.getPc());
        usuarioBeneficenciaBean.setDireccionIp(usuarioBeneficencia.getDireccionIp());
        usuarioBeneficenciaBean.setNombreSociedadBeneficencia(usuarioBeneficencia.getNombreSociedadBeneficencia());

        return usuarioBeneficenciaBean;
    }

    public static UsuarioBeneficencia castUsuarioBeneficenciaBeanToUsuarioBeneficencia(UsuarioBeneficenciaBean usuarioBeneficenciaBean) {

        if (usuarioBeneficenciaBean == null) {
            return null;
        }

        UsuarioBeneficencia usuarioBeneficencia = new UsuarioBeneficencia();

        usuarioBeneficencia.setUsuarioBeneficenciaId(usuarioBeneficenciaBean.getUsuarioBeneficenciaId());
        usuarioBeneficencia.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(usuarioBeneficenciaBean.getUsuarioBean()));
        usuarioBeneficencia.setBeneficenciaId(usuarioBeneficenciaBean.getBeneficenciaId());
        usuarioBeneficencia.setActivo(usuarioBeneficenciaBean.getActivo());
        usuarioBeneficencia.setUsuarioRegistroId(usuarioBeneficenciaBean.getUsuarioRegistroId());
        usuarioBeneficencia.setFechaRegistro(usuarioBeneficenciaBean.getFechaRegistro());
        usuarioBeneficencia.setUsuarioEdicionId(usuarioBeneficenciaBean.getUsuarioEdicionId());
        usuarioBeneficencia.setFechaEdicion(usuarioBeneficenciaBean.getFechaEdicion());
        usuarioBeneficencia.setPc(usuarioBeneficenciaBean.getPc());
        usuarioBeneficencia.setDireccionIp(usuarioBeneficenciaBean.getDireccionIp());
        usuarioBeneficencia.setNombreSociedadBeneficencia(usuarioBeneficenciaBean.getNombreSociedadBeneficencia());

        return usuarioBeneficencia;
    }
}
