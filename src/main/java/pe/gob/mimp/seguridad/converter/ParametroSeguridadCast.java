/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.ParametroSeguridadBean;
import pe.gob.mimp.seguridad.modelo.ParametroSeguridad;

/**
 *
 * @author Omar
 */
public class ParametroSeguridadCast {

    public static ParametroSeguridadBean castParametroSeguridadToParametroSeguridadBean(ParametroSeguridad parametroSeguridad) {

        if (parametroSeguridad == null) {
            return null;
        }

        ParametroSeguridadBean parametroSeguridadBean = new ParametroSeguridadBean();

        parametroSeguridadBean.setNidParametro(parametroSeguridad.getNidParametro());
        parametroSeguridadBean.setCidParametro(parametroSeguridad.getCidParametro());
        parametroSeguridadBean.setNidParametroPadre(parametroSeguridad.getNidParametroPadre());
        parametroSeguridadBean.setTxtValor(parametroSeguridad.getTxtValor());
        parametroSeguridadBean.setNumValor1(parametroSeguridad.getNumValor1());
        parametroSeguridadBean.setNumValor2(parametroSeguridad.getNumValor2());

        parametroSeguridadBean.setFlgActivo(parametroSeguridad.getFlgActivo());
        parametroSeguridadBean.setNidUsuario(parametroSeguridad.getNidUsuario());
        parametroSeguridadBean.setTxtPc(parametroSeguridad.getTxtPc());
        parametroSeguridadBean.setTxtIp(parametroSeguridad.getTxtIp());
        parametroSeguridadBean.setFecEdicion(parametroSeguridad.getFecEdicion());

        return parametroSeguridadBean;
    }

    public static ParametroSeguridad castParametroSeguridadBeanToParametroSeguridad(ParametroSeguridadBean parametroSeguridadBean) {

        if (parametroSeguridadBean == null) {
            return null;
        }

        ParametroSeguridad parametroSeguridad = new ParametroSeguridad();

        parametroSeguridad.setNidParametro(parametroSeguridadBean.getNidParametro());
        parametroSeguridad.setCidParametro(parametroSeguridadBean.getCidParametro());
        parametroSeguridad.setNidParametroPadre(parametroSeguridadBean.getNidParametroPadre());
        parametroSeguridad.setTxtValor(parametroSeguridadBean.getTxtValor());
        parametroSeguridad.setNumValor1(parametroSeguridadBean.getNumValor1());
        parametroSeguridad.setNumValor2(parametroSeguridadBean.getNumValor2());

        parametroSeguridad.setFlgActivo(parametroSeguridadBean.getFlgActivo());
        parametroSeguridad.setNidUsuario(parametroSeguridadBean.getNidUsuario());
        parametroSeguridad.setTxtPc(parametroSeguridadBean.getTxtPc());
        parametroSeguridad.setTxtIp(parametroSeguridadBean.getTxtIp());
        parametroSeguridad.setFecEdicion(parametroSeguridadBean.getFecEdicion());

        return parametroSeguridad;
    }
}
