/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgr.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.ActividadGobResultado;

/**
 *
 * @author Omar
 */
public interface ActividadGRCallService {

    void crearActividadGR(ActividadGobResultado actividadGR);

    void editarActividadGR(ActividadGobResultado actividadGR);

//    String obtenerActividadGobResultadoPorId(BigDecimal nidActividadGobResultado);

    List<ActividadGobResultado> loadActividadGRList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

//    ActividadGobResultado find(BigDecimal id);

}
