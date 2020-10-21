/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.converter;

import pe.gob.mimp.general.bean.entidades.ProvinciaBean;
import pe.gob.mimp.general.modelo.Provincia;

/**
 *
 * @author Omar
 */
public class ProvinciaCast {
    
    
    public static ProvinciaBean castProvinciaToProvinciaBean(Provincia provincia) {

        if (provincia == null) {
            return null;
        }

        ProvinciaBean provinciaBean = new ProvinciaBean();

        provinciaBean.setCidProvincia(provincia.getCidProvincia());
        provinciaBean.setTxtDescripcion(provincia.getTxtDescripcion());
        provinciaBean.setFlgActivo(provincia.getFlgActivo());
        provinciaBean.setNidUsuario(provincia.getNidUsuario());
        provinciaBean.setTxtPc(provincia.getTxtPc());
        provinciaBean.setTxtIp(provincia.getTxtIp());
        provinciaBean.setFecEdicion(provincia.getFecEdicion());
        provinciaBean.setNidProvincia(provincia.getNidProvincia());
        provinciaBean.setDepartamentoBean(DepartamentoCast.castDepartamentoToDepartamentoBean(provincia.getDepartamento()));

        return provinciaBean;
    }
    
    public static Provincia castProvinciaBeanToProvincia(ProvinciaBean provinciaBean) {

        if (provinciaBean == null) {
            return null;
        }

        Provincia provincia = new Provincia();

        provincia.setNidProvincia(provinciaBean.getNidProvincia());
        provincia.setTxtDescripcion(provinciaBean.getTxtDescripcion());
        provincia.setFlgActivo(provinciaBean.getFlgActivo());
        provincia.setNidUsuario(provinciaBean.getNidUsuario());
        provincia.setTxtPc(provinciaBean.getTxtPc());
        provincia.setTxtIp(provinciaBean.getTxtIp());
        provincia.setFecEdicion(provinciaBean.getFecEdicion());
        provincia.setNidProvincia(provinciaBean.getNidProvincia());
        provincia.setDepartamento(DepartamentoCast.castDepartamentoBeanToDepartamento(provinciaBean.getDepartamentoBean()));

        return provincia;
    }

}
