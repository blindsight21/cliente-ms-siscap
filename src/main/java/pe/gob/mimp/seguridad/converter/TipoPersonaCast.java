/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.TipoPersonaBean;
import pe.gob.mimp.seguridad.modelo.TipoPersona;

/**
 *
 * @author Omar
 */
public class TipoPersonaCast {

    public static TipoPersonaBean castTipoPersonaToTipoPersonaBean(TipoPersona tipoPersona) {

        if (tipoPersona == null) {
            return null;
        }

        TipoPersonaBean tipoPersonaBean = new TipoPersonaBean();

        tipoPersonaBean.setNidTipoPersona(tipoPersona.getNidTipoPersona());
        tipoPersonaBean.setTxtTipoPersona(tipoPersona.getTxtTipoPersona());
        tipoPersonaBean.setFlgActivo(tipoPersona.getFlgActivo());
        tipoPersonaBean.setNidUsuario(tipoPersona.getNidUsuario());
        tipoPersonaBean.setTxtPc(tipoPersona.getTxtPc());
        tipoPersonaBean.setTxtIp(tipoPersona.getTxtIp());
        tipoPersonaBean.setFecEdicion(tipoPersona.getFecEdicion());

        return tipoPersonaBean;
    }

    public static TipoPersona castTipoPersonaBeanToTipoPersona(TipoPersonaBean tipoPersonaBean) {

        if (tipoPersonaBean == null) {
            return null;
        }

        TipoPersona tipoPersona = new TipoPersona();

        tipoPersona.setNidTipoPersona(tipoPersonaBean.getNidTipoPersona());
        tipoPersona.setTxtTipoPersona(tipoPersonaBean.getTxtTipoPersona());
        tipoPersona.setFlgActivo(tipoPersonaBean.getFlgActivo());
        tipoPersona.setNidUsuario(tipoPersonaBean.getNidUsuario());
        tipoPersona.setTxtPc(tipoPersonaBean.getTxtPc());
        tipoPersona.setTxtIp(tipoPersonaBean.getTxtIp());
        tipoPersona.setFecEdicion(tipoPersonaBean.getFecEdicion());

        return tipoPersona;
    }
}
