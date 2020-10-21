/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.correopersonasiscap.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.CorreoPersonaSiscapBean;
import pe.gob.mimp.bean.PersonaSiscapBean;
import pe.gob.mimp.converter.CorreoPersonaSiscapCast;
import pe.gob.mimp.converter.PersonaSiscapCast;
import pe.gob.mimp.siscap.modelo.CorreoPersonaSiscap;
import pe.gob.mimp.siscap.modelo.PersonaSiscap;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class CorreoPersonaSiscapCallServiceImpl implements CorreoPersonaSiscapCallService {

    private CorreoPersonaSiscapCall correoPersonaSiscapCall = CorreoPersonaSiscapServiceGenerator.createService(CorreoPersonaSiscapCall.class);

    @Override
    public void crearCorreoPersonaSiscap(CorreoPersonaSiscap correoPersonaSiscap) {

        CorreoPersonaSiscapBean correoPersonaSiscapBean = CorreoPersonaSiscapCast.castCorreoPersonaSiscapToCorreoPersonaSiscapBean(correoPersonaSiscap);

        Call<ResponseData<Object>> callSync = correoPersonaSiscapCall.crearCorreoPersonaSiscap(correoPersonaSiscapBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarCorreoPersonaSiscap(CorreoPersonaSiscap correoPersonaSiscap) {

        CorreoPersonaSiscapBean correoPersonaSiscapBean = CorreoPersonaSiscapCast.castCorreoPersonaSiscapToCorreoPersonaSiscapBean(correoPersonaSiscap);

        Call<ResponseData<Object>> callSync = correoPersonaSiscapCall.editarCorreoPersonaSiscap(correoPersonaSiscapBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public List<CorreoPersonaSiscap> obtenerCorreos(PersonaSiscap personaSiscap) {

        PersonaSiscapBean personaSiscapBean = PersonaSiscapCast.castPersonaSiscapToPersonaSiscapBean(personaSiscap);

        Call<ResponseData<List<CorreoPersonaSiscapBean>>> callSync = correoPersonaSiscapCall.obtenerCorreos(personaSiscapBean);

        try {
            Response<ResponseData<List<CorreoPersonaSiscapBean>>> response = callSync.execute();

            List<CorreoPersonaSiscapBean> loadCorreoPersonaSiscapBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadCorreoPersonaSiscapBeanList)) {
                return null;
            }

            return loadCorreoPersonaSiscapBeanList.stream().map(correoPersonaSiscapBean -> {
                return CorreoPersonaSiscapCast.castCorreoPersonaSiscapBeanToCorreoPersonaSiscap(correoPersonaSiscapBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public CorreoPersonaSiscap find(BigDecimal id) {

        Call<ResponseData<CorreoPersonaSiscapBean>> callSync = correoPersonaSiscapCall.find(id);

        try {
            Response<ResponseData<CorreoPersonaSiscapBean>> response = callSync.execute();
            CorreoPersonaSiscapBean correoPersonaSiscapBean = response.body().getResultado();

            return CorreoPersonaSiscapCast.castCorreoPersonaSiscapBeanToCorreoPersonaSiscap(correoPersonaSiscapBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
