/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.usuario.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.UsuarioModuloBean;
import pe.gob.mimp.bean.ValidarBean;
import pe.gob.mimp.seguridad.bean.entidades.FuncionalidadBean;
import pe.gob.mimp.seguridad.bean.entidades.ModuloBean;
import pe.gob.mimp.seguridad.bean.entidades.UsuarioBean;
import pe.gob.mimp.seguridad.converter.FuncionalidadCast;
import pe.gob.mimp.seguridad.converter.ModuloCast;
import pe.gob.mimp.seguridad.converter.UsuarioCast;
import pe.gob.mimp.seguridad.modelo.Funcionalidad;
import pe.gob.mimp.seguridad.modelo.Modulo;
import pe.gob.mimp.seguridad.modelo.Usuario;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class UsuarioCallServiceImpl implements UsuarioCallService {

    private UsuarioCall usuarioCall = UsuarioServiceGenerator.createService(UsuarioCall.class);

    @Override
    public void crearUsuario(Usuario usuarioNuevo) {

        UsuarioBean UsuarioBeanNuevo = UsuarioCast.castUsuarioToUsuarioBean(usuarioNuevo);

        Call<ResponseData<Object>> callSync = usuarioCall.crearUsuario(UsuarioBeanNuevo);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarUsuario(Usuario usuarioEditado) {

        UsuarioBean UsuarioBeanEditado = UsuarioCast.castUsuarioToUsuarioBean(usuarioEditado);

        Call<ResponseData<Object>> callSync = usuarioCall.editarUsuario(UsuarioBeanEditado);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public List<Usuario> findAll() {

        Call<ResponseData<List<UsuarioBean>>> callSync = usuarioCall.findAll();

        try {
            Response<ResponseData<List<UsuarioBean>>> response = callSync.execute();

            List<UsuarioBean> usuarioBeanList = response.body().getResultado();

            if (Util.esListaVacia(usuarioBeanList)) {
                return null;
            }

            return usuarioBeanList.stream().map(usuarioBean -> {
                return UsuarioCast.castUsuarioBeanToUsuario(usuarioBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Usuario find(BigDecimal id) {

        Call<ResponseData<UsuarioBean>> callSync = usuarioCall.find(id);

        try {
            Response<ResponseData<UsuarioBean>> response = callSync.execute();

            UsuarioBean usuarioBean = response.body().getResultado();

            return UsuarioCast.castUsuarioBeanToUsuario(usuarioBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }

    @Override
    public List<Usuario> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<UsuarioBean>>> callSync = usuarioCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<UsuarioBean>>> response = callSync.execute();

            List<UsuarioBean> usuarioBeanList = response.body().getResultado();

            if (Util.esListaVacia(usuarioBeanList)) {
                return null;
            }

            return usuarioBeanList.stream().map(usuarioBean -> {
                return UsuarioCast.castUsuarioBeanToUsuario(usuarioBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<Usuario> getEntidadesModulo(Modulo modulo) {

        ModuloBean moduloBean = ModuloCast.castModuloToModuloBean(modulo);

        Call<ResponseData<List<UsuarioBean>>> callSync = usuarioCall.getEntidadesModulo(moduloBean);

        try {
            Response<ResponseData<List<UsuarioBean>>> response = callSync.execute();

            List<UsuarioBean> usuarioBeanList = response.body().getResultado();

            if (Util.esListaVacia(usuarioBeanList)) {
                return null;
            }

            return usuarioBeanList.stream().map(usuarioBean -> {
                return UsuarioCast.castUsuarioBeanToUsuario(usuarioBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<Usuario> validar(ValidarBean validarBean) {

        Call<ResponseData<List<UsuarioBean>>> callSync = usuarioCall.validar(validarBean);

        try {
            Response<ResponseData<List<UsuarioBean>>> response = callSync.execute();

            List<UsuarioBean> usuarioBeanList = response.body().getResultado();

            if (Util.esListaVacia(usuarioBeanList)) {
                return null;
            }

            return usuarioBeanList.stream().map(usuarioBean -> {
                return UsuarioCast.castUsuarioBeanToUsuario(usuarioBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<Funcionalidad> obtenerFuncionalidades(UsuarioModuloBean usuarioModuloBean) {

        Call<ResponseData<List<FuncionalidadBean>>> callSync = usuarioCall.obtenerFuncionalidades(usuarioModuloBean);

        try {
            Response<ResponseData<List<FuncionalidadBean>>> response = callSync.execute();

            List<FuncionalidadBean> funcionalidadBeanList = response.body().getResultado();

            if (Util.esListaVacia(funcionalidadBeanList)) {
                return null;
            }

            return funcionalidadBeanList.stream().map(funcionalidadBean -> {
                return FuncionalidadCast.castFuncionalidadBeanToFuncionalidad(funcionalidadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<Usuario> getEntidadesModuloTodos(Modulo modulo) {

        ModuloBean moduloBean = ModuloCast.castModuloToModuloBean(modulo);

        Call<ResponseData<List<UsuarioBean>>> callSync = usuarioCall.getEntidadesModuloTodos(moduloBean);

        try {
            Response<ResponseData<List<UsuarioBean>>> response = callSync.execute();

            List<UsuarioBean> usuarioBeanList = response.body().getResultado();

            if (Util.esListaVacia(usuarioBeanList)) {
                return null;
            }

            return usuarioBeanList.stream().map(usuarioBean -> {
                return UsuarioCast.castUsuarioBeanToUsuario(usuarioBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

}
