package com.example.ejercicio21;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sumar(View view) {

        EditText txtvalor1;
        EditText txtvalor2;
        TextView lblResultado;

        lblResultado = findViewById(R.id.textView6);
        lblResultado.setText("La suma es:");
        txtvalor1 = findViewById(R.id.editText2);
        txtvalor2 = findViewById(R.id.editText3);


        int resultado = Integer.parseInt(txtvalor1.getText().toString()) + Integer.parseInt(txtvalor2.getText().toString());

        String str= lblResultado.getText().toString() + " " + resultado;
        lblResultado.setText(str);
    }
}
