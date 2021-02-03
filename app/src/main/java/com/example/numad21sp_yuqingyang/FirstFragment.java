package com.example.numad21sp_yuqingyang;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState

    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);

        }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        view.findViewById(R.id.buttonA).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonA:
                        Toast toastA = Toast.makeText(getActivity().getApplicationContext(),"Pressed:A",Toast.LENGTH_SHORT);
                        toastA.setGravity(Gravity.CENTER, 0, 80);
                        toastA.show();
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonB).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonB:
                        Toast toastB = Toast.makeText(getActivity().getApplicationContext(),"Pressed:B",Toast.LENGTH_SHORT);
                        toastB.setGravity(Gravity.CENTER, 0, 80);
                        toastB.show();
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonC:
                        Toast toastC = Toast.makeText(getActivity().getApplicationContext(),"Pressed:C",Toast.LENGTH_SHORT);
                        toastC.setGravity(Gravity.CENTER, 0, 80);
                        toastC.show();
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonD).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonD:
                        Toast toastD = Toast.makeText(getActivity().getApplicationContext(),"Pressed:D",Toast.LENGTH_SHORT);
                        toastD.setGravity(Gravity.CENTER, 0, 80);
                        toastD.show();
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonE:
                        Toast toastE = Toast.makeText(getActivity().getApplicationContext(),"Pressed:E",Toast.LENGTH_SHORT);
                        toastE.setGravity(Gravity.CENTER, 0, 80);
                        toastE.show();
                        break;
                }
            }
        });
        view.findViewById(R.id.buttonF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.buttonF:
                        Toast toastF = Toast.makeText(getActivity().getApplicationContext(),"Pressed:F",Toast.LENGTH_SHORT);
                        toastF.setGravity(Gravity.CENTER, 0, 80);
                        toastF.show();
                        break;
                }
            }
        });

    }

}