/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.PublicoObjetivoBean;
import pe.gob.mimp.siscap.modelo.PublicoObjetivo;

/**
 *
 * @author Omar
 */
public class PublicoObjetivoCast {

    public static PublicoObjetivoBean castPublicoObjetivoToPublicoObjetivoBean(PublicoObjetivo publicoObjetivo) {

        if (publicoObjetivo == null) {
            return null;
        }

        PublicoObjetivoBean publicoObjetivoBean = new PublicoObjetivoBean();

        publicoObjetivoBean.setNidPublicoObjetivo(publicoObjetivo.getNidPublicoObjetivo());
        publicoObjetivoBean.setTxtPublicoObjetivo(publicoObjetivo.getTxtPublicoObjetivo());
        publicoObjetivoBean.setFlgActivo(publicoObjetivo.getFlgActivo());
        publicoObjetivoBean.setNidUsuario(publicoObjetivo.getNidUsuario());
        publicoObjetivoBean.setTxtPc(publicoObjetivo.getTxtPc());
        publicoObjetivoBean.setTxtIp(publicoObjetivo.getTxtIp());
        publicoObjetivoBean.setFecEdicion(publicoObjetivo.getFecEdicion());

        return publicoObjetivoBean;
    }

    public static PublicoObjetivo castPublicoObjetivoBeanToPublicoObjetivo(PublicoObjetivoBean publicoObjetivoBean) {

        if (publicoObjetivoBean == null) {
            return null;
        }

        PublicoObjetivo publicoObjetivo = new PublicoObjetivo();

        publicoObjetivo.setNidPublicoObjetivo(publicoObjetivoBean.getNidPublicoObjetivo());
        publicoObjetivo.setTxtPublicoObjetivo(publicoObjetivoBean.getTxtPublicoObjetivo());
        publicoObjetivo.setFlgActivo(publicoObjetivoBean.getFlgActivo());
        publicoObjetivo.setNidUsuario(publicoObjetivoBean.getNidUsuario());
        publicoObjetivo.setTxtPc(publicoObjetivoBean.getTxtPc());
        publicoObjetivo.setTxtIp(publicoObjetivoBean.getTxtIp());
        publicoObjetivo.setFecEdicion(publicoObjetivoBean.getFecEdicion());

        return publicoObjetivo;
    }
}
