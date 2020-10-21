/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.programacionfecha.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.ProgramacionFecha;

/**
 *
 * @author Omar
 */
public interface ProgramacionFechaCallService {

    void crearProgramacionFecha(ProgramacionFecha programacionFecha);

    void editarProgramacionFecha(ProgramacionFecha programacionFecha);

//    String obtenerProgramacionFechaPorId(BigDecimal nidProgramacionFecha);

    List<ProgramacionFecha> loadProgramacionFechaList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    ProgramacionFecha find(BigDecimal id);

}
