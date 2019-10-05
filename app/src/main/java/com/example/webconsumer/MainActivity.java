package com.example.webconsumer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn1 ;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);


    }


    public void acc(View v){
        Intent preguntasI = new Intent(this,SecondActivity.class);
        preguntasI.putExtra("tam", "people");
        preguntasI.putExtra("num", "1");
        startActivity(preguntasI);
    }
    public void acc2(View v){
        Intent preguntasI = new Intent(this,SecondActivity.class);
        preguntasI.putExtra("tam", "planets");
        preguntasI.putExtra("num", "1");
        startActivity(preguntasI);
    }
}
