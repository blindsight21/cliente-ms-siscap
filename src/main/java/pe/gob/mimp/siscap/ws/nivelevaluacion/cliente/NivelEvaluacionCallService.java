/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.nivelevaluacion.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.NivelEvaluacion;

/**
 *
 * @author Omar
 */
public interface NivelEvaluacionCallService {

//    void crearNivelEvaluacion(NivelEvaluacion nivelEvaluacion);
//
//    void editarNivelEvaluacion(NivelEvaluacion nivelEvaluacion);

//    String obtenerNivelEvaluacionPorId(BigDecimal nidNivelEvaluacion);

    List<NivelEvaluacion> loadNivelEvaluacionList(FindByParamBean findByParamBean);

//    Integer getRecordCount(FindByParamBean findByParamBean);

    NivelEvaluacion find(BigDecimal id);

}
