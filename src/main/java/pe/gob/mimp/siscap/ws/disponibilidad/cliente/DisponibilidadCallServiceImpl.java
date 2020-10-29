/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.disponibilidad.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.DisponibilidadBean;
import pe.gob.mimp.converter.DisponibilidadCast;
import pe.gob.mimp.siscap.modelo.Disponibilidad;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class DisponibilidadCallServiceImpl implements DisponibilidadCallService {

    private DisponibilidadCall disponibilidadCall = DisponibilidadServiceGenerator.createService(DisponibilidadCall.class);

    @Override
    public void crearDisponibilidad(Disponibilidad disponibilidad) {

        DisponibilidadBean disponibilidadBean = DisponibilidadCast.castDisponibilidadToDisponibilidadBean(disponibilidad);

        Call<ResponseData<Object>> callSync = disponibilidadCall.crearDisponibilidad(disponibilidadBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }
    
    @Override
    public void editarDisponibilidad(Disponibilidad disponibilidad) {

        DisponibilidadBean disponibilidadBean = DisponibilidadCast.castDisponibilidadToDisponibilidadBean(disponibilidad);

        Call<ResponseData<Object>> callSync = disponibilidadCall.editarDisponibilidad(disponibilidadBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public List<Disponibilidad> loadDisponibilidadList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<DisponibilidadBean>>> callSync = disponibilidadCall.loadDisponibilidadList(findByParamBean);

        try {
            Response<ResponseData<List<DisponibilidadBean>>> response = callSync.execute();

            List<DisponibilidadBean> loadDisponibilidadBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadDisponibilidadBeanList)) {
                return null;
            }

            return loadDisponibilidadBeanList.stream().map(disponibilidadBean -> {
                return DisponibilidadCast.castDisponibilidadBeanToDisponibilidad(disponibilidadBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Disponibilidad find(BigDecimal id) {

        Call<ResponseData<DisponibilidadBean>> callSync = disponibilidadCall.find(id);

        try {
            Response<ResponseData<DisponibilidadBean>> response = callSync.execute();
            DisponibilidadBean disponibilidadBean = response.body().getResultado();

            return DisponibilidadCast.castDisponibilidadBeanToDisponibilidad(disponibilidadBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
