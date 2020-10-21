/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.distritocoordenadas.cliente;

import java.util.List;
import pe.gob.mimp.general.modelo.Distrito;
import pe.gob.mimp.general.modelo.DistritoCoordenadas;

/**
 *
 * @author Omar
 */
public interface DistritoCoordenadasCallService {

    List<DistritoCoordenadas> obtenerCoordenadas(Distrito distrito);

}
