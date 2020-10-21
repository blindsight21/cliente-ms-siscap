/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import pe.gob.mimp.util.FormatoFechaConstante;

/**
 *
 * @author Omar
 */
public class ParticipanteBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @JsonInclude(Include.NON_NULL)
    private BigDecimal nidParticipante;

    @JsonInclude(Include.NON_NULL)
    private BigInteger flgActivo;

    @JsonInclude(Include.NON_NULL)
    private BigInteger nidUsuario;

    @JsonInclude(Include.NON_NULL)
    private String txtPc;

    @JsonInclude(Include.NON_NULL)
    private String txtIp;

    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecEdicion;

    @JsonInclude(Include.NON_NULL)
    private PersonaSiscapBean personaSiscapBean;

    @JsonInclude(Include.NON_NULL)
    private ActividadGobBean actividadGobBean;

    @JsonInclude(Include.NON_NULL)
    private PublicoObjetivoBean publicoObjetivoBean;

    public BigDecimal getNidParticipante() {
        return nidParticipante;
    }

    public void setNidParticipante(BigDecimal nidParticipante) {
        this.nidParticipante = nidParticipante;
    }

    public BigInteger getFlgActivo() {
        return flgActivo;
    }

    public void setFlgActivo(BigInteger flgActivo) {
        this.flgActivo = flgActivo;
    }

    public BigInteger getNidUsuario() {
        return nidUsuario;
    }

    public void setNidUsuario(BigInteger nidUsuario) {
        this.nidUsuario = nidUsuario;
    }

    public String getTxtPc() {
        return txtPc;
    }

    public void setTxtPc(String txtPc) {
        this.txtPc = txtPc;
    }

    public String getTxtIp() {
        return txtIp;
    }

    public void setTxtIp(String txtIp) {
        this.txtIp = txtIp;
    }

    public Date getFecEdicion() {
        return fecEdicion;
    }

    public void setFecEdicion(Date fecEdicion) {
        this.fecEdicion = fecEdicion;
    }

    public PersonaSiscapBean getPersonaSiscapBean() {
        return personaSiscapBean;
    }

    public void setPersonaSiscapBean(PersonaSiscapBean personaSiscapBean) {
        this.personaSiscapBean = personaSiscapBean;
    }

    public ActividadGobBean getActividadGobBean() {
        return actividadGobBean;
    }

    public void setActividadGobBean(ActividadGobBean actividadGobBean) {
        this.actividadGobBean = actividadGobBean;
    }

    public PublicoObjetivoBean getPublicoObjetivoBean() {
        return publicoObjetivoBean;
    }

    public void setPublicoObjetivoBean(PublicoObjetivoBean publicoObjetivoBean) {
        this.publicoObjetivoBean = publicoObjetivoBean;
    }

    @Override
    public String toString() {
        return "ParticipanteBean{" + "nidParticipante=" + nidParticipante + ", flgActivo=" + flgActivo + ", nidUsuario=" + nidUsuario + ", txtPc=" + txtPc + ", txtIp=" + txtIp + ", fecEdicion=" + fecEdicion + ", personaSiscapBean=" + personaSiscapBean + ", actividadGobBean=" + actividadGobBean + ", publicoObjetivoBean=" + publicoObjetivoBean + '}';
    }

}
