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
public class ModuloBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal nidModulo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtNombreTecnico;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtNombre;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtAlias;
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
    private SistemaBean sistemaBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UsuarioBean usuarioBean;

    public BigDecimal getNidModulo() {
        return nidModulo;
    }

    public void setNidModulo(BigDecimal nidModulo) {
        this.nidModulo = nidModulo;
    }

    public String getTxtNombreTecnico() {
        return txtNombreTecnico;
    }

    public void setTxtNombreTecnico(String txtNombreTecnico) {
        this.txtNombreTecnico = txtNombreTecnico;
    }

    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public String getTxtAlias() {
        return txtAlias;
    }

    public void setTxtAlias(String txtAlias) {
        this.txtAlias = txtAlias;
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

    public SistemaBean getSistemaBean() {
        return sistemaBean;
    }

    public void setSistemaBean(SistemaBean sistemaBean) {
        this.sistemaBean = sistemaBean;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

}
