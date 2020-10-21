/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import pe.gob.mimp.seguridad.bean.entidades.ModuloBean;
import pe.gob.mimp.seguridad.bean.entidades.UsuarioBean;

/**
 *
 * @author Omar
 */
public class UsuarioModuloBean implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private UsuarioBean usuarioBean;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private ModuloBean moduloBean;

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public ModuloBean getModuloBean() {
        return moduloBean;
    }

    public void setModuloBean(ModuloBean moduloBean) {
        this.moduloBean = moduloBean;
    }

}
