package com.example.eva1_12_listas_perzolalizadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView lstVwCiudades;
    static Clima[] asClimaCd ={
            new Clima(R.drawable.light_rain,"Delicias","despejado","seco y polvoriento",17),
            new Clima(R.drawable.rainy,"cuatemoc","lluvioso","humedecido por el cielo",20),
            new Clima(R.drawable.cloudy,"huazoshi","nublado","cielo  grisaceo",12),
            new Clima(R.drawable.sunny,"creel","soleado","",17),
            new Clima(R.drawable.thunderstorm,"Hermosillo","tormentoso","llueven tiburones",0),
            new Clima(R.drawable.snow,"Cananea","nevado","granizo tamaño camioneta",-20)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwCiudades =findViewById(R.id.lstVwCiudades);
        lstVwCiudades.setAdapter(
                new ClimaAdapter(this,
                        R.layout.layout_clima
                        ,asClimaCd)
        );
        lstVwCiudades.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //hacer el toast
        Toast.makeText(this, asClimaCd[position].getDesc_clima(), Toast.LENGTH_SHORT);
                //Toast.makeText(this, acClimaCd[position].getDesc_clima(), Toast.LENGTH_SHORT);
    }
}
