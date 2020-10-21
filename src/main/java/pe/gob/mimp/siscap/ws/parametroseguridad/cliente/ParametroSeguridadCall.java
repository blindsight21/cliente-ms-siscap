/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.parametroseguridad.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.ParametroSeguridadBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface ParametroSeguridadCall {

    @POST("/seguridad/parametroseguridad/findAllByField")
    Call<ResponseData<List<ParametroSeguridadBean>>> findAllByField(@Body FindAllByFieldBean findAllByFieldBean);

}
