package com.example.caculadoratarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;
    Button  mult, div, suma,resta;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.nu1);
        n2 = (EditText) findViewById(R.id.nu2);
        suma = (Button) findViewById(R.id.sumar);
        resta = (Button) findViewById(R.id.restar);
        mult = (Button) findViewById(R.id.multiplicar);
        div = (Button) findViewById(R.id.dividir);
         resultado= findViewById(R.id.resul);
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
         mult.setOnClickListener(this);
        div.setOnClickListener(this);
    }

   @Override
    public void onClick(View v) {
        String num1 = n1.getText().toString();
       String num2 = n2.getText().toString();

       int entero1 =  Integer.parseInt(num1);
       int entero2 =  Integer.parseInt(num2);

       int rta=0;
 switch (v.getId()){
     case R.id.sumar:
         rta= entero1+entero2;
         break;
     case R.id.restar:
         rta= entero1-entero2;
         break;
     case R.id.multiplicar:
         rta= entero1*entero2;
         break;
     case R.id.dividir:
         rta= entero1/entero2;
         break;
 }
resultado.setText(""+rta);
   }


}