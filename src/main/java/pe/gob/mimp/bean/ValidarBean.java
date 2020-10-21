/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import pe.gob.mimp.seguridad.bean.entidades.ModuloBean;

/**
 *
 * @author Omar
 */
public class ValidarBean implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ModuloBean moduloBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String usuario;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String password;

    public ModuloBean getModuloBean() {
        return moduloBean;
    }

    public void setModuloBean(ModuloBean moduloBean) {
        this.moduloBean = moduloBean;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ValidarBean{" + "moduloBean=" + moduloBean + ", usuario=" + usuario + ", password=" + password + '}';
    }

}
