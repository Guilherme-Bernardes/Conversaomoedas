package com.example.conversaomoedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editQuantidadeDolar;
    private EditText editTextCotacaoDolar;
    private TextView textResultado;

    private EditText editQuantidadeEuro;
    private EditText editCotacaoEuro;
    private TextView textResultadoEuro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editQuantidadeDolar = findViewById(R.id.editQuantidadeDolar);
        editTextCotacaoDolar=findViewById(R.id.editCotacaoDolar);
        textResultado=findViewById(R.id.textResultado);
        editQuantidadeEuro=findViewById(R.id.editQuantidadeEuro);
        editCotacaoEuro=findViewById(R.id.editCotacaoEuro);
        textResultadoEuro=findViewById(R.id.textResultadoEuro);



    }
    public void converterDolar(View view){
        double quantidadeDolar = Double.parseDouble(editQuantidadeDolar.getText().toString());
        double cotacaoDolar = Double.parseDouble(editTextCotacaoDolar.getText().toString());
        double resultado= quantidadeDolar*cotacaoDolar;
        textResultado.setText("Valor convertido em R$: "+resultado);

    }

    public void converterEuro(View view){
        double quantidadeEuro = Double.parseDouble(editQuantidadeEuro.getText().toString());
        double cotacaoEuro = Double.parseDouble(editCotacaoEuro.getText().toString());
        double resultadoEuro= quantidadeEuro*cotacaoEuro;
        textResultadoEuro.setText("Valor convertido em R$: "+resultadoEuro);

    }
}