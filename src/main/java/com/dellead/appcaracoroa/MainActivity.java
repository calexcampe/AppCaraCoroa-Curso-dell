package com.dellead.appcaracoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlanc;
    EditText edtop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlanc = findViewById(R.id.btnlancar);
        edtop = findViewById(R.id.edtnum);

        btnlanc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtop.getText().length() == 0){

                    Toast.makeText(MainActivity.this,"Informe sua escolha",Toast.LENGTH_LONG).show();
                }
                if (edtop.getText().toString().equals("1")||edtop.getText().toString().equals("2")) {
                    Intent a = new Intent(MainActivity.this, Main2Activity.class);
                    a.putExtra("op", edtop.getText().toString());
                    startActivity(a);
                }else {

                    Toast.makeText(MainActivity.this,"Informa 1 para Cara ou 2 para Coroa",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
