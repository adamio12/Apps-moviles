package com.example.eva1_10_orientacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtVmMensa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtVmMensa =findViewId(R.id.txtVmMensa);
        int iVal = (int) (Math.random()*100);
        txtVmMensa.setText(iVal + "");
    }
}
