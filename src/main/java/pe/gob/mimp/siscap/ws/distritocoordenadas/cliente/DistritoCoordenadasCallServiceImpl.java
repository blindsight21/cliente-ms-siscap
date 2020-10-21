/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.distritocoordenadas.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.DistritoBean;
import pe.gob.mimp.general.bean.entidades.DistritoCoordenadasBean;
import pe.gob.mimp.general.converter.DistritoCast;
import pe.gob.mimp.general.converter.DistritoCoordenadasCast;
import pe.gob.mimp.general.modelo.Distrito;
import pe.gob.mimp.general.modelo.DistritoCoordenadas;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class DistritoCoordenadasCallServiceImpl implements DistritoCoordenadasCallService {

    private DistritoCoordenadasCall distritoCoordenadasCall = DistritoCoordenadasServiceGenerator.createService(DistritoCoordenadasCall.class);

    @Override
    public List<DistritoCoordenadas> obtenerCoordenadas(Distrito distrito) {

        DistritoBean distritoBean = DistritoCast.castDistritoToDistritoBean(distrito);

        Call<ResponseData<List<DistritoCoordenadasBean>>> callSync = distritoCoordenadasCall.obtenerCoordenadas(distritoBean);

        try {
            Response<ResponseData<List<DistritoCoordenadasBean>>> response = callSync.execute();

            List<DistritoCoordenadasBean> loadDistritoCoordenadasBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadDistritoCoordenadasBeanList)) {
                return null;
            }

            return loadDistritoCoordenadasBeanList.stream().map(distritoCoordenadasBean -> {
                return DistritoCoordenadasCast.castDistritoCoordenadasBeanToDistritoCoordenadas(distritoCoordenadasBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
}
