package com.example.navgat.ui.developer;


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

import com.example.navgat.R;

public class DevelopersFragment extends Fragment {

    private DevelopersViewModel mViewModel;

    public static DevelopersFragment newInstance() {
        return new DevelopersFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_developers, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DevelopersViewModel.class);
        // TODO: Use the ViewModel
    }

}