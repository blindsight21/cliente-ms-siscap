/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgr.cliente;

import java.util.List;
import pe.gob.mimp.bean.ActividadGobResultadoBean;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface ActividadGRCall {

    @POST("/actividadgr/crearActividadGR")
    Call<ResponseData<Object>> crearActividadGR(@Body ActividadGobResultadoBean actividadGobResultadoBean);

    @POST("/actividadgr/editarActividadGR")
    Call<ResponseData<Object>> editarActividadGR(@Body ActividadGobResultadoBean actividadGobResultadoBean);

    @POST("/actividadgr/loadActividadGRList")
    Call<ResponseData<List<ActividadGobResultadoBean>>> loadActividadGRList(@Body FindByParamBean findByParamBean);

    @POST("/actividadgr/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

}
