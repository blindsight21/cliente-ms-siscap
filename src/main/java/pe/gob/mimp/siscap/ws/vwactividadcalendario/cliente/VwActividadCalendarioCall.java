/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwactividadcalendario.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.VwActividadCalendarioBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface VwActividadCalendarioCall {

    @POST("/consultavistasiscap/vwactividadcalendario/loadVwActividadCalendarioList")
    Call<ResponseData<List<VwActividadCalendarioBean>>> loadVwActividadCalendarioList(@Body FindByParamBean findByParamBean);

}
