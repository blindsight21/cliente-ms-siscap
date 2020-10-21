/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipogobierno.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.TipoGobierno;

/**
 *
 * @author Omar
 */
public interface TipoGobiernoCallService {

    void crearTipoGobierno(TipoGobierno tipoGobierno);

    void editarTipoGobierno(TipoGobierno tipoGobierno);

    String obtenerTipoGobiernoPorId(BigDecimal nidTipoGobierno);

    List<TipoGobierno> loadTipoGobiernoList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    TipoGobierno find(BigDecimal id);

}
