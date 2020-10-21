/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwreporteactividad.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.VwReporteActividadBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface VwReporteActividadCall {

    @GET("/consultavistasiscap/vwreporteactividad/findAll")
    Call<ResponseData<List<VwReporteActividadBean>>> findAll();

    @POST("/consultavistasiscap/vwreporteactividad/loadVwReporteActList")
    Call<ResponseData<List<VwReporteActividadBean>>> loadVwReporteActList(@Body FindByParamBean findByParamBean);

}
