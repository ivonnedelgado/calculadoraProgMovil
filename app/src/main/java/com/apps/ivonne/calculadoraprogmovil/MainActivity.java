package com.apps.ivonne.calculadoraprogmovil;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface.OnClickListener;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    boolean pun = false;
    boolean suma = false;
    boolean res = false;
    boolean mul = false;
    boolean div = false;
    Double [] numero = new Double[15];
    Double resul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 =  (Button) findViewById(R.id.button);
        b1.setOnClickListener(this);
        Button b2 =  (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);
        Button b3 =  (Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);
        Button b4 =  (Button) findViewById(R.id.button4);
        b4.setOnClickListener(this);
        Button b5 =  (Button) findViewById(R.id.button5);
        b5.setOnClickListener(this);
        Button b6 =  (Button) findViewById(R.id.button6);
        b6.setOnClickListener(this);
        Button b7 =  (Button) findViewById(R.id.button7);
        b7.setOnClickListener(this);
        Button b8 =  (Button) findViewById(R.id.button8);
        b8.setOnClickListener(this);
        Button b9 =  (Button) findViewById(R.id.button9);
        b9.setOnClickListener(this);
        Button b10 = (Button) findViewById(R.id.button10);
        b10.setOnClickListener(this);
        Button b11 = (Button) findViewById(R.id.button11);
        b11.setOnClickListener(this);
        Button b12 = (Button) findViewById(R.id.button12);
        b12.setOnClickListener(this);
        Button b13 = (Button) findViewById(R.id.button13);
        b13.setOnClickListener(this);
        Button b14 = (Button) findViewById(R.id.button14);
        b14.setOnClickListener(this);
        Button b15 = (Button) findViewById(R.id.button15);
        b15.setOnClickListener(this);
        Button b16 = (Button) findViewById(R.id.button16);
        b16.setOnClickListener(this);
        Button b17 = (Button) findViewById(R.id.button17);
        b17.setOnClickListener(this);
        Button b18 = (Button) findViewById(R.id.button18);
        b18.setOnClickListener(this);
        Button b19 = (Button) findViewById(R.id.button19);
        b19.setOnClickListener(this);
        Button b20 = (Button) findViewById(R.id.button20);
        b20.setOnClickListener(this);
        Button b21 = (Button) findViewById(R.id.button21);
        b21.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        TextView cajon = (TextView)findViewById(R.id.textView2);
        int seleccion = view.getId();
        String a = cajon.getText().toString();


        try {
            switch (seleccion) {
                case R.id.button21:
                    Intent sig = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(sig);
                    break;
                case R.id.button13:
                    cajon.setText(a+"0");
                    break;
                case R.id.button10:
                    cajon.setText(a+"1");
                    break;
                case R.id.button11:
                    cajon.setText(a+"2");
                    break;
                case R.id.button12:
                    cajon.setText(a+"3");
                    break;
                case R.id.button7:
                    cajon.setText(a+"4");
                    break;
                case R.id.button8:
                    cajon.setText(a+"5");
                    break;
                case R.id.button9:
                    cajon.setText(a+"6");
                    break;
                case R.id.button4:
                    cajon.setText(a+"7");
                    break;
                case R.id.button5:
                    cajon.setText(a+"8");
                    break;
                case R.id.button6:
                    cajon.setText(a+"9");
                    break;

                case R.id.button14:
                    if (pun == false) {
                        cajon.setText(".");
                        pun = true;
                    }
                    else {
                        return;
                    }
                    break;

                case R.id.button16: //Borrar
                    cajon.setText("");
                    pun = false;
                    break;

                case R.id.button18:
                    suma = true;
                    numero[0] = Double.parseDouble(a);
                    cajon.setText("");
                    pun=false;
                    break;
                case R.id.button17:
                    res = true;
                    numero[0] = Double.parseDouble(a);
                    cajon.setText("");
                    pun=false;
                    break;
                case R.id.button19:
                    mul = true;
                    numero[0] = Double.parseDouble(a);
                    cajon.setText("");
                    pun=false;
                    break;
                case R.id.button3:
                    div = true;
                    numero[0] = Double.parseDouble(a);
                    cajon.setText("");
                    pun=false;
                    break;

                case R.id.button20:
                    numero[1] = Double.parseDouble(a);

                    if(suma == true){
                        resul = numero[0] + numero [1];
                        cajon.setText(String.valueOf(resul));
                    }
                    else if (res == true){
                        resul = numero[0] - numero [1];
                        cajon.setText(String.valueOf(resul));
                    }
                    else if (mul == true){
                        resul = numero[0] * numero [1];
                        cajon.setText(String.valueOf(resul));
                    }
                    else if (div == true){
                        resul = numero[0] / numero [1];
                        cajon.setText(String.valueOf(resul));
                    }
                    pun = false;
                    suma = false;
                    res = false;
                    mul = false;
                    div = false;
                    break;
            }
        }
        catch(Exception e){
            cajon.setText("Error");
        }
    }
}