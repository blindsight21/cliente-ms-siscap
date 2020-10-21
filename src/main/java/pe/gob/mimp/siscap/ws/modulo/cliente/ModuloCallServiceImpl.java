/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.modulo.cliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import pe.gob.mimp.bean.ResponseData;
import pe.gob.mimp.seguridad.bean.entidades.ModuloBean;
import pe.gob.mimp.seguridad.converter.ModuloCast;
import pe.gob.mimp.seguridad.modelo.Modulo;
import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * @author Omar
 */
public class ModuloCallServiceImpl implements ModuloCallService {

    private ModuloCall moduloCall = ModuloServiceGenerator.createService(ModuloCall.class);

    @Override
    public Modulo find(BigDecimal id) {

        Call<ResponseData<ModuloBean>> callSync = moduloCall.find(id);

        try {
            Response<ResponseData<ModuloBean>> response = callSync.execute();

            ModuloBean moduloBean = response.body().getResultado();

            return ModuloCast.castModuloBeanToModulo(moduloBean);

        } catch (IOException ex) {
            System.out.println(Arrays.toString(ex.getStackTrace()));
            return null;
        }

    }

}
