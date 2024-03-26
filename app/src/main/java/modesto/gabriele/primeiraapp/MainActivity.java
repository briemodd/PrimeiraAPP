package modesto.gabriele.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //A classe main activity é a parte principal da aplicacao
    @Override
    protected void onCreate(Bundle savedInstanceState) { // onCreate é chamado toda vez que uma tela está sendo criada

        super.onCreate(savedInstanceState);
        // setContentView cria os elementos de interface
        setContentView(R.layout.activity_main);
        // Obtem o botao Enviar atraves do id
        Button btnEnviar = findViewById(R.id.btnEnviar);
        // setOnClickListener define o que acontece quando se clica no botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // é executado quando o botao é clicado
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this, NextActivity.class);
                i.putExtra("texto", textoDigitado);
                startActivity(i);
                
            }
        });
    }
}