/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipodocumento.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.TipoDocumentoBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface TipoDocumentoCall {

    @POST("/seguridad/tipodocumento/crearTipoDocumento")
    Call<ResponseData<Object>> crearTipoDocumento(@Body TipoDocumentoBean tipoDocumentoBean);

    @POST("/seguridad/tipodocumento/editarTipoDocumento")
    Call<ResponseData<Object>> editarTipoDocumento(@Body TipoDocumentoBean tipoDocumentoBean);

    @GET("/seguridad/tipodocumento/obtenerTipoDocumentoPorId/{nidTipoDocumento}")
    Call<ResponseData<String>> obtenerTipoDocumentoPorId(@Path("nidTipoDocumento") BigDecimal nidTipoDocumento);

    @GET("/seguridad/tipodocumento/findAll")
    Call<ResponseData<List<TipoDocumentoBean>>> findAll();
    
    @POST("/seguridad/tipodocumento/loadTipoDocumentoList")
    Call<ResponseData<List<TipoDocumentoBean>>> loadTipoDocumentoList(@Body FindByParamBean findByParamBean);

    @POST("/seguridad/tipodocumento/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

    @GET("/seguridad/tipodocumento/obtener/{nombre}")
    Call<ResponseData<TipoDocumentoBean>> obtener(@Path("nombre") String nombre);
    
    @GET("/seguridad/tipodocumento/find/{id}")
    Call<ResponseData<TipoDocumentoBean>> find(@Path("id") BigDecimal id);

}
