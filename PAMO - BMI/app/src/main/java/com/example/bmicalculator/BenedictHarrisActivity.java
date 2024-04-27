package com.example.bmicalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class BenedictHarrisActivity extends AppCompatActivity {

    private EditText ageInput, weightInput, heightInput;
    private Spinner genderSpinner;
    private Button calculateButton;
    private TextView caloriesResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benedict_harris);

        ageInput = findViewById(R.id.age);
        weightInput = findViewById(R.id.weight);
        heightInput = findViewById(R.id.height);
        genderSpinner = findViewById(R.id.gender);
        calculateButton = findViewById(R.id.calculate);
        caloriesResult = findViewById(R.id.caloriesResult);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateCalories();
            }
        });
    }

    private void calculateCalories() {
        int age = Integer.parseInt(ageInput.getText().toString());
        float weight = Float.parseFloat(weightInput.getText().toString());
        float height = Float.parseFloat(heightInput.getText().toString());
        String gender = genderSpinner.getSelectedItem().toString();

        double bmr;
        if ("Male".equals(gender)) {
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
        } else {
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
        }

        caloriesResult.setText("Daily Calories: " + bmr);
    }
}
