/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.perfilusuario.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.UsuarioModuloBean;
import pe.gob.mimp.seguridad.bean.entidades.PerfilUsuarioBean;
import pe.gob.mimp.seguridad.converter.PerfilUsuarioCast;
import pe.gob.mimp.seguridad.modelo.PerfilUsuario;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class PerfilUsuarioCallServiceImpl implements PerfilUsuarioCallService {

    private PerfilUsuarioCall perfilUsuarioCall = PerfilUsuarioServiceGenerator.createService(PerfilUsuarioCall.class);

    @Override
    public void crearPerfilUsuario(PerfilUsuario perfilUsuarioNuevo) {

        PerfilUsuarioBean perfilUsuarioBeanNuevo = PerfilUsuarioCast.castPerfilUsuarioToPerfilUsuarioBean(perfilUsuarioNuevo);

        Call<ResponseData<Object>> callSync = perfilUsuarioCall.crearPerfilUsuario(perfilUsuarioBeanNuevo);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public List<PerfilUsuario> obtenerPerfilUsuarioPorModulo(UsuarioModuloBean usuarioModuloBean) {
        Call<ResponseData<List<PerfilUsuarioBean>>> callSync = perfilUsuarioCall.obtenerPerfilUsuarioPorModulo(usuarioModuloBean);

        try {
            Response<ResponseData<List<PerfilUsuarioBean>>> response = callSync.execute();

            List<PerfilUsuarioBean> perfilUsuarioBeanList = response.body().getResultado();

            if (Util.esListaVacia(perfilUsuarioBeanList)) {
                return null;
            }

            return perfilUsuarioBeanList.stream().map(perfilUsuarioBean -> {
                return PerfilUsuarioCast.castPerfilUsuarioBeanToPerfilUsuario(perfilUsuarioBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public void remove(PerfilUsuario perfilUsuarioEliminado) {

        PerfilUsuarioBean perfilUsuarioBeanEliminado = PerfilUsuarioCast.castPerfilUsuarioToPerfilUsuarioBean(perfilUsuarioEliminado);

        Call<ResponseData<Object>> callSync = perfilUsuarioCall.remove(perfilUsuarioBeanEliminado);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

}
