package br.com.s2bminas.asistencia24h.s2b_android_asistencia24h;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class TelaConfirmacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_confirmacao);

        String []veiculos = new String[]{"Ferrari", "Fusca", "Kombi"};

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,veiculos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        Spinner SelVeiculo = (Spinner)findViewById(R.id.SelVeiculo);
        SelVeiculo.setAdapter(adapter);
    }
}
