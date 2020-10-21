/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.AreaBean;
import pe.gob.mimp.seguridad.modelo.Area;

/**
 *
 * @author Omar
 */
public class AreaCast {

    public static AreaBean castAreaToAreaBean(Area area) {

        if (area == null) {
            return null;
        }

        AreaBean areaBean = new AreaBean();

        areaBean.setNidArea(area.getNidArea());
        areaBean.setTxtArea(area.getTxtArea());
        areaBean.setNidAreaPadre(area.getNidAreaPadre());
        areaBean.setNumPiso(area.getNumPiso());
        areaBean.setFlgActivo(area.getFlgActivo());
        areaBean.setTxtSigla(area.getTxtSigla());
        areaBean.setTxtPc(area.getTxtPc());
        areaBean.setTxtIp(area.getTxtIp());
        areaBean.setFecEdicion(area.getFecEdicion());
        areaBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(area.getUsuario()));

        return areaBean;
    }

    public static Area castAreaBeanToArea(AreaBean areaBean) {

        if (areaBean == null) {
            return null;
        }

        Area area = new Area();

        area.setNidArea(areaBean.getNidArea());
        area.setTxtArea(areaBean.getTxtArea());
        area.setNidAreaPadre(areaBean.getNidAreaPadre());
        area.setNumTxtPiso(areaBean.getNumPiso());
        area.setFlgActivo(areaBean.getFlgActivo());
        area.setTxtSigla(areaBean.getTxtSigla());
        area.setTxtPc(areaBean.getTxtPc());
        area.setTxtIp(areaBean.getTxtIp());
        area.setFecEdicion(areaBean.getFecEdicion());
        area.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(areaBean.getUsuarioBean()));

        return area;
    }
}
