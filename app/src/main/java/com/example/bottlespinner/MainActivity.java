package com.example.bottlespinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

        public void spin(View view){
            Random rand = new Random();
            int randInt = rand.nextInt(3600);
            ImageView bottle= (ImageView) findViewById(R.id.bottle);
            bottle.animate().rotation(randInt).setDuration(3500);
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}