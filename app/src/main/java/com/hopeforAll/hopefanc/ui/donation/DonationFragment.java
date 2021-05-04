package com.hopeforAll.hopefanc.ui.donation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hopeforAll.hopefanc.R;


public class DonationFragment extends Fragment {


    private donationViewModel donationViewModel;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        donationViewModel=
                new ViewModelProvider(this).get(donationViewModel.class);
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_donation3, container, false);
        Button buttonSayHi = (Button) root.findViewById(R.id.button77);

        Button b =root. findViewById(R.id.button78);
        Button c = root.findViewById(R.id.button8);
        Button d =root. findViewById(R.id.button9);
        Button e=root.findViewById(R.id.button6);

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse("https://www.rbcroyalbank.com/personal.html"));
                i5.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i5);

            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse("https://www.td.com/ca/en/personal-banking/solutions/cross-border-banking/?cm_sp=:GOOGLE:EN+-+CBB+-+Canada+-+Brand+(21_S_PB_PBB_AO_ACQ_EN_NAT):DIF:TD+US+Locations+-+BMM&gclid=Cj0KCQiA34OBBhCcARIsAG32uvOE2QvnzJ7X2Dh_qD3WhmNjKMZzg3mj0HPdQ5bc9CsGPKKqr4qu7ZYaAlPREALw_wcB&gclsrc=aw.ds"));
                i5.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i5);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse("https://www.nbc.ca/"));
                i5.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i5);

            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse("https://www.paypal.com/ca/for-you/account/create-account?kid=p55297049571&gclid=Cj0KCQiA34OBBhCcARIsAG32uvOTEV2tZL98IwPr3yDsLeRAZKkNBOkaQhaHaMCMRQ_MZL4qydZxew0aAviAEALw_wcB&gclsrc=aw.ds"));
                i5.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i5);

            }
        });
        buttonSayHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse("https://www.scotiabank.com/ca/en/personal/bank-accounts/chequing-accounts/preferred.html?cid=ps_fa17b8d0268388d96f0703a79891ec94dd8c3794&gclid=Cj0KCQiA34OBBhCcARIsAG32uvPCGBopdyDKQWHaL8QMc6PvaBXUzisaC-lN72mluh5rHbz-h7Ha3TEaAv9xEALw_wcB&gclsrc=aw.ds"));
                i5.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i5);
            }
        });
            donationViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }
}