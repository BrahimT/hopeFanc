package com.example.hopefanc.ui.Sermon;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class sermonViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public sermonViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
