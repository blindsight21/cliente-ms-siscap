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
public class ActividadGobPubliObjeBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @JsonInclude(Include.NON_NULL)
    private BigDecimal nidActividadGobPubliObje;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numContadorMarculino;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numContadorFemenino;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numContadorTotal;

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
    private PublicoObjetivoBean publicoObjetivoBean;

    @JsonInclude(Include.NON_NULL)
    private ActividadGobBean actividadGobBean;

    public BigDecimal getNidActividadGobPubliObje() {
        return nidActividadGobPubliObje;
    }

    public void setNidActividadGobPubliObje(BigDecimal nidActividadGobPubliObje) {
        this.nidActividadGobPubliObje = nidActividadGobPubliObje;
    }

    public BigInteger getNumContadorMarculino() {
        return numContadorMarculino;
    }

    public void setNumContadorMarculino(BigInteger numContadorMarculino) {
        this.numContadorMarculino = numContadorMarculino;
    }

    public BigInteger getNumContadorFemenino() {
        return numContadorFemenino;
    }

    public void setNumContadorFemenino(BigInteger numContadorFemenino) {
        this.numContadorFemenino = numContadorFemenino;
    }

    public BigInteger getNumContadorTotal() {
        return numContadorTotal;
    }

    public void setNumContadorTotal(BigInteger numContadorTotal) {
        this.numContadorTotal = numContadorTotal;
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

    public PublicoObjetivoBean getPublicoObjetivoBean() {
        return publicoObjetivoBean;
    }

    public void setPublicoObjetivoBean(PublicoObjetivoBean publicoObjetivoBean) {
        this.publicoObjetivoBean = publicoObjetivoBean;
    }

    public ActividadGobBean getActividadGobBean() {
        return actividadGobBean;
    }

    public void setActividadGobBean(ActividadGobBean actividadGobBean) {
        this.actividadGobBean = actividadGobBean;
    }

    @Override
    public String toString() {
        return "ActividadGPOBean{" + "nidActividadGobPubliObje=" + nidActividadGobPubliObje + ", numContadorMarculino=" + numContadorMarculino + ", numContadorFemenino=" + numContadorFemenino + ", numContadorTotal=" + numContadorTotal + ", flgActivo=" + flgActivo + ", nidUsuario=" + nidUsuario + ", txtPc=" + txtPc + ", txtIp=" + txtIp + ", fecEdicion=" + fecEdicion + ", publicoObjetivoBean=" + publicoObjetivoBean + ", actividadGobBean=" + actividadGobBean + '}';
    }

}
