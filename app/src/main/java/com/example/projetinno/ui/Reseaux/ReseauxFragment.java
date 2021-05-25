package com.example.projetinno.ui.Reseaux;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.projetinno.R;

public class ReseauxFragment extends Fragment {

    private ReseauxViewModel reseauxViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        reseauxViewModel =
                new ViewModelProvider(this).get(ReseauxViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reseaux, container, false);
        final TextView textView = root.findViewById(R.id.text_reseaux);
        reseauxViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}