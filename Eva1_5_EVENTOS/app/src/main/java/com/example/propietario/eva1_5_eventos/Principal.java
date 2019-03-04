package com.example.propietario.eva1_5_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity  implements View.OnClickListener{
    private Button btnLis, btnAn, btnEx;

    @Override
    public void onClick(View view) {
        Toast.makeText(getApplicationContext(),"evento generado por listener",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnLis = findViewById(R.id.btnListener);
        btnLis.setOnClickListener(this);

        btnAn = findViewById(R.id.btnClaseAn);
        btnAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"evento por anonima", Toast.LENGTH_SHORT).show();
            }
        });

        btnEx = findViewById(R.id.btnClaseExt);
        btnEx.setOnClickListener(this);

        miListener mlClick = new miListener(getApplicationContext());
        btnEx.setOnClickListener(mlClick);
    }

    public void onClickXML(View view){
        Toast.makeText(getApplicationContext(),"evento desde XML",Toast.LENGTH_SHORT).show();
    }

}
