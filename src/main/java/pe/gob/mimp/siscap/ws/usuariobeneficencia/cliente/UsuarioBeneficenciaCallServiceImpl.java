/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.usuariobeneficencia.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.UsuarioBeneficenciaBean;
import pe.gob.mimp.seguridad.converter.UsuarioBeneficenciaCast;
import pe.gob.mimp.seguridad.modelo.UsuarioBeneficencia;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class UsuarioBeneficenciaCallServiceImpl implements UsuarioBeneficenciaCallService {

    private UsuarioBeneficenciaCall usuarioBeneficenciaCall = UsuarioBeneficenciaServiceGenerator.createService(UsuarioBeneficenciaCall.class);

    @Override
    public List<UsuarioBeneficencia> findByParams(FindByParamBean findByParamBean) {

        Call<ResponseData<List<UsuarioBeneficenciaBean>>> callSync = usuarioBeneficenciaCall.findByParams(findByParamBean);

        try {
            Response<ResponseData<List<UsuarioBeneficenciaBean>>> response = callSync.execute();

            List<UsuarioBeneficenciaBean> usuarioBeneficenciaList = response.body().getResultado();

            if (Util.esListaVacia(usuarioBeneficenciaList)) {
                return null;
            }

            return usuarioBeneficenciaList.stream().map(usuarioBeneficenciaBean -> {
                return UsuarioBeneficenciaCast.castUsuarioBeneficenciaBeanToUsuarioBeneficencia(usuarioBeneficenciaBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

}
