package com.example.fittnessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class exercise1 extends AppCompatActivity {

    Button next1;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(exercise1.this,R.color.black));
        setContentView(R.layout.activity_exercise1);
        next1 =findViewById(R.id.next1);

        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent=new Intent(exercise1.this,exercise2.class);
                startActivity(intent);

            }

        });

    }
}