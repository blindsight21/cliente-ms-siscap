/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.ParticipanteBean;
import pe.gob.mimp.siscap.modelo.Participante;


/**
 *
 * @author Omar
 */
public class ParticipanteCast {

    public static ParticipanteBean castParticipanteToParticipanteBean(Participante participante) {

        if (participante == null) {
            return null;
        }

        ParticipanteBean participanteBean = new ParticipanteBean();

        participanteBean.setNidParticipante(participante.getNidParticipante());

        participanteBean.setNidUsuario(participante.getNidUsuario());
        participanteBean.setTxtPc(participante.getTxtPc());
        participanteBean.setTxtIp(participante.getTxtIp());
        participanteBean.setFecEdicion(participante.getFecEdicion());
        participanteBean.setFlgActivo(participante.getFlgActivo());

        participanteBean.setPersonaSiscapBean(PersonaSiscapCast.castPersonaSiscapToPersonaSiscapBean(participante.getNidPersonaSiscap()));
        participanteBean.setActividadGobBean(ActividadGobCast.castActividadGobToActividadGobBean(participante.getNidActividadGob()));
        participanteBean.setPublicoObjetivoBean(PublicoObjetivoCast.castPublicoObjetivoToPublicoObjetivoBean(participante.getNidPublicoObjetivo()));

        return participanteBean;
    }

    public static Participante castParticipanteBeanToParticipante(ParticipanteBean participanteBean) {

        if (participanteBean == null) {
            return null;
        }

        Participante participante = new Participante();

        participante.setNidParticipante(participanteBean.getNidParticipante());

        participante.setNidUsuario(participanteBean.getNidUsuario());
        participante.setTxtPc(participanteBean.getTxtPc());
        participante.setTxtIp(participanteBean.getTxtIp());
        participante.setFecEdicion(participanteBean.getFecEdicion());
        participante.setFlgActivo(participanteBean.getFlgActivo());

        participante.setNidPersonaSiscap(PersonaSiscapCast.castPersonaSiscapBeanToPersonaSiscap(participanteBean.getPersonaSiscapBean()));
        participante.setNidActividadGob(ActividadGobCast.castActividadGobBeanToActividadGob(participanteBean.getActividadGobBean()));
        participante.setNidPublicoObjetivo(PublicoObjetivoCast.castPublicoObjetivoBeanToPublicoObjetivo(participanteBean.getPublicoObjetivoBean()));

        return participante;
    }
}
