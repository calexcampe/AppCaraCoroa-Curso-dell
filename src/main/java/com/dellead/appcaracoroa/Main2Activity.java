package com.dellead.appcaracoroa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    String op;
    boolean restulado;
    TextView txtresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle =getIntent().getExtras();
        op = bundle.getString("op");
        txtresult = findViewById(R.id.txtresult);

        restulado = caracoroa();

        if (!restulado){
            // se o resultado for falso, entende-se como 1 ou cara
            if (op.equals("1")){

                txtresult.setText("Vitoria");
            }else{
                txtresult.setText("Derrota");
            }
        }else{

            if (op.equals("2")){

                txtresult.setText("Vitoria");
            }else{
                txtresult.setText("Derrota");
            }
        }
    }

    public boolean caracoroa(){

        Random gerar = new Random();
        return gerar.nextBoolean();
    }
}
