/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipoobjetivo.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.TipoObjetivo;

/**
 *
 * @author Omar
 */
public interface TipoObjetivoCallService {

    void crearTipoObjetivo(TipoObjetivo tipoObjetivo);

    void editarTipoObjetivo(TipoObjetivo tipoObjetivo);

    String obtenerTipoObjetivoPorId(BigDecimal nidTipoObjetivo);

    List<TipoObjetivo> loadTipoObjetivoList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    TipoObjetivo find(BigDecimal id);

}
