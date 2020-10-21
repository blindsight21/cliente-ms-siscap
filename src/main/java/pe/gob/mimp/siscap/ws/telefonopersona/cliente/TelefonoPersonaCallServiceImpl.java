/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.telefonopersona.cliente;

import java.io.IOException;
import java.util.Arrays;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.TelefonoPersonaBean;
import pe.gob.mimp.seguridad.converter.TelefonoPersonaCast;
import pe.gob.mimp.seguridad.modelo.TelefonoPersona;
import retrofit2.Call;

/**
 *
 * @author Omar
 */
public class TelefonoPersonaCallServiceImpl implements TelefonoPersonaCallService {

    private TelefonoPersonaCall telefonoPersonaCall = TelefonoPersonaServiceGenerator.createService(TelefonoPersonaCall.class);

    @Override
    public void crearTelefonoPersona(TelefonoPersona telefonoPersonaNuevo) {

        TelefonoPersonaBean telefonoPersonaBeanNuevo = TelefonoPersonaCast.castTelefonoPersonaToTelefonoPersonaBean(telefonoPersonaNuevo);

        Call<ResponseData<Object>> callSync = telefonoPersonaCall.crearTelefonoPersona(telefonoPersonaBeanNuevo);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

}
