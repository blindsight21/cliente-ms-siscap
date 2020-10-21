/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.gobierno.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.Gobierno;

/**
 *
 * @author Omar
 */
public interface GobiernoCallService {

    void crearGobierno(Gobierno gobierno);

    void editarGobierno(Gobierno gobierno);

    String obtenerGobiernoPorId(BigDecimal nidGobierno);

    List<Gobierno> loadGobiernoList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    Gobierno find(BigDecimal id);

}
