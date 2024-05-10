package com.example.bmicalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class RecipesFragment extends Fragment {

    public RecipesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recipes, container, false);
        TextView recipeText = view.findViewById(R.id.textViewRecipe);
        recipeText.setText("Makaron ugotować al dente w osolonej wodzie. Szpinak opłukać i odcedzić.\n" +
                "Na patelni na oliwie i maśle zeszklić pokrojoną w kosteczkę cebulę (ok. 5 - 7 minut). Doprawić solą, dodać przeciśnięty przez praskę czosnek i smażyć jeszcze przez ok. 2 minuty.\n" +
                "Dodać szpinak i mieszając podgrzewać przez ok. 1 minutę aż zwiędnie.\n" +
                "Wlać śmietankę, doprawić świeżo zmielonym pieprzem i solą, całość zagotować. Dodać odcedzony makaron i wymieszać.\n" +
                "Połączyć z 1/3 ilości sera, resztę wykorzystać do posypania makaronu.");
        return view;
    }
}
