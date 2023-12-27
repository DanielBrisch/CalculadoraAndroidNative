package com.example.calculadoraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Double total = 0.0;

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonMais, buttonDiminui, buttonMultiplicacao, buttonDivisao, buttonIgual, buttonLimpar, buttonPonto;

    private TextView txtOutput, vlrParaCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciaViews();

        controlaBotoesNumericos();

        InciaEquacoes();
    }

    public void controlaBotoesNumericos() {
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

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(txtOutput.getText() + "9");
            }
        });
    }

    public void InciaEquacoes() {
        fazEquecaoDeSubtracao();
        resultado();
    }


    public void fazEquecaoDeSubtracao() {
        buttonDiminui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total = Double.parseDouble(txtOutput.getText().toString());
                txtOutput.setText(txtOutput.getText() + "-");
            }
        });
    }

    public void resultado() {
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public void iniciaViews() {
        txtOutput = findViewById(R.id.txtOutput);
        vlrParaCalcular = findViewById(R.id.vlrParaCalcular);
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
        buttonMais = findViewById(R.id.myButtonMais);
        buttonDiminui = findViewById(R.id.myButtonDiminui);
        buttonMultiplicacao = findViewById(R.id.myButtonX);
        buttonDivisao = findViewById(R.id.myButtonDivisao);
        buttonIgual = findViewById(R.id.myButtonResultado);
        buttonLimpar = findViewById(R.id.myButtonClear);
        buttonPonto = findViewById(R.id.myButtonPonto);
    }
}
