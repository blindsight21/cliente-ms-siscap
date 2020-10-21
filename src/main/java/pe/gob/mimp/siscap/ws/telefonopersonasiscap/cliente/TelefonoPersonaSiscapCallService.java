/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.telefonopersonasiscap.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.PersonaSiscapBean;
import pe.gob.mimp.siscap.modelo.TelefonoPersonaSiscap;

/**
 *
 * @author Omar
 */
public interface TelefonoPersonaSiscapCallService {

    void crearTelefonoPersonaSiscap(TelefonoPersonaSiscap telefonoPersonaSiscap);

    void editarTelefonoPersonaSiscap(TelefonoPersonaSiscap telefonoPersonaSiscap);

    List<TelefonoPersonaSiscap> obtenerTelefonos(PersonaSiscapBean personaSiscapBean);

    TelefonoPersonaSiscap find(BigDecimal id);

}
