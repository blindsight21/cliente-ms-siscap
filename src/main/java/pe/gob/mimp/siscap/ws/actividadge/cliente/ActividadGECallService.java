/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadge.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.ActividadGobEActGob;

/**
 *
 * @author Omar
 */
public interface ActividadGECallService {

    void crearActividadGE(ActividadGobEActGob actividadGE);

    void editarActividadGE(ActividadGobEActGob actividadGE);

//    String obtenerActividadGobEActGobPorId(BigDecimal nidActividadGobEActGob);

    List<ActividadGobEActGob> loadActividadGEList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

//    ActividadGobEActGob find(BigDecimal id);

}
