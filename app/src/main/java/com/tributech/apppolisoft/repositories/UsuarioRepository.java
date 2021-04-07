package com.tributech.apppolisoft.repositories;

import android.app.Application;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;

import com.tributech.apppolisoft.domain.Usuarios;
import com.tributech.apppolisoft.rest.RestApiClient;
import com.tributech.apppolisoft.rest.RestApiInterface;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UsuarioRepository extends AppCompatActivity {
    private RestApiInterface apiService = RestApiClient.getClient().create(RestApiInterface.class);

    public void login(String dni, String pass){
        Call<ResponseBody> call = apiService.appiniciarsesion("2222", "2222");
        /*call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if(response.isSuccessful()){
                    if(response.body().equals("BIENVENIDO")){
                        Toast.makeText(getApplicationContext(),"ACCESO CORRECTO", Toast.LENGTH_LONG).show();
                        System.out.println("conectado");
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"ACCESO DENEGADO", Toast.LENGTH_LONG).show();
                    System.out.println("errrorr");
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                t.printStackTrace();
            }
        });*/
    }
}
