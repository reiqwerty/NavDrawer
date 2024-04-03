package com.example.navdrawer.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawer.ClubAdapter;
import com.example.navdrawer.Football;
import com.example.navdrawer.R;
import com.example.navdrawer.TopScorerAdapter;

import java.util.ArrayList;

public class TopScorerFragment extends Fragment  {
    ArrayList<Football> modelTopScorer = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_top_scorer, container, false);
        RecyclerView rvTopScorer = rootview.findViewById(R.id.rvTopScorer);

        modelTopScorer.add(new Football("Jude Bellingham", "https://assets.laliga.com/squad/2023/t186/p244855/2048x2048/p244855_t186_2023_1_003_000.png", "16 Goals"));
        modelTopScorer.add(new Football("Artem Dovbyk", "https://assets.laliga.com/squad/2023/t2893/p213294/2048x2225/p213294_t2893_2023_1_001_000.png", "16 Goals"));
        modelTopScorer.add(new Football("Ante Budimir", "https://assets.laliga.com/squad/2023/t450/p94273/256x278/p94273_t450_2023_1_001_000.png","16 Goals"));
        modelTopScorer.add(new Football("Borja Mayoral", "https://assets.laliga.com/squad/2023/t1450/p199248/256x278/p199248_t1450_2023_1_001_000.png", "15 Goals"));
        modelTopScorer.add(new Football("Alexander Sørloth", "https://assets.laliga.com/squad/2023/t449/p143877/256x278/p143877_t449_2023_1_001_000.png", "14 Goals"));
        modelTopScorer.add(new Football("Álvaro Morata", "https://assets.laliga.com/squad/2023/t175/p88482/256x278/p88482_t175_2023_1_001_000.png", "14 Goals"));
        modelTopScorer.add(new Football("Robert Lewandowski", "https://assets.laliga.com/squad/2023/t178/p56764/256x278/p56764_t178_2023_1_001_000.png", "13 Goals"));

        rvTopScorer.setLayoutManager(new LinearLayoutManager(getActivity()));
        TopScorerAdapter adapter = new TopScorerAdapter(getContext(),modelTopScorer);
        rvTopScorer.setAdapter(adapter);

        return rootview;
    }
}