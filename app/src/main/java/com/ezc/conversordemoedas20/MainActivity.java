package com.ezc.conversordemoedas20;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText et_meticais;
    Button bt_reais, bt_dolares, bt_yen;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et_meticais = findViewById(R.id.et_valorMeticais);
        bt_reais = findViewById(R.id.bt_real);
        bt_dolares = findViewById(R.id.bt_dolar);
        bt_yen = findViewById(R.id.bt_Yen);

        bt_reais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double vMeticais = Double.parseDouble(et_meticais.getText().toString());
               double vReal = vMeticais / 13.36;
                Toast.makeText(MainActivity.this, vMeticais + "  Meticais são   "  +vReal+  "  R$" , Toast.LENGTH_SHORT).show();

            }
        });

        bt_dolares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vMeticais = Double.parseDouble(et_meticais.getText().toString());
                double vdolar = vMeticais / 74.87;
                Toast.makeText(MainActivity.this, vMeticais + "  Meticais são   "  +vdolar+  "  $" , Toast.LENGTH_SHORT).show();

            }
        });

        bt_yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double vMeticais = Double.parseDouble(et_meticais.getText().toString());
                double vyen = vMeticais / 0.70;
                Toast.makeText(MainActivity.this, vMeticais + "  Meticais são   "  +vyen+  "  ¥" , Toast.LENGTH_SHORT).show();
            }
        });

    }
}