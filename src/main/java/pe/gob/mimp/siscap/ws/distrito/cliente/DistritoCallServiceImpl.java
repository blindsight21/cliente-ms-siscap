/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.distrito.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.general.bean.entidades.DistritoBean;
import pe.gob.mimp.general.bean.entidades.ProvinciaBean;
import pe.gob.mimp.general.converter.DistritoCast;
import pe.gob.mimp.general.converter.ProvinciaCast;
import pe.gob.mimp.general.modelo.Distrito;
import pe.gob.mimp.general.modelo.Provincia;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class DistritoCallServiceImpl implements DistritoCallService {

    private DistritoCall distritoCall = DistritoServiceGenerator.createService(DistritoCall.class);

    @Override
    public List<Distrito> obtenerDistritos(Provincia provincia) {

        ProvinciaBean provinciaBean = ProvinciaCast.castProvinciaToProvinciaBean(provincia);
        
        Call<ResponseData<List<DistritoBean>>> callSync = distritoCall.obtenerDistritos(provinciaBean);

        try {
            Response<ResponseData<List<DistritoBean>>> response = callSync.execute();

            List<DistritoBean> loadDistritoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadDistritoBeanList)) {
                return null;
            }

            return loadDistritoBeanList.stream().map(distritoBean -> {
                return DistritoCast.castDistritoBeanToDistrito(distritoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public List<Distrito> obtenerActivos() {

        Call<ResponseData<List<DistritoBean>>> callSync = distritoCall.obtenerActivos();

        try {
            Response<ResponseData<List<DistritoBean>>> response = callSync.execute();

            List<DistritoBean> loadDistritoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadDistritoBeanList)) {
                return null;
            }

            return loadDistritoBeanList.stream().map(distritoBean -> {
                return DistritoCast.castDistritoBeanToDistrito(distritoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Distrito find(BigDecimal id) {

        Call<ResponseData<DistritoBean>> callSync = distritoCall.find(id);

        try {
            Response<ResponseData<DistritoBean>> response = callSync.execute();
            DistritoBean distritoBean = response.body().getResultado();

            return DistritoCast.castDistritoBeanToDistrito(distritoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
    
    @Override
    public List<Distrito> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<DistritoBean>>> callSync = distritoCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<DistritoBean>>> response = callSync.execute();

            List<DistritoBean> loadDistritoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadDistritoBeanList)) {
                return null;
            }

            return loadDistritoBeanList.stream().map(distritoBean -> {
                return DistritoCast.castDistritoBeanToDistrito(distritoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
}
