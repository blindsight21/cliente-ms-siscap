/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.bean.entidades;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author desarrollador
 */
public class FuncionalidadPerfilPKBean implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidFuncionalidad;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidPerfil;

    public FuncionalidadPerfilPKBean() {
    }

    public FuncionalidadPerfilPKBean(BigInteger nidFuncionalidad, BigInteger nidPerfil) {
        this.nidFuncionalidad = nidFuncionalidad;
        this.nidPerfil = nidPerfil;
    }

    public BigInteger getNidFuncionalidad() {
        return nidFuncionalidad;
    }

    public void setNidFuncionalidad(BigInteger nidFuncionalidad) {
        this.nidFuncionalidad = nidFuncionalidad;
    }

    public BigInteger getNidPerfil() {
        return nidPerfil;
    }

    public void setNidPerfil(BigInteger nidPerfil) {
        this.nidPerfil = nidPerfil;
    }

}
