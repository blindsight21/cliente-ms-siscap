/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.estadousuario.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.EstadoUsuarioBean;
import pe.gob.mimp.seguridad.converter.EstadoUsuarioCast;
import pe.gob.mimp.seguridad.modelo.EstadoUsuario;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class EstadoUsuarioCallServiceImpl implements EstadoUsuarioCallService {

    private EstadoUsuarioCall estadoUsuarioCall = EstadoUsuarioServiceGenerator.createService(EstadoUsuarioCall.class);

    @Override
    public List<EstadoUsuario> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<EstadoUsuarioBean>>> callSync = estadoUsuarioCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<EstadoUsuarioBean>>> response = callSync.execute();

            List<EstadoUsuarioBean> estadoUsuarioBeanList = response.body().getResultado();

            if (Util.esListaVacia(estadoUsuarioBeanList)) {
                return null;
            }

            return estadoUsuarioBeanList.stream().map(estadoUsuarioBean -> {
                return EstadoUsuarioCast.castEstadoUsuarioBeanToEstadoUsuario(estadoUsuarioBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

}
