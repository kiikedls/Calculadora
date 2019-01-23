package com.example.rey_m.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button c, parentesis, porcent, div, siete, ocho, nueve, mult, cuatro, cinco, sies, menos, uno, dos, tres, mas, masmenos, cero, punto, igual;
    TextView pantalla, pantallar;
    double n1, n2, r;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pantalla = findViewById(R.id.pantalla);
    }

    public void igual(View view) {
        pantallar = findViewById(R.id.pantalla);
        n2 = Double.parseDouble(pantallar.getText().toString());

        if (operador.equals("+")){
            pantalla.setText("");
            r=n1+n2;
        }
        if (operador.equals("-")){
            pantalla.setText("");
            r=n1-n2;
        }
        if (operador.equals("*")){
            pantalla.setText("");
            r=n1*n2;
        }
        if (operador.equals("/")){
            pantalla.setText("");
            if (n2!=0){
                r=n1/n2;
            }
            else {
                pantalla.setText("ERROR DE SINTAXIS");
            }
        }

        /*switch (view.getId()) {
            case R.id.mas:
                pantalla.setText("");
                r = n1 + n2;
                break;
            case R.id.menos:
                pantalla.setText("");
                r = n1 - n2;
                break;
            case R.id.mult:
                pantalla.setText("");
                r = n1 * n2;
                break;
            case R.id.div:
                pantalla.setText("");
                r = n1 / n2;
                break;
        }*/


        pantalla.setText(String.valueOf(r));

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cero:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "0");
                break;
            case R.id.uno:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "1");
                break;
            case R.id.dos:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "2");
                break;
            case R.id.tres:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "3");
                break;
            case R.id.cuatro:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "4");
                break;
            case R.id.cinco:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "5");
                break;
            case R.id.seis:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "6");
                break;
            case R.id.siete:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "7");
                break;
            case R.id.ocho:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "8");
                break;
            case R.id.nueve:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + "9");
                break;
            case R.id.punto:
                pantallar = findViewById(R.id.pantalla);
                pantalla.setText(pantallar.getText().toString() + ".");
                break;
            case R.id.mas:
                operador = "+";
                pantallar = findViewById(R.id.pantalla);
                n1 = Double.parseDouble(pantallar.getText().toString());
                pantalla.setText("");
                break;
            case R.id.menos:
                operador = "-";
                pantallar = findViewById(R.id.pantalla);
                n1 = Double.parseDouble(pantallar.getText().toString());
                pantalla.setText("");
                break;
            case R.id.mult:
                operador = "*";
                pantallar = findViewById(R.id.pantalla);
                n1 = Double.parseDouble(pantallar.getText().toString());
                pantalla.setText("");
                break;
            case R.id.div:
                operador = "/";
                pantallar = findViewById(R.id.pantalla);
                n1 = Double.parseDouble(pantallar.getText().toString());
                pantalla.setText("");
                break;
            case R.id.C:
                n1=0;
                n2=0;
                pantalla.setText("0");
                break;

        }
    }


}
