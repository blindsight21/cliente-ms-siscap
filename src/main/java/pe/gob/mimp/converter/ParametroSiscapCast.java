/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.ParametroSiscapBean;
import pe.gob.mimp.siscap.modelo.ParametroSiscap;

/**
 *
 * @author Omar
 */
public class ParametroSiscapCast {
    
    public static ParametroSiscapBean castParametroSiscapToParametroSiscapBean(ParametroSiscap parametroSiscap){
        
        if (parametroSiscap == null) {
            return null;
        }
        
        ParametroSiscapBean parametroSiscapBean = new ParametroSiscapBean();
        
        parametroSiscapBean.setNidParametro(parametroSiscap.getNidParametro());
        parametroSiscapBean.setCidParametro(parametroSiscap.getCidParametro());
        parametroSiscapBean.setNidParametroPadre(parametroSiscap.getNidParametroPadre());
        parametroSiscapBean.setTxtValor(parametroSiscap.getTxtValor());
        parametroSiscapBean.setNumValor1(parametroSiscap.getNumValor1());
        parametroSiscapBean.setNumValor2(parametroSiscap.getNumValor2());
        parametroSiscapBean.setFlgActivo(parametroSiscap.getFlgActivo());
        parametroSiscapBean.setNidUsuario(parametroSiscap.getNidUsuario());
        parametroSiscapBean.setTxtPc(parametroSiscap.getTxtPc());
        parametroSiscapBean.setTxtIp(parametroSiscap.getTxtIp());
        parametroSiscapBean.setFecEdicion(parametroSiscap.getFecEdicion());
        parametroSiscapBean.setComentario(parametroSiscap.getComentario());
       
        return parametroSiscapBean;
        
    }
    
    public static ParametroSiscap castParametroSiscapBeanToParametroSiscap(ParametroSiscapBean parametroSiscapBean){
        
        if (parametroSiscapBean == null) {
            return null;
        }
        
        ParametroSiscap parametroSiscap = new ParametroSiscap();
        
        parametroSiscap.setNidParametro(parametroSiscapBean.getNidParametro());
        parametroSiscap.setCidParametro(parametroSiscapBean.getCidParametro());
        parametroSiscap.setNidParametroPadre(parametroSiscapBean.getNidParametroPadre());
        parametroSiscap.setTxtValor(parametroSiscapBean.getTxtValor());
        parametroSiscap.setNumValor1(parametroSiscapBean.getNumValor1());
        parametroSiscap.setNumValor2(parametroSiscapBean.getNumValor2());
        parametroSiscap.setFlgActivo(parametroSiscapBean.getFlgActivo());
        parametroSiscap.setNidUsuario(parametroSiscapBean.getNidUsuario());
        parametroSiscap.setTxtPc(parametroSiscapBean.getTxtPc());
        parametroSiscap.setTxtIp(parametroSiscapBean.getTxtIp());
        parametroSiscap.setFecEdicion(parametroSiscapBean.getFecEdicion());
        parametroSiscap.setComentario(parametroSiscapBean.getComentario());
       
        return parametroSiscap;
    }
    
}
