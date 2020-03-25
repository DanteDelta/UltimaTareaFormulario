package com.example.ejercicotarea;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnVolver=(Button)findViewById(R.id.btnVolver);
        TextView txtResultado=(TextView)findViewById(R.id.txtDatos);
        cPersona otro = (cPersona) getIntent().getExtras().getParcelable("usuario");

        String nombre = otro.getNombre();
        String mail = otro.getMail();
        String ciudad = otro.getCiudad();
        String estado = otro.getEstado();
        int edad = otro.getEdad();
        txtResultado.setText(otro.getDatos().toUpperCase());


        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
