/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.area.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.seguridad.modelo.Area;

/**
 *
 * @author Omar
 */
public interface AreaCallService {

    List<Area> findAll();
    
    Area find(BigDecimal id);

    List<Area> findAllByField(FindAllByFieldBean findAllByFieldBean);

}
