/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.CorreoPersonaBean;
import pe.gob.mimp.seguridad.modelo.CorreoPersona;


/**
 *
 * @author Omar
 */
public class CorreoPersonaCast {

    public static CorreoPersonaBean castCorreoPersonaToCorreoPersonaBean(CorreoPersona correoPersona) {

        if (correoPersona == null) {
            return null;
        }

        CorreoPersonaBean correoPersonaBean = new CorreoPersonaBean();

        correoPersonaBean.setNidCorreoPersona(correoPersona.getNidCorreoPersona());
        correoPersonaBean.setTxtCorreoPersona(correoPersona.getTxtCorreoPersona());
        correoPersonaBean.setNidPersona(correoPersona.getNidPersona());
        correoPersonaBean.setFlgActivo(correoPersona.getFlgActivo());
        correoPersonaBean.setNidUsuario(correoPersona.getNidUsuario());
        correoPersonaBean.setTxtPc(correoPersona.getTxtPc());
        correoPersonaBean.setTxtIp(correoPersona.getTxtIp());
        correoPersonaBean.setFecEdicion(correoPersona.getFecEdicion());

        return correoPersonaBean;
    }

    public static CorreoPersona castCorreoPersonaBeanToCorreoPersona(CorreoPersonaBean correoPersonaBean) {

        if (correoPersonaBean == null) {
            return null;
        }

        CorreoPersona correoPersona = new CorreoPersona();

        correoPersona.setNidCorreoPersona(correoPersonaBean.getNidCorreoPersona());
        correoPersona.setTxtCorreoPersona(correoPersonaBean.getTxtCorreoPersona());
        correoPersona.setNidPersona(correoPersonaBean.getNidPersona());
        correoPersona.setFlgActivo(correoPersonaBean.getFlgActivo());
        correoPersona.setNidUsuario(correoPersonaBean.getNidUsuario());
        correoPersona.setTxtPc(correoPersonaBean.getTxtPc());
        correoPersona.setTxtIp(correoPersonaBean.getTxtIp());
        correoPersona.setFecEdicion(correoPersonaBean.getFecEdicion());

        return correoPersona;
    }
}
