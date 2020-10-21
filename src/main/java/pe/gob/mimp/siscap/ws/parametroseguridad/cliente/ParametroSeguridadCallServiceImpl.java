/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.parametroseguridad.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.ParametroSeguridadBean;
import pe.gob.mimp.seguridad.converter.ParametroSeguridadCast;
import pe.gob.mimp.seguridad.modelo.ParametroSeguridad;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ParametroSeguridadCallServiceImpl implements ParametroSeguridadCallService {

    private ParametroSeguridadCall parametroSeguridadCall = ParametroSeguridadServiceGenerator.createService(ParametroSeguridadCall.class);

    @Override
    public List<ParametroSeguridad> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<ParametroSeguridadBean>>> callSync = parametroSeguridadCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<ParametroSeguridadBean>>> response = callSync.execute();

            List<ParametroSeguridadBean> parametroSeguridadBeanList = response.body().getResultado();

            if (Util.esListaVacia(parametroSeguridadBeanList)) {
                return null;
            }

            return parametroSeguridadBeanList.stream().map(parametroSeguridadBean -> {
                return ParametroSeguridadCast.castParametroSeguridadBeanToParametroSeguridad(parametroSeguridadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

}
