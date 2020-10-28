/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.util;

/**
 *
 * @author Omar
 */
public class Constantes {

    public static final String IP_SERVIDOR = Constantes.Ambiente.ENTORNO_DESARROLLO;

    public static class Ambiente {

        private static String ENTORNO_DESARROLLO = "192.168.0.51";

        private static final String ENTORNO_CALIDAD = "192.168.0.52";

        private static final String ENTORNO_PRODUCCION = "192.168.0.53";
    }

    public static class PuertoMicroservicios {

        public static final String MS_ACTIVIDAD_GOBIERNO = "7161";
        public static final String MS_CONSULTA_VISTAS = "7162";
        public static final String MS_ESTADO_ACTIVIDAD_GOB = "7163";
        public static final String MS_FUNCION_TRANSFERIDA = "7164";
        public static final String MS_GOBIERNO = "7165";
        public static final String MS_MODALIDAD_ACTIVIDAD = "7166";
        public static final String MS_PROGRAMACION_FECHA = "7167";
        public static final String MS_PUBLICO_OBJETIVO = "7168";
        public static final String MS_TIPO_EVALUACION = "7169";
        public static final String MS_TIPO_FUNCION = "7170";
        public static final String MS_TIPO_GOBIERNO = "7171";
        public static final String MS_TIPO_MODALIDAD = "7172";
        public static final String MS_TIPO_OBJETIVO = "7173";
        public static final String MS_SEGURIDAD = "7174";
        public static final String MS_GENERAL = "7175";

    }

}
