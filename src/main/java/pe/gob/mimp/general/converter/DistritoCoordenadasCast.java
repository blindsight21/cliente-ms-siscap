/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.converter;

import pe.gob.mimp.general.bean.entidades.DistritoCoordenadasBean;
import pe.gob.mimp.general.modelo.DistritoCoordenadas;

/**
 *
 * @author Omar
 */
public class DistritoCoordenadasCast {

    public static DistritoCoordenadasBean castDistritoCoordenadasToDistritoCoordenadasBean(DistritoCoordenadas distritoCoordenadas) {

        if (distritoCoordenadas == null) {
            return null;
        }

        DistritoCoordenadasBean distritoCoordenadasBean = new DistritoCoordenadasBean();

        distritoCoordenadasBean.setUbigeo(distritoCoordenadas.getUbigeo());
        distritoCoordenadasBean.setNidDistritoCoordenadas(distritoCoordenadas.getNidDistritoCoordenadas());
        distritoCoordenadasBean.setNumLatitud(distritoCoordenadas.getNumLatitud());
        distritoCoordenadasBean.setNumLongitud(distritoCoordenadas.getNumLongitud());
        distritoCoordenadasBean.setNidUsuario(distritoCoordenadas.getNidUsuario());
        distritoCoordenadasBean.setTxtPc(distritoCoordenadas.getTxtPc());
        distritoCoordenadasBean.setTxtIp(distritoCoordenadas.getTxtIp());
        distritoCoordenadasBean.setFlgActivo(distritoCoordenadas.getFlgActivo());
        
        distritoCoordenadasBean.setFecEdicion(distritoCoordenadas.getFecEdicion());

        distritoCoordenadasBean.setDistritoBean(DistritoCast.castDistritoToDistritoBean(distritoCoordenadas.getDistrito()));

        return distritoCoordenadasBean;
    }

    public static DistritoCoordenadas castDistritoCoordenadasBeanToDistritoCoordenadas(DistritoCoordenadasBean distritoCoordenadasBean) {

        if (distritoCoordenadasBean == null) {
            return null;
        }

        DistritoCoordenadas distritoCoordenadas = new DistritoCoordenadas();

        distritoCoordenadas.setUbigeo(distritoCoordenadasBean.getUbigeo());
        distritoCoordenadas.setNidDistritoCoordenadas(distritoCoordenadasBean.getNidDistritoCoordenadas());
        distritoCoordenadas.setNumLatitud(distritoCoordenadasBean.getNumLatitud());
        distritoCoordenadas.setNumLongitud(distritoCoordenadasBean.getNumLongitud());
        distritoCoordenadas.setNidUsuario(distritoCoordenadasBean.getNidUsuario());
        distritoCoordenadas.setTxtPc(distritoCoordenadasBean.getTxtPc());
        distritoCoordenadas.setTxtIp(distritoCoordenadasBean.getTxtIp());
        distritoCoordenadas.setFlgActivo(distritoCoordenadasBean.getFlgActivo());
        
        distritoCoordenadas.setFecEdicion(distritoCoordenadasBean.getFecEdicion());

        distritoCoordenadas.setDistrito(DistritoCast.castDistritoBeanToDistrito(distritoCoordenadasBean.getDistritoBean()));
        
        return distritoCoordenadas;
    }

}
