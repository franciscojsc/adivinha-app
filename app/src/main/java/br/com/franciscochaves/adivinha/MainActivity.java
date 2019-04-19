package br.com.franciscochaves.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;
    private Random random;
    private int valor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.button);
        textoResultado = findViewById(R.id.textView3);

        random = new Random();

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor = random.nextInt(11);
                textoResultado.setText(valor+"");
            }
        });

    }


}
