package com.example.prova2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        home = findViewById(R.id.btn_home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =getIntent();
                Bundle b = i.getExtras();
                Toast t = Toast.makeText(getApplicationContext(), b.getString("chiave"), Toast.LENGTH_SHORT);
                t.show();

                Intent i1= new Intent(getApplicationContext(), MainActivity.class);
                i1.putExtra("MESSAGE", "");
                setResult(1,i1);
                finish();

            }
        });


        /*Intent intent = getIntent();
        Bundle b = intent.getExtras();

        String testo = b.getString("chiave");
        TextView etichetta = findViewById(R.id.benvenuto);
        etichetta.setText(testo);*/
    }
}
