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
public class PerfilUsuarioBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected PerfilUsuarioPKBean perfilUsuarioPKBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidUsuario2;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtPc;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtIp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX, timezone = FormatoFechaConstante.ZONA_HORARIA)
    private Date fecModificacion;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Short flgActivo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PerfilBean perfilBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UsuarioBean usuarioBean;

    public PerfilUsuarioPKBean getPerfilUsuarioPKBean() {
        return perfilUsuarioPKBean;
    }

    public void setPerfilUsuarioPKBean(PerfilUsuarioPKBean perfilUsuarioPKBean) {
        this.perfilUsuarioPKBean = perfilUsuarioPKBean;
    }

    public BigInteger getNidUsuario2() {
        return nidUsuario2;
    }

    public void setNidUsuario2(BigInteger nidUsuario2) {
        this.nidUsuario2 = nidUsuario2;
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

    public Date getFecModificacion() {
        return fecModificacion;
    }

    public void setFecModificacion(Date fecModificacion) {
        this.fecModificacion = fecModificacion;
    }

    public Short getFlgActivo() {
        return flgActivo;
    }

    public void setFlgActivo(Short flgActivo) {
        this.flgActivo = flgActivo;
    }

    public PerfilBean getPerfilBean() {
        return perfilBean;
    }

    public void setPerfilBean(PerfilBean perfilBean) {
        this.perfilBean = perfilBean;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

}
