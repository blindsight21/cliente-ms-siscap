/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.FuncionalidadBean;
import pe.gob.mimp.seguridad.modelo.Funcionalidad;


/**
 *
 * @author Omar
 */
public class FuncionalidadCast {

    public static FuncionalidadBean castFuncionalidadToFuncionalidadBean(Funcionalidad funcionalidad) {

        if (funcionalidad == null) {
            return null;
        }

        FuncionalidadBean funcionalidadBean = new FuncionalidadBean();

        funcionalidadBean.setNidFuncionalidad(funcionalidad.getNidFuncionalidad());
        funcionalidadBean.setNidFuncionalidadPadre(funcionalidad.getNidFuncionalidadPadre());
        funcionalidadBean.setTxtTitulo(funcionalidad.getTxtTitulo());
        funcionalidadBean.setTxtFuncionalidad(funcionalidad.getTxtFuncionalidad());
        funcionalidadBean.setTxtReferencia(funcionalidad.getTxtReferencia());
        funcionalidadBean.setTxtTarget(funcionalidad.getTxtTarget());
        funcionalidadBean.setTxtCss(funcionalidad.getTxtCss());
        funcionalidadBean.setTxtImagen(funcionalidad.getTxtImagen());
        funcionalidadBean.setNumOrden(funcionalidad.getNumOrden());
        funcionalidadBean.setFlgEstado(funcionalidad.getFlgEstado());
        funcionalidadBean.setFlgActivo(funcionalidad.getFlgActivo());
        funcionalidadBean.setTxtPc(funcionalidad.getTxtPc());
        funcionalidadBean.setTxtIp(funcionalidad.getTxtIp());
        funcionalidadBean.setFecEdicion(funcionalidad.getFecEdicion());
        funcionalidadBean.setModuloBean(ModuloCast.castModuloToModuloBean(funcionalidad.getModulo()));
        funcionalidadBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(funcionalidad.getUsuario()));

        return funcionalidadBean;
    }

    public static Funcionalidad castFuncionalidadBeanToFuncionalidad(FuncionalidadBean funcionalidadBean) {

        if (funcionalidadBean == null) {
            return null;
        }

        Funcionalidad funcionalidad = new Funcionalidad();

        funcionalidad.setNidFuncionalidad(funcionalidadBean.getNidFuncionalidad());
        funcionalidad.setNidFuncionalidadPadre(funcionalidadBean.getNidFuncionalidadPadre());
        funcionalidad.setTxtTitulo(funcionalidadBean.getTxtTitulo());
        funcionalidad.setTxtFuncionalidad(funcionalidadBean.getTxtFuncionalidad());
        funcionalidad.setTxtReferencia(funcionalidadBean.getTxtReferencia());
        funcionalidad.setTxtTarget(funcionalidadBean.getTxtTarget());
        funcionalidad.setTxtCss(funcionalidadBean.getTxtCss());
        funcionalidad.setTxtImagen(funcionalidadBean.getTxtImagen());
        funcionalidad.setNumOrden(funcionalidadBean.getNumOrden());
        funcionalidad.setFlgEstado(funcionalidadBean.getFlgEstado());
        funcionalidad.setFlgActivo(funcionalidadBean.getFlgActivo());
        funcionalidad.setTxtPc(funcionalidadBean.getTxtPc());
        funcionalidad.setTxtIp(funcionalidadBean.getTxtIp());
        funcionalidad.setFecEdicion(funcionalidadBean.getFecEdicion());
        funcionalidad.setModulo(ModuloCast.castModuloBeanToModulo(funcionalidadBean.getModuloBean()));
        funcionalidad.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(funcionalidadBean.getUsuarioBean()));

        return funcionalidad;
    }
}
