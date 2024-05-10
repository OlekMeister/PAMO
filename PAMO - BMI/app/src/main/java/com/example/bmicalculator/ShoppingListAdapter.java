package com.example.bmicalculator;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ShoppingListAdapter extends RecyclerView.Adapter<ShoppingListAdapter.ViewHolder> {

    private List<String> items;

    public ShoppingListAdapter(List<String> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_shopping_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String item = items.get(position);
        holder.textViewItemName.setText(item);
        holder.checkBox.setOnCheckedChangeListener(null);
        holder.checkBox.setChecked(false);
        holder.checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkBox;
        TextView textViewItemName;

        ViewHolder(View view) {
            super(view);
            checkBox = view.findViewById(R.id.checkBox);
            textViewItemName = view.findViewById(R.id.textViewItemName);
        }
    }
}
