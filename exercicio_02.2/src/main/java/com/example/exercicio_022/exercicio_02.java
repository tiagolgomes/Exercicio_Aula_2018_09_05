package com.example.exercicio_022;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class exercicio_02 extends Activity {

    private EditText editIdade;
    private TextView textCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_02);
    }

    public void categoria(View view){

        String suaCategoria;

        int idade;

        idade = Integer.parseInt(editIdade.getText().toString());

        switch (idade){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                suaCategoria = "Você não tem a Idade Mínima para Participar";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                suaCategoria = "Infantil";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                suaCategoria = "Juvenil";
                break;
            default:
                suaCategoria = "Adulto";
                break;
        }

       textCategoria.setText(String.valueOf(suaCategoria));
    }
}
