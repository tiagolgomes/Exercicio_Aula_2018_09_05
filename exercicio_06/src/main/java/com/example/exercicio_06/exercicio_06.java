package com.example.exercicio_06;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class exercicio_06 extends Activity {

    private EditText editAltura1;
    private EditText editAltura2;
    private EditText editAltura3;
    private EditText editAltura4;
    private EditText editAltura5;
    private EditText editAltura6;
    private TextView textMedia;
    private TextView textDesvioPadrao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_06);
        editAltura1 = findViewById(R.id.editAltura1);
        editAltura2 = findViewById(R.id.editAltura2);
        editAltura3 = findViewById(R.id.editAltura3);
        editAltura4 = findViewById(R.id.editAltura4);
        editAltura5 = findViewById(R.id.editAltura5);
        editAltura6 = findViewById(R.id.editAltura6);
        textMedia = findViewById(R.id.textMedia);
        textDesvioPadrao = findViewById(R.id.textDesvioPadrao);
    }

    public void mediaEdesvioPadrao(View view) {

        Double altura1 = Double.parseDouble(editAltura1.getText().toString());
        Double altura2 = Double.parseDouble(editAltura2.getText().toString());
        Double altura3 = Double.parseDouble(editAltura3.getText().toString());
        Double altura4 = Double.parseDouble(editAltura4.getText().toString());
        Double altura5 = Double.parseDouble(editAltura5.getText().toString());
        Double altura6 = Double.parseDouble(editAltura6.getText().toString());

        Double media1 = (altura1 + altura2 + altura3 + altura4 + altura5 + altura6) / 6;

        String mediaTime = "A média das alturas do time é " + media1;
        textMedia.setText(mediaTime);

        Double varianciaAltura1 = altura1 - media1;
        Double varianciaAltura2 = altura2 - media1;
        Double varianciaAltura3 = altura3 - media1;
        Double varianciaAltura4 = altura4 - media1;
        Double varianciaAltura5 = altura5 - media1;
        Double varianciaAltura6 = altura6 - media1;

        Double quadVarinciaAltura1 = varianciaAltura1 * varianciaAltura1;
        Double quadVarinciaAltura2 = varianciaAltura2 * varianciaAltura2;
        Double quadVarinciaAltura3 = varianciaAltura3 * varianciaAltura3;
        Double quadVarinciaAltura4 = varianciaAltura4 * varianciaAltura4;
        Double quadVarinciaAltura5 = varianciaAltura5 * varianciaAltura5;
        Double quadVarinciaAltura6 = varianciaAltura6 * varianciaAltura6;

        Double media2 = (quadVarinciaAltura1 + quadVarinciaAltura2 + quadVarinciaAltura3 + quadVarinciaAltura4 + quadVarinciaAltura5 + quadVarinciaAltura6) / (6 - 1);
        Double desvioPadrao = Math.sqrt(media2);

        String desvioPadraoTime = "O desvio padrão das alturas do time é " + desvioPadrao;
        textDesvioPadrao.setText(desvioPadraoTime);
    }
}
