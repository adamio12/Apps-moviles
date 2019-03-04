package com.example.eva1_12_listas_perzolalizadas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClimaAdapter extends ArrayAdapter<Clima> {
    private Context cApp;
    private int  iMiLayout;
    private Clima[] acDatos;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ImageView imgVmClima;
        TextView txtCd, txxtVwTemp, txtVwclima,txtVwDesc;
        View vwLayout = convertView;
        if(vwLayout == null){//no existe hay que crearla
            LayoutInflater liCrearLayout = ((Activity) cApp).getLayoutInflater();//creala
            vwLayout = liCrearLayout.inflate(iMiLayout,parent, false);
        }
        imgVmClima = vwLayout.findViewById(R.id.imgVwClima);
        txtCd = vwLayout.findViewById(R.id.txtVwCd);
        txtVwclima = vwLayout.findViewById(R.id.txtVwClima);
        txtVwDesc = vwLayout.findViewById(R.id.txtVwDesc);
        txxtVwTemp = vwLayout.findViewById(R.id.txtVwTemp);

        Clima cClimaCd = acDatos[position];

        imgVmClima.setImageResource(cClimaCd.getImagen_clima());
        txtCd.setText(cClimaCd.getCiudad());
        txtVwclima.setText(cClimaCd.getClima());
        txtVwDesc.setText(cClimaCd.getDesc_clima());
        txxtVwTemp.setText(cClimaCd.getTemp()+"");

        return super.getView(position, convertView, parent);
    }

    public ClimaAdapter(Context context, int resource, Clima[] objects) {
        super(context, resource, objects);
        cApp =context;
        iMiLayout = resource;
        acDatos = objects;
    }
}
