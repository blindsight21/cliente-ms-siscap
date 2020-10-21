/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.ActividadGobPubliObjeBean;
import pe.gob.mimp.siscap.modelo.ActividadGobPubliObje;


/**
 *
 * @author Omar
 */
public class ActividadGobPubliObjeCast {

    public static ActividadGobPubliObjeBean castActividadGobPubliObjeToActividadGobPubliObjeBean(ActividadGobPubliObje actividadGobPubliObje) {

        if (actividadGobPubliObje == null) {
            return null;
        }

        ActividadGobPubliObjeBean actividadGobPubliObjeBean = new ActividadGobPubliObjeBean();

        actividadGobPubliObjeBean.setNidActividadGobPubliObje(actividadGobPubliObje.getNidActividadGobPubliObje());
        actividadGobPubliObjeBean.setNumContadorMarculino(actividadGobPubliObje.getNumContadorMarculino());
        actividadGobPubliObjeBean.setNumContadorFemenino(actividadGobPubliObje.getNumContadorFemenino());
        actividadGobPubliObjeBean.setNumContadorTotal(actividadGobPubliObje.getNumContadorTotal());

        actividadGobPubliObjeBean.setFlgActivo(actividadGobPubliObje.getFlgActivo());
        actividadGobPubliObjeBean.setNidUsuario(actividadGobPubliObje.getNidUsuario());
        actividadGobPubliObjeBean.setTxtPc(actividadGobPubliObje.getTxtPc());
        actividadGobPubliObjeBean.setTxtIp(actividadGobPubliObje.getTxtIp());
        actividadGobPubliObjeBean.setFecEdicion(actividadGobPubliObje.getFecEdicion());

        actividadGobPubliObjeBean.setPublicoObjetivoBean(PublicoObjetivoCast.castPublicoObjetivoToPublicoObjetivoBean(actividadGobPubliObje.getNidPublicoObjetivo()));
        actividadGobPubliObjeBean.setActividadGobBean(ActividadGobCast.castActividadGobToActividadGobBean(actividadGobPubliObje.getNidActividadGob()));

        return actividadGobPubliObjeBean;
    }

    public static ActividadGobPubliObje castActividadGobPubliObjeBeanToActividadGobPubliObje(ActividadGobPubliObjeBean actividadGobPubliObjeBean) {

        if (actividadGobPubliObjeBean == null) {
            return null;
        }

        ActividadGobPubliObje actividadGobPubliObje = new ActividadGobPubliObje();

        actividadGobPubliObje.setNidActividadGobPubliObje(actividadGobPubliObjeBean.getNidActividadGobPubliObje());
        actividadGobPubliObje.setNumContadorMarculino(actividadGobPubliObjeBean.getNumContadorMarculino());
        actividadGobPubliObje.setNumContadorFemenino(actividadGobPubliObjeBean.getNumContadorFemenino());
        actividadGobPubliObje.setNumContadorTotal(actividadGobPubliObjeBean.getNumContadorTotal());

        actividadGobPubliObje.setFlgActivo(actividadGobPubliObjeBean.getFlgActivo());
        actividadGobPubliObje.setNidUsuario(actividadGobPubliObjeBean.getNidUsuario());
        actividadGobPubliObje.setTxtPc(actividadGobPubliObjeBean.getTxtPc());
        actividadGobPubliObje.setTxtIp(actividadGobPubliObjeBean.getTxtIp());
        actividadGobPubliObje.setFecEdicion(actividadGobPubliObjeBean.getFecEdicion());

        actividadGobPubliObje.setNidPublicoObjetivo(PublicoObjetivoCast.castPublicoObjetivoBeanToPublicoObjetivo(actividadGobPubliObjeBean.getPublicoObjetivoBean()));
        actividadGobPubliObje.setNidActividadGob(ActividadGobCast.castActividadGobBeanToActividadGob(actividadGobPubliObjeBean.getActividadGobBean()));

        return actividadGobPubliObje;
    }

}
