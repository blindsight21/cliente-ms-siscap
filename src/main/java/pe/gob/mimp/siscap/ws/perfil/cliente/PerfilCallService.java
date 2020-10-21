/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.perfil.cliente;

import java.math.BigDecimal;
import java.util.List;
import pe.gob.mimp.bean.UsuarioModuloBean;
import pe.gob.mimp.seguridad.modelo.Modulo;
import pe.gob.mimp.seguridad.modelo.Perfil;
import retrofit2.http.Path;

/**
 *
 * @author Omar
 */
public interface PerfilCallService {

    List<Perfil> obtenerPerfiles(UsuarioModuloBean usuarioModuloBean);
    
    List<Perfil> obtenerPerfilesDelModulo(Modulo modulo);
    
    List<Perfil> findAll();
    
    Perfil find(@Path("id") BigDecimal id);

}
