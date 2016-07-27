package net.boukhalfa.gottalovealgeria;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bukalat extends AppCompatActivity {
    ImageView BukalaLoader;
    TextView BukalaText, profileNameHolder;
    AdView adsHolder;
    int adsCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bukalat);

        BukalaLoader = (ImageView) findViewById(R.id.BukalaLoader);
        BukalaText = (TextView) findViewById(R.id.BukalaText);
        profileNameHolder = (TextView) findViewById(R.id.profilenameholder);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "font/naskh.ttf");
        Typeface arabictypeface = Typeface.createFromAsset(getAssets(), "font/arabic.ttf");
        profileNameHolder.setTypeface(arabictypeface);
        BukalaText.setTypeface(typeface);
        adsHolder = (AdView) findViewById(R.id.adView);
       BukalaLoader.performClick();
        Toast.makeText(Bukalat.this, "You have :" + readTextFileAsList(this, R.raw.boukalat).size() + " of bukalat .", Toast.LENGTH_SHORT).show();
    }

    public void LoadNewBukala(View view) {

        int id = (int) (Math.random() * readTextFileAsList(this, R.raw.boukalat).size());
        BukalaText.setText(readTextFileAsList(this, R.raw.boukalat).get(id));
        loadNewGoogleAd();
        Log.d("anmiation crasher ","Animation crasher");
        AnimationDrawable frameAnimation = (AnimationDrawable) BukalaLoader.getBackground();
       frameAnimation.start();
        Log.d("anmiation crasher ","fully animated");
    }


    public static List<String> readTextFileAsList(Context context, int resId) {

        InputStream inputStream = context.getResources().openRawResource(resId);

        InputStreamReader inputreader = new InputStreamReader(inputStream);
        BufferedReader bufferedreader = new BufferedReader(inputreader);
        String line;
        List<String> list = new ArrayList<String>();
        try {
            while ((line = bufferedreader.readLine()) != null) {
                list.add(line.replaceAll("\\d", ""));
            }
        } catch (IOException e) {
            return null;
        }
        return list;
    }

    public void loadNewGoogleAd() {
        adsCounter++;
        if (adsCounter >= 10) {
            Intent adsintent = new Intent(this, Adsact.class);
            startActivity(adsintent);
            adsCounter =0;
        }
            else {
                AdRequest adRequest = new AdRequest.Builder()
                        .build();
                adsHolder.loadAd(adRequest);

            }
        }
    }


