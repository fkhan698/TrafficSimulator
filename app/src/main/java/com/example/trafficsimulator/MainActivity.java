package com.example.trafficsimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void stopButton(View view){
        final Button button = findViewById(R.id.button);
        Imageview image = findViewById(R.id.greenlight);
        button.setBackgroundColor(getResources().getColor(R.color.red));
        button.setText("Go");
    }

}