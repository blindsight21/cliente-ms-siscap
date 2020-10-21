/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwcantidadactividad.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.siscap.modelo.VwCantidadActividad;

/**
 *
 * @author Omar
 */
public interface VwCantidadActividadCallService {

    List<VwCantidadActividad> findAllByField(FindAllByFieldBean findAllByFieldBean);

}
