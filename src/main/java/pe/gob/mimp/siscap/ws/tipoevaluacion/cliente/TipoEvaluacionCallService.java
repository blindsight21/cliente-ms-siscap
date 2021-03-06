/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipoevaluacion.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.TipoEvaluacion;

/**
 *
 * @author Omar
 */
public interface TipoEvaluacionCallService {

    void crearTipoEvaluacion(TipoEvaluacion tipoEvaluacion);

    void editarTipoEvaluacion(TipoEvaluacion tipoEvaluacion);

    String obtenerTipoEvaluacionPorId(BigDecimal nidTipoEvaluacion);

    List<TipoEvaluacion> loadTipoEvaluacionList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    TipoEvaluacion find(BigDecimal id);

}
