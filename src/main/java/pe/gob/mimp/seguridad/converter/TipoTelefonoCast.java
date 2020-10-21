/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.TipoTelefonoBean;
import pe.gob.mimp.seguridad.modelo.TipoTelefono;

/**
 *
 * @author Omar
 */
public class TipoTelefonoCast {

    public static TipoTelefonoBean castTipoTelefonoToTipoTelefonoBean(TipoTelefono tipoTelefono) {

        if (tipoTelefono == null) {
            return null;
        }

        TipoTelefonoBean tipoTelefonoBean = new TipoTelefonoBean();

        tipoTelefonoBean.setNidTipoTelefono(tipoTelefono.getNidTipoTelefono());
        tipoTelefonoBean.setTxtTipoTelefono(tipoTelefono.getTxtTipoTelefono());
        tipoTelefonoBean.setFlgActivo(tipoTelefono.getFlgActivo());
        tipoTelefonoBean.setNidUsuario(tipoTelefono.getNidUsuario());
        tipoTelefonoBean.setTxtPc(tipoTelefono.getTxtPc());
        tipoTelefonoBean.setTxtIp(tipoTelefono.getTxtIp());
        tipoTelefonoBean.setFecEdicion(tipoTelefono.getFecEdicion());

        return tipoTelefonoBean;
    }

    public static TipoTelefono castTipoTelefonoBeanToTipoTelefono(TipoTelefonoBean tipoTelefonoBean) {

        if (tipoTelefonoBean == null) {
            return null;
        }

        TipoTelefono tipoTelefono = new TipoTelefono();

        tipoTelefono.setNidTipoTelefono(tipoTelefonoBean.getNidTipoTelefono());
        tipoTelefono.setTxtTipoTelefono(tipoTelefonoBean.getTxtTipoTelefono());
        tipoTelefono.setFlgActivo(tipoTelefonoBean.getFlgActivo());
        tipoTelefono.setNidUsuario(tipoTelefonoBean.getNidUsuario());
        tipoTelefono.setTxtPc(tipoTelefonoBean.getTxtPc());
        tipoTelefono.setTxtIp(tipoTelefonoBean.getTxtIp());
        tipoTelefono.setFecEdicion(tipoTelefonoBean.getFecEdicion());

        return tipoTelefono;
    }
}
