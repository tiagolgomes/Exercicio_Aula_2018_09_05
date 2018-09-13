package com.example.exercicio_01;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

// Exercicio 1.
//
// Desenvolver um App que permita ao usuário controlar o total gasto em um bar.
// O usuário poderá definir um valor limite de gasto.
// A cada novo pedido, o usuário poderá atualizar o valor gasto no bar e verificar o quanto
// ainda pode gastar de acordo com o limite definido.
// Caso o limite seja extrapolado, notificar o usuário.

public class exercicio_01 extends Activity {

    private EditText editText1;
    private EditText editText2;
    private TextView textView2;
    private TextView textView4;

    public int valorLimite = 0;
    public int saldoComanda = 0;
    public int gasto = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_01);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
    }

    public void definirComanda(View view){
        String texto1 = editText1.getText().toString();
        valorLimite = Integer.parseInt(texto1);
        editText1.setText(String.valueOf(valorLimite));
        textView4.setText(String.valueOf(valorLimite));

        gasto = 0;
    }

    public void adcionarGasto(View view){
        String texto2 = editText2.getText().toString();
        int numero = Integer.parseInt(texto2);
        gasto = gasto + numero;
        saldoComanda = gasto;

        if (valorLimite > gasto){
            textView4.setText(String.valueOf(valorLimite));
            textView2.setText(String.valueOf(saldoComanda));
        }
        else {
            textView4.setText(String.valueOf("Seu limite acabou!!!"));
            textView2.setText(String.valueOf(saldoComanda));
        }
    }
}
