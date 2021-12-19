package com.example.module2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class checkboxFragment extends Fragment {

    View view;
    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;

    private void findViews(){

        checkBox1 = view.findViewById(R.id.checkBox1);
        checkBox2 = view.findViewById(R.id.checkBox2);
        checkBox3 = view.findViewById(R.id.checkBox3);
        checkBox4 = view.findViewById(R.id.checkBox4);

    }

    private void applyFunctionality(){

       checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
               if(checkBox1.isChecked())
                   infoFragment.CB.add(checkBox1.getText().toString());
               else
                   infoFragment.CB.remove(checkBox1.getText().toString());
               if(infoFragment.adapter != null) infoFragment.adapter.notifyDataSetChanged();
           }
       });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox2.isChecked())
                    infoFragment.CB.add(checkBox2.getText().toString());
                else
                    infoFragment.CB.remove(checkBox2.getText().toString());
                if(infoFragment.adapter != null) infoFragment.adapter.notifyDataSetChanged();
            }
        });

        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox3.isChecked())
                    infoFragment.CB.add(checkBox3.getText().toString());
                else
                    infoFragment.CB.remove(checkBox3.getText().toString());
                if(infoFragment.adapter != null) infoFragment.adapter.notifyDataSetChanged();
            }
        });

        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(checkBox4.isChecked())
                infoFragment.CB.add(checkBox4.getText().toString());
                else
                infoFragment.CB.remove(checkBox4.getText().toString());
                if(infoFragment.adapter != null) infoFragment.adapter.notifyDataSetChanged();
            }
        });



    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.checkbox_layout, container, false);
        findViews();
        applyFunctionality();
        return view;
    }
}