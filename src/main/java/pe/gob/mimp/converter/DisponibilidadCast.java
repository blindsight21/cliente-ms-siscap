/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.DisponibilidadBean;
import pe.gob.mimp.siscap.modelo.Disponibilidad;


/**
 *
 * @author Omar
 */
public class DisponibilidadCast {

    public static DisponibilidadBean castDisponibilidadToDisponibilidadBean(Disponibilidad disponibilidad) {

        if (disponibilidad == null) {
            return null;
        }

        DisponibilidadBean disponibilidadBean = new DisponibilidadBean();

        disponibilidadBean.setNidDisponibilidad(disponibilidad.getNidDisponibilidad());
        disponibilidadBean.setFecDisponible(disponibilidad.getFecDisponible());
        disponibilidadBean.setFecNoDisponible(disponibilidad.getFecNoDisponible());
        disponibilidadBean.setNumTiempoMedio(disponibilidad.getNumTiempoMedio());
        disponibilidadBean.setNidFuncionalidad(disponibilidad.getNidFuncionalidad());
        disponibilidadBean.setFlgActivo(disponibilidad.getFlgActivo());
        disponibilidadBean.setNidUsuario(disponibilidad.getNidUsuario());
        disponibilidadBean.setTxtPc(disponibilidad.getTxtPc());
        disponibilidadBean.setTxtIp(disponibilidad.getTxtIp());
        disponibilidadBean.setFecRegistro(disponibilidad.getFecRegistro());

        return disponibilidadBean;
    }

    public static Disponibilidad castDisponibilidadBeanToDisponibilidad(DisponibilidadBean disponibilidadBean) {

        if (disponibilidadBean == null) {
            return null;
        }

        Disponibilidad disponibilidad = new Disponibilidad();

        disponibilidad.setNidDisponibilidad(disponibilidadBean.getNidDisponibilidad());
        disponibilidad.setFecDisponible(disponibilidadBean.getFecDisponible());
        disponibilidad.setFecNoDisponible(disponibilidadBean.getFecNoDisponible());
        disponibilidad.setNumTiempoMedio(disponibilidadBean.getNumTiempoMedio());
        disponibilidad.setNidFuncionalidad(disponibilidadBean.getNidFuncionalidad());
        disponibilidad.setFlgActivo(disponibilidadBean.getFlgActivo());
        disponibilidad.setNidUsuario(disponibilidadBean.getNidUsuario());
        disponibilidad.setTxtPc(disponibilidadBean.getTxtPc());
        disponibilidad.setTxtIp(disponibilidadBean.getTxtIp());
        disponibilidad.setFecRegistro(disponibilidadBean.getFecRegistro());

        return disponibilidad;
    }
}
