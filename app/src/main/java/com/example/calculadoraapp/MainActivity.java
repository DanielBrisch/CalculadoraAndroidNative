package com.example.calculadoraapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonMais, buttonDiminui, buttonIgual, buttonLimpar, buttonPonto, buttonDivisao, myButtonApagar;

    private ImageButton buttonMultiplicacao;
    private TextView txtOutput, ultimoValor;

    boolean primeiroClick = true;

    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciaViews();

        controlaBotoesNumericos();

        InciaEquacoes();

        reSize();
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

        buttonLimpar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText("0");
                clickCount += 1;
                if (clickCount == 5) {
                    showDialogGay();
                    clickCount = 0;
                }
                primeiroClick = true;
            }
        });

        myButtonApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                if (!txtOutput.getText().toString().isEmpty()) {
                    String textoModificado = txtOutput.getText().toString().substring(0, txtOutput.getText().toString().length() - 1);
                    txtOutput.setText(textoModificado);
                }
                primeiroClick = false;
            }
        });

        buttonPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (primeiroClick)
                    txtOutput.setText("");
                txtOutput.setText(txtOutput.getText() + ",");
                primeiroClick = false;
            }
        });
    }

    public void InciaEquacoes() {
        adicao();
        subtracao();
        multiplicacao();
        divisao();
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
                txtOutput.setText(txtOutput.getText() + "X");
                primeiroClick = false;
            }
        });
    }

    public String converterResultado() {
        String texto = txtOutput.getText().toString();
        if (!texto.isEmpty()) {
            char primeiroCaractere = texto.charAt(0);
            char ultimoCaractere = texto.charAt(texto.length() - 1);

            if (!Character.isDigit(primeiroCaractere)) {
                String removePrimeiroCaractere = texto.substring(1);
                txtOutput.setText(removePrimeiroCaractere);
                if (!Character.isDigit(ultimoCaractere)) {
                    String removeUltimoNaoNumerico = texto.substring(0, texto.length() - 1);
                    txtOutput.setText(removeUltimoNaoNumerico);
                }
            }
        }

        txtOutput.setText(txtOutput.getText().toString().replace("X", "*"));
        txtOutput.setText(txtOutput.getText().toString().replace(",", "."));

        String expressao = txtOutput.getText().toString();
        Expression e = new ExpressionBuilder(expressao).build();
        double resultado = e.evaluate();

        return String.valueOf(resultado);
    }

    public void resultado() {
        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mudaPontoParaVirgula = converterResultado().replace(".", ",");
                txtOutput.setText(mudaPontoParaVirgula);
                ultimoValor.setText(txtOutput.getText());
                primeiroClick = true;
            }
        });
    }

    //coisa pra minha dama, só ignorar
    private void showDialogGay() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("TE AMO <3");
        builder.setMessage("Tu sabe que vai casa cmg né?");

        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                txtOutput.setText("Te amo Giovana <3");
                primeiroClick = true;
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void reSize() {

        txtOutput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                int paddingTop = txtOutput.getPaddingTop();
                int paddingRight = txtOutput.getPaddingRight();
                int paddingBottom = txtOutput.getPaddingBottom();
                int paddingLeft = txtOutput.getPaddingLeft();

                if (txtOutput.getText().length() > 7) {
                    txtOutput.setTextSize(60);
                    paddingTop = 380;
                    paddingRight = 65;
                } else if (txtOutput.getText().length() <= 7) {
                    txtOutput.setTextSize(80);
                    paddingTop = 325;
                    paddingRight = 55;
                }

                if (txtOutput.getText().length() > 10) {
                    txtOutput.setTextSize(40);
                    paddingTop = 430;
                    paddingRight = 75;
                }

                txtOutput.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
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
        myButtonApagar = findViewById(R.id.myButtonApagar);
    }
}
