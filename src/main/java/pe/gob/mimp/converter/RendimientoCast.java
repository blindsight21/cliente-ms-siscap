/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.converter;

import pe.gob.mimp.bean.RendimientoBean;
import pe.gob.mimp.siscap.modelo.Rendimiento;

/**
 *
 * @author Omar
 */
public class RendimientoCast {

    public static RendimientoBean castRendimientoToRendimientoBean(Rendimiento rendimiento) {

        if (rendimiento == null) {
            return null;
        }

        RendimientoBean rendimientoBean = new RendimientoBean();

        rendimientoBean.setNidRendimiento(rendimiento.getNidRendimiento());
        rendimientoBean.setTxtNombreMetodo(rendimiento.getTxtNombreMetodo());
        rendimientoBean.setNidFuncionalidad(rendimiento.getNidFuncionalidad());
        rendimientoBean.setNumTimeResponse(rendimiento.getNumTimeResponse());
        rendimientoBean.setFlgActivo(rendimiento.getFlgActivo());
        rendimientoBean.setNidUsuario(rendimiento.getNidUsuario());
        rendimientoBean.setTxtPc(rendimiento.getTxtPc());
        rendimientoBean.setTxtIp(rendimiento.getTxtIp());
        rendimientoBean.setFecRegistro(rendimiento.getFecRegistro());

        return rendimientoBean;
    }

    public static Rendimiento castRendimientoBeanToRendimiento(RendimientoBean rendimientoBean) {

        if (rendimientoBean == null) {
            return null;
        }

        Rendimiento rendimiento = new Rendimiento();

        rendimiento.setNidRendimiento(rendimientoBean.getNidRendimiento());
        rendimiento.setTxtNombreMetodo(rendimientoBean.getTxtNombreMetodo());
        rendimiento.setNidFuncionalidad(rendimientoBean.getNidFuncionalidad());
        rendimiento.setNumTimeResponse(rendimientoBean.getNumTimeResponse());
        rendimiento.setFlgActivo(rendimientoBean.getFlgActivo());
        rendimiento.setNidUsuario(rendimientoBean.getNidUsuario());
        rendimiento.setTxtPc(rendimientoBean.getTxtPc());
        rendimiento.setTxtIp(rendimientoBean.getTxtIp());
        rendimiento.setFecRegistro(rendimientoBean.getFecRegistro());

        return rendimiento;
    }
}
