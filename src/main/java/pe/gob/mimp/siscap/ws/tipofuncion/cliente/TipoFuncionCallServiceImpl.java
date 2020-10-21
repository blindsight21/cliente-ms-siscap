/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipofuncion.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TipoFuncionBean;
import pe.gob.mimp.converter.TipoFuncionCast;
import pe.gob.mimp.siscap.modelo.TipoFuncion;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class TipoFuncionCallServiceImpl implements TipoFuncionCallService {

    private TipoFuncionCall tipoFuncionCall = TipoFuncionServiceGenerator.createService(TipoFuncionCall.class);

    @Override
    public void crearTipoFuncion(TipoFuncion tipoFuncion) {

        TipoFuncionBean tipoFuncionBean = TipoFuncionCast.castTipoFuncionToTipoFuncionBean(tipoFuncion);

        Call<ResponseData<Object>> callSync = tipoFuncionCall.crearTipoFuncion(tipoFuncionBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarTipoFuncion(TipoFuncion tipoFuncion) {

        TipoFuncionBean tipoFuncionBean = TipoFuncionCast.castTipoFuncionToTipoFuncionBean(tipoFuncion);

        Call<ResponseData<Object>> callSync = tipoFuncionCall.editarTipoFuncion(tipoFuncionBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerTipoFuncionPorId(BigDecimal nidTipoFuncion) {

        Call<ResponseData<String>> callSync = tipoFuncionCall.obtenerTipoFuncionPorId(nidTipoFuncion);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<TipoFuncion> loadTipoFuncionList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<TipoFuncionBean>>> callSync = tipoFuncionCall.loadTipoFuncionList(findByParamBean);

        try {
            Response<ResponseData<List<TipoFuncionBean>>> response = callSync.execute();

            List<TipoFuncionBean> loadTipoFuncionBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadTipoFuncionBeanList)) {
                return null;
            }

            return loadTipoFuncionBeanList.stream().map(tipoFuncionBean -> {
                return TipoFuncionCast.castTipoFuncionBeanToTipoFuncion(tipoFuncionBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = tipoFuncionCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public TipoFuncion find(BigDecimal id) {

        Call<ResponseData<TipoFuncionBean>> callSync = tipoFuncionCall.find(id);

        try {
            Response<ResponseData<TipoFuncionBean>> response = callSync.execute();
            TipoFuncionBean tipoFuncionBean = response.body().getResultado();

            return TipoFuncionCast.castTipoFuncionBeanToTipoFuncion(tipoFuncionBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
