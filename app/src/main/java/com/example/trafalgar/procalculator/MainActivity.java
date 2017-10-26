package com.example.trafalgar.procalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText numeroActual;
    private EditText numeroAnterior;
    private EditText resultado;
    private Button suma;
    private Button resta;
    private Button producto;
    private Button division;
    private Button n0;
    private Button n1;
    private Button n2;
    private Button n3;
    private Button n4;
    private Button n5;
    private Button n6;
    private Button n7;
    private Button n8;
    private Button n9;
    private Button borrar;
    private Button cambiarSigno;
    private  double calculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroActual=(EditText)findViewById(R.id.operando);
        numeroAnterior=(EditText)findViewById(R.id.operando);
        resultado=(EditText)findViewById(R.id.operando);
        suma=(Button)findViewById(R.id.sumaBtn);
        resta=(Button)findViewById(R.id.restaBtn);
        producto=(Button)findViewById(R.id.productoBtn);
        division=(Button)findViewById(R.id.divisionBtn);
        n0 = (Button)findViewById(R.id.n0);
        n1 = (Button)findViewById(R.id.n1);
        n2 = (Button)findViewById(R.id.n2);
        n3 = (Button)findViewById(R.id.n3);
        n4 = (Button)findViewById(R.id.n4);
        n5 = (Button)findViewById(R.id.n5);
        n6 = (Button)findViewById(R.id.n6);
        n7 = (Button)findViewById(R.id.n7);
        n8 = (Button)findViewById(R.id.n8);
        n9 = (Button)findViewById(R.id.n9);
        borrar = (Button)findViewById(R.id.acBtn);



        n1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                resultado.setText(resultado.getText() + "1");

            }
        });

        n2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                resultado.setText(resultado.getText() + "2");

            }
        });

        borrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                resultado.setText("");

            }
        });


/*
        cambiarSigno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                calculo = (Double.parseDouble(resultado.getText().toString())) * -1;

                resultado.setText(Double.toString(calculo));

            }
        });
*/

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double num1 = Double.parseDouble(numeroActual.getText().toString());

                resultado.setText("");

                double num2 = Double.parseDouble(numeroActual.getText().toString());

                double operacion = num1 + num2;

                resultado.setText(Double.toString(operacion));


            }
        });



    }
}






