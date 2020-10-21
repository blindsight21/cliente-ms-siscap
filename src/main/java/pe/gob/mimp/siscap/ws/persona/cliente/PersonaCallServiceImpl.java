/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.persona.cliente;

import java.io.IOException;
import java.util.Arrays;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.PersonaBean;
import pe.gob.mimp.seguridad.converter.PersonaCast;
import pe.gob.mimp.seguridad.modelo.Persona;
import retrofit2.Call;

/**
 *
 * @author Omar
 */
public class PersonaCallServiceImpl implements PersonaCallService {

    private PersonaCall personaCall = PersonaServiceGenerator.createService(PersonaCall.class);

    @Override
    public void crearPersona(Persona persona) {

        PersonaBean personaBeanNuevo = PersonaCast.castPersonaToPersonaBean(persona);

        Call<ResponseData<Object>> callSync = personaCall.crearPersona(personaBeanNuevo);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

}
