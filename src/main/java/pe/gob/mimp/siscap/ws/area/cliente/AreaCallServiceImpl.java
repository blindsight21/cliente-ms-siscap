/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.area.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindAllByFieldBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.AreaBean;
import pe.gob.mimp.seguridad.converter.AreaCast;
import pe.gob.mimp.seguridad.modelo.Area;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class AreaCallServiceImpl implements AreaCallService {

    private AreaCall areaCall = AreaServiceGenerator.createService(AreaCall.class);

    @Override
    public List<Area> findAll() {

        Call<ResponseData<List<AreaBean>>> callSync = areaCall.findAll();

        try {
            Response<ResponseData<List<AreaBean>>> response = callSync.execute();

            List<AreaBean> areaBeanList = response.body().getResultado();

            if (Util.esListaVacia(areaBeanList)) {
                return null;
            }

            return areaBeanList.stream().map(areaBean -> {
                return AreaCast.castAreaBeanToArea(areaBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Area find(BigDecimal id) {

        Call<ResponseData<AreaBean>> callSync = areaCall.find(id);

        try {
            Response<ResponseData<AreaBean>> response = callSync.execute();

            AreaBean areaBean = response.body().getResultado();

            return AreaCast.castAreaBeanToArea(areaBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }

    @Override
    public List<Area> findAllByField(FindAllByFieldBean findAllByFieldBean) {

        Call<ResponseData<List<AreaBean>>> callSync = areaCall.findAllByField(findAllByFieldBean);

        try {
            Response<ResponseData<List<AreaBean>>> response = callSync.execute();

            List<AreaBean> areaBeanList = response.body().getResultado();

            if (Util.esListaVacia(areaBeanList)) {
                return null;
            }

            return areaBeanList.stream().map(areaBean -> {
                return AreaCast.castAreaBeanToArea(areaBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
    
}
