/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.converter;

import pe.gob.mimp.general.bean.entidades.DistritoBean;
import pe.gob.mimp.general.modelo.Distrito;

/**
 *
 * @author Omar
 */
public class DistritoCast {
    
    public static DistritoBean castDistritoToDistritoBean(Distrito distrito) {

        if (distrito == null) {
            return null;
        }

        DistritoBean distritoBean = new DistritoBean();

        distritoBean.setCidDistrito(distrito.getCidDistrito());
        distritoBean.setTxtDescripcion(distrito.getTxtDescripcion());
        distritoBean.setFlgActivo(distrito.getFlgActivo());
        distritoBean.setNidUsuario(distrito.getNidUsuario());
        distritoBean.setTxtPc(distrito.getTxtPc());
        distritoBean.setTxtIp(distrito.getTxtIp());
        distritoBean.setFecEdicion(distrito.getFecEdicion());
        distritoBean.setNidDistrito(distrito.getNidDistrito());
        distritoBean.setProvinciaBean(ProvinciaCast.castProvinciaToProvinciaBean(distrito.getProvincia()));

        return distritoBean;
    }
    
    public static Distrito castDistritoBeanToDistrito(DistritoBean distritoBean) {

        if (distritoBean == null) {
            return null;
        }

        Distrito distrito = new Distrito();

        distrito.setNidDistrito(distritoBean.getNidDistrito());
        distrito.setTxtDescripcion(distritoBean.getTxtDescripcion());
        distrito.setFlgActivo(distritoBean.getFlgActivo());
        distrito.setNidUsuario(distritoBean.getNidUsuario());
        distrito.setTxtPc(distritoBean.getTxtPc());
        distrito.setTxtIp(distritoBean.getTxtIp());
        distrito.setFecEdicion(distritoBean.getFecEdicion());
        distrito.setNidDistrito(distritoBean.getNidDistrito());
        distrito.setProvincia(ProvinciaCast.castProvinciaBeanToProvincia(distritoBean.getProvinciaBean()));

        return distrito;
    }
}
