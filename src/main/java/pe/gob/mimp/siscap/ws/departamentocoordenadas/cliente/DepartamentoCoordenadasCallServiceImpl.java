/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.departamentocoordenadas.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.DepartamentoBean;
import pe.gob.mimp.general.bean.entidades.DepartamentoCoordenadasBean;
import pe.gob.mimp.general.converter.DepartamentoCast;
import pe.gob.mimp.general.converter.DepartamentoCoordenadasCast;
import pe.gob.mimp.general.modelo.Departamento;
import pe.gob.mimp.general.modelo.DepartamentoCoordenadas;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class DepartamentoCoordenadasCallServiceImpl implements DepartamentoCoordenadasCallService {

    private DepartamentoCoordenadasCall departamentoCoordenadasCall = DepartamentoCoordenadasServiceGenerator.createService(DepartamentoCoordenadasCall.class);

    @Override
    public List<DepartamentoCoordenadas> obtenerCoordenadas(Departamento departamento) {

        DepartamentoBean departamentoBean = DepartamentoCast.castDepartamentoToDepartamentoBean(departamento);

        Call<ResponseData<List<DepartamentoCoordenadasBean>>> callSync = departamentoCoordenadasCall.obtenerCoordenadas(departamentoBean);

        try {
            Response<ResponseData<List<DepartamentoCoordenadasBean>>> response = callSync.execute();

            List<DepartamentoCoordenadasBean> loadDepartamentoCoordenadasBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadDepartamentoCoordenadasBeanList)) {
                return null;
            }

            return loadDepartamentoCoordenadasBeanList.stream().map(departamentoCoordenadasBean -> {
                return DepartamentoCoordenadasCast.castDepartamentoCoordenadasBeanToDepartamentoCoordenadas(departamentoCoordenadasBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
}
