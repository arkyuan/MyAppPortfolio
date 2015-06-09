package app.com.ark.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifystreamer(View view) {
        Toast.makeText(getApplicationContext(),"This button will launch my spotify streamer app!",Toast.LENGTH_LONG).show();
    }

    public void scores(View view) {
        Toast.makeText(getApplicationContext(),"This button will launch my scores app!",Toast.LENGTH_LONG).show();
    }

    public void library(View view) {
        Toast.makeText(getApplicationContext(),"This button will launch my library app!",Toast.LENGTH_LONG).show();
    }

    public void buildbigger(View view) {
        Toast.makeText(getApplicationContext(),"This button will launch my build it bigger app!",Toast.LENGTH_LONG).show();
    }

    public void xyzReader(View view) {
        Toast.makeText(getApplicationContext(),"This button will launch my XYZ reader app!",Toast.LENGTH_LONG).show();
    }

    public void myownapp(View view) {
        Toast.makeText(getApplicationContext(),"This button will launch my capstone app!",Toast.LENGTH_LONG).show();
    }
}
