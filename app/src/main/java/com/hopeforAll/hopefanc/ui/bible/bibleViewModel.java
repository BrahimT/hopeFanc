package com.hopeforAll.hopefanc.ui.bible;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class bibleViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public bibleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
