/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.SistemaBean;
import pe.gob.mimp.seguridad.modelo.Sistema;

/**
 *
 * @author Omar
 */
public class SistemaCast {

    public static SistemaBean castSistemaToSistemaBean(Sistema sistema) {

        if (sistema == null) {
            return null;
        }

        SistemaBean sistemaBean = new SistemaBean();

        sistemaBean.setNidSistema(sistema.getNidSistema());
        sistemaBean.setTxtNombreTecnico(sistema.getTxtNombreTecnico());
        sistemaBean.setTxtNombre(sistema.getTxtNombre());
        sistemaBean.setTxtAlias(sistema.getTxtAlias());
        sistemaBean.setFlgEstado(sistema.getFlgEstado());
        sistemaBean.setFlgActivo(sistema.getFlgActivo());
        sistemaBean.setTxtPc(sistema.getTxtPc());
        sistemaBean.setTxtIp(sistema.getTxtIp());
        sistemaBean.setFecEdicion(sistema.getFecEdicion());
        sistemaBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(sistema.getUsuario()));

        return sistemaBean;
    }

    public static Sistema castSistemaBeanToSistema(SistemaBean sistemaBean) {

        if (sistemaBean == null) {
            return null;
        }

        Sistema sistema = new Sistema();

        sistema.setNidSistema(sistemaBean.getNidSistema());
        sistema.setTxtNombreTecnico(sistemaBean.getTxtNombreTecnico());
        sistema.setTxtNombre(sistemaBean.getTxtNombre());
        sistema.setTxtAlias(sistemaBean.getTxtAlias());
        sistema.setFlgEstado(sistemaBean.getFlgEstado());
        sistema.setFlgActivo(sistemaBean.getFlgActivo());
        sistema.setTxtPc(sistemaBean.getTxtPc());
        sistema.setTxtIp(sistemaBean.getTxtIp());
        sistema.setFecEdicion(sistemaBean.getFecEdicion());
        sistema.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(sistemaBean.getUsuarioBean()));

        return sistema;
    }
}
