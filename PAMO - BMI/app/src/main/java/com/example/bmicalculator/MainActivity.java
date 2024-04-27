package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText weightInput;
    private EditText heightInput;
    private Button submitButton;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        weightInput = findViewById(R.id.weight);
        heightInput = findViewById(R.id.height);
        submitButton = findViewById(R.id.btnSubmit);
        resultText = findViewById(R.id.result);

        // Set OnClickListener for the submitButtonadb
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        // Get weight and height inputs from EditText fields
        String weightStr = weightInput.getText().toString();
        String heightStr = heightInput.getText().toString();

        // Convert weight and height inputs to float values
        float weight = Float.parseFloat(weightStr);
        float height = Float.parseFloat(heightStr) / 100; // Convert height from CM to meters

        // Calculate BMI
        float bmi = weight / (height * height);

        // Display result in TextView
        resultText.setText("Your BMI: " + bmi);
    }
}
