/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.tipodocumento.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pe.gob.mimp.bean.FindByParamBean;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.TipoDocumentoBean;
import pe.gob.mimp.seguridad.converter.TipoDocumentoCast;
import pe.gob.mimp.seguridad.modelo.TipoDocumento;
import pe.gob.mimp.util.Util;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class TipoDocumentoCallServiceImpl implements TipoDocumentoCallService {

    private TipoDocumentoCall tipoDocumentoCall = TipoDocumentoServiceGenerator.createService(TipoDocumentoCall.class);

    @Override
    public void crearTipoDocumento(TipoDocumento tipoDocumento) {

        TipoDocumentoBean tipoDocumentoBean = TipoDocumentoCast.castTipoDocumentoToTipoDocumentoBean(tipoDocumento);

        Call<ResponseData<Object>> callSync = tipoDocumentoCall.crearTipoDocumento(tipoDocumentoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public void editarTipoDocumento(TipoDocumento tipoDocumento) {

        TipoDocumentoBean tipoDocumentoBean = TipoDocumentoCast.castTipoDocumentoToTipoDocumentoBean(tipoDocumento);

        Call<ResponseData<Object>> callSync = tipoDocumentoCall.editarTipoDocumento(tipoDocumentoBean);

        try {
            callSync.execute();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
    }

    @Override
    public String obtenerTipoDocumentoPorId(BigDecimal nidTipoDocumento) {

        Call<ResponseData<String>> callSync = tipoDocumentoCall.obtenerTipoDocumentoPorId(nidTipoDocumento);

        try {
            Response<ResponseData<String>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }
    
    @Override
    public List<TipoDocumento> findAll(){
    
        Call<ResponseData<List<TipoDocumentoBean>>> callSync = tipoDocumentoCall.findAll();

        try {
            Response<ResponseData<List<TipoDocumentoBean>>> response = callSync.execute();

            List<TipoDocumentoBean> loadTipoDocumentoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadTipoDocumentoBeanList)) {
                return null;
            }

            return loadTipoDocumentoBeanList.stream().map(tipoDocumentoBean -> {
                return TipoDocumentoCast.castTipoDocumentoBeanToTipoDocumento(tipoDocumentoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
        
    }

    @Override
    public List<TipoDocumento> loadTipoDocumentoList(FindByParamBean findByParamBean) {

        Call<ResponseData<List<TipoDocumentoBean>>> callSync = tipoDocumentoCall.loadTipoDocumentoList(findByParamBean);

        try {
            Response<ResponseData<List<TipoDocumentoBean>>> response = callSync.execute();

            List<TipoDocumentoBean> loadTipoDocumentoBeanList = response.body().getResultado();

            if (Util.esListaVacia(loadTipoDocumentoBeanList)) {
                return null;
            }

            return loadTipoDocumentoBeanList.stream().map(tipoDocumentoBean -> {
                return TipoDocumentoCast.castTipoDocumentoBeanToTipoDocumento(tipoDocumentoBean);
            }).collect(Collectors.toList());

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public Integer getRecordCount(FindByParamBean findByParamBean) {
        Call<ResponseData<Integer>> callSync = tipoDocumentoCall.getRecordCount(findByParamBean);

        try {
            Response<ResponseData<Integer>> response = callSync.execute();
            return response.body().getResultado();

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }
    }

    @Override
    public TipoDocumento obtener(String nombre) {

        Call<ResponseData<TipoDocumentoBean>> callSync = tipoDocumentoCall.obtener(nombre);

        try {
            Response<ResponseData<TipoDocumentoBean>> response = callSync.execute();
            TipoDocumentoBean tipoDocumentoBean = response.body().getResultado();

            return TipoDocumentoCast.castTipoDocumentoBeanToTipoDocumento(tipoDocumentoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
    
    @Override
    public TipoDocumento find(BigDecimal id) {

        Call<ResponseData<TipoDocumentoBean>> callSync = tipoDocumentoCall.find(id);

        try {
            Response<ResponseData<TipoDocumentoBean>> response = callSync.execute();
            TipoDocumentoBean tipoDocumentoBean = response.body().getResultado();

            return TipoDocumentoCast.castTipoDocumentoBeanToTipoDocumento(tipoDocumentoBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }
}
