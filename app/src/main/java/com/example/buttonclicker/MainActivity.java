package com.example.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button buttonAdd = findViewById(R.id.button);
        final TextView textOutput = findViewById(R.id.textView2);
        final EditText increaseNumber = findViewById(R.id.incNumber);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            int num = 0;
            public void onClick(View v) {
                int adicionar = Integer.parseInt(increaseNumber.getText().toString());
                int num2 = num+adicionar;
                textOutput.setText(String.valueOf(num2));
                num = num2;
            }
        });
    }
}

