package com.example.zayed.lab03simplecalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private EditText etNumber1;
    private EditText etNumber2;
    private Button btnCalculate;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumber1 = findViewById(R.id.et1);
        etNumber2 = findViewById(R.id.et2);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                calculate();
            }
        });

    }

    private void calculate()
    {
        String strNum1 = etNumber1.getText().toString();
        String strNum2 = etNumber2.getText().toString();

        try {
            double num1 = Double.parseDouble(strNum1);
            double num2 = Double.parseDouble(strNum2);

            double sum = num1 + num2;

            tvResult.setText(sum + "");
        } catch (NumberFormatException e)
        {
            e.printStackTrace();
            Toast.makeText(this, "Error! Please enter numbers", Toast.LENGTH_SHORT).show();
        }

    }
}
