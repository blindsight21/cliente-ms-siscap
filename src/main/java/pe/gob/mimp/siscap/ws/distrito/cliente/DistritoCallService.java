/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.distrito.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.general.modelo.Distrito;
import pe.gob.mimp.general.modelo.Provincia;

/**
 *
 * @author Omar
 */
public interface DistritoCallService {

    List<Distrito> obtenerDistritos(Provincia provincia);
    
    List<Distrito> obtenerActivos();

    Distrito find(BigDecimal id);
    
    List<Distrito> findAllByField(FindAllByFieldBean findAllByFieldBean);

}
