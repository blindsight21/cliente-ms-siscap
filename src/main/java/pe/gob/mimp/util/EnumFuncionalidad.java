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

    private String nid_funcionalidad;
    private String nid_funcionalidad_padre;
    private String txt_funcionalidad;
    private int tiempoMedioParaLaFalla;
    private int tareasPorFuncionalidad;

    private EnumFuncionalidad(String nid_funcionalidad, String nid_funcionalidad_padre, String txt_funcionalidad, int tiempoMedioParaLaFalla, int tareasPorFuncionalidad) {

        this.nid_funcionalidad = nid_funcionalidad;
        this.nid_funcionalidad_padre = nid_funcionalidad_padre;
        this.txt_funcionalidad = txt_funcionalidad;
        this.tiempoMedioParaLaFalla = tiempoMedioParaLaFalla;
        this.tareasPorFuncionalidad = tareasPorFuncionalidad;

    }

    public String getNid_funcionalidad() {
        return nid_funcionalidad;
    }

    public void setNid_funcionalidad(String nid_funcionalidad) {
        this.nid_funcionalidad = nid_funcionalidad;
    }

    public String getNid_funcionalidad_padre() {
        return nid_funcionalidad_padre;
    }

    public void setNid_funcionalidad_padre(String nid_funcionalidad_padre) {
        this.nid_funcionalidad_padre = nid_funcionalidad_padre;
    }

    public String getTxt_funcionalidad() {
        return txt_funcionalidad;
    }

    public void setTxt_funcionalidad(String txt_funcionalidad) {
        this.txt_funcionalidad = txt_funcionalidad;
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

    public BigDecimal getNid_funcionalidadBigDecimal() {
        return new BigDecimal(this.nid_funcionalidad);
    }

    public BigInteger getTiempoMedioParaLaFallaBigInteger() {
        return BigInteger.valueOf(tiempoMedioParaLaFalla);
    }
    
    public BigInteger getTareasPorFuncionalidadBigInteger() {
        return BigInteger.valueOf(tareasPorFuncionalidad);
    }

}
