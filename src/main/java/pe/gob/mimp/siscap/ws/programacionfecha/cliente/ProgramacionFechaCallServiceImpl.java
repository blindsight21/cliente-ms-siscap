/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.programacionfecha.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.bean.ProgramacionFechaBean;
import pe.gob.mimp.converter.ProgramacionFechaCast;
import pe.gob.mimp.siscap.modelo.ProgramacionFecha;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ProgramacionFechaCallServiceImpl implements ProgramacionFechaCallService {

    private ProgramacionFechaCall programacionFechaCall = ProgramacionFechaServiceGenerator.createService(ProgramacionFechaCall.class);

    @Override
    public void crearProgramacionFecha(ProgramacionFecha programacionFecha) {

        ProgramacionFechaBean programacionFechaBean = ProgramacionFechaCast.castProgramacionFechaToProgramacionFechaBean(programacionFecha);

        Call<ResponseData<Object>> callSync = programacionFechaCall.crearProgramacionFecha(programacionFechaBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarProgramacionFecha(ProgramacionFecha programacionFecha) {

        ProgramacionFechaBean programacionFechaBean = ProgramacionFechaCast.castProgramacionFechaToProgramacionFechaBean(programacionFecha);

        Call<ResponseData<Object>> callSync = programacionFechaCall.editarProgramacionFecha(programacionFechaBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

//    @Override
//    public String obtenerProgramacionFechaPorId(BigDecimal nidProgramacionFecha) {
//
//        Call<ResponseData<String>> callSync = programacionFechaCall.obtenerProgramacionFechaPorId(nidProgramacionFecha);
//
//        try {
//            Response<ResponseData<String>> response = callSync.execute();
//            return response.body().getResultado();
//
//        } catch (IOException ex) {
//            System.out.println(Arrays.toString(ex.getStackTrace()));
//            return null;
//        }
//    }

    @Override
    public List<ProgramacionFecha> loadProgramacionFechaList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<ProgramacionFechaBean>>> callSync = programacionFechaCall.loadProgramacionFechaList(findByParamBean);

        try {
            Response<ResponseData<List<ProgramacionFechaBean>>> response = callSync.execute();

            List<ProgramacionFechaBean> loadProgramacionFechaBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadProgramacionFechaBeanList)) {
                return null;
            }

            return loadProgramacionFechaBeanList.stream().map(programacionFechaBean -> {
                return ProgramacionFechaCast.castProgramacionFechaBeanToProgramacionFecha(programacionFechaBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = programacionFechaCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public ProgramacionFecha find(BigDecimal id) {

        Call<ResponseData<ProgramacionFechaBean>> callSync = programacionFechaCall.find(id);

        try {
            Response<ResponseData<ProgramacionFechaBean>> response = callSync.execute();
            ProgramacionFechaBean programacionFechaBean = response.body().getResultado();

            return ProgramacionFechaCast.castProgramacionFechaBeanToProgramacionFecha(programacionFechaBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
