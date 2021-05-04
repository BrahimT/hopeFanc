package com.hopeforAll.hopefanc.ui.contact;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.hopeforAll.hopefanc.R;


public class contact extends Fragment {


    private contactViewModel contactViewModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        contactViewModel =
                new ViewModelProvider(this).get(contactViewModel.class);
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_contact, container, false);
        final WebView v = root.findViewById(R.id.po);
        v.getSettings().setJavaScriptEnabled(true);

        v.loadUrl("file:///android_asset/website.html");
        contactViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }

}