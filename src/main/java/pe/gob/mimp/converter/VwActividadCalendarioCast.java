/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.VwActividadCalendarioBean;
import pe.gob.mimp.siscap.modelo.VwActividadCalendario;


/**
 *
 * @author Omar
 */
public class VwActividadCalendarioCast {

    public static VwActividadCalendarioBean castVwActividadCalendarioToVwActividadCalendarioBean(VwActividadCalendario vwActividadCalendario) {

        if (vwActividadCalendario == null) {
            return null;
        }

        VwActividadCalendarioBean vwActividadCalBean = new VwActividadCalendarioBean();
        vwActividadCalBean.setNidActividadGob(vwActividadCalendario.getNidActividadGob());
        vwActividadCalBean.setTxtTema(vwActividadCalendario.getTxtTema());
        vwActividadCalBean.setNidArea(vwActividadCalendario.getNidArea());
        vwActividadCalBean.setTxtArea(vwActividadCalendario.getTxtArea());
        vwActividadCalBean.setTxtSigla(vwActividadCalendario.getTxtSigla());
        vwActividadCalBean.setTxtNombres(vwActividadCalendario.getTxtNombres());
        vwActividadCalBean.setFecInicio(vwActividadCalendario.getFecInicio());
        vwActividadCalBean.setFecFin(vwActividadCalendario.getFecFin());
        vwActividadCalBean.setNidGobierno(vwActividadCalendario.getNidGobierno());
        vwActividadCalBean.setTxtGobierno(vwActividadCalendario.getTxtGobierno());
        vwActividadCalBean.setNidEstadoActividadGob(vwActividadCalendario.getNidEstadoActividadGob());
        vwActividadCalBean.setTxtEstadoActividadGob(vwActividadCalendario.getTxtEstadoActividadGob());

        return vwActividadCalBean;
    }

    public static VwActividadCalendario castVwActividadCalendarioBeanToVwActividadCalendario(VwActividadCalendarioBean vwActividadCalendarioBean) {

        if (vwActividadCalendarioBean == null) {
            return null;
        }

        VwActividadCalendario vwActividadCalendario = new VwActividadCalendario();
        
        vwActividadCalendario.setNidActividadGob(vwActividadCalendarioBean.getNidActividadGob());
        vwActividadCalendario.setTxtTema(vwActividadCalendarioBean.getTxtTema());
        vwActividadCalendario.setNidArea(vwActividadCalendarioBean.getNidArea());
        vwActividadCalendario.setTxtArea(vwActividadCalendarioBean.getTxtArea());
        vwActividadCalendario.setTxtSigla(vwActividadCalendarioBean.getTxtSigla());
        vwActividadCalendario.setTxtNombres(vwActividadCalendarioBean.getTxtNombres());
        vwActividadCalendario.setFecInicio(vwActividadCalendarioBean.getFecInicio());
        vwActividadCalendario.setFecFin(vwActividadCalendarioBean.getFecFin());
        vwActividadCalendario.setNidGobierno(vwActividadCalendarioBean.getNidGobierno());
        vwActividadCalendario.setTxtGobierno(vwActividadCalendarioBean.getTxtGobierno());
        vwActividadCalendario.setNidEstadoActividadGob(vwActividadCalendarioBean.getNidEstadoActividadGob());
        vwActividadCalendario.setTxtEstadoActividadGob(vwActividadCalendarioBean.getTxtEstadoActividadGob());

        return vwActividadCalendario;
    }

}
