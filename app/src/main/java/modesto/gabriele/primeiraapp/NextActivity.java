package modesto.gabriele.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Intent i = getIntent(); // obtem o intent que veio de MainActivity
        String textoDigitado = i.getStringExtra("texto"); // pega o texto que está dentro do intent
        TextView tvTexto = findViewById(R.id.tvTexto);
        tvTexto.setText(textoDigitado); // exibe o texto
    }
}