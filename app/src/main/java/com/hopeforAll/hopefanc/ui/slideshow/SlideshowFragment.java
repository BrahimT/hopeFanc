package com.hopeforAll.hopefanc.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.hopeforAll.hopefanc.R;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;
    EditText e1;
    EditText  e2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);

        final WebView v= root.findViewById(R.id.web);
        WebSettings s=v.getSettings();
        s.setJavaScriptEnabled(true);
        v.loadUrl("https://us02web.zoom.us/j/4270696680?pwd=T0pkei9Vd0pDMDFtMjNCVmsvVGpodz09");
        if(v.canGoBack()){
            super.onStart();
        }

        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {


            }
        });
        return root;
    }


}

