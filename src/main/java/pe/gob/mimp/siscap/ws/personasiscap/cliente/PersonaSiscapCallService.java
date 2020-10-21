/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.personasiscap.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.siscap.modelo.PersonaSiscap;

/**
 *
 * @author Omar
 */
public interface PersonaSiscapCallService {

    void crearPersonaSiscap(PersonaSiscap personaSiscap);

    void editarPersonaSiscap(PersonaSiscap personaSiscap);

    List<PersonaSiscap> loadPersonaSiscapList(FindByParamBean findByParamBean);

    PersonaSiscap find(BigDecimal id);
    
    List<PersonaSiscap> findAllByField(FindAllByFieldBean findAllByFieldBean);

}
