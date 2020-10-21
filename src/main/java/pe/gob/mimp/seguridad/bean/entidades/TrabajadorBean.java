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
public class TrabajadorBean implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal nidTrabajador;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtApellidoPaterno;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtApellidoMaterno;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtNombre;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidRegimenLaboral;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidCargo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidTipoDocumento;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtNumeroDocumento;
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
    private BigInteger flgTrabajadorTercero;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private AreaBean areaBean;

    public BigDecimal getNidTrabajador() {
        return nidTrabajador;
    }

    public void setNidTrabajador(BigDecimal nidTrabajador) {
        this.nidTrabajador = nidTrabajador;
    }

    public String getTxtApellidoPaterno() {
        return txtApellidoPaterno;
    }

    public void setTxtApellidoPaterno(String txtApellidoPaterno) {
        this.txtApellidoPaterno = txtApellidoPaterno;
    }

    public String getTxtApellidoMaterno() {
        return txtApellidoMaterno;
    }

    public void setTxtApellidoMaterno(String txtApellidoMaterno) {
        this.txtApellidoMaterno = txtApellidoMaterno;
    }

    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public BigInteger getNidRegimenLaboral() {
        return nidRegimenLaboral;
    }

    public void setNidRegimenLaboral(BigInteger nidRegimenLaboral) {
        this.nidRegimenLaboral = nidRegimenLaboral;
    }

    public BigInteger getNidCargo() {
        return nidCargo;
    }

    public void setNidCargo(BigInteger nidCargo) {
        this.nidCargo = nidCargo;
    }

    public BigInteger getNidTipoDocumento() {
        return nidTipoDocumento;
    }

    public void setNidTipoDocumento(BigInteger nidTipoDocumento) {
        this.nidTipoDocumento = nidTipoDocumento;
    }

    public String getTxtNumeroDocumento() {
        return txtNumeroDocumento;
    }

    public void setTxtNumeroDocumento(String txtNumeroDocumento) {
        this.txtNumeroDocumento = txtNumeroDocumento;
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

    public BigInteger getFlgTrabajadorTercero() {
        return flgTrabajadorTercero;
    }

    public void setFlgTrabajadorTercero(BigInteger flgTrabajadorTercero) {
        this.flgTrabajadorTercero = flgTrabajadorTercero;
    }

    public AreaBean getAreaBean() {
        return areaBean;
    }

    public void setAreaBean(AreaBean areaBean) {
        this.areaBean = areaBean;
    }

}
