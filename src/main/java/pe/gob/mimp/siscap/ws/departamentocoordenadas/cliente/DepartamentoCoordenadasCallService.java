/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.departamentocoordenadas.cliente;

import java.util.List;
import pe.gob.mimp.general.modelo.Departamento;
import pe.gob.mimp.general.modelo.DepartamentoCoordenadas;

/**
 *
 * @author Omar
 */
public interface DepartamentoCoordenadasCallService {

    List<DepartamentoCoordenadas> obtenerCoordenadas(Departamento departamento);

}
