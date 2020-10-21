/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwcantidadactividad.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.VwCantidadActividadBean;
import pe.gob.mimp.converter.VwCantidadActividadCast;
import pe.gob.mimp.siscap.modelo.VwCantidadActividad;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class VwCantidadActividadCallServiceImpl implements VwCantidadActividadCallService {

    private VwCantidadActividadCall vwActividadCall = VwCantidadActividadServiceGenerator.createService(VwCantidadActividadCall.class);

    @Override
    public List<VwCantidadActividad> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<VwCantidadActividadBean>>> callSync = vwActividadCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<VwCantidadActividadBean>>> response = callSync.execute();

            List<VwCantidadActividadBean> loadVwCantidadActividadBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadVwCantidadActividadBeanList)) {
                return null;
            }

            return loadVwCantidadActividadBeanList.stream().map(vwActividadBean -> {
                return VwCantidadActividadCast.castVwCantidadActividadBeanToVwCantidadActividad(vwActividadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

}
