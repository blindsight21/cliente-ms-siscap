/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.VwReporteActividadBean;
import pe.gob.mimp.siscap.modelo.VwReporteActividad;

/**
 *
 * @author Omar
 */
public class VwReporteActividadCast {

    public static VwReporteActividadBean castVwReporteActividadToVwReporteActividadBean(VwReporteActividad vwReporteActividad) {

        if (vwReporteActividad == null) {
            return null;
        }

        VwReporteActividadBean vwReporteActividadBean = new VwReporteActividadBean();

        vwReporteActividadBean.setNidActividadGob(vwReporteActividad.getNidActividadGob());
        vwReporteActividadBean.setNidTipoObjetivo(vwReporteActividad.getNidTipoObjetivo());
        vwReporteActividadBean.setTxtTipoObjetivo(vwReporteActividad.getTxtTipoObjetivo());
        vwReporteActividadBean.setTxtObjetivo(vwReporteActividad.getTxtObjetivo());
        vwReporteActividadBean.setNidEstadoActividadGob(vwReporteActividad.getNidEstadoActividadGob());
        vwReporteActividadBean.setTxtEstadoActividadGob(vwReporteActividad.getTxtEstadoActividadGob());
        vwReporteActividadBean.setPublicoObjetivo(vwReporteActividad.getPublicoObjetivo());
        vwReporteActividadBean.setTxtTema(vwReporteActividad.getTxtTema());
        vwReporteActividadBean.setNidGobierno(vwReporteActividad.getNidGobierno());
        vwReporteActividadBean.setNidTipoModalidad(vwReporteActividad.getNidTipoModalidad());
        vwReporteActividadBean.setTxtTipoModalidad(vwReporteActividad.getTxtTipoModalidad());
        vwReporteActividadBean.setNidModalidadActividad(vwReporteActividad.getNidModalidadActividad());
        vwReporteActividadBean.setTxtModalidadActividad(vwReporteActividad.getTxtModalidadActividad());
        vwReporteActividadBean.setFecInicio(vwReporteActividad.getFecInicio());
        vwReporteActividadBean.setFecFin(vwReporteActividad.getFecFin());
        vwReporteActividadBean.setNumTrimestre(vwReporteActividad.getNumTrimestre());
        vwReporteActividadBean.setTxtTrimestre(vwReporteActividad.getTxtTrimestre());
        vwReporteActividadBean.setNumAnio(vwReporteActividad.getNumAnio());
        vwReporteActividadBean.setNidUsuario(vwReporteActividad.getNidUsuario());
        vwReporteActividadBean.setNidArea(vwReporteActividad.getNidArea());
        vwReporteActividadBean.setNumContadorFemenino(vwReporteActividad.getNumContadorFemenino());
        vwReporteActividadBean.setNumContadorMasculino(vwReporteActividad.getNumContadorMasculino());
        vwReporteActividadBean.setNumContadorTotal(vwReporteActividad.getNumContadorTotal());
        vwReporteActividadBean.setTxtGobierno(vwReporteActividad.getTxtGobierno());
        vwReporteActividadBean.setNidDepartamento(vwReporteActividad.getNidDepartamento());
        vwReporteActividadBean.setTxtSigla(vwReporteActividad.getTxtSigla());
        vwReporteActividadBean.setTxtArea(vwReporteActividad.getTxtArea());
        vwReporteActividadBean.setTxtJustificacionReprogramado(vwReporteActividad.getTxtJustificacionReprogramado());
        vwReporteActividadBean.setTxtJustificacionAnulado(vwReporteActividad.getTxtJustificacionAnulado());
        vwReporteActividadBean.setResultadoTipoNivel(vwReporteActividad.getResultadoTipoNivel());
        vwReporteActividadBean.setResultadoDescripcion(vwReporteActividad.getResultadoDescripcion());

        return vwReporteActividadBean;
    }

    public static VwReporteActividad castVwReporteActividadBeanToVwReporteActividad(VwReporteActividadBean vwReporteActividadBean) {

        if (vwReporteActividadBean == null) {
            return null;
        }

        VwReporteActividad vwReporteActividad = new VwReporteActividad();

        vwReporteActividad.setNidActividadGob(vwReporteActividadBean.getNidActividadGob());
        vwReporteActividad.setNidTipoObjetivo(vwReporteActividadBean.getNidTipoObjetivo());
        vwReporteActividad.setTxtTipoObjetivo(vwReporteActividadBean.getTxtTipoObjetivo());
        vwReporteActividad.setTxtObjetivo(vwReporteActividadBean.getTxtObjetivo());
        vwReporteActividad.setNidEstadoActividadGob(vwReporteActividadBean.getNidEstadoActividadGob());
        vwReporteActividad.setTxtEstadoActividadGob(vwReporteActividadBean.getTxtEstadoActividadGob());
        vwReporteActividad.setPublicoObjetivo(vwReporteActividadBean.getPublicoObjetivo());
        vwReporteActividad.setTxtTema(vwReporteActividadBean.getTxtTema());
        vwReporteActividad.setNidGobierno(vwReporteActividadBean.getNidGobierno());
        vwReporteActividad.setNidTipoModalidad(vwReporteActividadBean.getNidTipoModalidad());
        vwReporteActividad.setTxtTipoModalidad(vwReporteActividadBean.getTxtTipoModalidad());
        vwReporteActividad.setNidModalidadActividad(vwReporteActividadBean.getNidModalidadActividad());
        vwReporteActividad.setTxtModalidadActividad(vwReporteActividadBean.getTxtModalidadActividad());
        vwReporteActividad.setFecInicio(vwReporteActividadBean.getFecInicio());
        vwReporteActividad.setFecFin(vwReporteActividadBean.getFecFin());
        vwReporteActividad.setNumTrimestre(vwReporteActividadBean.getNumTrimestre());
        vwReporteActividad.setTxtTrimestre(vwReporteActividadBean.getTxtTrimestre());
        vwReporteActividad.setNumAnio(vwReporteActividadBean.getNumAnio());
        vwReporteActividad.setNidUsuario(vwReporteActividadBean.getNidUsuario());
        vwReporteActividad.setNidArea(vwReporteActividadBean.getNidArea());
        vwReporteActividad.setNumContadorFemenino(vwReporteActividadBean.getNumContadorFemenino());
        vwReporteActividad.setNumContadorMasculino(vwReporteActividadBean.getNumContadorMasculino());
        vwReporteActividad.setNumContadorTotal(vwReporteActividadBean.getNumContadorTotal());
        vwReporteActividad.setTxtGobierno(vwReporteActividadBean.getTxtGobierno());
        vwReporteActividad.setNidDepartamento(vwReporteActividadBean.getNidDepartamento());
        vwReporteActividad.setTxtSigla(vwReporteActividadBean.getTxtSigla());
        vwReporteActividad.setTxtArea(vwReporteActividadBean.getTxtArea());
        vwReporteActividad.setTxtJustificacionReprogramado(vwReporteActividadBean.getTxtJustificacionReprogramado());
        vwReporteActividad.setTxtJustificacionAnulado(vwReporteActividadBean.getTxtJustificacionAnulado());
        vwReporteActividad.setResultadoTipoNivel(vwReporteActividadBean.getResultadoTipoNivel());
        vwReporteActividad.setResultadoDescripcion(vwReporteActividadBean.getResultadoDescripcion());

        return vwReporteActividad;
    }

}
