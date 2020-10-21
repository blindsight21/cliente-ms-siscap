/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.correopersona.cliente;

import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.CorreoPersonaBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface CorreoPersonaCall {

    @POST("seguridad/correopersona/crearCorreoPersona")
    Call<ResponseData<Object>> crearCorreoPersona(@Body CorreoPersonaBean correoPersonaBeanNuevo);
}
