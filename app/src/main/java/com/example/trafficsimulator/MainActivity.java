package com.example.trafficsimulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


    public class MainActivity extends AppCompatActivity {
        int count = 0;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        public void stopButton(View view){
            ImageView img = findViewById(R.id.redLightImage);
            Button button = findViewById(R.id.button);
            button.setText("Stop");

            if(count == 0){
                img.setImageResource(R.drawable.redlight);
                button.setBackgroundColor(getResources().getColor(R.color.red));
                count = 1;
            }
            else if(count == 1){
                img.setImageResource(R.drawable.greenlight);
                button.setText("Go");
                button.setBackgroundColor(getResources().getColor(R.color.greenLight));
                count = 2;

            }else if(count == 2 ){
                img.setImageResource(R.drawable.yellowlight);
                button.setText("Wait");
                count = 0;
            }


        }

}