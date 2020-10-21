/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.EstadoUsuarioBean;
import pe.gob.mimp.seguridad.modelo.EstadoUsuario;

/**
 *
 * @author Omar
 */
public class EstadoUsuarioCast {

    public static EstadoUsuarioBean castEstadoUsuarioToEstadoUsuarioBean(EstadoUsuario estadoUsuario) {

        if (estadoUsuario == null) {
            return null;
        }

        EstadoUsuarioBean estadoUsuarioBean = new EstadoUsuarioBean();

        estadoUsuarioBean.setNidEstadoUsuario(estadoUsuario.getNidEstadoUsuario());
        estadoUsuarioBean.setTxtEstadoUsuario(estadoUsuario.getTxtEstadoUsuario());
        estadoUsuarioBean.setFlgActivo(estadoUsuario.getFlgActivo());
        estadoUsuarioBean.setTxtPc(estadoUsuario.getTxtPc());
        estadoUsuarioBean.setTxtIp(estadoUsuario.getTxtIp());
        estadoUsuarioBean.setFecEdicion(estadoUsuario.getFecEdicion());

        return estadoUsuarioBean;
    }

    public static EstadoUsuario castEstadoUsuarioBeanToEstadoUsuario(EstadoUsuarioBean estadoUsuarioBean) {

        if (estadoUsuarioBean == null) {
            return null;
        }

        EstadoUsuario estadoUsuario = new EstadoUsuario();

        estadoUsuario.setNidEstadoUsuario(estadoUsuarioBean.getNidEstadoUsuario());
        estadoUsuario.setTxtEstadoUsuario(estadoUsuarioBean.getTxtEstadoUsuario());
        estadoUsuario.setFlgActivo(estadoUsuarioBean.getFlgActivo());
        estadoUsuario.setTxtPc(estadoUsuarioBean.getTxtPc());
        estadoUsuario.setTxtIp(estadoUsuarioBean.getTxtIp());
        estadoUsuario.setFecEdicion(estadoUsuarioBean.getFecEdicion());

        return estadoUsuario;
    }
}
