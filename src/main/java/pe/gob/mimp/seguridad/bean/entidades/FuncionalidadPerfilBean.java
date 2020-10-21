/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.bean.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import pe.gob.mimp.util.FormatoFechaConstante;

/**
 *
 * @author desarrollador
 */
public class FuncionalidadPerfilBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected FuncionalidadPerfilPKBean funcionalidadPerfilPKBean;
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
    private FuncionalidadBean funcionalidadBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PerfilBean perfilBean;

    public FuncionalidadPerfilPKBean getFuncionalidadPerfilPKBean() {
        return funcionalidadPerfilPKBean;
    }

    public void setFuncionalidadPerfilPKBean(FuncionalidadPerfilPKBean funcionalidadPerfilPKBean) {
        this.funcionalidadPerfilPKBean = funcionalidadPerfilPKBean;
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

    public FuncionalidadBean getFuncionalidadBean() {
        return funcionalidadBean;
    }

    public void setFuncionalidadBean(FuncionalidadBean funcionalidadBean) {
        this.funcionalidadBean = funcionalidadBean;
    }

    public PerfilBean getPerfilBean() {
        return perfilBean;
    }

    public void setPerfilBean(PerfilBean perfilBean) {
        this.perfilBean = perfilBean;
    }

}
