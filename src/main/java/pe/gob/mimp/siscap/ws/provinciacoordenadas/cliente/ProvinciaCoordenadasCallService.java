/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.provinciacoordenadas.cliente;

import java.util.List;
import pe.gob.mimp.general.modelo.Provincia;
import pe.gob.mimp.general.modelo.ProvinciaCoordenadas;

/**
 *
 * @author Omar
 */
public interface ProvinciaCoordenadasCallService {

    List<ProvinciaCoordenadas> obtenerCoordenadas(Provincia provincia);

}
