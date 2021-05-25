package com.example.projetinno.ui.Info_ecole;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfoEcoleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InfoEcoleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is info école fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}