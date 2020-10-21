/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.DireccionPersonaBean;
import pe.gob.mimp.seguridad.modelo.DireccionPersona;

/**
 *
 * @author Omar
 */
public class DireccionPersonaCast {

    public static DireccionPersonaBean castDireccionPersonaToDireccionPersonaBean(DireccionPersona direccionPersona) {

        if (direccionPersona == null) {
            return null;
        }

        DireccionPersonaBean direccionPersonaBean = new DireccionPersonaBean();

        direccionPersonaBean.setNidDireccionPersona(direccionPersona.getNidDireccionPersona());
        direccionPersonaBean.setNidDistrito(direccionPersona.getNidDistrito());
        direccionPersonaBean.setNidVia(direccionPersona.getNidVia());
        direccionPersonaBean.setTxtDireccion(direccionPersona.getTxtDireccion());
        direccionPersonaBean.setFlgActivo(direccionPersona.getFlgActivo());
        direccionPersonaBean.setNidUsuario(direccionPersona.getNidUsuario());
        direccionPersonaBean.setTxtPc(direccionPersona.getTxtPc());
        direccionPersonaBean.setTxtIp(direccionPersona.getTxtIp());
        direccionPersonaBean.setFecEdicion(direccionPersona.getFecEdicion());
        direccionPersonaBean.setNidLugar(direccionPersona.getNidLugar());
        direccionPersonaBean.setTxtLugar(direccionPersona.getTxtLugar());
        direccionPersonaBean.setPersonaBean(PersonaCast.castPersonaToPersonaBean(direccionPersona.getPersona()));

        return direccionPersonaBean;
    }

    public static DireccionPersona castDireccionPersonaBeanToDireccionPersona(DireccionPersonaBean direccionPersonaBean) {

        if (direccionPersonaBean == null) {
            return null;
        }

        DireccionPersona direccionPersona = new DireccionPersona();

        direccionPersona.setNidDireccionPersona(direccionPersonaBean.getNidDireccionPersona());
        direccionPersona.setNidDistrito(direccionPersonaBean.getNidDistrito());
        direccionPersona.setNidVia(direccionPersonaBean.getNidVia());
        direccionPersona.setTxtDireccion(direccionPersonaBean.getTxtDireccion());
        direccionPersona.setFlgActivo(direccionPersonaBean.getFlgActivo());
        direccionPersona.setNidUsuario(direccionPersonaBean.getNidUsuario());
        direccionPersona.setTxtPc(direccionPersonaBean.getTxtPc());
        direccionPersona.setTxtIp(direccionPersonaBean.getTxtIp());
        direccionPersona.setFecEdicion(direccionPersonaBean.getFecEdicion());
        direccionPersona.setNidLugar(direccionPersonaBean.getNidLugar());
        direccionPersona.setTxtLugar(direccionPersonaBean.getTxtLugar());
        direccionPersona.setPersona(PersonaCast.castPersonaBeanToPersona(direccionPersonaBean.getPersonaBean()));

        return direccionPersona;
    }
}
