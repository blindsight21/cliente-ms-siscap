/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.departamento.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.DepartamentoBean;
import pe.gob.mimp.general.converter.DepartamentoCast;
import pe.gob.mimp.general.modelo.Departamento;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class DepartamentoCallServiceImpl implements DepartamentoCallService {

    private DepartamentoCall departamentoCall = DepartamentoServiceGenerator.createService(DepartamentoCall.class);

    @Override
    public List<Departamento> obtenerDepartamentos() {

        Call<ResponseData<List<DepartamentoBean>>> callSync = departamentoCall.obtenerDepartamentos();

        try {
            Response<ResponseData<List<DepartamentoBean>>> response = callSync.execute();

            List<DepartamentoBean> loadDepartamentoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadDepartamentoBeanList)) {
                return null;
            }

            return loadDepartamentoBeanList.stream().map(departamentoBean -> {
                return DepartamentoCast.castDepartamentoBeanToDepartamento(departamentoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<Departamento> obtenerActivos() {

        Call<ResponseData<List<DepartamentoBean>>> callSync = departamentoCall.obtenerActivos();

        try {
            Response<ResponseData<List<DepartamentoBean>>> response = callSync.execute();

            List<DepartamentoBean> loadDepartamentoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadDepartamentoBeanList)) {
                return null;
            }

            return loadDepartamentoBeanList.stream().map(departamentoBean -> {
                return DepartamentoCast.castDepartamentoBeanToDepartamento(departamentoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Departamento find(BigDecimal id) {

        Call<ResponseData<DepartamentoBean>> callSync = departamentoCall.find(id);

        try {
            Response<ResponseData<DepartamentoBean>> response = callSync.execute();
            DepartamentoBean departamentoBean = response.body().getResultado();

            return DepartamentoCast.castDepartamentoBeanToDepartamento(departamentoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
    
    @Override
    public List<Departamento> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<DepartamentoBean>>> callSync = departamentoCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<DepartamentoBean>>> response = callSync.execute();

            List<DepartamentoBean> loadDepartamentoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadDepartamentoBeanList)) {
                return null;
            }

            return loadDepartamentoBeanList.stream().map(departamentoBean -> {
                return DepartamentoCast.castDepartamentoBeanToDepartamento(departamentoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
}
