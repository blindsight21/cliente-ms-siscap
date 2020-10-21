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
public class VwReporteActividadBean implements Serializable {

    @JsonInclude(Include.NON_NULL)
    private BigInteger nidActividadGob;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidTipoObjetivo;
    @JsonInclude(Include.NON_NULL)
    private String txtTipoObjetivo;
    @JsonInclude(Include.NON_NULL)
    private String txtObjetivo;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidEstadoActividadGob;
    @JsonInclude(Include.NON_NULL)
    private String txtEstadoActividadGob;
    @JsonInclude(Include.NON_NULL)
    private String publicoObjetivo;
    @JsonInclude(Include.NON_NULL)
    private String txtTema;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidGobierno;
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
    private BigInteger numTrimestre;
    @JsonInclude(Include.NON_NULL)
    private String txtTrimestre;
    @JsonInclude(Include.NON_NULL)
    private BigInteger numAnio;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidUsuario;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidArea;
    @JsonInclude(Include.NON_NULL)
    private BigInteger numContadorFemenino;
    @JsonInclude(Include.NON_NULL)
    private BigInteger numContadorMasculino;
    @JsonInclude(Include.NON_NULL)
    private BigInteger numContadorTotal;
    @JsonInclude(Include.NON_NULL)
    private String txtGobierno;
    @JsonInclude(Include.NON_NULL)
    private BigInteger nidDepartamento;
    @JsonInclude(Include.NON_NULL)
    private String txtSigla;
    @JsonInclude(Include.NON_NULL)
    private String txtArea;
    @JsonInclude(Include.NON_NULL)
    private String txtJustificacionReprogramado;
    @JsonInclude(Include.NON_NULL)
    private String txtJustificacionAnulado;
    @JsonInclude(Include.NON_NULL)
    private String resultadoTipoNivel;
    @JsonInclude(Include.NON_NULL)
    private String resultadoDescripcion;

    public BigInteger getNidActividadGob() {
        return nidActividadGob;
    }

    public void setNidActividadGob(BigInteger nidActividadGob) {
        this.nidActividadGob = nidActividadGob;
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

    public String getTxtObjetivo() {
        return txtObjetivo;
    }

    public void setTxtObjetivo(String txtObjetivo) {
        this.txtObjetivo = txtObjetivo;
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

    public String getPublicoObjetivo() {
        return publicoObjetivo;
    }

    public void setPublicoObjetivo(String publicoObjetivo) {
        this.publicoObjetivo = publicoObjetivo;
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

    public BigInteger getNumTrimestre() {
        return numTrimestre;
    }

    public void setNumTrimestre(BigInteger numTrimestre) {
        this.numTrimestre = numTrimestre;
    }

    public String getTxtTrimestre() {
        return txtTrimestre;
    }

    public void setTxtTrimestre(String txtTrimestre) {
        this.txtTrimestre = txtTrimestre;
    }

    public BigInteger getNumAnio() {
        return numAnio;
    }

    public void setNumAnio(BigInteger numAnio) {
        this.numAnio = numAnio;
    }

    public BigInteger getNidUsuario() {
        return nidUsuario;
    }

    public void setNidUsuario(BigInteger nidUsuario) {
        this.nidUsuario = nidUsuario;
    }

    public BigInteger getNidArea() {
        return nidArea;
    }

    public void setNidArea(BigInteger nidArea) {
        this.nidArea = nidArea;
    }

    public BigInteger getNumContadorFemenino() {
        return numContadorFemenino;
    }

    public void setNumContadorFemenino(BigInteger numContadorFemenino) {
        this.numContadorFemenino = numContadorFemenino;
    }

    public BigInteger getNumContadorMasculino() {
        return numContadorMasculino;
    }

    public void setNumContadorMasculino(BigInteger numContadorMasculino) {
        this.numContadorMasculino = numContadorMasculino;
    }

    public BigInteger getNumContadorTotal() {
        return numContadorTotal;
    }

    public void setNumContadorTotal(BigInteger numContadorTotal) {
        this.numContadorTotal = numContadorTotal;
    }

    public String getTxtGobierno() {
        return txtGobierno;
    }

    public void setTxtGobierno(String txtGobierno) {
        this.txtGobierno = txtGobierno;
    }

    public BigInteger getNidDepartamento() {
        return nidDepartamento;
    }

    public void setNidDepartamento(BigInteger nidDepartamento) {
        this.nidDepartamento = nidDepartamento;
    }

    public String getTxtSigla() {
        return txtSigla;
    }

    public void setTxtSigla(String txtSigla) {
        this.txtSigla = txtSigla;
    }

    public String getTxtArea() {
        return txtArea;
    }

    public void setTxtArea(String txtArea) {
        this.txtArea = txtArea;
    }

    public String getTxtJustificacionReprogramado() {
        return txtJustificacionReprogramado;
    }

    public void setTxtJustificacionReprogramado(String txtJustificacionReprogramado) {
        this.txtJustificacionReprogramado = txtJustificacionReprogramado;
    }

    public String getTxtJustificacionAnulado() {
        return txtJustificacionAnulado;
    }

    public void setTxtJustificacionAnulado(String txtJustificacionAnulado) {
        this.txtJustificacionAnulado = txtJustificacionAnulado;
    }

    public String getResultadoTipoNivel() {
        return resultadoTipoNivel;
    }

    public void setResultadoTipoNivel(String resultadoTipoNivel) {
        this.resultadoTipoNivel = resultadoTipoNivel;
    }

    public String getResultadoDescripcion() {
        return resultadoDescripcion;
    }

    public void setResultadoDescripcion(String resultadoDescripcion) {
        this.resultadoDescripcion = resultadoDescripcion;
    }

    @Override
    public String toString() {
        return "VwReporteActividadBean{" + "nidActividadGob=" + nidActividadGob + ", nidTipoObjetivo=" + nidTipoObjetivo + ", txtTipoObjetivo=" + txtTipoObjetivo + ", txtObjetivo=" + txtObjetivo + ", nidEstadoActividadGob=" + nidEstadoActividadGob + ", txtEstadoActividadGob=" + txtEstadoActividadGob + ", publicoObjetivo=" + publicoObjetivo + ", txtTema=" + txtTema + ", nidGobierno=" + nidGobierno + ", nidTipoModalidad=" + nidTipoModalidad + ", txtTipoModalidad=" + txtTipoModalidad + ", nidModalidadActividad=" + nidModalidadActividad + ", txtModalidadActividad=" + txtModalidadActividad + ", fecInicio=" + fecInicio + ", fecFin=" + fecFin + ", numTrimestre=" + numTrimestre + ", txtTrimestre=" + txtTrimestre + ", numAnio=" + numAnio + ", nidUsuario=" + nidUsuario + ", nidArea=" + nidArea + ", numContadorFemenino=" + numContadorFemenino + ", numContadorMasculino=" + numContadorMasculino + ", numContadorTotal=" + numContadorTotal + ", txtGobierno=" + txtGobierno + ", nidDepartamento=" + nidDepartamento + ", txtSigla=" + txtSigla + ", txtArea=" + txtArea + ", txtJustificacionReprogramado=" + txtJustificacionReprogramado + ", txtJustificacionAnulado=" + txtJustificacionAnulado + ", resultadoTipoNivel=" + resultadoTipoNivel + ", resultadoDescripcion=" + resultadoDescripcion + '}';
    }
    
}
