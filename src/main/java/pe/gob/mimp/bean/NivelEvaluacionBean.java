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
public class NivelEvaluacionBean implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal nidNivelEvaluacion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtNivelEvaluacion;

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
    private TipoEvaluacionBean tipoEvaluacionBean;

    public BigDecimal getNidNivelEvaluacion() {
        return nidNivelEvaluacion;
    }

    public void setNidNivelEvaluacion(BigDecimal nidNivelEvaluacion) {
        this.nidNivelEvaluacion = nidNivelEvaluacion;
    }

    public String getTxtNivelEvaluacion() {
        return txtNivelEvaluacion;
    }

    public void setTxtNivelEvaluacion(String txtNivelEvaluacion) {
        this.txtNivelEvaluacion = txtNivelEvaluacion;
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

    public TipoEvaluacionBean getTipoEvaluacionBean() {
        return tipoEvaluacionBean;
    }

    public void setTipoEvaluacionBean(TipoEvaluacionBean tipoEvaluacionBean) {
        this.tipoEvaluacionBean = tipoEvaluacionBean;
    }

    @Override
    public String toString() {
        return "NivelEvaluacionBean{" + "nidNivelEvaluacion=" + nidNivelEvaluacion + ", txtNivelEvaluacion=" + txtNivelEvaluacion + ", flgActivo=" + flgActivo + ", nidUsuario=" + nidUsuario + ", txtPc=" + txtPc + ", txtIp=" + txtIp + ", fecEdicion=" + fecEdicion + ", tipoEvaluacionBean=" + tipoEvaluacionBean + '}';
    }

}
