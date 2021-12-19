package com.example.module2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class infoFragment extends Fragment {

    RecyclerView recyclerView;
    public static checkBoxListAdapter adapter;
    public static ArrayList<String> CB = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.info_layout, container, false);
        recyclerView = view.findViewById(R.id.CBList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new checkBoxListAdapter(getContext(),CB );
        recyclerView.setAdapter(adapter);
        return view;

    }

}