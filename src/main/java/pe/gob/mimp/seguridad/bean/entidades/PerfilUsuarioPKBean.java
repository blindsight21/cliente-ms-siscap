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
public class PerfilUsuarioPKBean implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidUsuario;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger nidPerfil;

    public PerfilUsuarioPKBean() {
    }

    public PerfilUsuarioPKBean(BigInteger nidUsuario, BigInteger nidPerfil) {
        this.nidUsuario = nidUsuario;
        this.nidPerfil = nidPerfil;
    }

    public BigInteger getNidUsuario() {
        return nidUsuario;
    }

    public void setNidUsuario(BigInteger nidUsuario) {
        this.nidUsuario = nidUsuario;
    }

    public BigInteger getNidPerfil() {
        return nidPerfil;
    }

    public void setNidPerfil(BigInteger nidPerfil) {
        this.nidPerfil = nidPerfil;
    }

}
