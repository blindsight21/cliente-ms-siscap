/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.CorreoPersonaSiscapBean;
import pe.gob.mimp.siscap.modelo.CorreoPersonaSiscap;

/**
 *
 * @author Omar
 */
public class CorreoPersonaSiscapCast {

    public static CorreoPersonaSiscapBean castCorreoPersonaSiscapToCorreoPersonaSiscapBean(CorreoPersonaSiscap correoPersonaSiscap) {

        if (correoPersonaSiscap == null) {
            return null;
        }

        CorreoPersonaSiscapBean correoPersonaSiscapBean = new CorreoPersonaSiscapBean();

        correoPersonaSiscapBean.setNidCorreoPersonaSiscap(correoPersonaSiscap.getNidCorreoPersonaSiscap());

        correoPersonaSiscapBean.setFlgActivo(correoPersonaSiscap.getFlgActivo());
        correoPersonaSiscapBean.setNidUsuario(correoPersonaSiscap.getNidUsuario());
        correoPersonaSiscapBean.setTxtPc(correoPersonaSiscap.getTxtPc());
        correoPersonaSiscapBean.setTxtIp(correoPersonaSiscap.getTxtIp());
        correoPersonaSiscapBean.setFecEdicion(correoPersonaSiscap.getFecEdicion());

        correoPersonaSiscapBean.setTxtCorreoPersonaSiscap(correoPersonaSiscap.getTxtCorreoPersonaSiscap());

        correoPersonaSiscapBean.setPersonaSiscapBean(PersonaSiscapCast.castPersonaSiscapToPersonaSiscapBean(correoPersonaSiscap.getNidPersonaSiscap()));

        return correoPersonaSiscapBean;
    }

    public static CorreoPersonaSiscap castCorreoPersonaSiscapBeanToCorreoPersonaSiscap(CorreoPersonaSiscapBean correoPersonaSiscapBean) {

        if (correoPersonaSiscapBean == null) {
            return null;
        }

        CorreoPersonaSiscap correoPersonaSiscap = new CorreoPersonaSiscap();

        correoPersonaSiscap.setNidCorreoPersonaSiscap(correoPersonaSiscapBean.getNidCorreoPersonaSiscap());

        correoPersonaSiscap.setFlgActivo(correoPersonaSiscapBean.getFlgActivo());
        correoPersonaSiscap.setNidUsuario(correoPersonaSiscapBean.getNidUsuario());
        correoPersonaSiscap.setTxtPc(correoPersonaSiscapBean.getTxtPc());
        correoPersonaSiscap.setTxtIp(correoPersonaSiscapBean.getTxtIp());
        correoPersonaSiscap.setFecEdicion(correoPersonaSiscapBean.getFecEdicion());

        correoPersonaSiscap.setTxtCorreoPersonaSiscap(correoPersonaSiscapBean.getTxtCorreoPersonaSiscap());

        correoPersonaSiscap.setNidPersonaSiscap(PersonaSiscapCast.castPersonaSiscapBeanToPersonaSiscap(correoPersonaSiscapBean.getPersonaSiscapBean()));

        return correoPersonaSiscap;
    }
}
