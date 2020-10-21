/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.seguridad.converter;

import pe.gob.mimp.seguridad.bean.entidades.CargoBean;
import pe.gob.mimp.seguridad.modelo.Cargo;


/**
 *
 * @author Omar
 */
public class CargoCast {

    public static CargoBean castCargoToCargoBean(Cargo cargo) {

        if (cargo == null) {
            return null;
        }

        CargoBean cargoBean = new CargoBean();

        cargoBean.setNidCargo(cargo.getNidCargo());
        cargoBean.setTxtDescripcion(cargo.getTxtDescripcion());
        cargoBean.setFlgActivo(cargo.getFlgActivo());
        cargoBean.setTxtPc(cargo.getTxtPc());
        cargoBean.setTxtIp(cargo.getTxtIp());
        cargoBean.setFecEdicion(cargo.getFecEdicion());
//        cargoBean.setUsuarioBean(UsuarioCast.castUsuarioToUsuarioBean(cargo.getUsuario()));

        return cargoBean;
    }

    public static Cargo castCargoBeanToCargo(CargoBean cargoBean) {

        if (cargoBean == null) {
            return null;
        }

        Cargo cargo = new Cargo();

        cargo.setNidCargo(cargoBean.getNidCargo());
        cargo.setTxtDescripcion(cargoBean.getTxtDescripcion());
        cargo.setFlgActivo(cargoBean.getFlgActivo());
        cargo.setTxtPc(cargoBean.getTxtPc());
        cargo.setTxtIp(cargoBean.getTxtIp());
        cargo.setFecEdicion(cargoBean.getFecEdicion());
//        cargo.setUsuario(UsuarioCast.castUsuarioBeanToUsuario(cargoBean.getUsuarioBean()));

        return cargo;
    }
}
