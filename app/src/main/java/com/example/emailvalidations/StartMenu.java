package com.example.emailvalidations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import static com.example.emailvalidations.R.*;

public class StartMenu extends AppCompatActivity
{
    ImageButton Start_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Start_btn = findViewById(id.btnLogin);
        final Context context = this;
        Start_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivities();
            }
        });
    }

    private void startActivities() 
    {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

}