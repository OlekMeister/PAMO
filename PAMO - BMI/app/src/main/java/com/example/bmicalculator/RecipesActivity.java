package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RecipesActivity extends AppCompatActivity {

    private ListView recipesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        recipesList = findViewById(R.id.recipesList);

        String[] recipes = {"Przepis 1", "Przepis 2"}; // Nazwy przepisów
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, recipes);
        recipesList.setAdapter(adapter);

        recipesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(RecipesActivity.this, "Wybrano: " + recipes[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}
