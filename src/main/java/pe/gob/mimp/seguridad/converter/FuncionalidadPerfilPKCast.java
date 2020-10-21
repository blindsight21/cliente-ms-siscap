/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.FuncionalidadPerfilPKBean;
import pe.gob.mimp.seguridad.modelo.FuncionalidadPerfilPK;

/**
 *
 * @author Omar
 */
public class FuncionalidadPerfilPKCast {

    public static FuncionalidadPerfilPKBean castFuncionalidadPerfilPKToFuncionalidadPerfilPKBean(FuncionalidadPerfilPK funcionalidadPerfilPK) {

        if (funcionalidadPerfilPK == null) {
            return null;
        }

        FuncionalidadPerfilPKBean funcionalidadPerfilPKBean = new FuncionalidadPerfilPKBean();

        funcionalidadPerfilPKBean.setNidFuncionalidad(funcionalidadPerfilPK.getNidFuncionalidad());
        funcionalidadPerfilPKBean.setNidPerfil(funcionalidadPerfilPK.getNidPerfil());

        return funcionalidadPerfilPKBean;
    }

    public static FuncionalidadPerfilPK castFuncionalidadPerfilPKBeanToFuncionalidadPerfilPK(FuncionalidadPerfilPKBean funcionalidadPerfilPKBean) {

        if (funcionalidadPerfilPKBean == null) {
            return null;
        }

        FuncionalidadPerfilPK funcionalidadPerfilPK = new FuncionalidadPerfilPK();

        funcionalidadPerfilPK.setNidFuncionalidad(funcionalidadPerfilPKBean.getNidFuncionalidad());
        funcionalidadPerfilPK.setNidPerfil(funcionalidadPerfilPKBean.getNidPerfil());

        return funcionalidadPerfilPK;
    }
}
