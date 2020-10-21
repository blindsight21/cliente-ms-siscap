/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwactividadcalendario.cliente;

import pe.gob.mimp.siscap.ws.vwactividad.cliente.*;
import pe.gob.mimp.siscap.ws.vwactividadcalendario.cliente.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.VwActividadCalendarioBean;
import pe.gob.mimp.converter.VwActividadCalendarioCast;
import pe.gob.mimp.siscap.modelo.VwActividadCalendario;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class VwActividadCalendarioCallServiceImpl implements VwActividadCalendarioCallService {

    private VwActividadCalendarioCall vwActividadCalendarioCall = VwActividadCalendarioServiceGenerator.createService(VwActividadCalendarioCall.class);

    @Override
    public List<VwActividadCalendario> loadVwActividadCalendarioList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<VwActividadCalendarioBean>>> callSync = vwActividadCalendarioCall.loadVwActividadCalendarioList(findByParamBean);

        try {
            Response<ResponseData<List<VwActividadCalendarioBean>>> response = callSync.execute();

            List<VwActividadCalendarioBean> loadVwActividadCalendarioBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadVwActividadCalendarioBeanList)) {
                return null;
            }

            return loadVwActividadCalendarioBeanList.stream().map(vwActividadCalendarioBean -> {
                return VwActividadCalendarioCast.castVwActividadCalendarioBeanToVwActividadCalendario(vwActividadCalendarioBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

}
