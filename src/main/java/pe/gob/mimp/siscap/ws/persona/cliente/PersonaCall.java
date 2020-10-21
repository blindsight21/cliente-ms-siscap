/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.persona.cliente;

import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.PersonaBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface PersonaCall {

    @POST("/seguridad/persona/crearPersona")
    Call<ResponseData<Object>> crearPersona(@Body PersonaBean personaBeanNuevo);

}
