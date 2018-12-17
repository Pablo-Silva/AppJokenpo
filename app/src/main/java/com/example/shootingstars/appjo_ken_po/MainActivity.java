package com.example.shootingstars.appjo_ken_po;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedraSelecionada(View view){
      this.opcaoSelecionada("Pedra");
    }

    public void papelSelecionado(View view){
        this.opcaoSelecionada("Papel");
    }

    public void tesouraSelecionada(View view){
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String escolhaPlayer){

        ImageView imageResultado = findViewById(R.id.imageResultado);

        TextView textResultado = findViewById(R.id.textResultado);

        TextView textCPU = findViewById(R.id.textCPU);

        TextView textPlayer = findViewById(R.id.textPlayer);

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        int number = new Random().nextInt(3);

        String escolhaCpu = opcoes[number];

        switch (escolhaCpu){
            case "Pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;

            case "Papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((escolhaCpu == "Pedra" && escolhaPlayer == "Tesoura") ||
            (escolhaCpu == "Papel" && escolhaPlayer == "Pedra") ||
            (escolhaCpu == "Tesoura" && escolhaPlayer == "Papel")){

            textResultado.setText("You Lose!");
        }

        else if ((escolhaPlayer == "Pedra" && escolhaCpu == "Tesoura") ||
                (escolhaPlayer == "Papel" && escolhaCpu == "Pedra") ||
                (escolhaPlayer == "Tesoura" && escolhaCpu == "Papel")){
            textResultado.setText("You Win!");
        }

        else {
            textResultado.setText("Draw!");
        }
    }
}
