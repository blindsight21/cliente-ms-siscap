/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.parametrosiscap.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ParametroSiscapBean;
import pe.gob.mimp.converter.ParametroSiscapCast;
import pe.gob.mimp.siscap.modelo.ParametroSiscap;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ParametroSiscapCallServiceImpl implements ParametroSiscapCallService {

    private final ParametroSiscapCall parametroSiscapCall = ParametroSiscapServiceGenerator.createService(ParametroSiscapCall.class);

    @Override
    public void crearParametroSiscap(ParametroSiscap parametroSiscap) {
        Call<ResponseData<Object>> callSync = parametroSiscapCall.crearParametroSiscap(ParametroSiscapCast.castParametroSiscapToParametroSiscapBean(parametroSiscap));

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarParametroSiscap(ParametroSiscap parametroSiscap) {
        Call<ResponseData<Object>> callSync = parametroSiscapCall.editarParametroSiscap(ParametroSiscapCast.castParametroSiscapToParametroSiscapBean(parametroSiscap));

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public List<ParametroSiscap> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<ParametroSiscapBean>>> callSync = parametroSiscapCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<ParametroSiscapBean>>> response = callSync.execute();

            List<ParametroSiscapBean> parametroSiscapBeanList = response.body().getResultado();

            if (Util.esListaVacia(parametroSiscapBeanList)) {
                return null;
            }

            return parametroSiscapBeanList.stream().map(tipoObjetivoBean -> {
                return ParametroSiscapCast.castParametroSiscapBeanToParametroSiscap(tipoObjetivoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public ParametroSiscap find(BigDecimal id) {

        Call<ResponseData<ParametroSiscapBean>> callSync = parametroSiscapCall.find(id);

        try {
            Response<ResponseData<ParametroSiscapBean>> response = callSync.execute();
            ParametroSiscapBean parametroSiscapBean = response.body().getResultado();

            return ParametroSiscapCast.castParametroSiscapBeanToParametroSiscap(parametroSiscapBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
