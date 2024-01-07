package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2,operation;
    TextView Result;
    Button modules, division, multiply, subtract, add, equal;

    double num_1, num_2;
    double result;
    String operator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.edittext_number1);
        number2 = findViewById(R.id.edittext_number2);
        operation = findViewById(R.id.edittext_operation);
        Result = findViewById(R.id.textView_result);
        modules = findViewById(R.id.btn_modules);
        division = findViewById(R.id.btn_division);
        multiply = findViewById(R.id.btn_multiply);
        subtract = findViewById(R.id.btn_subtract);
        add = findViewById(R.id.btn_add);
        equal = findViewById(R.id.btn_equal);


        operator = "+";



        modules.setOnClickListener(view -> {
            operation.setText("%");
            operator = "%";
        });

        division.setOnClickListener(view -> {
                operation.setText("/");
                operator = "/";

        });
        multiply.setOnClickListener(view -> {
                operation.setText("*");
                operator = "*";

        });
        subtract.setOnClickListener(view -> {
                operation.setText("-");
                operator = "-";

        });
        add.setOnClickListener(view -> {
                operation.setText("+");
                operator = "+";

        });



        equal.setOnClickListener(view -> {

                num_1 = Double.parseDouble(number1.getText().toString());
                num_2 = Double.parseDouble(number2.getText().toString());


                switch (operator){
                    case "+":
                        result = num_1 + num_2;
                        Result.setText(String.format("Result = %s", result));
                        break;
                    case "-":
                        result = num_1 - num_2;
                        Result.setText(String.format("Result = %s", result));
                        break;
                    case "*":
                        result = num_1 * num_2;
                        Result.setText(String.format("Result = %s", result));
                        break;
                    case "/":
                        result = (double) (num_1 / num_2);
                        Result.setText(String.format("Result = %s", result));
                        break;
                    case "%":
                        result = (num_1 % num_2);
                        Result.setText(String.format("Result = %s", result));
                        break;
                }
                number1.setText("0");
                number2.setText("0");
                operation.getText().clear();

        });

    }
}