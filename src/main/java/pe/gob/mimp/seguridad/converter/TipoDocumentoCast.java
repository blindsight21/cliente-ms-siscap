/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.TipoDocumentoBean;
import pe.gob.mimp.seguridad.modelo.TipoDocumento;

/**
 *
 * @author Omar
 */
public class TipoDocumentoCast {

    public static TipoDocumentoBean castTipoDocumentoToTipoDocumentoBean(TipoDocumento tipoDocumento) {

        if (tipoDocumento == null) {
            return null;
        }

        TipoDocumentoBean tipoDocumentoBean = new TipoDocumentoBean();

        tipoDocumentoBean.setNidTipoDocumento(tipoDocumento.getNidTipoDocumento());
        tipoDocumentoBean.setTxtDescripcion(tipoDocumento.getTxtDescripcion());
        tipoDocumentoBean.setFlgActivo(tipoDocumento.getFlgActivo());
        tipoDocumentoBean.setTxtPc(tipoDocumento.getTxtPc());
        tipoDocumentoBean.setTxtIp(tipoDocumento.getTxtIp());
        tipoDocumentoBean.setFecEdicion(tipoDocumento.getFecEdicion());
//        tipoDocumentoBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(tipoDocumento.getUsuario()));

        return tipoDocumentoBean;
    }

    public static TipoDocumento castTipoDocumentoBeanToTipoDocumento(TipoDocumentoBean tipoDocumentoBean) {

        if (tipoDocumentoBean == null) {
            return null;
        }

        TipoDocumento tipoDocumento = new TipoDocumento();

        tipoDocumento.setNidTipoDocumento(tipoDocumentoBean.getNidTipoDocumento());
        tipoDocumento.setTxtDescripcion(tipoDocumentoBean.getTxtDescripcion());
        tipoDocumento.setFlgActivo(tipoDocumentoBean.getFlgActivo());
        tipoDocumento.setTxtPc(tipoDocumentoBean.getTxtPc());
        tipoDocumento.setTxtIp(tipoDocumentoBean.getTxtIp());
        tipoDocumento.setFecEdicion(tipoDocumentoBean.getFecEdicion());
//        tipoDocumento.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(tipoDocumentoBean.getUsuarioBean()));

        return tipoDocumento;
    }
}
