package com.example.calculadoraapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonMais, buttonDiminui, buttonMultiplicacao, buttonDivisao, buttonIgual, buttonLimpar, buttonPonto;

    private TextView txtOutput, ultimoValor;

    boolean primeiroClick = true;

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
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "0");
                primeiroClick = false;
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "1");
                primeiroClick = false;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "2");
                primeiroClick = false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "3");
                primeiroClick = false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "4");
                primeiroClick = false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "5");
                primeiroClick = false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "6");
                primeiroClick = false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "7");
                primeiroClick = false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "8");
                primeiroClick = false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "9");
                primeiroClick = false;
            }
        });
    }

    public void InciaEquacoes() {
        adicao();
        subtracao();
        multiplicacao();
        resultado();
    }

    public void subtracao() {
        buttonDiminui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "-");
                primeiroClick = false;
            }
        });
    }

    public void adicao() {
        buttonMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "+");
                primeiroClick = false;
            }
        });
    }

    public void divisao() {
        buttonDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "/");
                primeiroClick = false;
            }
        });
    }

    public void multiplicacao() {
        buttonMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + "*");
                primeiroClick = false;
            }
        });
    }

    public String converterResultado() {
        String expressao = txtOutput.getText().toString();
        Expression e = new ExpressionBuilder(expressao).build();
        double resultado = e.evaluate();

        return String.valueOf(resultado);
    }

    public void resultado() {
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOutput.setText(String.valueOf(converterResultado()));
                ultimoValor.setText(txtOutput.getText());
                primeiroClick = true;
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
