/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.parametrosiscap.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.siscap.modelo.ParametroSiscap;

/**
 *
 * @author Omar
 */
public interface ParametroSiscapCallService {

    void crearParametroSiscap(ParametroSiscap parametroSiscap);

    void editarParametroSiscap(ParametroSiscap parametroSiscap);

    List<ParametroSiscap> findAllByField(FindAllByFieldBean findByParamBean);

    ParametroSiscap find(BigDecimal id);

}
