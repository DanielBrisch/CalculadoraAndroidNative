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

    private TextView txtOutput, ultimoValor;

    private List<String> lsOperadores = new ArrayList<>();
    private List<Double> lsValores = new ArrayList<>();

    boolean primeiroClick = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciaViews();

//        buttonLimpar.setBackgroundColor(0xFFFFA500);

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
        fazEquacaoDeSubtracao();
        resultado();
    }

    public void fazEquacaoDeSubtracao() {
        buttonDiminui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");

                String texto = txtOutput.getText().toString();

                int indice = texto.length() - 1;
                while (indice >= 0) {
                    if (Character.isDigit(texto.charAt(indice)) || texto.charAt(indice) == '.') {
                        indice--;
                    } else {
                        break;
                    }
                }

                if (indice < 0) {
                    total = Double.parseDouble(texto);
                } else {
                    String textoNumerico = texto.substring(0, indice + 1);
                    try {
                        total = Double.parseDouble(textoNumerico);
                    } catch (NumberFormatException e) {
                        total = 0.0;
                    }
                }

                lsValores.add(total);
                txtOutput.setText(txtOutput.getText() + "-");
                char ultimoCaractere = txtOutput.getText().charAt(txtOutput.getText().length() - 1);
                lsOperadores.add(String.valueOf(ultimoCaractere));
                primeiroClick = false;
            }
        });
    }

    public Double montaResultado() {

        double resultado = lsValores.get(0);
        for (int i = 0; i < lsOperadores.size(); i++) {
            double proximoValor = (i + 1 < lsValores.size()) ? lsValores.get(i + 1) : 0;
            String operador = lsOperadores.get(i);

            switch (operador) {
                case "+":
                    resultado += proximoValor;
                    break;
                case "-":
                    resultado -= proximoValor;
                    break;
                case "*":
                    resultado *= proximoValor;
                    break;
                case "/":
                    if (proximoValor != 0) {
                        resultado /= proximoValor;
                    } else {
                        throw new ArithmeticException("Divisão por zero");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Operador inválido: " + operador);
            }
        }
        return resultado;
    }

    public void resultado() {
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(montaResultado().toString());
            }
        });
    }

    public void iniciaViews() {
        txtOutput = findViewById(R.id.txtOutput);
        ultimoValor = findViewById(R.id.ultimoValor);
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
