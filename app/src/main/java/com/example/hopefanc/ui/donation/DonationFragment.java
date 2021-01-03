package com.example.hopefanc.ui.donation;

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

import com.example.hopefanc.R;
import com.example.hopefanc.ui.follow.followViewModel;


public class DonationFragment extends Fragment {


    private donationViewModel donationViewModel;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        donationViewModel=
                new ViewModelProvider(this).get(donationViewModel.class);
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_donation3, container, false);
        final WebView v= root.findViewById(R.id.t);
        v.getSettings().setJavaScriptEnabled(true);
        v.loadUrl("file:///android_asset/donation.html");
        donationViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}