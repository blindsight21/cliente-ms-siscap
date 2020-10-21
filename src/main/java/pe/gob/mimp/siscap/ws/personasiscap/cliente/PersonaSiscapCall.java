/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.personasiscap.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.PersonaSiscapBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface PersonaSiscapCall {

    @POST("/personasiscap/crearPersonaSiscap")
    Call<ResponseData<Object>> crearPersonaSiscap(@Body PersonaSiscapBean personaSiscapBean);

    @POST("/personasiscap/editarPersonaSiscap")
    Call<ResponseData<Object>> editarPersonaSiscap(@Body PersonaSiscapBean personaSiscapBean);

    @POST("/personasiscap/loadPersonaSiscapList")
    Call<ResponseData<List<PersonaSiscapBean>>> loadPersonaSiscapList(@Body FindByParamBean findByParamBean);

    @GET("/personasiscap/find/{id}")
    Call<ResponseData<PersonaSiscapBean>> find(@Path("id") BigDecimal id);

    @POST("/personasiscap/findAllByField")
    Call<ResponseData<List<PersonaSiscapBean>>> findAllByField(@Body FindAllByFieldBean findAllByFieldBean);

}
