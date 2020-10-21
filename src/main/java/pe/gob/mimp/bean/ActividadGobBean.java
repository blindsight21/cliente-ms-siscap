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
public class ActividadGobBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @JsonInclude(Include.NON_NULL)
    private BigDecimal nidActividadGob;

    @JsonInclude(Include.NON_NULL)
    private String txtObjetivo;

    @JsonInclude(Include.NON_NULL)
    private String txtTema;

    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecInicio;

    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecFin;

    @JsonInclude(Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecCreacion;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numAnio;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numTrimestre;

    @JsonInclude(Include.NON_NULL)
    private String txtObservacionEliminado;

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
    private BigInteger nidArea;

    @JsonInclude(Include.NON_NULL)
    private BigInteger nidDepartamento;

    @JsonInclude(Include.NON_NULL)
    private String txtResponsableApepat;

    @JsonInclude(Include.NON_NULL)
    private String txtResponsableApemat;

    @JsonInclude(Include.NON_NULL)
    private String txtResponsableNombre;

    @JsonInclude(Include.NON_NULL)
    private String txtResponsableTelef;

    @JsonInclude(Include.NON_NULL)
    private String txtResponsableCorreo;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numContadorMasculino;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numContadorFemenino;

    @JsonInclude(Include.NON_NULL)
    private BigInteger numContadorTotal;

    @JsonInclude(Include.NON_NULL)
    private String txtJustificacionReprogramado;

    @JsonInclude(Include.NON_NULL)
    private String txtJustificacionAnulado;

    @JsonInclude(Include.NON_NULL)
    private TipoObjetivoBean tipoObjetivoBean;

    @JsonInclude(Include.NON_NULL)
    private TipoModalidadBean tipoModalidadBean;

    @JsonInclude(Include.NON_NULL)
    private ModalidadActividadBean modalidadActividadBean;

    @JsonInclude(Include.NON_NULL)
    private GobiernoBean gobiernoBean;

    @JsonInclude(Include.NON_NULL)
    private FuncionTransferidaBean funcionTransferidaBean;

    @JsonInclude(Include.NON_NULL)
    private BigDecimal nidTipoFuncion;

    @JsonInclude(Include.NON_NULL)
    private BigDecimal nidTipoGobierno;

    @JsonInclude(Include.NON_NULL)
    private BigDecimal nidEstadoActividad;

    public BigDecimal getNidActividadGob() {
        return nidActividadGob;
    }

    public void setNidActividadGob(BigDecimal nidActividadGob) {
        this.nidActividadGob = nidActividadGob;
    }

    public String getTxtObjetivo() {
        return txtObjetivo;
    }

    public void setTxtObjetivo(String txtObjetivo) {
        this.txtObjetivo = txtObjetivo;
    }

    public String getTxtTema() {
        return txtTema;
    }

    public void setTxtTema(String txtTema) {
        this.txtTema = txtTema;
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

    public Date getFecCreacion() {
        return fecCreacion;
    }

    public void setFecCreacion(Date fecCreacion) {
        this.fecCreacion = fecCreacion;
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

    public String getTxtObservacionEliminado() {
        return txtObservacionEliminado;
    }

    public void setTxtObservacionEliminado(String txtObservacionEliminado) {
        this.txtObservacionEliminado = txtObservacionEliminado;
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

    public String getTxtResponsableApepat() {
        return txtResponsableApepat;
    }

    public void setTxtResponsableApepat(String txtResponsableApepat) {
        this.txtResponsableApepat = txtResponsableApepat;
    }

    public String getTxtResponsableApemat() {
        return txtResponsableApemat;
    }

    public void setTxtResponsableApemat(String txtResponsableApemat) {
        this.txtResponsableApemat = txtResponsableApemat;
    }

    public String getTxtResponsableNombre() {
        return txtResponsableNombre;
    }

    public void setTxtResponsableNombre(String txtResponsableNombre) {
        this.txtResponsableNombre = txtResponsableNombre;
    }

    public String getTxtResponsableTelef() {
        return txtResponsableTelef;
    }

    public void setTxtResponsableTelef(String txtResponsableTelef) {
        this.txtResponsableTelef = txtResponsableTelef;
    }

    public String getTxtResponsableCorreo() {
        return txtResponsableCorreo;
    }

    public void setTxtResponsableCorreo(String txtResponsableCorreo) {
        this.txtResponsableCorreo = txtResponsableCorreo;
    }

    public BigInteger getNumContadorMasculino() {
        return numContadorMasculino;
    }

    public void setNumContadorMasculino(BigInteger numContadorMasculino) {
        this.numContadorMasculino = numContadorMasculino;
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

    public TipoObjetivoBean getTipoObjetivoBean() {
        return tipoObjetivoBean;
    }

    public void setTipoObjetivoBean(TipoObjetivoBean tipoObjetivoBean) {
        this.tipoObjetivoBean = tipoObjetivoBean;
    }

    public TipoModalidadBean getTipoModalidadBean() {
        return tipoModalidadBean;
    }

    public void setTipoModalidadBean(TipoModalidadBean tipoModalidadBean) {
        this.tipoModalidadBean = tipoModalidadBean;
    }

    public ModalidadActividadBean getModalidadActividadBean() {
        return modalidadActividadBean;
    }

    public void setModalidadActividadBean(ModalidadActividadBean modalidadActividadBean) {
        this.modalidadActividadBean = modalidadActividadBean;
    }

    public GobiernoBean getGobiernoBean() {
        return gobiernoBean;
    }

    public void setGobiernoBean(GobiernoBean gobiernoBean) {
        this.gobiernoBean = gobiernoBean;
    }

    public FuncionTransferidaBean getFuncionTransferidaBean() {
        return funcionTransferidaBean;
    }

    public void setFuncionTransferidaBean(FuncionTransferidaBean funcionTransferidaBean) {
        this.funcionTransferidaBean = funcionTransferidaBean;
    }

    public BigDecimal getNidTipoFuncion() {
        return nidTipoFuncion;
    }
    
    public void setNidTipoFuncion(BigDecimal nidTipoFuncion) {
        this.nidTipoFuncion = nidTipoFuncion;
    }

    public BigDecimal getNidTipoGobierno() {
        return nidTipoGobierno;
    }

    public void setNidTipoGobierno(BigDecimal nidTipoGobierno) {
        this.nidTipoGobierno = nidTipoGobierno;
    }

    public BigDecimal getNidEstadoActividad() {
        return nidEstadoActividad;
    }

    public void setNidEstadoActividad(BigDecimal nidEstadoActividad) {
        this.nidEstadoActividad = nidEstadoActividad;
    }

    @Override
    public String toString() {
        return "ActividadGobBean{" + "nidActividadGob=" + nidActividadGob + ", txtObjetivo=" + txtObjetivo + ", txtTema=" + txtTema + ", fecInicio=" + fecInicio + ", fecFin=" + fecFin + ", fecCreacion=" + fecCreacion + ", numAnio=" + numAnio + ", numTrimestre=" + numTrimestre + ", txtObservacionEliminado=" + txtObservacionEliminado + ", flgActivo=" + flgActivo + ", nidUsuario=" + nidUsuario + ", txtPc=" + txtPc + ", txtIp=" + txtIp + ", fecEdicion=" + fecEdicion + ", nidArea=" + nidArea + ", nidDepartamento=" + nidDepartamento + ", txtResponsableApepat=" + txtResponsableApepat + ", txtResponsableApemat=" + txtResponsableApemat + ", txtResponsableNombre=" + txtResponsableNombre + ", txtResponsableTelef=" + txtResponsableTelef + ", txtResponsableCorreo=" + txtResponsableCorreo + ", numContadorMasculino=" + numContadorMasculino + ", numContadorFemenino=" + numContadorFemenino + ", numContadorTotal=" + numContadorTotal + ", txtJustificacionReprogramado=" + txtJustificacionReprogramado + ", txtJustificacionAnulado=" + txtJustificacionAnulado + ", tipoObjetivoBean=" + tipoObjetivoBean + ", tipoModalidadBean=" + tipoModalidadBean + ", modalidadActividadBean=" + modalidadActividadBean + ", gobiernoBean=" + gobiernoBean + ", funcionTransferidaBean=" + funcionTransferidaBean + ", nidTipoFuncion=" + nidTipoFuncion + ", nidTipoGobierno=" + nidTipoGobierno + ", nidEstadoActividad=" + nidEstadoActividad + '}';
    }

}
