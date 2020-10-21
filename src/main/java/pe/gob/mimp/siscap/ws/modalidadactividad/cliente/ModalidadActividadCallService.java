/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.modalidadactividad.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.ModalidadActividad;

/**
 *
 * @author Omar
 */
public interface ModalidadActividadCallService {

    void crearModalidadActividad(ModalidadActividad modalidadActividad);

    void editarModalidadActividad(ModalidadActividad modalidadActividad);

    String obtenerModalidadActividadPorId(BigDecimal nidModalidadActividad);

    List<ModalidadActividad> loadModalidadActividadList(FindByParamBean findByParamBean);

    Integer getRecordCount(FindByParamBean findByParamBean);

    ModalidadActividad find(BigDecimal id);

}
