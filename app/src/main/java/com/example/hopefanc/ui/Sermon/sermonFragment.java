package com.example.hopefanc.ui.Sermon;

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

/**
 * A simple {@link Fragment} subclass.

 * create an instance of this fragment.
 */
public class sermonFragment extends Fragment {

    private sermonViewModel sermonViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        sermonViewModel =
                new ViewModelProvider(this).get(sermonViewModel.class);
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_sermon, container, false);
        final WebView v = root.findViewById(R.id.o);
        WebSettings s=v.getSettings();
        s.setJavaScriptEnabled(true);
        v.loadUrl("httpS://www.youtube.com/channel/UCKagqhu3wBgvAVXJfoOMdGQ/videos");
if(v.canGoBack()){
    super.onStart();
}
        sermonViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }

}