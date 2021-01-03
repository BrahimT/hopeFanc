package com.example.hopefanc.ui.follow;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.hopefanc.R;
import com.example.hopefanc.ui.gallery.GalleryViewModel;


public class followfragment extends Fragment {


    private followViewModel followViewModel;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        followViewModel=
                new ViewModelProvider(this).get(followViewModel.class);
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_follow2, container, false);
        final WebView v = root.findViewById(R.id.gg);

        WebSettings s=v.getSettings();
        s.setJavaScriptEnabled(true);
        v.loadUrl("https://www.facebook.com/HopeforAllNationsChurch/");
        if(v.canGoBack()){
            super.onStart();
        }
        followViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}