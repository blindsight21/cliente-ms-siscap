/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.TrabajadorBean;
import pe.gob.mimp.seguridad.modelo.Trabajador;

/**
 *
 * @author Omar
 */
public class TrabajadorCast {

    public static TrabajadorBean castTrabajadorToTrabajadorBean(Trabajador trabajador) {

        if (trabajador == null) {
            return null;
        }

        TrabajadorBean trabajadorBean = new TrabajadorBean();

        trabajadorBean.setNidTrabajador(trabajador.getNidTrabajador());
        trabajadorBean.setTxtApellidoPaterno(trabajador.getTxtApellidoPaterno());
        trabajadorBean.setTxtApellidoMaterno(trabajador.getTxtApellidoMaterno());
        trabajadorBean.setTxtNombre(trabajador.getTxtNombre());
        trabajadorBean.setNidRegimenLaboral(trabajador.getNidRegimenLaboral());
        trabajadorBean.setNidCargo(trabajador.getNidCargo());
        trabajadorBean.setNidTipoDocumento(trabajador.getNidTipoDocumento());
        trabajadorBean.setTxtNumeroDocumento(trabajador.getTxtNumeroDocumento());

        trabajadorBean.setFlgActivo(trabajador.getFlgActivo());
        trabajadorBean.setNidUsuario(trabajador.getNidUsuario());
        trabajadorBean.setTxtPc(trabajador.getTxtPc());
        trabajadorBean.setTxtIp(trabajador.getTxtIp());
        trabajadorBean.setFecEdicion(trabajador.getFecEdicion());

        trabajadorBean.setFlgTrabajadorTercero(trabajador.getFlgTrabajadorTercero());

        trabajadorBean.setAreaBean(AreaCast.castAreaToAreaBean(trabajador.getNidArea()));

        return trabajadorBean;
    }

    public static Trabajador castTrabajadorBeanToTrabajador(TrabajadorBean trabajadorBean) {

        if (trabajadorBean == null) {
            return null;
        }

        Trabajador trabajador = new Trabajador();

        trabajador.setNidTrabajador(trabajadorBean.getNidTrabajador());
        trabajador.setTxtApellidoPaterno(trabajadorBean.getTxtApellidoPaterno());
        trabajador.setTxtApellidoMaterno(trabajadorBean.getTxtApellidoMaterno());
        trabajador.setTxtNombre(trabajadorBean.getTxtNombre());
        trabajador.setNidRegimenLaboral(trabajadorBean.getNidRegimenLaboral());
        trabajador.setNidCargo(trabajadorBean.getNidCargo());
        trabajador.setNidTipoDocumento(trabajadorBean.getNidTipoDocumento());
        trabajador.setTxtNumeroDocumento(trabajadorBean.getTxtNumeroDocumento());

        trabajador.setFlgActivo(trabajadorBean.getFlgActivo());
        trabajador.setNidUsuario(trabajadorBean.getNidUsuario());
        trabajador.setTxtPc(trabajadorBean.getTxtPc());
        trabajador.setTxtIp(trabajadorBean.getTxtIp());
        trabajador.setFecEdicion(trabajadorBean.getFecEdicion());

        trabajador.setFlgTrabajadorTercero(trabajadorBean.getFlgTrabajadorTercero());

        trabajador.setNidArea(AreaCast.castAreaBeanToArea(trabajadorBean.getAreaBean()));

        return trabajador;
    }
}
