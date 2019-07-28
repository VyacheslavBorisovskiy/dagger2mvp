package com.borisovskiy.daggermvpapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.borisovskiy.daggermvpapp.R;

import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecViewAdapterIntegers extends RecyclerView.Adapter<RecViewAdapterIntegers.RecViewHolder> {

    private List<Integer> items;

    @NonNull
    @Override
    public RecViewAdapterIntegers.RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recview_item, parent, false);
        return new RecViewAdapterIntegers.RecViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewAdapterIntegers.RecViewHolder holder, int position) {
        int item = items.get(position);
        holder.recViewItem.setText(String.format(Locale.US, "%d", item));
    }

    public void setItems(List<Integer> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class RecViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.recview_item_tv)
        TextView recViewItem;

        public RecViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}