/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.funciontransferida.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.FuncionTransferida;

/**
 *
 * @author Omar
 */
public interface FuncionTransferidaCallService {

    void crearFuncionTransferida(FuncionTransferida funcionTransferida);

    void editarFuncionTransferida(FuncionTransferida funcionTransferida);

    String obtenerFuncionTransferidaPorId(BigDecimal nidFuncionTransferida);

    List<FuncionTransferida> loadFuncionTransferidaList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    FuncionTransferida find(BigDecimal id);

}
