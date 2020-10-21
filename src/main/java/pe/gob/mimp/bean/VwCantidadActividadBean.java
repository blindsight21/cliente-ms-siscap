/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigInteger;

/**
 *
 * @author Omar
 */
public class VwCantidadActividadBean implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger departamentoActividad;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger cantidadActividad;

    public BigInteger getDepartamentoActividad() {
        return departamentoActividad;
    }

    public void setDepartamentoActividad(BigInteger departamentoActividad) {
        this.departamentoActividad = departamentoActividad;
    }

    public BigInteger getCantidadActividad() {
        return cantidadActividad;
    }

    public void setCantidadActividad(BigInteger cantidadActividad) {
        this.cantidadActividad = cantidadActividad;
    }

    @Override
    public String toString() {
        return "VwCantidadActividadBean{" + "departamentoActividad=" + departamentoActividad + ", cantidadActividad=" + cantidadActividad + '}';
    }

}
