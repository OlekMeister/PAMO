package com.example.bmicalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.util.ArrayList;
import java.util.List;

public class BmiFragment extends Fragment {

    private EditText weight, height;
    private TextView result;
    private LineChart chart;
    private List<Entry> entries;
    private LineDataSet dataSet;

    public BmiFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bmi, container, false);
        weight = view.findViewById(R.id.editTextWeight);
        height = view.findViewById(R.id.editTextHeight);
        result = view.findViewById(R.id.textViewResult);
        Button calculate = view.findViewById(R.id.buttonCalculate);
        chart = view.findViewById(R.id.chart);

        initializeChart();

        calculate.setOnClickListener(v -> {
            if (!weight.getText().toString().isEmpty() && !height.getText().toString().isEmpty()) {
                double w = Double.parseDouble(weight.getText().toString());
                double h = Double.parseDouble(height.getText().toString()) / 100;
                double bmi = w / (h * h);
                result.setText(String.format("Twoje BMI to: %.2f", bmi));

                updateChart(bmi);
            }
        });

        return view;
    }

    private void initializeChart() {
        entries = new ArrayList<>();
        entries.add(new Entry(1, calculateInitialBMI(70, 1.75)));
        entries.add(new Entry(2, calculateInitialBMI(65, 1.75)));
        entries.add(new Entry(3, calculateInitialBMI(68, 1.75)));

        dataSet = new LineDataSet(entries, "BMI w czasie");
        dataSet.setColor(getResources().getColor(R.color.colorPrimary));
        dataSet.setValueTextColor(getResources().getColor(R.color.colorAccent));

        LineData lineData = new LineData(dataSet);
        chart.setData(lineData);
        chart.getDescription().setEnabled(false);
        chart.invalidate();
    }

    private float calculateInitialBMI(double weight, double height) {
        return (float) (weight / (height * height));
    }

    private void updateChart(double bmiValue) {
        entries.add(new Entry(entries.size() + 1, (float) bmiValue));
        chart.getData().notifyDataChanged();
        chart.notifyDataSetChanged();
        chart.invalidate();
    }
}
