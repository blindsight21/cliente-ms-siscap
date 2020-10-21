/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.TipoDocumentoModuloBean;
import pe.gob.mimp.seguridad.modelo.TipoDocumentoModulo;

/**
 *
 * @author Omar
 */
public class TipoDocumentoModuloCast {

    public static TipoDocumentoModuloBean castTipoDocumentoModuloToTipoDocumentoModuloBean(TipoDocumentoModulo tipoDocumento) {

        if (tipoDocumento == null) {
            return null;
        }

        TipoDocumentoModuloBean tipoDocumentoBean = new TipoDocumentoModuloBean();

        tipoDocumentoBean.setNidTipoDocumentoModulo(tipoDocumento.getNidTipoDocumentoModulo());
        tipoDocumentoBean.setFlgActivo(tipoDocumento.getFlgActivo());
        tipoDocumentoBean.setNidUsuario(tipoDocumento.getNidUsuario());
        tipoDocumentoBean.setTxtPc(tipoDocumento.getTxtPc());
        tipoDocumentoBean.setTxtIp(tipoDocumento.getTxtIp());
        tipoDocumentoBean.setFecEdicion(tipoDocumento.getFecEdicion());
        tipoDocumentoBean.setNidTipoDocumento(tipoDocumento.getNidTipoDocumento());
        tipoDocumentoBean.setNidModulo(tipoDocumento.getNidModulo());
        
        return tipoDocumentoBean;
    }

    public static TipoDocumentoModulo castTipoDocumentoModuloBeanToTipoDocumentoModulo(TipoDocumentoModuloBean tipoDocumentoBean) {

        if (tipoDocumentoBean == null) {
            return null;
        }

        TipoDocumentoModulo tipoDocumento = new TipoDocumentoModulo();

        tipoDocumento.setNidTipoDocumentoModulo(tipoDocumentoBean.getNidTipoDocumentoModulo());
        tipoDocumento.setFlgActivo(tipoDocumentoBean.getFlgActivo());
        tipoDocumento.setNidUsuario(tipoDocumentoBean.getNidUsuario());
        tipoDocumento.setTxtPc(tipoDocumentoBean.getTxtPc());
        tipoDocumento.setTxtIp(tipoDocumentoBean.getTxtIp());
        tipoDocumento.setFecEdicion(tipoDocumentoBean.getFecEdicion());
        tipoDocumento.setNidTipoDocumento(tipoDocumentoBean.getNidTipoDocumento());
        tipoDocumento.setNidModulo(tipoDocumentoBean.getNidModulo());

        return tipoDocumento;
    }
}
