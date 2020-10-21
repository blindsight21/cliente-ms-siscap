/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.ArchivoActividadBean;
import pe.gob.mimp.siscap.modelo.ArchivoActividad;



/**
 *
 * @author Omar
 */
public class ArchivoActividadCast {

    public static ArchivoActividadBean castArchivoActividadToArchivoActividadBean(ArchivoActividad archivoActividad) {

        if (archivoActividad == null) {
            return null;
        }

        ArchivoActividadBean archivoActividadBean = new ArchivoActividadBean();

        archivoActividadBean.setNidArchivoActividad(archivoActividad.getNidArchivoActividad());
        archivoActividadBean.setTxtArchivo(archivoActividad.getTxtArchivo());
        archivoActividadBean.setFlgActivo(archivoActividad.getFlgActivo());
        archivoActividadBean.setNidUsuario(archivoActividad.getNidUsuario());
        archivoActividadBean.setTxtPc(archivoActividad.getTxtPc());
        archivoActividadBean.setTxtIp(archivoActividad.getTxtIp());
        archivoActividadBean.setFecEdicion(archivoActividad.getFecEdicion());
        
        archivoActividadBean.setActividadGobBean(ActividadGobCast.castActividadGobToActividadGobBean(archivoActividad.getNidActividadGob()));

        return archivoActividadBean;
    }
    
    public static ArchivoActividad castArchivoActividadBeanToArchivoActividad(ArchivoActividadBean archivoActividadBean) {

        if (archivoActividadBean == null) {
            return null;
        }

        ArchivoActividad archivoActividad = new ArchivoActividad();

        archivoActividad.setNidArchivoActividad(archivoActividadBean.getNidArchivoActividad());
        archivoActividad.setTxtArchivo(archivoActividadBean.getTxtArchivo());
        archivoActividad.setFlgActivo(archivoActividadBean.getFlgActivo());
        archivoActividad.setNidUsuario(archivoActividadBean.getNidUsuario());
        archivoActividad.setTxtPc(archivoActividadBean.getTxtPc());
        archivoActividad.setTxtIp(archivoActividadBean.getTxtIp());
        archivoActividad.setFecEdicion(archivoActividadBean.getFecEdicion());

        archivoActividad.setNidActividadGob(ActividadGobCast.castActividadGobBeanToActividadGob(archivoActividadBean.getActividadGobBean()));
        
        return archivoActividad;
    }
}
