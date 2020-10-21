/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.PerfilUsuarioPKBean;
import pe.gob.mimp.seguridad.modelo.PerfilUsuarioPK;

/**
 *
 * @author Omar
 */
public class PerfilUsuarioPKCast {

    public static PerfilUsuarioPKBean castPerfilUsuarioPKToPerfilUsuarioPKBean(PerfilUsuarioPK perfilUsuarioPK) {

        if (perfilUsuarioPK == null) {
            return null;
        }

        PerfilUsuarioPKBean perfilUsuarioPKBean = new PerfilUsuarioPKBean();

        perfilUsuarioPKBean.setNidUsuario(perfilUsuarioPK.getNidUsuario());
        perfilUsuarioPKBean.setNidPerfil(perfilUsuarioPK.getNidPerfil());

        return perfilUsuarioPKBean;
    }

    public static PerfilUsuarioPK castPerfilUsuarioPKBeanToPerfilUsuarioPK(PerfilUsuarioPKBean perfilUsuarioPKBean) {

        if (perfilUsuarioPKBean == null) {
            return null;
        }

        PerfilUsuarioPK perfilUsuarioPK = new PerfilUsuarioPK();

        perfilUsuarioPK.setNidUsuario(perfilUsuarioPKBean.getNidUsuario());
        perfilUsuarioPK.setNidPerfil(perfilUsuarioPKBean.getNidPerfil());

        return perfilUsuarioPK;
    }
}
