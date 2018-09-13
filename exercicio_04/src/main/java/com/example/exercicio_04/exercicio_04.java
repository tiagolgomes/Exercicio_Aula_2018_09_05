package com.example.exercicio_04;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

//Exercicio 4.
//
// Modificar o App do exercicio 3 adicionando 5 perguntas.
// Após responder cada pergunta, atualizar os acertos em uma TextView usando o padrão acertos/total.
// Exemplo: 3/5 acertos.

public class exercicio_04 extends Activity {

    private Spinner spinnerPerguntas1;
    private Spinner spinnerPerguntas2;
    private Spinner spinnerPerguntas3;
    private Spinner spinnerPerguntas4;
    private Spinner spinnerPerguntas5;

    private TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_04);

        spinnerPerguntas1 = findViewById(R.id.spinnerPerguntas1);
        spinnerPerguntas2 = findViewById(R.id.spinnerPerguntas2);
        spinnerPerguntas3 = findViewById(R.id.spinnerPerguntas3);
        spinnerPerguntas4 = findViewById(R.id.spinnerPerguntas4);
        spinnerPerguntas5 = findViewById(R.id.spinnerPerguntas5);

        textView6 = findViewById(R.id.textView6);
    }

    public void responder(View view){
        String resposta1 = spinnerPerguntas1.getSelectedItem().toString();
        String resposta2 = spinnerPerguntas2.getSelectedItem().toString();
        String resposta3 = spinnerPerguntas3.getSelectedItem().toString();
        String resposta4 = spinnerPerguntas4.getSelectedItem().toString();
        String resposta5 = spinnerPerguntas5.getSelectedItem().toString();

        int acertos = 0;

        switch (resposta1) {
            case "Curitiba":
                acertos++;
                break;
        }
        switch (resposta2){
            case "Branco":
                acertos++;
                break;
        }
        switch (resposta3){
            case "10":
                acertos++;
                break;
        }
        switch (resposta4){
            case "Goggle":
                acertos++;
                break;
        }
        switch (resposta5){
            case "Verde":
                acertos++;
                break;
        }

        textView6.setText(String.valueOf("Seu resultado é: " + acertos + "/5"));
    }
}
