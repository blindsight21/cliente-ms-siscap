/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.converter;

import pe.gob.mimp.general.bean.entidades.DepartamentoCoordenadasBean;
import pe.gob.mimp.general.modelo.DepartamentoCoordenadas;

/**
 *
 * @author Omar
 */
public class DepartamentoCoordenadasCast {

    public static DepartamentoCoordenadasBean castDepartamentoCoordenadasToDepartamentoCoordenadasBean(DepartamentoCoordenadas departamentoCoordenadas) {

        if (departamentoCoordenadas == null) {
            return null;
        }

        DepartamentoCoordenadasBean departamentoCoordenadasBean = new DepartamentoCoordenadasBean();

        departamentoCoordenadasBean.setNidDepartamentoCoordenadas(departamentoCoordenadas.getNidDepartamentoCoordenadas());
        departamentoCoordenadasBean.setNumLatitud(departamentoCoordenadas.getNumLatitud());
        departamentoCoordenadasBean.setNumLongitud(departamentoCoordenadas.getNumLongitud());
        departamentoCoordenadasBean.setNidUsuario(departamentoCoordenadas.getNidUsuario());
        departamentoCoordenadasBean.setTxtPc(departamentoCoordenadas.getTxtPc());
        departamentoCoordenadasBean.setTxtIp(departamentoCoordenadas.getTxtIp());
        departamentoCoordenadasBean.setFlgActivo(departamentoCoordenadas.getFlgActivo());
        departamentoCoordenadasBean.setNumOrden(departamentoCoordenadas.getNumOrden());
        departamentoCoordenadasBean.setFecEdicion(departamentoCoordenadas.getFecEdicion());

        departamentoCoordenadasBean.setDepartamentoBean(DepartamentoCast.castDepartamentoToDepartamentoBean(departamentoCoordenadas.getDepartamento()));

        return departamentoCoordenadasBean;
    }

    public static DepartamentoCoordenadas castDepartamentoCoordenadasBeanToDepartamentoCoordenadas(DepartamentoCoordenadasBean departamentoCoordenadasBean) {

        if (departamentoCoordenadasBean == null) {
            return null;
        }

        DepartamentoCoordenadas departamentoCoordenadas = new DepartamentoCoordenadas();

        departamentoCoordenadas.setNidDepartamentoCoordenadas(departamentoCoordenadasBean.getNidDepartamentoCoordenadas());
        departamentoCoordenadas.setNumLatitud(departamentoCoordenadasBean.getNumLatitud());
        departamentoCoordenadas.setNumLongitud(departamentoCoordenadasBean.getNumLongitud());
        departamentoCoordenadas.setNidUsuario(departamentoCoordenadasBean.getNidUsuario());
        departamentoCoordenadas.setTxtPc(departamentoCoordenadasBean.getTxtPc());
        departamentoCoordenadas.setTxtIp(departamentoCoordenadasBean.getTxtIp());
        departamentoCoordenadas.setFlgActivo(departamentoCoordenadasBean.getFlgActivo());
        departamentoCoordenadas.setNumOrden(departamentoCoordenadasBean.getNumOrden());
        departamentoCoordenadas.setFecEdicion(departamentoCoordenadasBean.getFecEdicion());

        departamentoCoordenadas.setDepartamento(DepartamentoCast.castDepartamentoBeanToDepartamento(departamentoCoordenadasBean.getDepartamentoBean()));
        
        return departamentoCoordenadas;
    }

}
