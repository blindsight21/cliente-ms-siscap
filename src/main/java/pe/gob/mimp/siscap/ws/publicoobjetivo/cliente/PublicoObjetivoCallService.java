/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.publicoobjetivo.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.PublicoObjetivo;

/**
 *
 * @author Omar
 */
public interface PublicoObjetivoCallService {

    void crearPublicoObjetivo(PublicoObjetivo publicoObjetivo);

    void editarPublicoObjetivo(PublicoObjetivo publicoObjetivo);

    String obtenerPublicoObjetivoPorId(BigDecimal nidPublicoObjetivo);

    List<PublicoObjetivo> loadPublicoObjetivoList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    PublicoObjetivo find(BigDecimal id);

}
