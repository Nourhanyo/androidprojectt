package com.example.fittnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class finish extends AppCompatActivity {
    Button contune;
    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(finish.this,R.color.black));
        setContentView(R.layout.activity_finish);

        contune =findViewById(R.id.contnue);

        contune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(finish.this,activityy1nourr.class);
                startActivity(intent);

            }

        });
    }
}