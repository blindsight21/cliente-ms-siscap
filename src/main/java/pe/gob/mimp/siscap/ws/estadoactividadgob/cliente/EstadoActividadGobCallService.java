/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.estadoactividadgob.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.EstadoActividadGob;

/**
 *
 * @author Omar
 */
public interface EstadoActividadGobCallService {

    void crearEstadoActividadGob(EstadoActividadGob estadoActividadGob);

    void editarEstadoActividadGob(EstadoActividadGob estadoActividadGob);

    String obtenerEstadoActividadGobPorId(BigDecimal nidEstadoActividadGob);

    List<EstadoActividadGob> loadEstadoActividadGobList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    EstadoActividadGob find(BigDecimal id);

}
