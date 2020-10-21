/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipofuncion.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.TipoFuncion;

/**
 *
 * @author Omar
 */
public interface TipoFuncionCallService {

    void crearTipoFuncion(TipoFuncion tipoFuncion);

    void editarTipoFuncion(TipoFuncion tipoFuncion);

    String obtenerTipoFuncionPorId(BigDecimal nidTipoFuncion);

    List<TipoFuncion> loadTipoFuncionList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    TipoFuncion find(BigDecimal id);

}
