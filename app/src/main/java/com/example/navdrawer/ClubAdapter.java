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

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.MyViewHolder> {
    Context context;
    ArrayList<Football> modelClub;

    public ClubAdapter(Context context, ArrayList<Football> modelbangundatar) {
        this.context = context;
        this.modelClub = modelbangundatar;
    }

    @NonNull
    @Override
    public ClubAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_club, parent, false);
        return new ClubAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClubAdapter.MyViewHolder holder,  int position) {
        holder.tvNama.setText(modelClub.get(position).getName());
        holder.tvPoin.setText(modelClub.get(position).getDesc());
        Glide.with(context).load(modelClub.get(position).getImg()).into(holder.imgClub);
    }

    @Override
    public int getItemCount() {
            return modelClub.size();
        }
        public class MyViewHolder extends RecyclerView.ViewHolder{
            TextView tvNama,tvPoin;
            ImageView imgClub;

            public MyViewHolder(View ItemView) {
                super(ItemView);
                tvNama = itemView.findViewById(R.id.tvNama);
                tvPoin = itemView.findViewById(R.id.tvPoin);
                imgClub = itemView.findViewById(R.id.imgClub);
            }
        }
    }