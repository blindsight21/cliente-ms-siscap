/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.general.converter;

import pe.gob.mimp.general.bean.entidades.DepartamentoBean;
import pe.gob.mimp.general.modelo.Departamento;

/**
 *
 * @author Omar
 */
public class DepartamentoCast {

    public static DepartamentoBean castDepartamentoToDepartamentoBean(Departamento departamento) {

        if (departamento == null) {
            return null;
        }

        DepartamentoBean departamentoBean = new DepartamentoBean();

        departamentoBean.setCidDepartamento(departamento.getCidDepartamento());
        departamentoBean.setTxtDescripcion(departamento.getTxtDescripcion());
        departamentoBean.setFlgActivo(departamento.getFlgActivo());
        departamentoBean.setNidUsuario(departamento.getNidUsuario());
        departamentoBean.setTxtPc(departamento.getTxtPc());
        departamentoBean.setTxtIp(departamento.getTxtIp());
        departamentoBean.setFecEdicion(departamento.getFecEdicion());
        departamentoBean.setNidDepartamento(departamento.getNidDepartamento());
        departamentoBean.setInei(departamento.getInei());
        departamentoBean.setReniec(departamento.getReniec());

        return departamentoBean;
    }
    
    public static Departamento castDepartamentoBeanToDepartamento(DepartamentoBean departamentoBean) {

        if (departamentoBean == null) {
            return null;
        }

        Departamento departamento = new Departamento();

        departamento.setCidDepartamento(departamentoBean.getCidDepartamento());
        departamento.setTxtDescripcion(departamentoBean.getTxtDescripcion());
        departamento.setFlgActivo(departamentoBean.getFlgActivo());
        departamento.setNidUsuario(departamentoBean.getNidUsuario());
        departamento.setTxtPc(departamentoBean.getTxtPc());
        departamento.setTxtIp(departamentoBean.getTxtIp());
        departamento.setFecEdicion(departamentoBean.getFecEdicion());
        departamento.setNidDepartamento(departamentoBean.getNidDepartamento());
        departamento.setInei(departamentoBean.getInei());
        departamento.setReniec(departamentoBean.getReniec());

        return departamento;
    }
    
}
