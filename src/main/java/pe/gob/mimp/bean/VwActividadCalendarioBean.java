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
import java.math.BigInteger;
import java.util.Date;
import pe.gob.mimp.util.FormatoFechaConstante;

/**
 *
 * @author Omar
 */
public class VwActividadCalendarioBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @JsonInclude(Include.NON_NULL)
    private BigInteger nidActividadGob;
    @JsonInclude(Include.NON_NULL)
    private String txtTema;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidArea;
    @JsonInclude(Include.NON_NULL)
    private String txtArea;
    @JsonInclude(Include.NON_NULL)
    private String txtSigla;
    @JsonInclude(Include.NON_NULL)
    private String txtNombres;
    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecInicio;
    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecFin;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidGobierno;
    @JsonInclude(Include.NON_NULL)
    private String txtGobierno;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidEstadoActividadGob;
    @JsonInclude(Include.NON_NULL)
    private String txtEstadoActividadGob;

    public BigInteger getNidActividadGob() {
        return nidActividadGob;
    }

    public void setNidActividadGob(BigInteger nidActividadGob) {
        this.nidActividadGob = nidActividadGob;
    }

    public String getTxtTema() {
        return txtTema;
    }

    public void setTxtTema(String txtTema) {
        this.txtTema = txtTema;
    }

    public BigInteger getNidArea() {
        return nidArea;
    }

    public void setNidArea(BigInteger nidArea) {
        this.nidArea = nidArea;
    }

    public String getTxtArea() {
        return txtArea;
    }

    public void setTxtArea(String txtArea) {
        this.txtArea = txtArea;
    }

    public String getTxtSigla() {
        return txtSigla;
    }

    public void setTxtSigla(String txtSigla) {
        this.txtSigla = txtSigla;
    }

    public String getTxtNombres() {
        return txtNombres;
    }

    public void setTxtNombres(String txtNombres) {
        this.txtNombres = txtNombres;
    }

    public Date getFecInicio() {
        return fecInicio;
    }

    public void setFecInicio(Date fecInicio) {
        this.fecInicio = fecInicio;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    public BigInteger getNidGobierno() {
        return nidGobierno;
    }

    public void setNidGobierno(BigInteger nidGobierno) {
        this.nidGobierno = nidGobierno;
    }

    public String getTxtGobierno() {
        return txtGobierno;
    }

    public void setTxtGobierno(String txtGobierno) {
        this.txtGobierno = txtGobierno;
    }

    public BigInteger getNidEstadoActividadGob() {
        return nidEstadoActividadGob;
    }

    public void setNidEstadoActividadGob(BigInteger nidEstadoActividadGob) {
        this.nidEstadoActividadGob = nidEstadoActividadGob;
    }

    public String getTxtEstadoActividadGob() {
        return txtEstadoActividadGob;
    }

    public void setTxtEstadoActividadGob(String txtEstadoActividadGob) {
        this.txtEstadoActividadGob = txtEstadoActividadGob;
    }

    @Override
    public String toString() {
        return "VwActividadCalendarioBean{" + "nidActividadGob=" + nidActividadGob + ", txtTema=" + txtTema + ", nidArea=" + nidArea + ", txtArea=" + txtArea + ", txtSigla=" + txtSigla + ", txtNombres=" + txtNombres + ", fecInicio=" + fecInicio + ", fecFin=" + fecFin + ", nidGobierno=" + nidGobierno + ", txtGobierno=" + txtGobierno + ", nidEstadoActividadGob=" + nidEstadoActividadGob + ", txtEstadoActividadGob=" + txtEstadoActividadGob + '}';
    }

}
