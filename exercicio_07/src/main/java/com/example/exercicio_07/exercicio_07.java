package com.example.exercicio_07;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class exercicio_07 extends Activity {

    private EditText editA;
    private EditText editB;
    private EditText editC;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_07);
    }

    public void baskara(View view){
        Double a = Double.parseDouble(editA.getText().toString());
        Double b = Double.parseDouble(editB.getText().toString());
        Double c = Double.parseDouble(editC.getText().toString());
        Double delta = (b*b) + (- 4*(a*c));

        if (delta>=0){
            Double x1 = ((-b+ Math.sqrt(delta))/(2*a));
            Double x2 = ((-b- Math.sqrt(delta))/(2*a));

            String resultado = "As raízes para Delta são: %.2f " +x1+ " e " +x2;
            textResultado.setText(resultado);
        }else{
            String resultado = "Delta não possui raiz";
            textResultado.setText(resultado);
        }

    }
}
