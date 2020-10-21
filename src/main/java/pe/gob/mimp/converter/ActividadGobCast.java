/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.ActividadGobBean;
import pe.gob.mimp.siscap.modelo.ActividadGob;

/**
 *
 * @author Omar
 */
public class ActividadGobCast {

    public static ActividadGobBean castActividadGobToActividadGobBean(ActividadGob actividadGobierno) {

        if (actividadGobierno == null) {
            return null;
        }

        ActividadGobBean actividadGobiernoBean = new ActividadGobBean();

        actividadGobiernoBean.setNidActividadGob(actividadGobierno.getNidActividadGob());
        actividadGobiernoBean.setTxtObjetivo(actividadGobierno.getTxtObjetivo());
        actividadGobiernoBean.setTxtTema(actividadGobierno.getTxtTema());
        actividadGobiernoBean.setFecInicio(actividadGobierno.getFecInicio());
        actividadGobiernoBean.setFecFin(actividadGobierno.getFecFin());
        actividadGobiernoBean.setFecCreacion(actividadGobierno.getFecCreacion());
        actividadGobiernoBean.setNumAnio(actividadGobierno.getNumAnio());
        actividadGobiernoBean.setNumTrimestre(actividadGobierno.getNumTrimestre());
        actividadGobiernoBean.setTxtObservacionEliminado(actividadGobierno.getTxtObservacionEliminado());

        actividadGobiernoBean.setNidUsuario(actividadGobierno.getNidUsuario());
        actividadGobiernoBean.setTxtPc(actividadGobierno.getTxtPc());
        actividadGobiernoBean.setTxtIp(actividadGobierno.getTxtIp());
        actividadGobiernoBean.setFecEdicion(actividadGobierno.getFecEdicion());
        actividadGobiernoBean.setFlgActivo(actividadGobierno.getFlgActivo());

        actividadGobiernoBean.setNidArea(actividadGobierno.getNidArea());
        actividadGobiernoBean.setNidDepartamento(actividadGobierno.getNidDepartamento());
        actividadGobiernoBean.setTxtResponsableApepat(actividadGobierno.getTxtResponsableApepat());
        actividadGobiernoBean.setTxtResponsableApemat(actividadGobierno.getTxtResponsableApemat());
        actividadGobiernoBean.setTxtResponsableNombre(actividadGobierno.getTxtResponsableNombre());
        actividadGobiernoBean.setTxtResponsableTelef(actividadGobierno.getTxtResponsableTelef());
        actividadGobiernoBean.setTxtResponsableCorreo(actividadGobierno.getTxtResponsableCorreo());
        actividadGobiernoBean.setNumContadorMasculino(actividadGobierno.getNumContadorMasculino());
        actividadGobiernoBean.setNumContadorFemenino(actividadGobierno.getNumContadorFemenino());
        actividadGobiernoBean.setNumContadorTotal(actividadGobierno.getNumContadorTotal());
        actividadGobiernoBean.setTxtJustificacionReprogramado(actividadGobierno.getTxtJustificacionReprogramado());
        actividadGobiernoBean.setTxtJustificacionAnulado(actividadGobierno.getTxtJustificacionAnulado());

        actividadGobiernoBean.setTipoObjetivoBean(TipoObjetivoCast.castTipoObjetivoToTipoObjetivoBean(actividadGobierno.getNidTipoObjetivo()));
        actividadGobiernoBean.setTipoModalidadBean(TipoModalidadCast.castTipoModalidadToTipoModalidadBean(actividadGobierno.getNidTipoModalidad()));
        actividadGobiernoBean.setModalidadActividadBean(ModalidadActividadCast.castModalidadActividadToModalidadActividadBean(actividadGobierno.getNidModalidadActividad()));
        actividadGobiernoBean.setGobiernoBean(GobiernoCast.castGobiernoToGobiernoBean(actividadGobierno.getNidGobierno()));
        actividadGobiernoBean.setFuncionTransferidaBean(FuncionTransferidaCast.castFuncionTransferidaToFuncionTransferidaBean(actividadGobierno.getNidFuncionTransferida()));

        actividadGobiernoBean.setNidTipoFuncion(actividadGobierno.getNidTipoFuncion());
        actividadGobiernoBean.setNidTipoGobierno(actividadGobierno.getNidTipoGobierno());
        actividadGobiernoBean.setNidEstadoActividad(actividadGobierno.getNidEstadoActividad());

        return actividadGobiernoBean;
    }

    public static ActividadGob castActividadGobBeanToActividadGob(ActividadGobBean actividadGobiernoBean) {

        if (actividadGobiernoBean == null) {
            return null;
        }

        ActividadGob actividadGobierno = new ActividadGob();

        actividadGobierno.setNidActividadGob(actividadGobiernoBean.getNidActividadGob());
        actividadGobierno.setTxtObjetivo(actividadGobiernoBean.getTxtObjetivo());
        actividadGobierno.setTxtTema(actividadGobiernoBean.getTxtTema());
        actividadGobierno.setFecInicio(actividadGobiernoBean.getFecInicio());
        actividadGobierno.setFecFin(actividadGobiernoBean.getFecFin());
        actividadGobierno.setFecCreacion(actividadGobiernoBean.getFecCreacion());
        actividadGobierno.setNumAnio(actividadGobiernoBean.getNumAnio());
        actividadGobierno.setNumTrimestre(actividadGobiernoBean.getNumTrimestre());
        actividadGobierno.setTxtObservacionEliminado(actividadGobiernoBean.getTxtObservacionEliminado());

        actividadGobierno.setNidUsuario(actividadGobiernoBean.getNidUsuario());
        actividadGobierno.setTxtPc(actividadGobiernoBean.getTxtPc());
        actividadGobierno.setTxtIp(actividadGobiernoBean.getTxtIp());
        actividadGobierno.setFecEdicion(actividadGobiernoBean.getFecEdicion());
        actividadGobierno.setFlgActivo(actividadGobiernoBean.getFlgActivo());

        actividadGobierno.setNidArea(actividadGobiernoBean.getNidArea());
        actividadGobierno.setNidDepartamento(actividadGobiernoBean.getNidDepartamento());
        actividadGobierno.setTxtResponsableApepat(actividadGobiernoBean.getTxtResponsableApepat());
        actividadGobierno.setTxtResponsableApemat(actividadGobiernoBean.getTxtResponsableApemat());
        actividadGobierno.setTxtResponsableNombre(actividadGobiernoBean.getTxtResponsableNombre());
        actividadGobierno.setTxtResponsableTelef(actividadGobiernoBean.getTxtResponsableTelef());
        actividadGobierno.setTxtResponsableCorreo(actividadGobiernoBean.getTxtResponsableCorreo());
        actividadGobierno.setNumContadorMasculino(actividadGobiernoBean.getNumContadorMasculino());
        actividadGobierno.setNumContadorFemenino(actividadGobiernoBean.getNumContadorFemenino());
        actividadGobierno.setNumContadorTotal(actividadGobiernoBean.getNumContadorTotal());
        actividadGobierno.setTxtJustificacionReprogramado(actividadGobiernoBean.getTxtJustificacionReprogramado());
        actividadGobierno.setTxtJustificacionAnulado(actividadGobiernoBean.getTxtJustificacionAnulado());

        actividadGobierno.setNidTipoObjetivo(TipoObjetivoCast.castTipoObjetivoBeanToTipoObjetivo(actividadGobiernoBean.getTipoObjetivoBean()));
        actividadGobierno.setNidTipoModalidad(TipoModalidadCast.castTipoModalidadBeanToTipoModalidad(actividadGobiernoBean.getTipoModalidadBean()));
        actividadGobierno.setNidModalidadActividad(ModalidadActividadCast.castModalidadActividadBeanToModalidadActividad(actividadGobiernoBean.getModalidadActividadBean()));
        actividadGobierno.setNidGobierno(GobiernoCast.castGobiernoBeanToGobierno(actividadGobiernoBean.getGobiernoBean()));
        actividadGobierno.setNidFuncionTransferida(FuncionTransferidaCast.castFuncionTransferidaBeanToFuncionTransferida(actividadGobiernoBean.getFuncionTransferidaBean()));

        actividadGobierno.setNidTipoFuncion(actividadGobiernoBean.getNidTipoFuncion());
        actividadGobierno.setNidTipoGobierno(actividadGobiernoBean.getNidTipoGobierno());
        actividadGobierno.setNidEstadoActividad(actividadGobierno.getNidEstadoActividad());

        return actividadGobierno;
    }

}
