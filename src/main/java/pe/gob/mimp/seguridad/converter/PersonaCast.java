/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.PersonaBean;
import pe.gob.mimp.seguridad.modelo.Persona;

/**
 *
 * @author Omar
 */
public class PersonaCast {

    public static PersonaBean castPersonaToPersonaBean(Persona persona) {

        if (persona == null) {
            return null;
        }

        PersonaBean personaBean = new PersonaBean();

        personaBean.setNidPersona(persona.getNidPersona());
        personaBean.setTxtDocumento(persona.getTxtDocumento());
        personaBean.setTxtApellidoPaterno(persona.getTxtApellidoPaterno());
        personaBean.setTxtApellidoMaterno(persona.getTxtApellidoMaterno());
        personaBean.setTxtNombres(persona.getTxtNombres());
        personaBean.setFecNacimiento(persona.getFecNacimiento());
        personaBean.setTxtSexo(persona.getTxtSexo());
        personaBean.setNidArea(persona.getNidArea());
        personaBean.setTxtFoto(persona.getTxtFoto());
        personaBean.setFlgActivo(persona.getFlgActivo());
        personaBean.setTxtPc(persona.getTxtPc());
        personaBean.setTxtIp(persona.getTxtIp());
        personaBean.setFecEdicion(persona.getFecEdicion());
        personaBean.setTxtWeb(persona.getTxtWeb());
        personaBean.setCargoBean(CargoCast.castCargoToCargoBean(persona.getCargo()));
        personaBean.setTipoDocumentoBean(TipoDocumentoCast.castTipoDocumentoToTipoDocumentoBean(persona.getTipoDocumento()));
        personaBean.setTipoPersonaBean(TipoPersonaCast.castTipoPersonaToTipoPersonaBean(persona.getTipoPersona()));
//        personaBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(persona.getUsuario()));

        return personaBean;
    }

    public static Persona castPersonaBeanToPersona(PersonaBean personaBean) {

        if (personaBean == null) {
            return null;
        }

        Persona persona = new Persona();

        persona.setNidPersona(personaBean.getNidPersona());
        persona.setTxtDocumento(personaBean.getTxtDocumento());
        persona.setTxtApellidoPaterno(personaBean.getTxtApellidoPaterno());
        persona.setTxtApellidoMaterno(personaBean.getTxtApellidoMaterno());
        persona.setTxtNombres(personaBean.getTxtNombres());
        persona.setFecNacimiento(personaBean.getFecNacimiento());
        persona.setTxtSexo(personaBean.getTxtSexo());
        persona.setNidArea(personaBean.getNidArea());
        persona.setTxtFoto(personaBean.getTxtFoto());
        persona.setFlgActivo(personaBean.getFlgActivo());
        persona.setTxtPc(personaBean.getTxtPc());
        persona.setTxtIp(personaBean.getTxtIp());
        persona.setFecEdicion(personaBean.getFecEdicion());
        persona.setTxtWeb(personaBean.getTxtWeb());
        persona.setCargo(CargoCast.castCargoBeanToCargo(personaBean.getCargoBean()));
        persona.setTipoDocumento(TipoDocumentoCast.castTipoDocumentoBeanToTipoDocumento(personaBean.getTipoDocumentoBean()));
        persona.setTipoPersona(TipoPersonaCast.castTipoPersonaBeanToTipoPersona(personaBean.getTipoPersonaBean()));
//        persona.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(personaBean.getUsuarioBean()));

        return persona;
    }
}
