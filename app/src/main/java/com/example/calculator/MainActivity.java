package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public int firstNumber, secondNumber;
    public EditText first, second;
    public TextView solutionText;
    public Button add, subtract, multiplication, clearButton;
    public String firstNumText, secondNumText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findSolution();
    }

    public void userInput() {
        first = findViewById(R.id.firstText);
        firstNumText = first.getText().toString();
        firstNumber = Integer.parseInt(firstNumText);
        second = findViewById(R.id.secondText);
        secondNumText = second.getText().toString();
        secondNumber = Integer.parseInt(secondNumText);
        solutionText = findViewById(R.id.solution);
    }

    public void findSolution() {
        add = findViewById(R.id.addButton);
        subtract = findViewById(R.id.subtractButton);
        multiplication = findViewById(R.id.multiplyButton);
        clearButton = findViewById(R.id.clearButton);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput();
                int answer = firstNumber + secondNumber;
                solutionText.setText(String.valueOf(answer));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput();
                int answer = firstNumber - secondNumber;
                solutionText.setText(String.valueOf(answer));
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userInput();
                int answer = firstNumber * secondNumber;
                solutionText.setText(String.valueOf(answer));
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionText.setText("Welcome to the Yadav calculator!");
                first.setText("");
                second.setText("");
                Toast.makeText(getApplicationContext(), "Restarted the Calculator", Toast.LENGTH_SHORT).show();
            }
        });
    }
}