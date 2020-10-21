/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.actividadgpo.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.ActividadGobPubliObje;

/**
 *
 * @author Omar
 */
public interface ActividadGPOCallService {

    void crearActividadGPO(ActividadGobPubliObje actividadGPO);

    void editarActividadGPO(ActividadGobPubliObje actividadGPO);

//    String obtenerActividadGobPubliObjePorId(BigDecimal nidActividadGobPubliObje);

    List<ActividadGobPubliObje> loadActividadGPOList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

//    ActividadGobPubliObje find(BigDecimal id);

}
