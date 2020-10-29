/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.rendimiento.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.RendimientoBean;
import pe.gob.mimp.converter.RendimientoCast;
import pe.gob.mimp.siscap.modelo.Rendimiento;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class RendimientoCallServiceImpl implements RendimientoCallService {

    private RendimientoCall rendimientoCall = RendimientoServiceGenerator.createService(RendimientoCall.class);

    @Override
    public void crearRendimiento(Rendimiento rendimiento) {

        RendimientoBean rendimientoBean = RendimientoCast.castRendimientoToRendimientoBean(rendimiento);

        Call<ResponseData<Object>> callSync = rendimientoCall.crearRendimiento(rendimientoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarRendimiento(Rendimiento rendimiento) {

        RendimientoBean rendimientoBean = RendimientoCast.castRendimientoToRendimientoBean(rendimiento);

        Call<ResponseData<Object>> callSync = rendimientoCall.editarRendimiento(rendimientoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public List<Rendimiento> loadRendimientoList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<RendimientoBean>>> callSync = rendimientoCall.loadRendimientoList(findByParamBean);

        try {
            Response<ResponseData<List<RendimientoBean>>> response = callSync.execute();

            List<RendimientoBean> loadRendimientoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadRendimientoBeanList)) {
                return null;
            }

            return loadRendimientoBeanList.stream().map(rendimientoBean -> {
                return RendimientoCast.castRendimientoBeanToRendimiento(rendimientoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Rendimiento find(BigDecimal id) {

        Call<ResponseData<RendimientoBean>> callSync = rendimientoCall.find(id);

        try {
            Response<ResponseData<RendimientoBean>> response = callSync.execute();
            RendimientoBean rendimientoBean = response.body().getResultado();

            return RendimientoCast.castRendimientoBeanToRendimiento(rendimientoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
