/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.vwactividad.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.VwActividadBean;
import pe.gob.mimp.converter.VwActividadCast;
import pe.gob.mimp.siscap.modelo.VwActividad;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class VwActividadCallServiceImpl implements VwActividadCallService {

    private VwActividadCall vwActividadCall = VwActividadServiceGenerator.createService(VwActividadCall.class);

    @Override
    public List<VwActividad> findAll() {

        Call<ResponseData<List<VwActividadBean>>> callSync = vwActividadCall.findAll();

        try {
            Response<ResponseData<List<VwActividadBean>>> response = callSync.execute();

            List<VwActividadBean> loadVwActividadBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadVwActividadBeanList)) {
                return null;
            }

            return loadVwActividadBeanList.stream().map(vwActividadBean -> {
                return VwActividadCast.castVwActividadBeanToVwActividad(vwActividadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
    
    @Override
    public List<VwActividad> obtenerActividadesDepartamento(BigDecimal nidDepartamento) {

        Call<ResponseData<List<VwActividadBean>>> callSync = vwActividadCall.obtenerActividadesDepartamento(nidDepartamento);

        try {
            Response<ResponseData<List<VwActividadBean>>> response = callSync.execute();

            List<VwActividadBean> loadVwActividadBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadVwActividadBeanList)) {
                return null;
            }

            return loadVwActividadBeanList.stream().map(vwActividadBean -> {
                return VwActividadCast.castVwActividadBeanToVwActividad(vwActividadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

}
