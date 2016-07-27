package net.boukhalfa.gottalovealgeria;

/**
 * Created by Hamza on 20/07/2016.
 */
public class PictureLoader {

    private int[] Picid ={
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
           };

    public int LoadNewPic (){
        int imageId = (int)(Math.random() * Picid.length);
        return Picid[imageId];
   }
}
