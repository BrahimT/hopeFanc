package com.hopeforAll.hopefanc.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.hopeforAll.hopefanc.R;

public class GalleryFragment extends Fragment {
    private com.hopeforAll.hopefanc.ui.follow.followViewModel followViewModel;
    private GalleryViewModel GalleryViewModel;
    ViewFlipper a;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        GalleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);


        a = root.findViewById(R.id.fliper);
        int image[] = {R.drawable.h, R.drawable.li, R.drawable.op, R.drawable.opi, R.drawable.peter
                , R.drawable.pi, R.drawable.pw, R.drawable.rp, R.drawable.sss, R.drawable.tt, R.drawable.tu, R.drawable.up,
                R.drawable.vb, R.drawable.w, R.drawable.wp, R.drawable.www, R.drawable.wwwwww,
                R.drawable.yt, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h,
                R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h,
                R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h,
                R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h, R.drawable.h};

        for (int o : image) {
            fliper(o);
        }


        GalleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }

    private void fliper(int image) {
        ImageView imageView = new ImageView(getContext());
        imageView.setBackgroundResource(image);

        a.addView(imageView);
        a.setFlipInterval(1000 * 4);
        a.setAutoStart(true);

        a.setInAnimation(getContext(), android.R.anim.slide_in_left);
        a.setOutAnimation(getContext(), android.R.anim.slide_out_right);

    }
}