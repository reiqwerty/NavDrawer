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

import java.util.ArrayList;

public class ClubFragment extends Fragment  {
    ArrayList<Football> modelClub = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_club, container, false);
        RecyclerView rvClub = rootview.findViewById(R.id.rvClub);

        modelClub.add(new Football("Real Madrid", "https://assets.laliga.com/assets/2019/06/07/small/real-madrid.png", "75 pts"));
        modelClub.add(new Football("FC Barcelona", "https://assets.laliga.com/assets/2019/06/07/small/barcelona.png", "67 pts"));
        modelClub.add(new Football("Girona FC", "https://assets.laliga.com/assets/2022/06/22/small/8f43addbb29e4a72f5e90b6edfe4728f.png", "65 pts"));
        modelClub.add(new Football("Atlético Madrid", "https://assets.laliga.com/assets/2019/06/07/small/atletico.png", "58 pts"));
        modelClub.add(new Football("Athletic Club", "https://assets.laliga.com/assets/2019/06/07/small/athletic.png", "56 pts"));
        modelClub.add(new Football("Real Sociedad", "https://assets.laliga.com/assets/2019/06/07/small/real-sociedad.png", "49 pts"));
        modelClub.add(new Football("Real Betis", "https://assets.laliga.com/assets/2022/09/15/small/e4a09419d3bd115b8f3dab73d480e146.png", "42 pts"));

        rvClub.setLayoutManager(new LinearLayoutManager(getActivity()));
        ClubAdapter adapter = new ClubAdapter(getContext(),modelClub);
        rvClub.setAdapter(adapter);

        return rootview;
    }
}