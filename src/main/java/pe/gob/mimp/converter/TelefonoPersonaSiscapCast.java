/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.TelefonoPersonaSiscapBean;
import pe.gob.mimp.siscap.modelo.TelefonoPersonaSiscap;

/**
 *
 * @author Omar
 */
public class TelefonoPersonaSiscapCast {

    public static TelefonoPersonaSiscapBean castTelefonoPersonaSiscapToTelefonoPersonaSiscapBean(TelefonoPersonaSiscap telefonoPersonaSiscap) {

        if (telefonoPersonaSiscap == null) {
            return null;
        }

        TelefonoPersonaSiscapBean telefonoPersonaSiscapBean = new TelefonoPersonaSiscapBean();

        telefonoPersonaSiscapBean.setNidTelefonoPersonaSiscap(telefonoPersonaSiscap.getNidTelefonoPersonaSiscap());

        telefonoPersonaSiscapBean.setFlgActivo(telefonoPersonaSiscap.getFlgActivo());
        telefonoPersonaSiscapBean.setNidUsuario(telefonoPersonaSiscap.getNidUsuario());
        telefonoPersonaSiscapBean.setTxtPc(telefonoPersonaSiscap.getTxtPc());
        telefonoPersonaSiscapBean.setTxtIp(telefonoPersonaSiscap.getTxtIp());
        telefonoPersonaSiscapBean.setFecEdicion(telefonoPersonaSiscap.getFecEdicion());

        telefonoPersonaSiscapBean.setTxtTelefonoPersonaSiscap(telefonoPersonaSiscap.getTxtTelefonoPersonaSiscap());

        telefonoPersonaSiscapBean.setPersonaSiscapBean(PersonaSiscapCast.castPersonaSiscapToPersonaSiscapBean(telefonoPersonaSiscap.getNidPersonaSiscap()));

        return telefonoPersonaSiscapBean;
    }

    public static TelefonoPersonaSiscap castTelefonoPersonaSiscapBeanToTelefonoPersonaSiscap(TelefonoPersonaSiscapBean telefonoPersonaSiscapBean) {

        if (telefonoPersonaSiscapBean == null) {
            return null;
        }

        TelefonoPersonaSiscap telefonoPersonaSiscap = new TelefonoPersonaSiscap();

        telefonoPersonaSiscap.setNidTelefonoPersonaSiscap(telefonoPersonaSiscapBean.getNidTelefonoPersonaSiscap());

        telefonoPersonaSiscap.setFlgActivo(telefonoPersonaSiscapBean.getFlgActivo());
        telefonoPersonaSiscap.setNidUsuario(telefonoPersonaSiscapBean.getNidUsuario());
        telefonoPersonaSiscap.setTxtPc(telefonoPersonaSiscapBean.getTxtPc());
        telefonoPersonaSiscap.setTxtIp(telefonoPersonaSiscapBean.getTxtIp());
        telefonoPersonaSiscap.setFecEdicion(telefonoPersonaSiscapBean.getFecEdicion());

        telefonoPersonaSiscap.setTxtTelefonoPersonaSiscap(telefonoPersonaSiscapBean.getTxtTelefonoPersonaSiscap());

        telefonoPersonaSiscap.setNidPersonaSiscap(PersonaSiscapCast.castPersonaSiscapBeanToPersonaSiscap(telefonoPersonaSiscapBean.getPersonaSiscapBean()));

        return telefonoPersonaSiscap;
    }
}
