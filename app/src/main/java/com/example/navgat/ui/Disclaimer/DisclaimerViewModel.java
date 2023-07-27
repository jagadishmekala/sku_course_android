package com.example.navgat.ui.Disclaimer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DisclaimerViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public DisclaimerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is disclaimer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}