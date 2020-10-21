/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipomodalidad.cliente;

import pe.gob.mimp.siscap.ws.tipoobjetivo.cliente.*;
import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.TipoModalidad;

/**
 *
 * @author Omar
 */
public interface TipoModalidadCallService {

    void crearTipoModalidad(TipoModalidad tipoModalidad);

    void editarTipoModalidad(TipoModalidad tipoModalidad);

    String obtenerTipoModalidadPorId(BigDecimal nidTipoModalidad);

    List<TipoModalidad> loadTipoModalidadList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    TipoModalidad find(BigDecimal id);

}
