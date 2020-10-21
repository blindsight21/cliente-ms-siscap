/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.VwCantidadActividadBean;
import pe.gob.mimp.siscap.modelo.VwCantidadActividad;

/**
 *
 * @author Omar
 */
public class VwCantidadActividadCast {

    public static VwCantidadActividadBean castVwCantidadActividadToVwCantidadActividadBean(VwCantidadActividad vwCantidadActividad) {

        if (vwCantidadActividad == null) {
            return null;
        }

        VwCantidadActividadBean vwCantidadActividadBean = new VwCantidadActividadBean();

        vwCantidadActividadBean.setDepartamentoActividad(vwCantidadActividad.getDepartamentoActividad());
        vwCantidadActividadBean.setCantidadActividad(vwCantidadActividad.getCantidadActividad());
        
        return vwCantidadActividadBean;
    }
    
    public static VwCantidadActividad castVwCantidadActividadBeanToVwCantidadActividad(VwCantidadActividadBean vwCantidadActividadBean) {

        if (vwCantidadActividadBean == null) {
            return null;
        }

        VwCantidadActividad vwCantidadActividad = new VwCantidadActividad();

        vwCantidadActividad.setDepartamentoActividad(vwCantidadActividadBean.getDepartamentoActividad());
        vwCantidadActividad.setCantidadActividad(vwCantidadActividadBean.getCantidadActividad());
        
        return vwCantidadActividad;
    }
}
