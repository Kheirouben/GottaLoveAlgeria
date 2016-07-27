package net.boukhalfa.gottalovealgeria;

/**
 * Created by Hamza on 20/07/2016.
 */
public class AdsLoader {

    private int[] Picid ={

            R.drawable.pubcondor,
            R.drawable.oppo
            };

    public int LoadNewAd (){
        int imageId = (int)(Math.random() * Picid.length);
        return Picid[imageId];
    }
}
