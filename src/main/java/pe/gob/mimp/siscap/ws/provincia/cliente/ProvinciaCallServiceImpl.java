/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.provincia.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.DepartamentoBean;
import pe.gob.mimp.general.bean.entidades.ProvinciaBean;
import pe.gob.mimp.general.converter.DepartamentoCast;
import pe.gob.mimp.general.converter.ProvinciaCast;
import pe.gob.mimp.general.modelo.Departamento;
import pe.gob.mimp.general.modelo.Provincia;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ProvinciaCallServiceImpl implements ProvinciaCallService {

    private ProvinciaCall distritoCall = ProvinciaServiceGenerator.createService(ProvinciaCall.class);

    @Override
    public List<Provincia> obtenerProvincias(Departamento departamento) {
        
        DepartamentoBean departamentoBean = DepartamentoCast.castDepartamentoToDepartamentoBean(departamento);

        Call<ResponseData<List<ProvinciaBean>>> callSync = distritoCall.obtenerProvincias(departamentoBean);

        try {
            Response<ResponseData<List<ProvinciaBean>>> response = callSync.execute();

            List<ProvinciaBean> loadProvinciaBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadProvinciaBeanList)) {
                return null;
            }

            return loadProvinciaBeanList.stream().map(distritoBean -> {
                return ProvinciaCast.castProvinciaBeanToProvincia(distritoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<Provincia> obtenerActivos() {

        Call<ResponseData<List<ProvinciaBean>>> callSync = distritoCall.obtenerActivos();

        try {
            Response<ResponseData<List<ProvinciaBean>>> response = callSync.execute();

            List<ProvinciaBean> loadProvinciaBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadProvinciaBeanList)) {
                return null;
            }

            return loadProvinciaBeanList.stream().map(distritoBean -> {
                return ProvinciaCast.castProvinciaBeanToProvincia(distritoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Provincia find(BigDecimal id) {

        Call<ResponseData<ProvinciaBean>> callSync = distritoCall.find(id);

        try {
            Response<ResponseData<ProvinciaBean>> response = callSync.execute();
            ProvinciaBean distritoBean = response.body().getResultado();

            return ProvinciaCast.castProvinciaBeanToProvincia(distritoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
    
    @Override
    public List<Provincia> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<ProvinciaBean>>> callSync = distritoCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<ProvinciaBean>>> response = callSync.execute();

            List<ProvinciaBean> loadProvinciaBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadProvinciaBeanList)) {
                return null;
            }

            return loadProvinciaBeanList.stream().map(distritoBean -> {
                return ProvinciaCast.castProvinciaBeanToProvincia(distritoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
}
