package com.hopeforAll.hopefanc.ui.follow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class followViewModel  extends ViewModel {
    private MutableLiveData<String> mText;

    public followViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}