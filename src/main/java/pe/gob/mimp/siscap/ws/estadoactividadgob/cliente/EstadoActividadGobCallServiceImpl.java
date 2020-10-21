/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.estadoactividadgob.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.EstadoActividadGobBean;
import pe.gob.mimp.converter.EstadoActividadGobCast;
import pe.gob.mimp.siscap.modelo.EstadoActividadGob;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class EstadoActividadGobCallServiceImpl implements EstadoActividadGobCallService {

    private EstadoActividadGobCall estadoActividadGobCall = EstadoActividadGobServiceGenerator.createService(EstadoActividadGobCall.class);

    @Override
    public void crearEstadoActividadGob(EstadoActividadGob estadoActividadGob) {

        EstadoActividadGobBean estadoActividadGobBean = EstadoActividadGobCast.castEstadoActividadGobToEstadoActividadGobBean(estadoActividadGob);

        Call<ResponseData<Object>> callSync = estadoActividadGobCall.crearEstadoActividadGob(estadoActividadGobBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarEstadoActividadGob(EstadoActividadGob estadoActividadGob) {

        EstadoActividadGobBean estadoActividadGobBean = EstadoActividadGobCast.castEstadoActividadGobToEstadoActividadGobBean(estadoActividadGob);

        Call<ResponseData<Object>> callSync = estadoActividadGobCall.editarEstadoActividadGob(estadoActividadGobBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerEstadoActividadGobPorId(BigDecimal nidEstadoActividadGob) {

        Call<ResponseData<String>> callSync = estadoActividadGobCall.obtenerEstadoActividadGobPorId(nidEstadoActividadGob);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<EstadoActividadGob> loadEstadoActividadGobList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<EstadoActividadGobBean>>> callSync = estadoActividadGobCall.loadEstadoActividadGobList(findByParamBean);

        try {
            Response<ResponseData<List<EstadoActividadGobBean>>> response = callSync.execute();

            List<EstadoActividadGobBean> loadEstadoActividadGobBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadEstadoActividadGobBeanList)) {
                return null;
            }

            return loadEstadoActividadGobBeanList.stream().map(estadoActividadGobBean -> {
                return EstadoActividadGobCast.castEstadoActividadGobBeanToEstadoActividadGob(estadoActividadGobBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = estadoActividadGobCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public EstadoActividadGob find(BigDecimal id) {

        Call<ResponseData<EstadoActividadGobBean>> callSync = estadoActividadGobCall.find(id);

        try {
            Response<ResponseData<EstadoActividadGobBean>> response = callSync.execute();
            EstadoActividadGobBean estadoActividadGobBean = response.body().getResultado();

            return EstadoActividadGobCast.castEstadoActividadGobBeanToEstadoActividadGob(estadoActividadGobBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
