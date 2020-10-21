/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.provinciacoordenadas.cliente;

import java.util.List;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.ProvinciaBean;
import pe.gob.mimp.general.bean.entidades.ProvinciaCoordenadasBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface ProvinciaCoordenadasCall {

    @POST("/general/provinciacoordenadas/obtenerCoordenadas")
    Call<ResponseData<List<ProvinciaCoordenadasBean>>> obtenerCoordenadas(@Body ProvinciaBean provinciaBean);

}
