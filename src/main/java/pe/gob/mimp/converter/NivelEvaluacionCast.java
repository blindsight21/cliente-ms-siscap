/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.NivelEvaluacionBean;
import pe.gob.mimp.siscap.modelo.NivelEvaluacion;

/**
 *
 * @author Omar
 */
public class NivelEvaluacionCast {

    public static NivelEvaluacionBean castNivelEvaluacionToNivelEvaluacionBean(NivelEvaluacion nivelEvaluacion) {

        if (nivelEvaluacion == null) {
            return null;
        }

        NivelEvaluacionBean nivelEvaluacionBean = new NivelEvaluacionBean();

        nivelEvaluacionBean.setNidNivelEvaluacion(nivelEvaluacion.getNidNivelEvaluacion());
        nivelEvaluacionBean.setTxtNivelEvaluacion(nivelEvaluacion.getTxtNivelEvaluacion());
        nivelEvaluacionBean.setFlgActivo(nivelEvaluacion.getFlgActivo());
        nivelEvaluacionBean.setNidUsuario(nivelEvaluacion.getNidUsuario());
        nivelEvaluacionBean.setTxtPc(nivelEvaluacion.getTxtPc());
        nivelEvaluacionBean.setTxtIp(nivelEvaluacion.getTxtIp());
        nivelEvaluacionBean.setFecEdicion(nivelEvaluacion.getFecEdicion());
        
        nivelEvaluacionBean.setTipoEvaluacionBean(TipoEvaluacionCast.castTipoEvaluacionToTipoEvaluacionBean(nivelEvaluacion.getNidTipoEvaluacion()));

        return nivelEvaluacionBean;
    }

    public static NivelEvaluacion castNivelEvaluacionBeanToNivelEvaluacion(NivelEvaluacionBean nivelEvaluacionBean) {

        if (nivelEvaluacionBean == null) {
            return null;
        }

        NivelEvaluacion nivelEvaluacion = new NivelEvaluacion();

        nivelEvaluacion.setNidNivelEvaluacion(nivelEvaluacionBean.getNidNivelEvaluacion());
        nivelEvaluacion.setTxtNivelEvaluacion(nivelEvaluacionBean.getTxtNivelEvaluacion());
        nivelEvaluacion.setFlgActivo(nivelEvaluacionBean.getFlgActivo());
        nivelEvaluacion.setNidUsuario(nivelEvaluacionBean.getNidUsuario());
        nivelEvaluacion.setTxtPc(nivelEvaluacionBean.getTxtPc());
        nivelEvaluacion.setTxtIp(nivelEvaluacionBean.getTxtIp());
        nivelEvaluacion.setFecEdicion(nivelEvaluacionBean.getFecEdicion());
        
        nivelEvaluacion.setNidTipoEvaluacion(TipoEvaluacionCast.castTipoEvaluacionBeanToTipoEvaluacion(nivelEvaluacionBean.getTipoEvaluacionBean()));

        return nivelEvaluacion;
    }
}
