/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.participante.cliente;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ParticipanteBean;
import pe.gob.mimp.converter.ParticipanteCast;
import pe.gob.mimp.siscap.modelo.Participante;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ParticipanteCallServiceImpl implements ParticipanteCallService {

    private ParticipanteCall participanteCall = ParticipanteServiceGenerator.createService(ParticipanteCall.class);

    @Override
    public void crearParticipante(Participante participante) {

        ParticipanteBean participanteBean = ParticipanteCast.castParticipanteToParticipanteBean(participante);

        Call<ResponseData<Object>> callSync = participanteCall.crearParticipante(participanteBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarParticipante(Participante participante) {

        ParticipanteBean participanteBean = ParticipanteCast.castParticipanteToParticipanteBean(participante);

        Call<ResponseData<Object>> callSync = participanteCall.editarParticipante(participanteBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

//    @Override
//    public String obtenerParticipantePorId(BigDecimal nidParticipante) {
//
//        Call<ResponseData<String>> callSync = participanteCall.obtenerParticipantePorId(nidParticipante);
//
//        try {
//            Response<ResponseData<String>> response = callSync.execute();
//            return response.body().getResultado();
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//    }
    @Override
    public List<Participante> loadParticipanteList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<ParticipanteBean>>> callSync = participanteCall.loadParticipanteList(findByParamBean);

        try {
            Response<ResponseData<List<ParticipanteBean>>> response = callSync.execute();

            List<ParticipanteBean> loadParticipanteBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadParticipanteBeanList)) {
                return new ArrayList<>();
            }

            return loadParticipanteBeanList.stream().map(participanteBean -> {
                return ParticipanteCast.castParticipanteBeanToParticipante(participanteBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = participanteCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

//    @Override
//    public Participante find(BigDecimal id) {
//
//        Call<ResponseData<ParticipanteBean>> callSync = participanteCall.find(id);
//
//        try {
//            Response<ResponseData<ParticipanteBean>> response = callSync.execute();
//            ParticipanteBean participanteBean = response.body().getResultado();
//
//            return ParticipanteCast.castParticipanteBeanToParticipante(participanteBean);
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//
//    }
}
