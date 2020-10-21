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
public class DireccionPersonaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal nidDireccionPersona;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidDistrito;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidVia;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtDireccion;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger flgActivo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidUsuario;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtPc;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtIp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecEdicion;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidLugar;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtLugar;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PersonaBean personaBean;

    public BigDecimal getNidDireccionPersona() {
        return nidDireccionPersona;
    }

    public void setNidDireccionPersona(BigDecimal nidDireccionPersona) {
        this.nidDireccionPersona = nidDireccionPersona;
    }

    public BigInteger getNidDistrito() {
        return nidDistrito;
    }

    public void setNidDistrito(BigInteger nidDistrito) {
        this.nidDistrito = nidDistrito;
    }

    public BigInteger getNidVia() {
        return nidVia;
    }

    public void setNidVia(BigInteger nidVia) {
        this.nidVia = nidVia;
    }

    public String getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(String txtDireccion) {
        this.txtDireccion = txtDireccion;
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

    public BigInteger getNidLugar() {
        return nidLugar;
    }

    public void setNidLugar(BigInteger nidLugar) {
        this.nidLugar = nidLugar;
    }

    public String getTxtLugar() {
        return txtLugar;
    }

    public void setTxtLugar(String txtLugar) {
        this.txtLugar = txtLugar;
    }

    public PersonaBean getPersonaBean() {
        return personaBean;
    }

    public void setPersonaBean(PersonaBean personaBean) {
        this.personaBean = personaBean;
    }

}
