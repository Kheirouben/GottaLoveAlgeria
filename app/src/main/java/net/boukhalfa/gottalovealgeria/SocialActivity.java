package net.boukhalfa.gottalovealgeria;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.VideoView;

public class SocialActivity extends AppCompatActivity {
    ListView myMenu;
    String[] Urls = {"https://www.facebook.com/GLAlgeria/", "https://www.instagram.com/Glalgeria/", "https://www.youtube.com/channel/UCsFlvi3vR8C5arZrkWDe9iQ", "https://plus.google.com/107886829269842043373/posts", "https://twitter.com/Glalgeria/"};
VideoView VideoHolder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
        myMenu = (ListView) findViewById(R.id.SocialMenu);
        MenuLoader();
        VideoHolder = (VideoView) findViewById(R.id.VideoHolder);
        VideoHolder.setVideoPath("android.resource://"+ getPackageName()+"/"+R.raw.video);
        VideoHolder.start();

        myMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Intent facebookIntent = new Intent(Intent.ACTION_VIEW);
                        facebookIntent.setData(Uri.parse(Urls[0]));
                        startActivity(facebookIntent);
                        break;
                    case 2:
                        Intent InstaIntent = new Intent(Intent.ACTION_VIEW);
                        InstaIntent.setData(Uri.parse(Urls[1]));
                        startActivity(InstaIntent);
                        break;
                    case 3:
                        Intent YoutubeIntent = new Intent(Intent.ACTION_VIEW);
                        YoutubeIntent.setData(Uri.parse(Urls[2]));
                        startActivity(YoutubeIntent);
                        break;
                    case 4:
                        Intent GooglePlus = new Intent(Intent.ACTION_VIEW);
                        GooglePlus.setData(Uri.parse(Urls[3]));
                        startActivity(GooglePlus);
                        break;
                    case 5:
                        Intent Twitter = new Intent(Intent.ACTION_VIEW);
                        Twitter.setData(Uri.parse(Urls[4]));
                        startActivity(Twitter);
                        break;
                    default:
                        Toast.makeText(SocialActivity.this, "just testing clieck", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }


    public void MenuLoader() {

        Menu Social_Menu[] = new Menu[]
                {
                        new Menu(R.drawable.ic_facebook, "GLA on Facebook", Urls[0]),
                        new Menu(R.drawable.ic_insta, "GLA on Instagram", Urls[1]),
                        new Menu(R.drawable.ic_youtube, "GLA Youtube Chanel", Urls[2]),
                        new Menu(R.drawable.ic_google, "GLA On Google+", Urls[3]),
                        new Menu(R.drawable.ic_twitter, "GLA On Twitter! ", Urls[4]),
                };

        MenuAdapter SocialMenuAdapter = new MenuAdapter(this,
                R.layout.listview_item_row, Social_Menu);

        View header = (View) getLayoutInflater().inflate(R.layout.listview_header_row, null);
        myMenu.addHeaderView(header);

        myMenu.setAdapter(SocialMenuAdapter);


    }
}
