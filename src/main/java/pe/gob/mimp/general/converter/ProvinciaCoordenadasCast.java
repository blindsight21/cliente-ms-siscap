/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.converter;

import pe.gob.mimp.general.bean.entidades.ProvinciaCoordenadasBean;
import pe.gob.mimp.general.modelo.ProvinciaCoordenadas;

/**
 *
 * @author Omar
 */
public class ProvinciaCoordenadasCast {

    public static ProvinciaCoordenadasBean castProvinciaCoordenadasToProvinciaCoordenadasBean(ProvinciaCoordenadas provinciaCoordenadas) {

        if (provinciaCoordenadas == null) {
            return null;
        }

        ProvinciaCoordenadasBean provinciaCoordenadasBean = new ProvinciaCoordenadasBean();

        provinciaCoordenadasBean.setNidProvinciaCoordenadas(provinciaCoordenadas.getNidProvinciaCoordenadas());
        provinciaCoordenadasBean.setNumLatitud(provinciaCoordenadas.getNumLatitud());
        provinciaCoordenadasBean.setNumLongitud(provinciaCoordenadas.getNumLongitud());
        provinciaCoordenadasBean.setNidUsuario(provinciaCoordenadas.getNidUsuario());
        provinciaCoordenadasBean.setTxtPc(provinciaCoordenadas.getTxtPc());
        provinciaCoordenadasBean.setTxtIp(provinciaCoordenadas.getTxtIp());
        provinciaCoordenadasBean.setFlgActivo(provinciaCoordenadas.getFlgActivo());

        provinciaCoordenadasBean.setProvinciaBean(ProvinciaCast.castProvinciaToProvinciaBean(provinciaCoordenadas.getProvincia()));

        return provinciaCoordenadasBean;
    }

    public static ProvinciaCoordenadas castProvinciaCoordenadasBeanToProvinciaCoordenadas(ProvinciaCoordenadasBean provinciaCoordenadasBean) {

        if (provinciaCoordenadasBean == null) {
            return null;
        }

        ProvinciaCoordenadas provinciaCoordenadas = new ProvinciaCoordenadas();

        provinciaCoordenadas.setNidProvinciaCoordenadas(provinciaCoordenadasBean.getNidProvinciaCoordenadas());
        provinciaCoordenadas.setNumLatitud(provinciaCoordenadasBean.getNumLatitud());
        provinciaCoordenadas.setNumLongitud(provinciaCoordenadasBean.getNumLongitud());
        provinciaCoordenadas.setNidUsuario(provinciaCoordenadasBean.getNidUsuario());
        provinciaCoordenadas.setTxtPc(provinciaCoordenadasBean.getTxtPc());
        provinciaCoordenadas.setTxtIp(provinciaCoordenadasBean.getTxtIp());
        provinciaCoordenadas.setFlgActivo(provinciaCoordenadasBean.getFlgActivo());

        provinciaCoordenadas.setProvincia(ProvinciaCast.castProvinciaBeanToProvincia(provinciaCoordenadasBean.getProvinciaBean()));
        
        return provinciaCoordenadas;
    }

}
