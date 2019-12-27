package com.softwindevs.admobdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class BannerAdsActivity extends AppCompatActivity {

    private AdView mAdBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner_ads);
        setTitle("Banner Ads Activity");

        //Admob Initialization
        MobileAds.initialize(this,getResources().getString(R.string.admob_ID));


        //banner ads
        mAdBanner = findViewById(R.id.banner_ad);
        //ads testing on emulator
       /* AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .addTestDevice("E78BA2D03F09DB23CB6F4A0ED07A0446") //note 4
                .build();*/
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdBanner.loadAd(adRequest);
    }

    public void interstitial_ads_activity(View view) {
        startActivity(new Intent(BannerAdsActivity.this,InterstitialAdsActivity.class));
    }
}
