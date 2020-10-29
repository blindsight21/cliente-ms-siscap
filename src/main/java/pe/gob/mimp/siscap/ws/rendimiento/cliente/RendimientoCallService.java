/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.rendimiento.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.Rendimiento;

/**
 *
 * @author Omar
 */
public interface RendimientoCallService {

    void crearRendimiento(Rendimiento rendimiento);
    
    void editarRendimiento(Rendimiento rendimiento);

    List<Rendimiento> loadRendimientoList(FindByParamBean findByParamBean);
    
    Rendimiento find(BigDecimal id);

}
