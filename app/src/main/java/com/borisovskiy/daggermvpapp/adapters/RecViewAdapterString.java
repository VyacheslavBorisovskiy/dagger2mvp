package com.borisovskiy.daggermvpapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.borisovskiy.daggermvpapp.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecViewAdapterString extends RecyclerView.Adapter<RecViewAdapterString.RecViewHolder> {

    private List<String> items;

    @NonNull
    @Override
    public RecViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recview_item, parent, false);
        return new RecViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecViewHolder holder, int position) {
        String item = items.get(position);
        holder.recViewItem.setText(item);
    }

    public void setItems(List<String> items) {
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
