/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.personasiscap.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.PersonaSiscapBean;
import pe.gob.mimp.converter.PersonaSiscapCast;
import pe.gob.mimp.siscap.modelo.PersonaSiscap;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class PersonaSiscapCallServiceImpl implements PersonaSiscapCallService {

    private PersonaSiscapCall personaSiscapCall = PersonaSiscapServiceGenerator.createService(PersonaSiscapCall.class);

    @Override
    public void crearPersonaSiscap(PersonaSiscap personaSiscap) {

        PersonaSiscapBean personaSiscapBean = PersonaSiscapCast.castPersonaSiscapToPersonaSiscapBean(personaSiscap);

        Call<ResponseData<PersonaSiscapBean>> callSync = personaSiscapCall.crearPersonaSiscap(personaSiscapBean);

        try {
            Response<ResponseData<PersonaSiscapBean>> response = callSync.execute();
            PersonaSiscap actividadGobEActGobNuevo = PersonaSiscapCast.castPersonaSiscapBeanToPersonaSiscap(response.body().getResultado());
            personaSiscap.setNidPersonaSiscap(actividadGobEActGobNuevo.getNidPersonaSiscap());
            
        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarPersonaSiscap(PersonaSiscap personaSiscap) {

        PersonaSiscapBean personaSiscapBean = PersonaSiscapCast.castPersonaSiscapToPersonaSiscapBean(personaSiscap);

        Call<ResponseData<PersonaSiscapBean>> callSync = personaSiscapCall.editarPersonaSiscap(personaSiscapBean);

        try {
            Response<ResponseData<PersonaSiscapBean>> response = callSync.execute();
            PersonaSiscap actividadGobEActGobNuevo = PersonaSiscapCast.castPersonaSiscapBeanToPersonaSiscap(response.body().getResultado());
            personaSiscap.setNidPersonaSiscap(actividadGobEActGobNuevo.getNidPersonaSiscap());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public List<PersonaSiscap> loadPersonaSiscapList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<PersonaSiscapBean>>> callSync = personaSiscapCall.loadPersonaSiscapList(findByParamBean);

        try {
            Response<ResponseData<List<PersonaSiscapBean>>> response = callSync.execute();

            List<PersonaSiscapBean> loadPersonaSiscapBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadPersonaSiscapBeanList)) {
                return null;
            }

            return loadPersonaSiscapBeanList.stream().map(personaSiscapBean -> {
                return PersonaSiscapCast.castPersonaSiscapBeanToPersonaSiscap(personaSiscapBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public PersonaSiscap find(BigDecimal id) {

        Call<ResponseData<PersonaSiscapBean>> callSync = personaSiscapCall.find(id);

        try {
            Response<ResponseData<PersonaSiscapBean>> response = callSync.execute();
            PersonaSiscapBean personaSiscapBean = response.body().getResultado();

            return PersonaSiscapCast.castPersonaSiscapBeanToPersonaSiscap(personaSiscapBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }

    @Override
    public List<PersonaSiscap> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<PersonaSiscapBean>>> callSync = personaSiscapCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<PersonaSiscapBean>>> response = callSync.execute();

            List<PersonaSiscapBean> loadPersonaSiscapBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadPersonaSiscapBeanList)) {
                return new ArrayList<>();
            }

            return loadPersonaSiscapBeanList.stream().map(personaSiscapBean -> {
                return PersonaSiscapCast.castPersonaSiscapBeanToPersonaSiscap(personaSiscapBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
}
