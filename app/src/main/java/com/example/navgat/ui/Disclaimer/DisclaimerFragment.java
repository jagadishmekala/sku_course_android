package com.example.navgat.ui.Disclaimer;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navgat.R;
import com.example.navgat.databinding.FragmentDisclaimerBinding;
import com.example.navgat.databinding.FragmentGalleryBinding;
import com.example.navgat.ui.gallery.GalleryViewModel;

public class DisclaimerFragment extends Fragment {

    private FragmentDisclaimerBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DisclaimerViewModel disclaimerViewModel =
                new ViewModelProvider(this).get(DisclaimerViewModel.class);

        binding = FragmentDisclaimerBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}