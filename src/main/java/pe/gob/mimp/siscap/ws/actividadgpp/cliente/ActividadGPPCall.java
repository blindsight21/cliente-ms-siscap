/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgpp.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ActividadGobPubliProcBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface ActividadGPPCall {

    @POST("/actividadgpp/crearActividadGPP")
    Call<ResponseData<ActividadGobPubliProcBean>> crearActividadGPP(@Body ActividadGobPubliProcBean actividadGobPubliProcBean);

    @POST("/actividadgpp/editarActividadGPP")
    Call<ResponseData<ActividadGobPubliProcBean>> editarActividadGPP(@Body ActividadGobPubliProcBean actividadGobPubliProcBean);

    @POST("/actividadgpp/loadActividadGPPList")
    Call<ResponseData<List<ActividadGobPubliProcBean>>> loadActividadGPPList(@Body FindByParamBean findByParamBean);

    @POST("/actividadgpp/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

}
