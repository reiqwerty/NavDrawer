package com.example.navdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class POTMAdapter extends RecyclerView.Adapter<POTMAdapter.MyViewHolder> {
    Context context;
    ArrayList<Football> modelPOTM;

    public POTMAdapter(Context context, ArrayList<Football> modelPOTM) {
        this.context = context;
        this.modelPOTM = modelPOTM;
    }

    @NonNull
    @Override
    public POTMAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_potm, parent, false);
        return new POTMAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull POTMAdapter.MyViewHolder holder,  int position) {
        holder.tvNama.setText(modelPOTM.get(position).getName());
        holder.tvBulan.setText(modelPOTM.get(position).getDesc());
        Glide.with(context).load(modelPOTM.get(position).getImg()).into(holder.imgPOTM);
    }

    @Override
    public int getItemCount() {
        return modelPOTM.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvNama, tvBulan;
        ImageView imgPOTM;

        public MyViewHolder(View ItemView) {
            super(ItemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvBulan = itemView.findViewById(R.id.tvBulan);
            imgPOTM = itemView.findViewById(R.id.imgPOTM);

        }
    }
}