/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.modulo.cliente;

import java.math.BigDecimal;
import pe.gob.mimp.seguridad.modelo.Modulo;

/**
 *
 * @author Omar
 */
public interface ModuloCallService {

    Modulo find(BigDecimal id);

}
