/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipomodalidad.cliente;

import pe.gob.mimp.siscap.ws.tipoobjetivo.cliente.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoModalidadBean;
import pe.gob.mimp.converter.TipoModalidadCast;
import pe.gob.mimp.siscap.modelo.TipoModalidad;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class TipoModalidadCallServiceImpl implements TipoModalidadCallService {

    private TipoModalidadCall tipoModalidadCall = TipoModalidadServiceGenerator.createService(TipoModalidadCall.class);

    @Override
    public void crearTipoModalidad(TipoModalidad tipoModalidad) {

        TipoModalidadBean tipoModalidadBean = TipoModalidadCast.castTipoModalidadToTipoModalidadBean(tipoModalidad);

        Call<ResponseData<Object>> callSync = tipoModalidadCall.crearTipoModalidad(tipoModalidadBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarTipoModalidad(TipoModalidad tipoModalidad) {

        TipoModalidadBean tipoModalidadBean = TipoModalidadCast.castTipoModalidadToTipoModalidadBean(tipoModalidad);

        Call<ResponseData<Object>> callSync = tipoModalidadCall.editarTipoModalidad(tipoModalidadBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerTipoModalidadPorId(BigDecimal nidTipoModalidad) {

        Call<ResponseData<String>> callSync = tipoModalidadCall.obtenerTipoModalidadPorId(nidTipoModalidad);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<TipoModalidad> loadTipoModalidadList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<TipoModalidadBean>>> callSync = tipoModalidadCall.loadTipoModalidadList(findByParamBean);

        try {
            Response<ResponseData<List<TipoModalidadBean>>> response = callSync.execute();

            List<TipoModalidadBean> loadTipoModalidadBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadTipoModalidadBeanList)) {
                return null;
            }

            return loadTipoModalidadBeanList.stream().map(tipoModalidadBean -> {
                return TipoModalidadCast.castTipoModalidadBeanToTipoModalidad(tipoModalidadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = tipoModalidadCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public TipoModalidad find(BigDecimal id) {

        Call<ResponseData<TipoModalidadBean>> callSync = tipoModalidadCall.find(id);

        try {
            Response<ResponseData<TipoModalidadBean>> response = callSync.execute();
            TipoModalidadBean tipoModalidadBean = response.body().getResultado();

            return TipoModalidadCast.castTipoModalidadBeanToTipoModalidad(tipoModalidadBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
