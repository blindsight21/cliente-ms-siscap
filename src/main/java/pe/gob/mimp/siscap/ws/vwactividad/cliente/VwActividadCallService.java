/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwactividad.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.siscap.modelo.VwActividad;

/**
 *
 * @author Omar
 */
public interface VwActividadCallService {

    List<VwActividad> findAll();

    List<VwActividad> obtenerActividadesDepartamento(BigDecimal nidDepartamento);

}
