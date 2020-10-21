/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.archivoactividad.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.ArchivoActividad;

/**
 *
 * @author Omar
 */
public interface ArchivoActividadCallService {

    void crearArchivoActividad(ArchivoActividad archivoActividad);

    void editarArchivoActividad(ArchivoActividad archivoActividad);

//    String obtenerArchivoActividadPorId(BigDecimal nidArchivoActividad);

    List<ArchivoActividad> loadArchivoActividadList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

//    ArchivoActividad find(BigDecimal id);

}
