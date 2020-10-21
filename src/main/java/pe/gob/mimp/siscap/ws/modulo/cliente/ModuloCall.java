/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.modulo.cliente;

import java.math.BigDecimal;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.ModuloBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface ModuloCall {

    @GET("/seguridad/modulo/find/{id}")
    Call<ResponseData<ModuloBean>> find(@Path("id") BigDecimal id);

}
