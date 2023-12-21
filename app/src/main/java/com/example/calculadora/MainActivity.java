package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int num = 0;
    private Button button;
    private TextView txtCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.myButton);
        txtCounter = findViewById(R.id.txtCounter);

        controlaBotao();
    }

    public void controlaBotao() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num += 1;
                txtCounter.setText(String.valueOf(num));
            }
        });
    }

    public void iniciaViews() {

    }
}
