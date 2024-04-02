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
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui); // pega o campo de texto
                String textoDigitado = etDigiteAqui.getText().toString(); // pega o texto do campo de texto
                Intent i = new Intent(MainActivity.this, NextActivity.class); // tem como intençao de navegar pra proxima tela
                i.putExtra("texto", textoDigitado); // coloca o texto digitado dentro do intent
                startActivity(i); // navega para a proxima activity
                
            }
        });
    }
}