package com.example.navgat.ui.aboutsku;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navgat.R;
import com.example.navgat.databinding.FragmentAboutskuBinding;

import com.example.navgat.ui.aboutsku.AboutskuViewModel;


public class AboutskuFragment extends Fragment {

    private FragmentAboutskuBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AboutskuViewModel aboutskuViewModel =
                new ViewModelProvider(this).get(AboutskuViewModel.class);

        binding = FragmentAboutskuBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAboutsku;
       aboutskuViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}