package app.com.ark.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void spotifystreamer(View view) {

        //stop any previous toast
        if(mAppToast!=null){
            mAppToast.cancel();
        }

        //Make and display new toast
        mAppToast = Toast.makeText(getApplicationContext(),"This button will launch my spotify streamer app!",Toast.LENGTH_LONG);
        mAppToast.show();
    }

    public void scores(View view) {

        //stop any previous toast
        if(mAppToast!=null){
            mAppToast.cancel();
        }

        //Make and display new toast
        mAppToast = Toast.makeText(getApplicationContext(),"This button will launch my scores app!",Toast.LENGTH_LONG);
        mAppToast.show();
    }

    public void library(View view) {

        //stop any previous toast
        if(mAppToast!=null){
            mAppToast.cancel();
        }

        //Make and display new toast
        mAppToast = Toast.makeText(getApplicationContext(),"This button will launch my library app!",Toast.LENGTH_LONG);
        mAppToast.show();
    }

    public void buildbigger(View view) {

        //stop any previous toast
        if(mAppToast!=null){
            mAppToast.cancel();
        }

        //Make and display new toast
        mAppToast = Toast.makeText(getApplicationContext(),"This button will launch my build it bigger app!",Toast.LENGTH_LONG);
        mAppToast.show();
    }

    public void xyzReader(View view) {

        //stop any previous toast
        if(mAppToast!=null){
            mAppToast.cancel();
        }

        //Make and display new toast
        mAppToast = Toast.makeText(getApplicationContext(),"This button will launch my XYZ reader app!",Toast.LENGTH_LONG);
        mAppToast.show();
    }

    public void myownapp(View view) {

        //stop any previous toast
        if(mAppToast!=null){
            mAppToast.cancel();
        }

        //Make and display new toast
        mAppToast = Toast.makeText(getApplicationContext(),"This button will launch my capstone app!",Toast.LENGTH_LONG);
        mAppToast.show();
    }
}
