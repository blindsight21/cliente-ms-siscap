/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.ModuloBean;
import pe.gob.mimp.seguridad.modelo.Modulo;

/**
 *
 * @author Omar
 */
public class ModuloCast {

    public static ModuloBean castModuloToModuloBean(Modulo modulo) {

        if (modulo == null) {
            return null;
        }

        ModuloBean moduloBean = new ModuloBean();

        moduloBean.setNidModulo(modulo.getNidModulo());
        moduloBean.setTxtNombreTecnico(modulo.getTxtNombreTecnico());
        moduloBean.setTxtNombre(modulo.getTxtNombre());
        moduloBean.setTxtAlias(modulo.getTxtAlias());
        moduloBean.setFlgEstado(modulo.getFlgEstado());
        moduloBean.setFlgActivo(modulo.getFlgActivo());
        moduloBean.setTxtPc(modulo.getTxtPc());
        moduloBean.setTxtIp(modulo.getTxtIp());
        moduloBean.setFecEdicion(modulo.getFecEdicion());
        moduloBean.setSistemaBean(SistemaCast.castSistemaToSistemaBean(modulo.getSistema()));
        moduloBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(modulo.getUsuario()));

        return moduloBean;
    }

    public static Modulo castModuloBeanToModulo(ModuloBean moduloBean) {

        if (moduloBean == null) {
            return null;
        }

        Modulo modulo = new Modulo();

        modulo.setNidModulo(moduloBean.getNidModulo());
        modulo.setTxtNombreTecnico(moduloBean.getTxtNombreTecnico());
        modulo.setTxtNombre(moduloBean.getTxtNombre());
        modulo.setTxtAlias(moduloBean.getTxtAlias());
        modulo.setFlgEstado(moduloBean.getFlgEstado());
        modulo.setFlgActivo(moduloBean.getFlgActivo());
        modulo.setTxtPc(moduloBean.getTxtPc());
        modulo.setTxtIp(moduloBean.getTxtIp());
        modulo.setFecEdicion(moduloBean.getFecEdicion());
        modulo.setSistema(SistemaCast.castSistemaBeanToSistema(moduloBean.getSistemaBean()));
        modulo.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(moduloBean.getUsuarioBean()));

        return modulo;
    }
}
