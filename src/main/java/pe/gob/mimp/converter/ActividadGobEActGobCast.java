/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.ActividadGobEActGobBean;
import pe.gob.mimp.siscap.modelo.ActividadGobEActGob;


/**
 *
 * @author Omar
 */
public class ActividadGobEActGobCast {

    public static ActividadGobEActGobBean castActividadGobEActGobToActividadGobEActGobBean(ActividadGobEActGob actividadGobEActGob) {

        if (actividadGobEActGob == null) {
            return null;
        }

        ActividadGobEActGobBean actividadGobEActGobBean = new ActividadGobEActGobBean();

        actividadGobEActGobBean.setNidActividadGobEActGob(actividadGobEActGob.getNidActividadGobEActGob());
        actividadGobEActGobBean.setFecCreacion(actividadGobEActGob.getFecCreacion());
        actividadGobEActGobBean.setFlgActivo(actividadGobEActGob.getFlgActivo());
        actividadGobEActGobBean.setNidUsuario(actividadGobEActGob.getNidUsuario());
        actividadGobEActGobBean.setTxtPc(actividadGobEActGob.getTxtPc());
        actividadGobEActGobBean.setTxtIp(actividadGobEActGob.getTxtIp());
        actividadGobEActGobBean.setFecEdicion(actividadGobEActGob.getFecEdicion());
        actividadGobEActGobBean.setEstadoActividadGobBean(EstadoActividadGobCast.castEstadoActividadGobToEstadoActividadGobBean(actividadGobEActGob.getNidEstadoActividadGob()));
        actividadGobEActGobBean.setActividadGobBean(ActividadGobCast.castActividadGobToActividadGobBean(actividadGobEActGob.getNidActividadGob()));

        return actividadGobEActGobBean;
    }

    public static ActividadGobEActGob castActividadGobEActGobBeanToActividadGobEActGob(ActividadGobEActGobBean actividadGobEActBean) {

        if (actividadGobEActBean == null) {
            return null;
        }

        ActividadGobEActGob actividadGobEActGob = new ActividadGobEActGob();

        actividadGobEActGob.setNidActividadGobEActGob(actividadGobEActGob.getNidActividadGobEActGob());
        actividadGobEActGob.setFecCreacion(actividadGobEActGob.getFecCreacion());
        actividadGobEActGob.setFlgActivo(actividadGobEActGob.getFlgActivo());
        actividadGobEActGob.setNidUsuario(actividadGobEActGob.getNidUsuario());
        actividadGobEActGob.setTxtPc(actividadGobEActGob.getTxtPc());
        actividadGobEActGob.setTxtIp(actividadGobEActGob.getTxtIp());
        actividadGobEActGob.setFecEdicion(actividadGobEActGob.getFecEdicion());
        actividadGobEActGob.setNidEstadoActividadGob(EstadoActividadGobCast.castEstadoActividadGobBeanToEstadoActividadGob(actividadGobEActBean.getEstadoActividadGobBean()));
        actividadGobEActGob.setNidActividadGob(ActividadGobCast.castActividadGobBeanToActividadGob(actividadGobEActBean.getActividadGobBean()));

        return actividadGobEActGob;
    }
}
