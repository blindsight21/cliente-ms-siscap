/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.departamento.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.general.modelo.Departamento;

/**
 *
 * @author Omar
 */
public interface DepartamentoCallService {

    List<Departamento> obtenerDepartamentos();
    
    List<Departamento> obtenerActivos();

    Departamento find(BigDecimal id);
    
    List<Departamento> findAllByField(FindAllByFieldBean findAllByFieldBean);

}
