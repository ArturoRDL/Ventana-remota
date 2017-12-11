package com.example.dgtic.httppost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int grados;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView TextoGrado = (TextView) findViewById(R.id.TextGra);
        final Button BotonIzq = (Button) findViewById(R.id.BotonIzq);
        final Button BotonDer = (Button) findViewById(R.id.BotonDer);


        BotonIzq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                BotonIzq.isClickable();
                TextoGrado.setText((grados--) + "°");
            }

        });


        BotonDer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                BotonDer.isClickable();
                TextoGrado.setText((grados++) + "°");
            }
        });


    }


}
