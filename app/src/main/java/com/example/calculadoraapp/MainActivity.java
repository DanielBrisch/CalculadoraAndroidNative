package com.example.calculadoraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int total = 0;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    private TextView txtOutput;

    private String operacao = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciaViews();

        controlaBotoes();
    }

    public void controlaBotoes() {
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "7");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "8");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "9");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void iniciaViews() {
        txtOutput = findViewById(R.id.txtOutput);
        button1 = findViewById(R.id.myButton1);
        button2 = findViewById(R.id.myButton2);
        button3 = findViewById(R.id.myButton3);
        button4 = findViewById(R.id.myButton4);
        button5 = findViewById(R.id.myButton5);
        button6 = findViewById(R.id.myButton6);
        button7 = findViewById(R.id.myButton7);
        button8 = findViewById(R.id.myButton8);
        button9 = findViewById(R.id.myButton9);
        button0 = findViewById(R.id.myButton0);
    }
}
