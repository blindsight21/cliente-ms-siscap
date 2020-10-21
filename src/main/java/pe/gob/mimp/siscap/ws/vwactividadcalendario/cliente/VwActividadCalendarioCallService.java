/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwactividadcalendario.cliente;

import pe.gob.mimp.siscap.ws.vwactividad.cliente.*;
import pe.gob.mimp.siscap.ws.vwactividadcalendario.cliente.*;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.VwActividadCalendario;

/**
 *
 * @author Omar
 */
public interface VwActividadCalendarioCallService {

    List<VwActividadCalendario> loadVwActividadCalendarioList(FindByParamBean findByParamBean);

}
