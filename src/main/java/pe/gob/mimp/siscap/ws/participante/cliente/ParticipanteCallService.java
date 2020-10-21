/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.participante.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.Participante;

/**
 *
 * @author Omar
 */
public interface ParticipanteCallService {

    void crearParticipante(Participante participante);

    void editarParticipante(Participante participante);

//    String obtenerParticipantePorId(BigDecimal nidParticipante);

    List<Participante> loadParticipanteList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

//    Participante find(BigDecimal id);

}
