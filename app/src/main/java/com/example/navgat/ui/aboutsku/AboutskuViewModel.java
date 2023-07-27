package com.example.navgat.ui.aboutsku;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutskuViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public AboutskuViewModel() {
        mText = new MutableLiveData<>();
    }

    public LiveData<String> getText() {
        return mText;
    }
}