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

public class TopScorerAdapter extends RecyclerView.Adapter<TopScorerAdapter.MyViewHolder> {
    Context context;
    ArrayList<Football> modelTopScorer;

    public TopScorerAdapter(Context context, ArrayList<Football> modelTopScorer) {
        this.context = context;
        this.modelTopScorer = modelTopScorer;
    }

    @NonNull
    @Override
    public TopScorerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_topscorer, parent, false);
        return new TopScorerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopScorerAdapter.MyViewHolder holder,  int position) {
        holder.tvNama.setText(modelTopScorer.get(position).getName());
        holder.tvGoal.setText(modelTopScorer.get(position).getDesc());
        Glide.with(context).load(modelTopScorer.get(position).getImg()).into(holder.imgTopScorer);
    }

    @Override
    public int getItemCount() {
        return modelTopScorer.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvNama, tvGoal;
        ImageView imgTopScorer;

        public MyViewHolder(View ItemView) {
            super(ItemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvGoal = itemView.findViewById(R.id.tvGoal);
            imgTopScorer = itemView.findViewById(R.id.imgTopScorer);
        }
    }
}