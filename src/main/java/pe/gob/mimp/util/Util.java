/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Omar
 */
public class Util {

    public static Boolean esTextoVacio(String cadena) {
        return cadena == null || cadena.isEmpty();
    }

    public static boolean esListaVacia(List<?> lista) {
        return lista == null || lista.isEmpty();
    }

    public static String construirURI(String ipServidor, String puerto) {

        StringBuilder sb = new StringBuilder();

        sb.append("http://").append(ipServidor)
                .append(":")
                .append(puerto)
                .append("/");

        return sb.toString();

    }

    
    public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
    }

    public LocalDateTime convertToLocalDateTimeViaSqlTimestamp(Date dateToConvert) {
        return new java.sql.Timestamp(
                dateToConvert.getTime()).toLocalDateTime();
    }
}
