package com.example.projetinno.ui.Discussion;

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

public class DiscussionFragment extends Fragment {

    private DiscussionViewModel discussionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        discussionViewModel =
                new ViewModelProvider(this).get(DiscussionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_discussion, container, false);
        final TextView textView = root.findViewById(R.id.text_discussion);
        discussionViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}