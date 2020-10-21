/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.siscap.ws.usuario.cliente;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import pe.gob.mimp.util.FormatoFechaConstante;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author Omar
 */
public class UsuarioServiceGenerator {

    private static final String BASE_USUARIO_URL = "http://192.168.0.7:7174/";

    private static final Gson GSON_FORMATO_FECHA_yyyyMMddTHHmmssSSSXXX = new GsonBuilder().setDateFormat(FormatoFechaConstante.yyyyMMddTHHmmssSSSXXX).create();

//    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private static final Retrofit.Builder builder
            = new Retrofit.Builder()
                    .baseUrl(BASE_USUARIO_URL)
                    .addConverterFactory(GsonConverterFactory.create(GSON_FORMATO_FECHA_yyyyMMddTHHmmssSSSXXX));
//                    .addConverterFactory(JacksonConverterFactory.create(OBJECT_MAPPER));

    private static final Retrofit retrofit = builder.build();

    private static final OkHttpClient.Builder httpClient
            = new OkHttpClient.Builder();

    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }

}
