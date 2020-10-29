/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.disponibilidad.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.Disponibilidad;

/**
 *
 * @author Omar
 */
public interface DisponibilidadCallService {

    void crearDisponibilidad(Disponibilidad disponibilidad);
    
    void editarDisponibilidad(Disponibilidad disponibilidad);

    List<Disponibilidad> loadDisponibilidadList(FindByParamBean findByParamBean);

    Disponibilidad find(BigDecimal id);

}
