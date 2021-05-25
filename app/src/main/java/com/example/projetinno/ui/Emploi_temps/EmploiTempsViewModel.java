package com.example.projetinno.ui.Emploi_temps;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EmploiTempsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EmploiTempsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is emploi temps fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}