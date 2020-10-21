/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.telefonopersonasiscap.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.PersonaSiscapBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.TelefonoPersonaSiscapBean;
import pe.gob.mimp.converter.TelefonoPersonaSiscapCast;
import pe.gob.mimp.siscap.modelo.TelefonoPersonaSiscap;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class TelefonoPersonaSiscapCallServiceImpl implements TelefonoPersonaSiscapCallService {

    private TelefonoPersonaSiscapCall telefonoPersonaSiscapCall = TelefonoPersonaSiscapServiceGenerator.createService(TelefonoPersonaSiscapCall.class);

    @Override
    public void crearTelefonoPersonaSiscap(TelefonoPersonaSiscap telefonoPersonaSiscap) {

        TelefonoPersonaSiscapBean telefonoPersonaSiscapBean = TelefonoPersonaSiscapCast.castTelefonoPersonaSiscapToTelefonoPersonaSiscapBean(telefonoPersonaSiscap);

        Call<ResponseData<Object>> callSync = telefonoPersonaSiscapCall.crearTelefonoPersonaSiscap(telefonoPersonaSiscapBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarTelefonoPersonaSiscap(TelefonoPersonaSiscap telefonoPersonaSiscap) {

        TelefonoPersonaSiscapBean telefonoPersonaSiscapBean = TelefonoPersonaSiscapCast.castTelefonoPersonaSiscapToTelefonoPersonaSiscapBean(telefonoPersonaSiscap);

        Call<ResponseData<Object>> callSync = telefonoPersonaSiscapCall.editarTelefonoPersonaSiscap(telefonoPersonaSiscapBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public List<TelefonoPersonaSiscap> obtenerTelefonos(PersonaSiscapBean personaSiscapBean) {

        Call<ResponseData<List<TelefonoPersonaSiscapBean>>> callSync = telefonoPersonaSiscapCall.obtenerTelefonos(personaSiscapBean);

        try {
            Response<ResponseData<List<TelefonoPersonaSiscapBean>>> response = callSync.execute();

            List<TelefonoPersonaSiscapBean> telefonoPersonaSiscapBeanList = response.body().getResultado();

            if (Util.esListaVacia(telefonoPersonaSiscapBeanList)) {
                return null;
            }

            return telefonoPersonaSiscapBeanList.stream().map(telefonoPersonaSiscapBean -> {
                return TelefonoPersonaSiscapCast.castTelefonoPersonaSiscapBeanToTelefonoPersonaSiscap(telefonoPersonaSiscapBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public TelefonoPersonaSiscap find(BigDecimal id) {

        Call<ResponseData<TelefonoPersonaSiscapBean>> callSync = telefonoPersonaSiscapCall.find(id);

        try {
            Response<ResponseData<TelefonoPersonaSiscapBean>> response = callSync.execute();
            TelefonoPersonaSiscapBean telefonoPersonaSiscapBean = response.body().getResultado();

            return TelefonoPersonaSiscapCast.castTelefonoPersonaSiscapBeanToTelefonoPersonaSiscap(telefonoPersonaSiscapBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }

}
