/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.telefonopersona.cliente;

import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.TelefonoPersonaBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface TelefonoPersonaCall {

    @POST("/seguridad/telefonopersona/crearTelefonoPersona")
    Call<ResponseData<Object>> crearTelefonoPersona(@Body TelefonoPersonaBean telefonoPersonaBeanNuevo);

}
