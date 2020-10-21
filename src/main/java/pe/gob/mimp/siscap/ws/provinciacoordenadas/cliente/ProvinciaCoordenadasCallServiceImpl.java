/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.provinciacoordenadas.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.ProvinciaBean;
import pe.gob.mimp.general.bean.entidades.ProvinciaCoordenadasBean;
import pe.gob.mimp.general.converter.ProvinciaCast;
import pe.gob.mimp.general.converter.ProvinciaCoordenadasCast;
import pe.gob.mimp.general.modelo.Provincia;
import pe.gob.mimp.general.modelo.ProvinciaCoordenadas;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ProvinciaCoordenadasCallServiceImpl implements ProvinciaCoordenadasCallService {

    private ProvinciaCoordenadasCall provinciaCoordenadasCall = ProvinciaCoordenadasServiceGenerator.createService(ProvinciaCoordenadasCall.class);

    @Override
    public List<ProvinciaCoordenadas> obtenerCoordenadas(Provincia provincia) {

        ProvinciaBean provinciaBean = ProvinciaCast.castProvinciaToProvinciaBean(provincia);

        Call<ResponseData<List<ProvinciaCoordenadasBean>>> callSync = provinciaCoordenadasCall.obtenerCoordenadas(provinciaBean);

        try {
            Response<ResponseData<List<ProvinciaCoordenadasBean>>> response = callSync.execute();

            List<ProvinciaCoordenadasBean> loadProvinciaCoordenadasBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadProvinciaCoordenadasBeanList)) {
                return null;
            }

            return loadProvinciaCoordenadasBeanList.stream().map(provinciaCoordenadasBean -> {
                return ProvinciaCoordenadasCast.castProvinciaCoordenadasBeanToProvinciaCoordenadas(provinciaCoordenadasBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
}
