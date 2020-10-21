/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.bean.entidades;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Omar
 */
public class ProvinciaCoordenadasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal nidProvinciaCoordenadas;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal numLatitud;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal numLongitud;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidUsuario;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtPc;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String txtIp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger flgActivo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ProvinciaBean provinciaBean;

    public BigDecimal getNidProvinciaCoordenadas() {
        return nidProvinciaCoordenadas;
    }

    public void setNidProvinciaCoordenadas(BigDecimal nidProvinciaCoordenadas) {
        this.nidProvinciaCoordenadas = nidProvinciaCoordenadas;
    }

    public BigDecimal getNumLatitud() {
        return numLatitud;
    }

    public void setNumLatitud(BigDecimal numLatitud) {
        this.numLatitud = numLatitud;
    }

    public BigDecimal getNumLongitud() {
        return numLongitud;
    }

    public void setNumLongitud(BigDecimal numLongitud) {
        this.numLongitud = numLongitud;
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

    public BigInteger getFlgActivo() {
        return flgActivo;
    }

    public void setFlgActivo(BigInteger flgActivo) {
        this.flgActivo = flgActivo;
    }

    public ProvinciaBean getProvinciaBean() {
        return provinciaBean;
    }

    public void setProvinciaBean(ProvinciaBean provinciaBean) {
        this.provinciaBean = provinciaBean;
    }

}
