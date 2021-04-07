package com.tributech.apppolisoft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.tributech.apppolisoft.repositories.UsuarioRepository;
import com.tributech.apppolisoft.rest.RestApiClient;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText dnitext, passtext;
    private String dni, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        dnitext = findViewById(R.id.text1);
        passtext = findViewById(R.id.text2);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                dni = dnitext.getText().toString();
                pass = passtext.getText().toString();

                UsuarioRepository userLogin = new UsuarioRepository();
                userLogin.login(dni, pass);
            }
        });
    }

    //private String createAuthToken(String dni, String pass) {
    //}
}