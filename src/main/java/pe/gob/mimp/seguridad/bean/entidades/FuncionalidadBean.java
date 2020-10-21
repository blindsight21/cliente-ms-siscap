/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.bean.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import pe.gob.mimp.util.FormatoFechaConstante;

/**
 *
 * @author desarrollador
 */
public class FuncionalidadBean implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal nidFuncionalidad;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidFuncionalidadPadre;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtTitulo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtFuncionalidad;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtReferencia;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtTarget;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtCss;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtImagen;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger numOrden;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger flgEstado;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger flgActivo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtPc;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtIp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecEdicion;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ModuloBean moduloBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UsuarioBean usuarioBean;

    public BigDecimal getNidFuncionalidad() {
        return nidFuncionalidad;
    }

    public void setNidFuncionalidad(BigDecimal nidFuncionalidad) {
        this.nidFuncionalidad = nidFuncionalidad;
    }

    public BigInteger getNidFuncionalidadPadre() {
        return nidFuncionalidadPadre;
    }

    public void setNidFuncionalidadPadre(BigInteger nidFuncionalidadPadre) {
        this.nidFuncionalidadPadre = nidFuncionalidadPadre;
    }

    public String getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(String txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public String getTxtFuncionalidad() {
        return txtFuncionalidad;
    }

    public void setTxtFuncionalidad(String txtFuncionalidad) {
        this.txtFuncionalidad = txtFuncionalidad;
    }

    public String getTxtReferencia() {
        return txtReferencia;
    }

    public void setTxtReferencia(String txtReferencia) {
        this.txtReferencia = txtReferencia;
    }

    public String getTxtTarget() {
        return txtTarget;
    }

    public void setTxtTarget(String txtTarget) {
        this.txtTarget = txtTarget;
    }

    public String getTxtCss() {
        return txtCss;
    }

    public void setTxtCss(String txtCss) {
        this.txtCss = txtCss;
    }

    public String getTxtImagen() {
        return txtImagen;
    }

    public void setTxtImagen(String txtImagen) {
        this.txtImagen = txtImagen;
    }

    public BigInteger getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(BigInteger numOrden) {
        this.numOrden = numOrden;
    }

    public BigInteger getFlgEstado() {
        return flgEstado;
    }

    public void setFlgEstado(BigInteger flgEstado) {
        this.flgEstado = flgEstado;
    }

    public BigInteger getFlgActivo() {
        return flgActivo;
    }

    public void setFlgActivo(BigInteger flgActivo) {
        this.flgActivo = flgActivo;
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

    public ModuloBean getModuloBean() {
        return moduloBean;
    }

    public void setModuloBean(ModuloBean moduloBean) {
        this.moduloBean = moduloBean;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

}
