package net.boukhalfa.gottalovealgeria;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    //Main picture holder class
    PictureLoader myPictureLoader;
    // ads loader class
    AdsLoader myAdsLoader;
    //Listview
    ListView myMenu;
    ImageView mainPicture;
    ImageView adholder;
    private static final int NotificID = 01;
    NotificationManager notificationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Loading Gotta love algeria picture holder with random photo
        mainPicture = (ImageView) findViewById(R.id.MainScreenPic);
        myPictureLoader = new PictureLoader();
        mainPicture.setImageResource(myPictureLoader.LoadNewPic());

        Menu Menu_data[] = new Menu[]
                {
                        new Menu(R.drawable.ic_gift, getString(R.string.SurpriseTitle), getString(R.string.SurpriseDesc)),
                        new Menu(R.drawable.ic_searche, getString(R.string.HotelSearchTitle),getString(R.string.HotelSearchDesc)),
                        new Menu(R.drawable.ic_network, getString(R.string.FollowUsTitle),getString(R.string.FollowUsDesc)),
                        new Menu(R.drawable.ic_partner, getString(R.string.PartnerTitle),getString(R.string.PartnerDesc)),
                        new Menu(R.drawable.ic_message, getString(R.string.BukalatTitle),getString(R.string.BukalatDesc)),
                };

        MenuAdapter adapter = new MenuAdapter(this,
                R.layout.listview_item_row, Menu_data);


        myMenu = (ListView) findViewById(R.id.menuList);

        View header = (View) getLayoutInflater().inflate(R.layout.listview_header_row, null);
        myMenu.addHeaderView(header);
        //Loading offline ads holder with a photo
        adholder = (ImageView) findViewById(R.id.adholder);
        myAdsLoader = new AdsLoader();
        adholder.setImageResource(myAdsLoader.LoadNewAd());
        myMenu.setAdapter(adapter);

        myMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent in1 = new Intent(MainActivity.this, CommentActivity.class);
                        startActivity(in1);
                        break;
                    case 2:
                        Intent info = new Intent(MainActivity.this, info.class);
                        startActivity(info);
                        Log.d("gottalove","ok intent wasis passed");
                        break;
                    case 3:
                        Intent socialactivity = new Intent(MainActivity.this, SocialActivity.class);
                        startActivity(socialactivity);
                        break;
                    case 4:
                        break;
                    case 5:
                        Intent bukalaIntent = new Intent(MainActivity.this, Bukalat.class);
                        startActivity(bukalaIntent);
                        break;
                        default:
                            Toast.makeText(MainActivity.this, "nth was clicked", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }

    public void LoadNewAd(View v) {
        adholder.setImageResource(myAdsLoader.LoadNewAd());
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        addNotification();
    }

    private void addNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
        builder.setContentTitle("20% Promotion Chez Condor");
        builder.setContentInfo("check out the new promotion from Condor Mobile up to 50% of discounts");
        builder.setSmallIcon(R.drawable.ic_notification);
        builder.setTicker("Update from Gotta Love Algeria");
        notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, builder.build());
    }

}
