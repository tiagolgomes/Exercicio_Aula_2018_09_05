package com.example.exercicio_05;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

// Exercicio 5.
//
// Modificar o App do Exercicio 4 para desabilitar uma questão depois de respondida.
// Adicionar um botão no qual o usuário possa reiniciar o Quiz.

public class exercicio_05 extends Activity {

    private Spinner spinnerPerguntas1;
    private Spinner spinnerPerguntas2;
    private Spinner spinnerPerguntas3;
    private Spinner spinnerPerguntas4;
    private Spinner spinnerPerguntas5;

    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;

    private TextView textView6;

    private boolean check1;
    private boolean check2;
    private boolean check3;
    private boolean check4;
    private boolean check5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_05);

        spinnerPerguntas1 = findViewById(R.id.spinnerPerguntas1);
        spinnerPerguntas2 = findViewById(R.id.spinnerPerguntas2);
        spinnerPerguntas3 = findViewById(R.id.spinnerPerguntas3);
        spinnerPerguntas4 = findViewById(R.id.spinnerPerguntas4);
        spinnerPerguntas5 = findViewById(R.id.spinnerPerguntas5);

        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);

        textView6 = findViewById(R.id.textView6);

        spinnerPerguntas1.setEnabled(false);
        spinnerPerguntas2.setEnabled(false);
        spinnerPerguntas3.setEnabled(false);
        spinnerPerguntas4.setEnabled(false);
        spinnerPerguntas5.setEnabled(false);
    }

    public void onRadioButtonClicked1(View view) {
        if (checkBox1.isChecked()){
            spinnerPerguntas1.setEnabled(true);
            check1 = true;
        }
        else {
            spinnerPerguntas1.setEnabled(false);
            check1 = false;
        }
    }

    public void onRadioButtonClicked2(View view) {
        if (checkBox2.isChecked()){
            spinnerPerguntas2.setEnabled(true);
            check2 = true;
        }
        else {
            spinnerPerguntas2.setEnabled(false);
            check2 = false;
        }
    }

    public void onRadioButtonClicked3(View view) {
        if (checkBox3.isChecked()){
            spinnerPerguntas3.setEnabled(true);
            check3 = true;
        }
        else {
            spinnerPerguntas3.setEnabled(false);
            check3 = false;
        }
    }

    public void onRadioButtonClicked4(View view) {
        if (checkBox4.isChecked()){
            spinnerPerguntas4.setEnabled(true);
            check4 = true;
        }
        else {
            spinnerPerguntas4.setEnabled(false);
            check4 = false;
        }
    }

    public void onRadioButtonClicked5(View view) {
        if (checkBox5.isChecked()){
            spinnerPerguntas5.setEnabled(true);
            check5 = true;
        }
        else {
            spinnerPerguntas5.setEnabled(false);
            check5 = false;
        }
    }

    public void responder(View view){

        String resposta1 = "";
        String resposta2 = "";
        String resposta3 = "";
        String resposta4 = "";
        String resposta5 = "";

        if(check1){
            resposta1 = spinnerPerguntas1.getSelectedItem().toString();
        }
        if(check2){
            resposta2 = spinnerPerguntas2.getSelectedItem().toString();
        }
        if(check3){
            resposta3 = spinnerPerguntas3.getSelectedItem().toString();
        }
        if(check4){
            resposta4 = spinnerPerguntas4.getSelectedItem().toString();
        }
        if(check5){
            resposta5 = spinnerPerguntas5.getSelectedItem().toString();
        }

        int acertos = 0;
        int questoesRespondidas = 0;

        switch (resposta1) {
            case "Curitiba":
                acertos++;
                questoesRespondidas++;
                break;
            default:
                break;
        }
        switch (resposta2){
            case "Branco":
                acertos++;
                questoesRespondidas++;
                break;
            default:
                break;
        }
        switch (resposta3){
            case "10":
                acertos++;
                questoesRespondidas++;
                break;
            default:
                break;
        }
        switch (resposta4){
            case "Goggle":
                acertos++;
                questoesRespondidas++;
                break;
            default:
                break;
        }
        switch (resposta5){
            case "Verde":
                acertos++;
                questoesRespondidas++;
                break;
            default:
                break;
        }

        if (questoesRespondidas == 0){
            textView6.setText(String.valueOf("Você deverá selecionar pelo menos uma questão!"));
        }
        else{
            textView6.setText(String.valueOf("Seu resultado é: " + acertos + "/" + questoesRespondidas));
        }
    }

    public void reiniciar (View view){

        if (checkBox1.isChecked()){
            checkBox1.toggle();
        }
        if (checkBox2.isChecked()){
            checkBox2.toggle();
        }
        if (checkBox3.isChecked()){
            checkBox3.toggle();
        }
        if (checkBox4.isChecked()){
            checkBox4.toggle();
        }
        if (checkBox5.isChecked()){
            checkBox5.toggle();
        }

        spinnerPerguntas1.setEnabled(false);
        spinnerPerguntas2.setEnabled(false);
        spinnerPerguntas3.setEnabled(false);
        spinnerPerguntas4.setEnabled(false);
        spinnerPerguntas5.setEnabled(false);

    }
}
