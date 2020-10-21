/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipopersona.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.TipoPersonaBean;
import pe.gob.mimp.seguridad.converter.TipoPersonaCast;
import pe.gob.mimp.seguridad.modelo.TipoPersona;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class TipoPersonaCallServiceImpl implements TipoPersonaCallService {

    private TipoPersonaCall tipoPersonaCall = TipoPersonaServiceGenerator.createService(TipoPersonaCall.class);

    @Override
    public List<TipoPersona> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<TipoPersonaBean>>> callSync = tipoPersonaCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<TipoPersonaBean>>> response = callSync.execute();

            List<TipoPersonaBean> tipoPersonaBeanList = response.body().getResultado();

            return tipoPersonaBeanList.stream().map(tipoPersonaBean -> {
                return TipoPersonaCast.castTipoPersonaBeanToTipoPersona(tipoPersonaBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

}
