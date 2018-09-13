package com.example.exercicio_03;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;
import android.view.View;
import android.widget.TextView;

// Exercicio 3
//
// Criar um App com uma questão e um conjunto de respostas (Spinner). Informar o usuário se acertou ou errou.

public class exercicio_03 extends Activity {

    private Spinner spinnerPerguntas;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_03);

        spinnerPerguntas = findViewById(R.id.spinnerPerguntas);
        textView2 = findViewById(R.id.textView2);
    }

    public void responder(View view){
        String resposta = spinnerPerguntas.getSelectedItem().toString();

        switch (resposta){
            case "Sim":
                textView2.setText(String.valueOf("Você está Correto"));
                break;
            case "Não":
                textView2.setText(String.valueOf("Você está Errado!"));
            break;

        }
    }
}
