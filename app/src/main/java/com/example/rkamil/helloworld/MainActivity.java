package com.example.rkamil.helloworld;

import com.inmobi.ads.InMobiAdRequest;
import com.inmobi.ads.InMobiBanner;
//import com.inmobi.banner.PlacementId;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.InMobiSdk.LogLevel;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private InMobiBanner mBanner;
    //private InMobiAdRequest mAdRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InMobiSdk.init(this, "6111d606d870421eaa6d1de3c3f231e3");

        mBanner = findViewById(R.id.banner);
        mBanner.load();
        InMobiSdk.setLogLevel(LogLevel.DEBUG);
    }
}

    //private InMobiAdRequest adRequest;
    //private InMobiBanner.BannerAdRequestListener bannerAdRequestListener;
    //private InMobiBanner mBannerAd;
    //private InMobiBanner PlacementId;

    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
      //  super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        //InMobiSdk.init(MainActivity.this, "6111d606d870421eaa6d1de3c3f231e3");

        //mBannerAd = new InMobiBanner(mBannerAd = (findViewById(R.id.banner);
        //InMobiAdRequest adRequest = new InMobiAdRequest(MainActivity.this,PlacementId.1527788588600);
        //InMobiBanner mBannerAd = findViewById(R.id.banner);
        //mBannerAd = new InMobiBanner(MainActivity.this, placementId.1527788588600);
        //mBannerAd.load();

    //}
//}
