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
public class VwActividadBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @JsonInclude(Include.NON_NULL)
    private BigInteger nidActividadGob;
    @JsonInclude(Include.NON_NULL)
    private String txtObjetivo;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidTipoObjetivo;
    @JsonInclude(Include.NON_NULL)
    private String txtTipoObjetivo;
    @JsonInclude(Include.NON_NULL)
    private String txtTema;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidGobierno;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidEstadoActividadGob;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidTipoModalidad;
    @JsonInclude(Include.NON_NULL)
    private String txtTipoModalidad;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidModalidadActividad;
    @JsonInclude(Include.NON_NULL)
    private String txtModalidadActividad;
    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecInicio;
    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecFin;
    @JsonInclude(Include.NON_NULL)
    private BigInteger numAnio;
    @JsonInclude(Include.NON_NULL)
    private BigInteger numTrimestre;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidArea;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidDepartamento;

    public BigInteger getNidActividadGob() {
        return nidActividadGob;
    }

    public void setNidActividadGob(BigInteger nidActividadGob) {
        this.nidActividadGob = nidActividadGob;
    }

    public String getTxtObjetivo() {
        return txtObjetivo;
    }

    public void setTxtObjetivo(String txtObjetivo) {
        this.txtObjetivo = txtObjetivo;
    }

    public BigInteger getNidTipoObjetivo() {
        return nidTipoObjetivo;
    }

    public void setNidTipoObjetivo(BigInteger nidTipoObjetivo) {
        this.nidTipoObjetivo = nidTipoObjetivo;
    }

    public String getTxtTipoObjetivo() {
        return txtTipoObjetivo;
    }

    public void setTxtTipoObjetivo(String txtTipoObjetivo) {
        this.txtTipoObjetivo = txtTipoObjetivo;
    }

    public String getTxtTema() {
        return txtTema;
    }

    public void setTxtTema(String txtTema) {
        this.txtTema = txtTema;
    }

    public BigInteger getNidGobierno() {
        return nidGobierno;
    }

    public void setNidGobierno(BigInteger nidGobierno) {
        this.nidGobierno = nidGobierno;
    }

    public BigInteger getNidEstadoActividadGob() {
        return nidEstadoActividadGob;
    }

    public void setNidEstadoActividadGob(BigInteger nidEstadoActividadGob) {
        this.nidEstadoActividadGob = nidEstadoActividadGob;
    }

    public BigInteger getNidTipoModalidad() {
        return nidTipoModalidad;
    }

    public void setNidTipoModalidad(BigInteger nidTipoModalidad) {
        this.nidTipoModalidad = nidTipoModalidad;
    }

    public String getTxtTipoModalidad() {
        return txtTipoModalidad;
    }

    public void setTxtTipoModalidad(String txtTipoModalidad) {
        this.txtTipoModalidad = txtTipoModalidad;
    }

    public BigInteger getNidModalidadActividad() {
        return nidModalidadActividad;
    }

    public void setNidModalidadActividad(BigInteger nidModalidadActividad) {
        this.nidModalidadActividad = nidModalidadActividad;
    }

    public String getTxtModalidadActividad() {
        return txtModalidadActividad;
    }

    public void setTxtModalidadActividad(String txtModalidadActividad) {
        this.txtModalidadActividad = txtModalidadActividad;
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

    public BigInteger getNumAnio() {
        return numAnio;
    }

    public void setNumAnio(BigInteger numAnio) {
        this.numAnio = numAnio;
    }

    public BigInteger getNumTrimestre() {
        return numTrimestre;
    }

    public void setNumTrimestre(BigInteger numTrimestre) {
        this.numTrimestre = numTrimestre;
    }

    public BigInteger getNidArea() {
        return nidArea;
    }

    public void setNidArea(BigInteger nidArea) {
        this.nidArea = nidArea;
    }

    public BigInteger getNidDepartamento() {
        return nidDepartamento;
    }

    public void setNidDepartamento(BigInteger nidDepartamento) {
        this.nidDepartamento = nidDepartamento;
    }

    @Override
    public String toString() {
        return "VwActividadBean{" + "nidActividadGob=" + nidActividadGob + ", txtObjetivo=" + txtObjetivo + ", nidTipoObjetivo=" + nidTipoObjetivo + ", txtTipoObjetivo=" + txtTipoObjetivo + ", txtTema=" + txtTema + ", nidGobierno=" + nidGobierno + ", nidEstadoActividadGob=" + nidEstadoActividadGob + ", nidTipoModalidad=" + nidTipoModalidad + ", txtTipoModalidad=" + txtTipoModalidad + ", nidModalidadActividad=" + nidModalidadActividad + ", txtModalidadActividad=" + txtModalidadActividad + ", fecInicio=" + fecInicio + ", fecFin=" + fecFin + ", numAnio=" + numAnio + ", numTrimestre=" + numTrimestre + ", nidArea=" + nidArea + ", nidDepartamento=" + nidDepartamento + '}';
    }

}
