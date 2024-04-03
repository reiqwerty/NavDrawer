package com.example.navdrawer.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navdrawer.Football;
import com.example.navdrawer.POTMAdapter;
import com.example.navdrawer.R;

import java.util.ArrayList;

public class POTMFragment extends Fragment  {
    ArrayList<Football> modelPOTM = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_potm, container, false);
        RecyclerView rvPOTM = rootview.findViewById(R.id.rvPOTM);

        modelPOTM.add(new Football("Vinicius Junior", "https://assets.laliga.com/squad/2023/t186/p246333/2048x2048/p246333_t186_2023_1_003_000.png", "Maret 2024"));
        modelPOTM.add(new Football("Robert Lewandowski", "https://assets.laliga.com/squad/2023/t178/p56764/256x278/p56764_t178_2023_1_001_000.png", "Februari 2024"));
        modelPOTM.add(new Football("Artem Dovbyk", "https://assets.laliga.com/squad/2023/t2893/p213294/2048x2225/p213294_t2893_2023_1_001_000.png", "December 2023"));
        modelPOTM.add(new Football("Antoine Griezmann", "https://assets.laliga.com/squad/2023/t175/p76650/2048x2048/p76650_t175_2023_1_003_000.png", "November 2023"));
        modelPOTM.add(new Football("Jude Bellingham", "https://assets.laliga.com/squad/2023/t186/p244855/2048x2048/p244855_t186_2023_1_003_000.png", "Oktober 2023"));
        modelPOTM.add(new Football("Takefusa Kubo", "https://assets.laliga.com/squad/2023/t188/p219271/2048x2048/p219271_t188_2023_1_003_000.png", "September 2023"));
        modelPOTM.add(new Football("Jude Bellingham", "https://assets.laliga.com/squad/2023/t186/p244855/2048x2048/p244855_t186_2023_1_003_000.png", "Agustus 2023"));

        rvPOTM.setLayoutManager(new LinearLayoutManager(getActivity()));
        POTMAdapter adapter = new POTMAdapter(getContext(),modelPOTM);
        rvPOTM.setAdapter(adapter);

        return rootview;
    }
}