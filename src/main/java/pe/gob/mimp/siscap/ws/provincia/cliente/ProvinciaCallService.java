/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.provincia.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.general.modelo.Departamento;
import pe.gob.mimp.general.modelo.Provincia;

/**
 *
 * @author Omar
 */
public interface ProvinciaCallService {

    List<Provincia> obtenerProvincias(Departamento departamento);
    
    List<Provincia> obtenerActivos();

    Provincia find(BigDecimal id);
    
    List<Provincia> findAllByField(FindAllByFieldBean findAllByFieldBean);

}
