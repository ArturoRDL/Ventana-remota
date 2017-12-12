package com.example.dgtic.httppost;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int Grado = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.BotonDer).setOnClickListener(this);
        findViewById(R.id.BotonIzq).setOnClickListener(this);

    }

    public void onClick(View v) {
        TextView TextoGrado = (TextView) findViewById(R.id.TextGra);
        View contenedor = v.getRootView();
        if ((Grado >= 0) && (Grado <= 10)) {
            switch (v.getId()) {
                case R.id.BotonDer:
                    Grado = Grado + 1;
                    TextoGrado.setText(Grado + "°");
                    break;
                case R.id.BotonIzq:
                    Grado = Grado - 1;
                    TextoGrado.setText(Grado + "°");

            }
        }

    }


}
