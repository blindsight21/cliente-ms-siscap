/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.ActividadGobResultadoBean;
import pe.gob.mimp.siscap.modelo.ActividadGobResultado;

/**
 *
 * @author Omar
 */
public class ActividadGobResultadoCast {

    public static ActividadGobResultadoBean castActividadGobResultadoToActividadGobResultadoBean(ActividadGobResultado actividadGobResultado) {

        if (actividadGobResultado == null) {
            return null;
        }

        ActividadGobResultadoBean actividadGobResultadoBean = new ActividadGobResultadoBean();

        actividadGobResultadoBean.setNidActividadGobResultado(actividadGobResultado.getNidActividadGobResultado());
        actividadGobResultadoBean.setTxtActividadGobResultado(actividadGobResultado.getTxtActividadGobResultado());
        actividadGobResultadoBean.setFlgActivo(actividadGobResultado.getFlgActivo());
        actividadGobResultadoBean.setNidUsuario(actividadGobResultado.getNidUsuario());
        actividadGobResultadoBean.setTxtPc(actividadGobResultado.getTxtPc());
        actividadGobResultadoBean.setTxtIp(actividadGobResultado.getTxtIp());
        actividadGobResultadoBean.setFecEdicion(actividadGobResultado.getFecEdicion());

        actividadGobResultadoBean.setNivelEvaluacionBean(NivelEvaluacionCast.castNivelEvaluacionToNivelEvaluacionBean(actividadGobResultado.getNidNivelEvaluacion()));
        actividadGobResultadoBean.setActividadGobBean(ActividadGobCast.castActividadGobToActividadGobBean(actividadGobResultado.getNidActividadGob()));

        actividadGobResultadoBean.setNidTipoEvaluacion(actividadGobResultado.getNidTipoEvaluacion());

        return actividadGobResultadoBean;
    }

    public static ActividadGobResultado castActividadGobResultadoBeanToActividadGobResultado(ActividadGobResultadoBean actividadGobResultadoBean) {

        if (actividadGobResultadoBean == null) {
            return null;
        }

        ActividadGobResultado actividadGobResultado = new ActividadGobResultado();

        actividadGobResultado.setNidActividadGobResultado(actividadGobResultadoBean.getNidActividadGobResultado());
        actividadGobResultado.setFlgActivo(actividadGobResultadoBean.getFlgActivo());
        actividadGobResultado.setNidUsuario(actividadGobResultadoBean.getNidUsuario());
        actividadGobResultado.setTxtPc(actividadGobResultadoBean.getTxtPc());
        actividadGobResultado.setTxtIp(actividadGobResultadoBean.getTxtIp());
        actividadGobResultado.setFecEdicion(actividadGobResultadoBean.getFecEdicion());

        actividadGobResultado.setNidNivelEvaluacion(NivelEvaluacionCast.castNivelEvaluacionBeanToNivelEvaluacion(actividadGobResultadoBean.getNivelEvaluacionBean()));
        actividadGobResultado.setNidActividadGob(ActividadGobCast.castActividadGobBeanToActividadGob(actividadGobResultadoBean.getActividadGobBean()));
        
        actividadGobResultado.setNidTipoEvaluacion(actividadGobResultadoBean.getNidTipoEvaluacion());

        return actividadGobResultado;
    }

}
