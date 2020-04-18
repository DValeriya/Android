package com.example.laba_04_2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment {

    private OnFragmentInteractionListener mListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach(){
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String result);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button tsnButton = view.findViewById(R.id.tsnBtn);
        Button reviewerButton = view.findViewById(R.id.reviewerBtn);
        Button ukrButton = view.findViewById(R.id.ukrBtn);

        tsnButton.setOnClickListener(v -> {
            mListener.onFragmentInteraction("https://tsn.ua/");
        });
        reviewerButton.setOnClickListener(v -> {
            mListener.onFragmentInteraction("https://www.obozrevatel.com/");
        });
        ukrButton.setOnClickListener(v -> {
            mListener.onFragmentInteraction("https://www.ukr.net/");
        });
    }
}

