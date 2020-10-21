/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.usuariobeneficencia.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.UsuarioBeneficenciaBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface UsuarioBeneficenciaCall {

    @POST("/seguridad/usuariobeneficencia/findByParams")
    Call<ResponseData<List<UsuarioBeneficenciaBean>>> findByParams(@Body FindByParamBean findByParamBean);

}
