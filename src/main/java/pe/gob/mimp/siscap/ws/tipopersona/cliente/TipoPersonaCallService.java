/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipopersona.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.seguridad.modelo.TipoPersona;

/**
 *
 * @author Omar
 */
public interface TipoPersonaCallService {

    List<TipoPersona> findAllByField(FindAllByFieldBean findAllByFieldBean);

}
