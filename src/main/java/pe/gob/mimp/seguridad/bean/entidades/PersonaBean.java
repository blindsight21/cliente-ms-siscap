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
public class PersonaBean implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal nidPersona;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtDocumento;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtApellidoPaterno;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtApellidoMaterno;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtNombres;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date fecNacimiento;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtSexo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidArea;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtFoto;
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
    private String txtWeb;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CargoBean cargoBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TipoDocumentoBean tipoDocumentoBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private TipoPersonaBean tipoPersonaBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UsuarioBean usuarioBean;

    public BigDecimal getNidPersona() {
        return nidPersona;
    }

    public void setNidPersona(BigDecimal nidPersona) {
        this.nidPersona = nidPersona;
    }

    public String getTxtDocumento() {
        return txtDocumento;
    }

    public void setTxtDocumento(String txtDocumento) {
        this.txtDocumento = txtDocumento;
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

    public String getTxtNombres() {
        return txtNombres;
    }

    public void setTxtNombres(String txtNombres) {
        this.txtNombres = txtNombres;
    }

    public Date getFecNacimiento() {
        return fecNacimiento;
    }

    public void setFecNacimiento(Date fecNacimiento) {
        this.fecNacimiento = fecNacimiento;
    }

    public String getTxtSexo() {
        return txtSexo;
    }

    public void setTxtSexo(String txtSexo) {
        this.txtSexo = txtSexo;
    }

    public BigInteger getNidArea() {
        return nidArea;
    }

    public void setNidArea(BigInteger nidArea) {
        this.nidArea = nidArea;
    }

    public String getTxtFoto() {
        return txtFoto;
    }

    public void setTxtFoto(String txtFoto) {
        this.txtFoto = txtFoto;
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

    public String getTxtWeb() {
        return txtWeb;
    }

    public void setTxtWeb(String txtWeb) {
        this.txtWeb = txtWeb;
    }

    public CargoBean getCargoBean() {
        return cargoBean;
    }

    public void setCargoBean(CargoBean cargoBean) {
        this.cargoBean = cargoBean;
    }

    public TipoDocumentoBean getTipoDocumentoBean() {
        return tipoDocumentoBean;
    }

    public void setTipoDocumentoBean(TipoDocumentoBean tipoDocumentoBean) {
        this.tipoDocumentoBean = tipoDocumentoBean;
    }

    public TipoPersonaBean getTipoPersonaBean() {
        return tipoPersonaBean;
    }

    public void setTipoPersonaBean(TipoPersonaBean tipoPersonaBean) {
        this.tipoPersonaBean = tipoPersonaBean;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

}
