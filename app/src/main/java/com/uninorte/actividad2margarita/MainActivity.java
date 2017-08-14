package com.uninorte.actividad2margarita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float operacion=0;
    float total=0;
    TextView respuesta1;
    float valor1 = 0;
    public int s=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        respuesta1= (TextView) findViewById(R.id.respuesta);
    }

    void clicBoton(View view){
        Button operador = (Button) view;

            valor1 = Integer.valueOf(operador.getText().toString());
            total = total * 10 + valor1;
        if(s==3) {
            respuesta1.setText(String.format("%.0f", total));
        } else {
            respuesta1.setText(String.format("%.0f", valor1));
        }
    }
    void clicSuma(View view){
        respuesta1.setText(0+"");
        s=0;


    }
    void clicResta(View view){
        respuesta1.setText(0+"");
        s=1;
    }
    void clicIgual(View view){
        if(s==0){
            total=total+valor1;
            respuesta1.setText(String.format("%0.f",total));
            s=3;
        }
        if (s==1) {
            total=total-valor1;
            respuesta1.setText(String.format("%0.f",total));
            s=3;
        }



    }
}
