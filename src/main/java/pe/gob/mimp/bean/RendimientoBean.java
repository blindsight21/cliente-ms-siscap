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
 * @author desarrollador
 */
public class RendimientoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal nidRendimiento;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtNombreMetodo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidFuncionalidad;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal numTimeResponse;
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
    private Date fecRegistro;

    public BigDecimal getNidRendimiento() {
        return nidRendimiento;
    }

    public void setNidRendimiento(BigDecimal nidRendimiento) {
        this.nidRendimiento = nidRendimiento;
    }

    public String getTxtNombreMetodo() {
        return txtNombreMetodo;
    }

    public void setTxtNombreMetodo(String txtNombreMetodo) {
        this.txtNombreMetodo = txtNombreMetodo;
    }

    public BigInteger getNidFuncionalidad() {
        return nidFuncionalidad;
    }

    public void setNidFuncionalidad(BigInteger nidFuncionalidad) {
        this.nidFuncionalidad = nidFuncionalidad;
    }

    public BigDecimal getNumTimeResponse() {
        return numTimeResponse;
    }

    public void setNumTimeResponse(BigDecimal numTimeResponse) {
        this.numTimeResponse = numTimeResponse;
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

    public Date getFecRegistro() {
        return fecRegistro;
    }

    public void setFecRegistro(Date fecRegistro) {
        this.fecRegistro = fecRegistro;
    }

}
