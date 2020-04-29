package com.example.prova2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    static final int REQUEST_CODE = 1;
    EditText name;
    Button b;
    Button verifica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.nome);
        b = findViewById(R.id.pulsante);
        verifica = findViewById(R.id.invia);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = name.getText().toString();
                Toast t = Toast.makeText(getApplicationContext(), "Hello World!" + n, Toast.LENGTH_LONG);
                t.show();
            }
        });

        verifica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomeinserito;
                nomeinserito = name.getText().toString();

                Toast t = Toast.makeText(getApplicationContext(), nomeinserito, Toast.LENGTH_LONG);

                Intent intent = new Intent(getApplicationContext(), secondActivity.class);
                intent.putExtra("chiave", nomeinserito);
                //startActivity(intent);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE){
            String message=data.getStringExtra("MESSAGE");
            name.setText(message);
        }

    }
}
