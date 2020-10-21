/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwreporteactividad.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.VwReporteActividad;

/**
 *
 * @author Omar
 */
public interface VwReporteActividadCallService {

    List<VwReporteActividad> findAll();

    List<VwReporteActividad> loadVwReporteActList(FindByParamBean findByParamBean);

}
