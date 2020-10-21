/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.participante.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ParticipanteBean;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 *
 * @author Omar
 */
public interface ParticipanteCall {

    @POST("/participante/crearParticipante")
    Call<ResponseData<Object>> crearParticipante(@Body ParticipanteBean participanteBean);

    @POST("/participante/editarParticipante")
    Call<ResponseData<Object>> editarParticipante(@Body ParticipanteBean participanteBean);

    @POST("/participante/loadParticipanteList")
    Call<ResponseData<List<ParticipanteBean>>> loadParticipanteList(@Body FindByParamBean findByParamBean);

    @POST("/participante/getRecordCount")
    Call<ResponseData<Integer>> getRecordCount(@Body FindByParamBean findByParamBean);

}
