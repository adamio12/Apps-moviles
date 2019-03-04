package com.example.propietario.eva1_5_eventos;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class miListener implements View.OnClickListener {
    private Context cnt;

    public miListener(Context cnt){
        this.cnt=cnt;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(cnt,"evento por clase externa", Toast.LENGTH_SHORT).show();
    }
}
