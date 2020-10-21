/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.usuariobeneficencia.cliente;

import java.util.List;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.seguridad.modelo.UsuarioBeneficencia;

/**
 *
 * @author Omar
 */
public interface UsuarioBeneficenciaCallService {

    List<UsuarioBeneficencia> findByParams(FindByParamBean findByParamBean);

}
