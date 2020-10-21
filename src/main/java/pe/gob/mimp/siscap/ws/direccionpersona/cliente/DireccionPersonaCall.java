/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.direccionpersona.cliente;

import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.DireccionPersonaBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface DireccionPersonaCall {

    @POST("/seguridad/direccionpersona/crearDireccionPersona")
    Call<ResponseData<Object>> crearDireccionPersona(@Body DireccionPersonaBean direccionPersonaBeanNuevo);

}
