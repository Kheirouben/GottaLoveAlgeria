package net.boukhalfa.gottalovealgeria;


import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


public class CommentActivity extends AppCompatActivity {
ImageButton commentLoader;
    TextView commentHolder, profileHolder;
    CommentManager myCommentManager;

    //int id = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        commentLoader = (ImageButton) findViewById(R.id.commentloader);
        commentHolder= (TextView)findViewById(R.id.textView);
        myCommentManager = new CommentManager();
        profileHolder = (TextView)findViewById(R.id.profilenameholder);
        Typeface newTypeFace = Typeface.createFromAsset(getAssets(),"font/myfont.ttf");
        profileHolder.setTypeface(newTypeFace);
   Loadcomment();


    }

  public void LoadNewComment(View view){

      int id = (int) (Math.random() * 106);
     Log.d("Crash log :", "id is : " + id );
      Log.d("Crash log :", "crashing comment is : " + myCommentManager.getNewComment(id));
     //Toast.makeText(CommentActivity.this, "id is : " + id +" Total array length is : "+ myCommentManager.getTotalComment() + "Comment is : "+myCommentManager.getNewComment(id) , Toast.LENGTH_SHORT).show();
      commentHolder.setText(myCommentManager.getNewComment(id));
      profileHolder.setText(myCommentManager.getNewProfile(id));


  }

    public void Loadcomment(){

        int id = (int) (Math.random() * 106);
        commentHolder.setText(myCommentManager.getNewComment(id));
        profileHolder.setText(myCommentManager.getNewProfile(id));

    }
}
