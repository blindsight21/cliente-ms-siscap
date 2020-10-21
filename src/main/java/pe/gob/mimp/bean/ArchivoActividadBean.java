/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import pe.gob.mimp.util.FormatoFechaConstante;

/**
 *
 * @author Omar
 */
public class ArchivoActividadBean implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal nidArchivoActividad;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtArchivo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtUrl;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger flgActivo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidUsuario;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtIp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtPc;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecEdicion;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ActividadGobBean actividadGobBean;

    public BigDecimal getNidArchivoActividad() {
        return nidArchivoActividad;
    }

    public void setNidArchivoActividad(BigDecimal nidArchivoActividad) {
        this.nidArchivoActividad = nidArchivoActividad;
    }

    public String getTxtArchivo() {
        return txtArchivo;
    }

    public void setTxtArchivo(String txtArchivo) {
        this.txtArchivo = txtArchivo;
    }

    public String getTxtUrl() {
        return txtUrl;
    }

    public void setTxtUrl(String txtUrl) {
        this.txtUrl = txtUrl;
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

    public String getTxtIp() {
        return txtIp;
    }

    public void setTxtIp(String txtIp) {
        this.txtIp = txtIp;
    }

    public String getTxtPc() {
        return txtPc;
    }

    public void setTxtPc(String txtPc) {
        this.txtPc = txtPc;
    }

    public Date getFecEdicion() {
        return fecEdicion;
    }

    public void setFecEdicion(Date fecEdicion) {
        this.fecEdicion = fecEdicion;
    }

    public ActividadGobBean getActividadGobBean() {
        return actividadGobBean;
    }

    public void setActividadGobBean(ActividadGobBean actividadGobBean) {
        this.actividadGobBean = actividadGobBean;
    }

    @Override
    public String toString() {
        return "ArchivoActividadBean{" + "nidArchivoActividad=" + nidArchivoActividad + ", txtArchivo=" + txtArchivo + ", txtUrl=" + txtUrl + ", flgActivo=" + flgActivo + ", nidUsuario=" + nidUsuario + ", txtIp=" + txtIp + ", txtPc=" + txtPc + ", fecEdicion=" + fecEdicion + ", actividadGobBean=" + actividadGobBean + '}';
    }

}
