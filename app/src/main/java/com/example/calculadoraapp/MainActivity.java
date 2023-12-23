package com.example.calculadora;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int num = 0;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.myButton7);

        controlaBotao();
    }

    public void controlaBotao() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num += 1;
            }
        });
    }

    public void iniciaViews() {

    }
}
