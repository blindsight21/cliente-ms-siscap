/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.util;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Omar
 */
public enum EnumFuncionalidad {

    ACTIVIDADES("141", "140", "ACTIVIDADES", 150, 24),
    FUNCION_TRANSFERIDA("148", "144", "FUNCION TRANSFERIDA", 60, 8),
    ESTADO_ACTIVIDAD_GOBIERNO("147", "144", "ESTADO ACTIVIDAD GOBIERNO", 60, 8),
    GOBIERNO("149", "144", "GOBIERNO", 60, 8),
    MODALIDAD_ACTIVIDAD("150", "144", "MODALIDAD ACTIVIDAD", 60, 8),
    PUBLICO_OBJETIVO("151", "144", "PUBLICO OBJETIVO", 60, 8),
    TIPO_FUNCION("152", "144", "TIPO FUNCION", 60, 8),
    TIPO_GOBIERNO("153", "144", "TIPO GOBIERNO", 60, 8),
    TIPO_OBJETIVO("154", "144", "TIPO OBJETIVO", 60, 8),
    TIPO_MODALIDAD("155", "144", "TIPO MODALIDAD", 60, 8),
    PROGRAMACION_FECHAS("738", "144", "PROGRAMACION FECHAS", 90, 8),
    REPORTE("266", "265", "REPORTE", 120, 16),
    CALENDARIO("739", "265", "CALENDARIO", 120, 16);

    private String nidFuncionalidad;
    private String nidFuncionalidad_padre;
    private String txtFuncionalidad;
    private int tiempoMedioParaLaFalla;
    private int tareasPorFuncionalidad;

    private EnumFuncionalidad(String nidFuncionalidad, String nidFuncionalidad_padre, String txtFuncionalidad, int tiempoMedioParaLaFalla, int tareasPorFuncionalidad) {

        this.nidFuncionalidad = nidFuncionalidad;
        this.nidFuncionalidad_padre = nidFuncionalidad_padre;
        this.txtFuncionalidad = txtFuncionalidad;
        this.tiempoMedioParaLaFalla = tiempoMedioParaLaFalla;
        this.tareasPorFuncionalidad = tareasPorFuncionalidad;

    }

    public String getNidFuncionalidad() {
        return nidFuncionalidad;
    }

    public void setNidFuncionalidad(String nidFuncionalidad) {
        this.nidFuncionalidad = nidFuncionalidad;
    }

    public String getNidFuncionalidad_padre() {
        return nidFuncionalidad_padre;
    }

    public void setNidFuncionalidad_padre(String nidFuncionalidad_padre) {
        this.nidFuncionalidad_padre = nidFuncionalidad_padre;
    }

    public String getTxtFuncionalidad() {
        return txtFuncionalidad;
    }

    public void setTxtFuncionalidad(String txtFuncionalidad) {
        this.txtFuncionalidad = txtFuncionalidad;
    }

    public int getTiempoMedioParaLaFalla() {
        return tiempoMedioParaLaFalla;
    }

    public void setTiempoMedioParaLaFalla(int tiempoMedioParaLaFalla) {
        this.tiempoMedioParaLaFalla = tiempoMedioParaLaFalla;
    }

    public int getTareasPorFuncionalidad() {
        return tareasPorFuncionalidad;
    }

    public void setTareasPorFuncionalidad(int tareasPorFuncionalidad) {
        this.tareasPorFuncionalidad = tareasPorFuncionalidad;
    }

    public BigDecimal getNidFuncionalidadBigDecimal() {
        return new BigDecimal(this.nidFuncionalidad);
    }

    public BigInteger getNidFuncionalidadBigInteger() {
        return BigInteger.valueOf(Long.valueOf(this.nidFuncionalidad));
    }

    public BigInteger getTiempoMedioParaLaFallaBigInteger() {
        return BigInteger.valueOf(tiempoMedioParaLaFalla);
    }

    public BigDecimal getTiempoMedioParaLaFallaBigDecimal() {
        return new BigDecimal(tiempoMedioParaLaFalla);
    }

    public BigInteger getTareasPorFuncionalidadBigInteger() {
        return BigInteger.valueOf(tareasPorFuncionalidad);
    }

}
