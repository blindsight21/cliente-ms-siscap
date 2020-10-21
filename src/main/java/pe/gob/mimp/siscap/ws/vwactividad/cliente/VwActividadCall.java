/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwactividad.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.VwActividadBean;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface VwActividadCall {

    @GET("/consultavistasiscap/vwactividad/findAll")
    Call<ResponseData<List<VwActividadBean>>> findAll();

    @GET("/consultavistasiscap/vwactividad/obtenerActividadesDepartamento/{nidDepartamento}")
    Call<ResponseData<List<VwActividadBean>>> obtenerActividadesDepartamento(@Path("nidDepartamento") BigDecimal nidDepartamento);

}
