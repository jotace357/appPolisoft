package com.tributech.apppolisoft.rest;

import com.tributech.apppolisoft.domain.Usuarios;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RestApiInterface {
    @POST("/addregistro")
    Call<ResponseBody> addregistro(@Query("pass") String pass, @Query("confpass") String confpass,
                                   @Query("cedula") String cedula, @Query("name") String name, @Query("lastname") String lastname, @Query("direc") String direc,
                                   @Query("telm") String telm, @Query("tel") String tel, @Query("correo") String correo);

    @POST("/appiniciarsesion")
    Call<ResponseBody> appiniciarsesion(@Path("dni_init") String dni_init, @Query("pass_init") String pass_init);

    @POST("/appcerrarsesion")
    Call<ResponseBody> appcerrarsesion();

    @POST("/appeliminarusuario")
    Call<ResponseBody> appeliminarusuario(@Query("pass") String pass);

    @GET("appservicios")
    Call<List<Usuarios>> appservicios();

}
