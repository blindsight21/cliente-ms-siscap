/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipodocumento.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.seguridad.modelo.TipoDocumento;

/**
 *
 * @author Omar
 */
public interface TipoDocumentoCallService {

    void crearTipoDocumento(TipoDocumento tipoDocumento);

    void editarTipoDocumento(TipoDocumento tipoDocumento);

    String obtenerTipoDocumentoPorId(BigDecimal nidTipoDocumento);
    
    List<TipoDocumento> findAll();

    List<TipoDocumento> loadTipoDocumentoList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    TipoDocumento obtener(String nombre);
    
    TipoDocumento find(BigDecimal id);

}
