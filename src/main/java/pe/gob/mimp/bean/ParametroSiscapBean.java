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
public class ParametroSiscapBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @JsonInclude(Include.NON_NULL)
    private BigDecimal nidParametro;

    @JsonInclude(Include.NON_NULL)
    private String cidParametro;

    @JsonInclude(Include.NON_NULL)
    private BigInteger nidParametroPadre;

    @JsonInclude(Include.NON_NULL)
    private String txtValor;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numValor1;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numValor2;

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
    private String comentario;

    public BigDecimal getNidParametro() {
        return nidParametro;
    }

    public void setNidParametro(BigDecimal nidParametro) {
        this.nidParametro = nidParametro;
    }

    public String getCidParametro() {
        return cidParametro;
    }

    public void setCidParametro(String cidParametro) {
        this.cidParametro = cidParametro;
    }

    public BigInteger getNidParametroPadre() {
        return nidParametroPadre;
    }

    public void setNidParametroPadre(BigInteger nidParametroPadre) {
        this.nidParametroPadre = nidParametroPadre;
    }

    public String getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(String txtValor) {
        this.txtValor = txtValor;
    }

    public BigInteger getNumValor1() {
        return numValor1;
    }

    public void setNumValor1(BigInteger numValor1) {
        this.numValor1 = numValor1;
    }

    public BigInteger getNumValor2() {
        return numValor2;
    }

    public void setNumValor2(BigInteger numValor2) {
        this.numValor2 = numValor2;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "ParametroSiscapBean{" + "nidParametro=" + nidParametro + ", cidParametro=" + cidParametro + ", nidParametroPadre=" + nidParametroPadre + ", txtValor=" + txtValor + ", numValor1=" + numValor1 + ", numValor2=" + numValor2 + ", flgActivo=" + flgActivo + ", nidUsuario=" + nidUsuario + ", txtPc=" + txtPc + ", txtIp=" + txtIp + ", fecEdicion=" + fecEdicion + ", comentario=" + comentario + '}';
    }

}
