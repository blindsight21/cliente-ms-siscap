/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.correopersona.cliente;

import java.io.IOException;
import java.util.Arrays;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.CorreoPersonaBean;
import pe.gob.mimp.seguridad.converter.CorreoPersonaCast;
import pe.gob.mimp.seguridad.modelo.CorreoPersona;
import retrofit2.Call;

/**
 *
 * @author Omar
 */
public class CorreoPersonaCallServiceImpl implements CorreoPersonaCallService {

    private CorreoPersonaCall correoPersonaCall = CorreoPersonaServiceGenerator.createService(CorreoPersonaCall.class);

    @Override
    public void crearCorreoPersona(CorreoPersona correoPersonaNuevo) {

        CorreoPersonaBean correoPersonaBean = CorreoPersonaCast.castCorreoPersonaToCorreoPersonaBean(correoPersonaNuevo);

        Call<ResponseData<Object>> callSync = correoPersonaCall.crearCorreoPersona(correoPersonaBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }
}
