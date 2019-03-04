package com.example.propietario.eva1_2_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtVmMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVmMensaje = findViewById(R.id.txtVmMensaje);
        txtVmMensaje.setText(R.string.mi_texto);
    }
}
