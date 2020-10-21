/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwreporteactividad.cliente;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.VwReporteActividadBean;
import pe.gob.mimp.converter.VwReporteActividadCast;
import pe.gob.mimp.siscap.modelo.VwReporteActividad;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class VwReporteActividadCallServiceImpl implements VwReporteActividadCallService {

    private VwReporteActividadCall vwReporteActividadCall = VwReporteActividadServiceGenerator.createService(VwReporteActividadCall.class);

    @Override
    public List<VwReporteActividad> findAll() {

        Call<ResponseData<List<VwReporteActividadBean>>> callSync = vwReporteActividadCall.findAll();

        try {
            Response<ResponseData<List<VwReporteActividadBean>>> response = callSync.execute();

            List<VwReporteActividadBean> loadVwReporteActividadBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadVwReporteActividadBeanList)) {
                return null;
            }

            return loadVwReporteActividadBeanList.stream().map(vwActividadBean -> {
                return VwReporteActividadCast.castVwReporteActividadBeanToVwReporteActividad(vwActividadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
    
    @Override
    public List<VwReporteActividad> loadVwReporteActList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<VwReporteActividadBean>>> callSync = vwReporteActividadCall.loadVwReporteActList(findByParamBean);

        try {
            Response<ResponseData<List<VwReporteActividadBean>>> response = callSync.execute();

            List<VwReporteActividadBean> loadVwReporteActividadBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadVwReporteActividadBeanList)) {
                return null;
            }

            return loadVwReporteActividadBeanList.stream().map(vwActividadBean -> {
                return VwReporteActividadCast.castVwReporteActividadBeanToVwReporteActividad(vwActividadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

}
