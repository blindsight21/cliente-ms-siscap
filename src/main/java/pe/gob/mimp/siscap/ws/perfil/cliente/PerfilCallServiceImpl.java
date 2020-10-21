/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.perfil.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.UsuarioModuloBean;
import pe.gob.mimp.seguridad.bean.entidades.ModuloBean;
import pe.gob.mimp.seguridad.bean.entidades.PerfilBean;
import pe.gob.mimp.seguridad.converter.ModuloCast;
import pe.gob.mimp.seguridad.converter.PerfilCast;
import pe.gob.mimp.seguridad.modelo.Modulo;
import pe.gob.mimp.seguridad.modelo.Perfil;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class PerfilCallServiceImpl implements PerfilCallService {

    private PerfilCall perfilCall = PerfilServiceGenerator.createService(PerfilCall.class);

    @Override
    public List<Perfil> obtenerPerfiles(UsuarioModuloBean usuarioModuloBean) {

        Call<ResponseData<List<PerfilBean>>> callSync = perfilCall.obtenerPerfiles(usuarioModuloBean);

        try {
            Response<ResponseData<List<PerfilBean>>> response = callSync.execute();

            List<PerfilBean> perfilBeanList = response.body().getResultado();

            if (Util.esListaVacia(perfilBeanList)) {
                return null;
            }

            return perfilBeanList.stream().map(perfilBean -> {
                return PerfilCast.castPerfilBeanToPerfil(perfilBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<Perfil> obtenerPerfilesDelModulo(Modulo modulo) {

        ModuloBean moduloBean = ModuloCast.castModuloToModuloBean(modulo);

        Call<ResponseData<List<PerfilBean>>> callSync = perfilCall.obtenerPerfilesDelModulo(moduloBean);

        try {
            Response<ResponseData<List<PerfilBean>>> response = callSync.execute();

            List<PerfilBean> perfilBeanList = response.body().getResultado();

            if (Util.esListaVacia(perfilBeanList)) {
                return null;
            }

            return perfilBeanList.stream().map(perfilBean -> {
                return PerfilCast.castPerfilBeanToPerfil(perfilBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }

    @Override
    public List<Perfil> findAll() {
        Call<ResponseData<List<PerfilBean>>> callSync = perfilCall.findAll();

        try {
            Response<ResponseData<List<PerfilBean>>> response = callSync.execute();

            List<PerfilBean> perfilBeanList = response.body().getResultado();

            if (Util.esListaVacia(perfilBeanList)) {
                return null;
            }

            return perfilBeanList.stream().map(perfilBean -> {
                return PerfilCast.castPerfilBeanToPerfil(perfilBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Perfil find(BigDecimal id) {

        Call<ResponseData<PerfilBean>> callSync = perfilCall.find(id);

        try {
            Response<ResponseData<PerfilBean>> response = callSync.execute();

            PerfilBean perfilBean = response.body().getResultado();

            return PerfilCast.castPerfilBeanToPerfil(perfilBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }

}
