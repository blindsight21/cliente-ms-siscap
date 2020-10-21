/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgob.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.ActividadGob;

/**
 *
 * @author Omar
 */
public interface ActividadGobCallService {

    void crearActividadGob(ActividadGob actividadGob);

    void editarActividadGob(ActividadGob actividadGob);

//    String obtenerActividadGobPorId(BigDecimal nidActividadGob);

    List<ActividadGob> loadActividadGobList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    ActividadGob find(BigDecimal id);

}
