package com.example.bmicalculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bmicalculator.ShoppingListAdapter;

import java.util.Arrays;
import java.util.List;

public class ShoppingListFragment extends Fragment {
    private RecyclerView recyclerView;
    private ShoppingListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shopping_list, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewShoppingList);
        List<String> items = Arrays.asList("Makaron", "Szpinak", "Czosnek", "Oliwa z oliwek", "Sól", "Pieprz", "Masło", "Śmietanka 30%", "Parmezan");
        adapter = new ShoppingListAdapter(items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}
