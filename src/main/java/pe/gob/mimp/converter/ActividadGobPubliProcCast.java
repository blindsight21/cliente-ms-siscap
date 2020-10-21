/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.ActividadGobPubliProcBean;
import pe.gob.mimp.siscap.modelo.ActividadGobPubliProc;


/**
 *
 * @author Omar
 */
public class ActividadGobPubliProcCast {

    public static ActividadGobPubliProcBean castActividadGobPubliProcToActividadGobPubliProcBean(ActividadGobPubliProc actividadGobPubliProc) {

        if (actividadGobPubliProc == null) {
            return null;
        }

        ActividadGobPubliProcBean actividadGobPubliProcBean = new ActividadGobPubliProcBean();

        actividadGobPubliProcBean.setNidActividadGobProcGob(actividadGobPubliProc.getNidActividadGobProcGob());
        actividadGobPubliProcBean.setFlgActivo(actividadGobPubliProc.getFlgActivo());
        actividadGobPubliProcBean.setNidUsuario(actividadGobPubliProc.getNidUsuario());
        actividadGobPubliProcBean.setTxtPc(actividadGobPubliProc.getTxtPc());
        actividadGobPubliProcBean.setTxtIp(actividadGobPubliProc.getTxtIp());
        actividadGobPubliProcBean.setFecEdicion(actividadGobPubliProc.getFecEdicion());

        actividadGobPubliProcBean.setGobiernoBean(GobiernoCast.castGobiernoToGobiernoBean(actividadGobPubliProc.getNidGobierno()));
        actividadGobPubliProcBean.setActividadGobBean(ActividadGobCast.castActividadGobToActividadGobBean(actividadGobPubliProc.getNidActividadGob()));

        return actividadGobPubliProcBean;
    }

    public static ActividadGobPubliProc castActividadGobPubliProcBeanToActividadGobPubliProc(ActividadGobPubliProcBean actividadGobPubliProcBean) {

        if (actividadGobPubliProcBean == null) {
            return null;
        }

        ActividadGobPubliProc actividadGobPubliProc = new ActividadGobPubliProc();

        actividadGobPubliProc.setNidActividadGobProcGob(actividadGobPubliProcBean.getNidActividadGobProcGob());
        actividadGobPubliProc.setFlgActivo(actividadGobPubliProcBean.getFlgActivo());
        actividadGobPubliProc.setNidUsuario(actividadGobPubliProcBean.getNidUsuario());
        actividadGobPubliProc.setTxtPc(actividadGobPubliProcBean.getTxtPc());
        actividadGobPubliProc.setTxtIp(actividadGobPubliProcBean.getTxtIp());
        actividadGobPubliProc.setFecEdicion(actividadGobPubliProcBean.getFecEdicion());

        actividadGobPubliProc.setNidGobierno(GobiernoCast.castGobiernoBeanToGobierno(actividadGobPubliProcBean.getGobiernoBean()));
        actividadGobPubliProc.setNidActividadGob(ActividadGobCast.castActividadGobBeanToActividadGob(actividadGobPubliProcBean.getActividadGobBean()));

        return actividadGobPubliProc;
    }

}
