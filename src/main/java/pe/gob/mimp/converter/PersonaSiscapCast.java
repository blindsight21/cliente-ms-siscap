/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.PersonaSiscapBean;
import pe.gob.mimp.siscap.modelo.PersonaSiscap;


/**
 *
 * @author Omar
 */
public class PersonaSiscapCast {

    public static PersonaSiscapBean castPersonaSiscapToPersonaSiscapBean(PersonaSiscap personaSiscap) {

        if (personaSiscap == null) {
            return null;
        }

        PersonaSiscapBean personaSiscapBean = new PersonaSiscapBean();

        personaSiscapBean.setNidPersonaSiscap(personaSiscap.getNidPersonaSiscap());

        personaSiscapBean.setNidTipoDocumento(personaSiscap.getNidTipoDocumento());
        personaSiscapBean.setTxtDocumento(personaSiscap.getTxtDocumento());
        personaSiscapBean.setTxtApellidoPaterno(personaSiscap.getTxtApellidoPaterno());
        personaSiscapBean.setTxtApellidoMaterno(personaSiscap.getTxtApellidoMaterno());
        personaSiscapBean.setTxtNombres(personaSiscap.getTxtNombres());
        personaSiscapBean.setFecNacimiento(personaSiscap.getFecNacimiento());
        personaSiscapBean.setTxtSexo(personaSiscap.getTxtSexo());

        personaSiscapBean.setFlgActivo(personaSiscap.getFlgActivo());
        personaSiscapBean.setNidUsuario(personaSiscap.getNidUsuario());
        personaSiscapBean.setTxtPc(personaSiscap.getTxtPc());
        personaSiscapBean.setTxtIp(personaSiscap.getTxtIp());
        personaSiscapBean.setFecEdicion(personaSiscap.getFecEdicion());

        return personaSiscapBean;
    }

    public static PersonaSiscap castPersonaSiscapBeanToPersonaSiscap(PersonaSiscapBean personaSiscapBean) {

        if (personaSiscapBean == null) {
            return null;
        }

        PersonaSiscap personaSiscap = new PersonaSiscap();

        personaSiscap.setNidPersonaSiscap(personaSiscapBean.getNidPersonaSiscap());

        personaSiscap.setNidTipoDocumento(personaSiscapBean.getNidTipoDocumento());
        personaSiscap.setTxtDocumento(personaSiscapBean.getTxtDocumento());
        personaSiscap.setTxtApellidoPaterno(personaSiscapBean.getTxtApellidoPaterno());
        personaSiscap.setTxtApellidoMaterno(personaSiscapBean.getTxtApellidoMaterno());
        personaSiscap.setTxtNombres(personaSiscapBean.getTxtNombres());
        personaSiscap.setFecNacimiento(personaSiscapBean.getFecNacimiento());
        personaSiscap.setTxtSexo(personaSiscapBean.getTxtSexo());

        personaSiscap.setFlgActivo(personaSiscapBean.getFlgActivo());
        personaSiscap.setNidUsuario(personaSiscapBean.getNidUsuario());
        personaSiscap.setTxtPc(personaSiscapBean.getTxtPc());
        personaSiscap.setTxtIp(personaSiscapBean.getTxtIp());
        personaSiscap.setFecEdicion(personaSiscapBean.getFecEdicion());

        return personaSiscap;
    }
}
