/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgpp.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.ActividadGobPubliProc;

/**
 *
 * @author Omar
 */
public interface ActividadGPPCallService {

    void crearActividadGPP(ActividadGobPubliProc actividadGPP);

    void editarActividadGPP(ActividadGobPubliProc actividadGPP);

//    String obtenerActividadGobPubliProcPorId(BigDecimal nidActividadGobPubliProc);

    List<ActividadGobPubliProc> loadActividadGPPList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

//    ActividadGobPubliProc find(BigDecimal id);

}
