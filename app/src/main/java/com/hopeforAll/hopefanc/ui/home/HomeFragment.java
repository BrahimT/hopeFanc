package com.hopeforAll.hopefanc.ui.home;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.hopeforAll.hopefanc.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final WebView v= root.findViewById(R.id.webview);
        v.getSettings().setJavaScriptEnabled(true);
        v.loadUrl("file:///android_asset/gospel.html");
        final VideoView v1= root.findViewById(R.id.videoView);
        MediaController mc= new MediaController(getActivity());
        String path="android.resource://"+getActivity().getPackageName()+"/"+R.raw.churchh;
        v1.setVideoURI(Uri.parse(path));
        v1.setMediaController(mc);
        v1.start();



        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}