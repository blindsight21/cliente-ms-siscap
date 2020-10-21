/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.direccionpersona.cliente;

import java.io.IOException;
import java.util.Arrays;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.DireccionPersonaBean;
import pe.gob.mimp.seguridad.converter.DireccionPersonaCast;
import pe.gob.mimp.seguridad.modelo.DireccionPersona;
import retrofit2.Call;

/**
 *
 * @author Omar
 */
public class DireccionPersonaCallServiceImpl implements DireccionPersonaCallService {

    private DireccionPersonaCall direccionPersonaCall = DireccionPersonaServiceGenerator.createService(DireccionPersonaCall.class);

    @Override
    public void crearDireccionPersona(DireccionPersona direccionPersonaNuevo) {

        DireccionPersonaBean direccionPersonaBeanNuevo = DireccionPersonaCast.castDireccionPersonaToDireccionPersonaBean(direccionPersonaNuevo);

        Call<ResponseData<Object>> callSync = direccionPersonaCall.crearDireccionPersona(direccionPersonaBeanNuevo);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

}
