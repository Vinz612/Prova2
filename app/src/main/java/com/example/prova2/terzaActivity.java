package com.example.prova2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class terzaActivity extends AppCompatActivity {
TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terza);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        int i = b.getInt("intero");

        t = findViewById(R.id.eccoci);
        t.setText("ciao" + i);


    }
}
