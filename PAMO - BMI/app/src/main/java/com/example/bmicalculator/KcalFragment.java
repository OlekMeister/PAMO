package com.example.bmicalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.fragment.app.Fragment;

public class KcalFragment extends Fragment {

    private EditText weight, height, bmi;
    private ToggleButton toggleGender;
    private TextView calorieResult;

    public KcalFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kcal, container, false);
        weight = view.findViewById(R.id.editTextWeight);
        height = view.findViewById(R.id.editTextHeight);
        bmi = view.findViewById(R.id.editTextBMI);
        toggleGender = view.findViewById(R.id.toggleButtonGender);
        calorieResult = view.findViewById(R.id.textViewCalorieResult);
        Button calculate = view.findViewById(R.id.buttonCalculateCalories);

        calculate.setOnClickListener(v -> {
            double w = Double.parseDouble(weight.getText().toString());
            double h = Double.parseDouble(height.getText().toString());
            double b = Double.parseDouble(bmi.getText().toString());
            double bmr = toggleGender.isChecked() ? (447.593 + (9.247 * w) + (3.098 * h) - (4.330 * b)) : (88.362 + (13.397 * w) + (4.799 * h) - (5.677 * b));
            calorieResult.setText(String.format("Twoje zapotrzebowanie kaloryczne: %.2f kcal", bmr));
        });

        return view;
    }
}
