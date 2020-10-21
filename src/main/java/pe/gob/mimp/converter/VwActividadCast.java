/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.VwActividadBean;
import pe.gob.mimp.siscap.modelo.VwActividad;

/**
 *
 * @author Omar
 */
public class VwActividadCast {

    public static VwActividadBean castVwActividadToVwActividadBean(VwActividad vwActividad) {

        if (vwActividad == null) {
            return null;
        }

        VwActividadBean vwActividadBean = new VwActividadBean();
        vwActividadBean.setNidActividadGob(vwActividad.getNidActividadGob());
        vwActividadBean.setTxtObjetivo(vwActividad.getTxtObjetivo());
        vwActividadBean.setNidTipoObjetivo(vwActividad.getNidTipoObjetivo());
        vwActividadBean.setTxtTema(vwActividad.getTxtTema());
        vwActividadBean.setNidGobierno(vwActividad.getNidGobierno());
        vwActividadBean.setNidEstadoActividadGob(vwActividad.getNidEstadoActividadGob());
        vwActividadBean.setNidTipoModalidad(vwActividad.getNidTipoModalidad());
        vwActividadBean.setTxtTipoModalidad(vwActividad.getTxtTipoModalidad());
        vwActividadBean.setNidModalidadActividad(vwActividad.getNidModalidadActividad());
        vwActividadBean.setTxtModalidadActividad(vwActividad.getTxtModalidadActividad());
        vwActividadBean.setFecInicio(vwActividad.getFecInicio());
        vwActividadBean.setFecFin(vwActividad.getFecFin());
        vwActividadBean.setNumAnio(vwActividad.getNumAnio());
        vwActividadBean.setNumTrimestre(vwActividad.getNumTrimestre());
        vwActividadBean.setNidArea(vwActividad.getNidArea());
        vwActividadBean.setNidDepartamento(vwActividad.getNidDepartamento());

        return vwActividadBean;
    }

    public static VwActividad castVwActividadBeanToVwActividad(VwActividadBean vwActividadBean) {

        if (vwActividadBean == null) {
            return null;
        }

        VwActividad vwActividad = new VwActividad();
        
        vwActividad.setNidActividadGob(vwActividadBean.getNidActividadGob());
        vwActividad.setTxtObjetivo(vwActividadBean.getTxtObjetivo());
        vwActividad.setNidTipoObjetivo(vwActividadBean.getNidTipoObjetivo());
        vwActividad.setTxtTema(vwActividadBean.getTxtTema());
        vwActividad.setNidGobierno(vwActividadBean.getNidGobierno());
        vwActividad.setNidEstadoActividadGob(vwActividadBean.getNidEstadoActividadGob());
        vwActividad.setNidTipoModalidad(vwActividadBean.getNidTipoModalidad());
        vwActividad.setTxtTipoModalidad(vwActividadBean.getTxtTipoModalidad());
        vwActividad.setNidModalidadActividad(vwActividadBean.getNidModalidadActividad());
        vwActividad.setTxtModalidadActividad(vwActividadBean.getTxtModalidadActividad());
        vwActividad.setFecInicio(vwActividadBean.getFecInicio());
        vwActividad.setFecFin(vwActividadBean.getFecFin());
        vwActividad.setNumAnio(vwActividadBean.getNumAnio());
        vwActividad.setNumTrimestre(vwActividadBean.getNumTrimestre());
        vwActividad.setNidArea(vwActividadBean.getNidArea());
        vwActividad.setNidDepartamento(vwActividadBean.getNidDepartamento());

        return vwActividad;
    }

}
