package com.hopeforAll.hopefanc.ui.bible;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.hopeforAll.hopefanc.R;


public class bible extends Fragment {

    private bibleViewModel bibleViewModel;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        bibleViewModel=
                new ViewModelProvider(this).get(bibleViewModel.class);
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_bible, container, false);
        final WebView v= root.findViewById(R.id.qq);
        WebSettings s=v.getSettings();
        s.setJavaScriptEnabled(true);
        v.loadUrl("https://dailyverses.net/get/example?languageid=1&translation=nkjv");
        if(v.canGoBack()){
            super.onStart();
        }
        bibleViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}