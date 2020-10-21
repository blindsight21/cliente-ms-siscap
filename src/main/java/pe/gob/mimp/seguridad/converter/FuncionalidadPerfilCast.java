/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.FuncionalidadPerfilBean;
import pe.gob.mimp.seguridad.modelo.FuncionalidadPerfil;

/**
 *
 * @author Omar
 */
public class FuncionalidadPerfilCast {
    
    public static FuncionalidadPerfilBean castFuncionalidadPerfilToFuncionalidadPerfilBean(FuncionalidadPerfil funcionalidadPerfil) {
        
        if (funcionalidadPerfil == null) {
            return null;
        }
        
        FuncionalidadPerfilBean funcionalidadPerfilBean = new FuncionalidadPerfilBean();
        
        funcionalidadPerfilBean.setFuncionalidadPerfilPKBean(FuncionalidadPerfilPKCast.castFuncionalidadPerfilPKToFuncionalidadPerfilPKBean(funcionalidadPerfil.getFuncionalidadPerfilPK()));
        funcionalidadPerfilBean.setFlgActivo(funcionalidadPerfil.getFlgActivo());
        funcionalidadPerfilBean.setNidUsuario(funcionalidadPerfil.getNidUsuario());
        funcionalidadPerfilBean.setTxtPc(funcionalidadPerfil.getTxtPc());
        funcionalidadPerfilBean.setTxtIp(funcionalidadPerfil.getTxtIp());
        funcionalidadPerfilBean.setFecEdicion(funcionalidadPerfil.getFecEdicion());
        funcionalidadPerfilBean.setFuncionalidadBean(FuncionalidadCast.castFuncionalidadToFuncionalidadBean(funcionalidadPerfil.getFuncionalidad()));
        funcionalidadPerfilBean.setPerfilBean(null);
        
        return funcionalidadPerfilBean;
    }
    
    public static FuncionalidadPerfil castFuncionalidadPerfilBeanToFuncionalidadPerfil(FuncionalidadPerfilBean funcionalidadPerfilBean) {
        
        if (funcionalidadPerfilBean == null) {
            return null;
        }
        
        FuncionalidadPerfil funcionalidadPerfil = new FuncionalidadPerfil();
        
        funcionalidadPerfil.setFuncionalidadPerfilPK(FuncionalidadPerfilPKCast.castFuncionalidadPerfilPKBeanToFuncionalidadPerfilPK(funcionalidadPerfilBean.getFuncionalidadPerfilPKBean()));
        funcionalidadPerfil.setFlgActivo(funcionalidadPerfilBean.getFlgActivo());
        funcionalidadPerfil.setNidUsuario(funcionalidadPerfilBean.getNidUsuario());
        funcionalidadPerfil.setTxtPc(funcionalidadPerfilBean.getTxtPc());
        funcionalidadPerfil.setTxtIp(funcionalidadPerfilBean.getTxtIp());
        funcionalidadPerfil.setFecEdicion(funcionalidadPerfilBean.getFecEdicion());
        funcionalidadPerfil.setFuncionalidad(FuncionalidadCast.castFuncionalidadBeanToFuncionalidad(funcionalidadPerfilBean.getFuncionalidadBean()));
        funcionalidadPerfil.setPerfil(null);
        
        return funcionalidadPerfil;
    }
}
