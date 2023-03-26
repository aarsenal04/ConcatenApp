package com.extraclase.concatenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText inputText1;
    EditText inputText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView2);
        inputText1 = (EditText) findViewById(R.id.inputText1);
        inputText2 = (EditText) findViewById(R.id.inputText2);
    }

    @SuppressLint("SetTextI18n")
    public void concatenar(View view){
        textView.setText(inputText1.getText()+" "+inputText2.getText());
    }
}