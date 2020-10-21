/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.archivoactividad.cliente;

import pe.gob.mimp.siscap.ws.archivoactividad.cliente.*;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ArchivoActividadBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface ArchivoActividadCall {

    @POST("/archivoactividad/crearArchivoActividad")
    Call<ResponseData<Object>> crearArchivoActividad(@Body ArchivoActividadBean archivoActividadBean);

    @POST("/archivoactividad/editarArchivoActividad")
    Call<ResponseData<Object>> editarArchivoActividad(@Body ArchivoActividadBean archivoActividadBean);

    @POST("/archivoactividad/loadArchivoActividadList")
    Call<ResponseData<List<ArchivoActividadBean>>> loadArchivoActividadList(@Body FindByParamBean findByParamBean);

    @POST("/archivoactividad/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

}
