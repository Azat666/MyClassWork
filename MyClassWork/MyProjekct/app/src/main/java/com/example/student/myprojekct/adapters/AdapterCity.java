package com.example.student.myprojekct.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.student.myprojekct.R;
import com.example.student.myprojekct.models.ModelCity;

import java.util.List;

public class AdapterCity extends RecyclerView.Adapter<AdapterCity.MyViewHolder> {
    private List<ModelCity> list;
    private Context context;

    public AdapterCity(List<ModelCity> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterCity.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.second_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCity.MyViewHolder holder, int position) {
        holder.textDesc.setText(list.get(position).getTextDescription());
        holder.textName.setText(list.get(position).getTextName());
        holder.imageView.setImageResource(list.get(position).getImageId());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textName;
        private TextView textDesc;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_item);
            textName = itemView.findViewById(R.id.name_item);
            textDesc = itemView.findViewById(R.id.description_item);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                }
            });
        }
    }
}
