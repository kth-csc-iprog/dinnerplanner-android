package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.view.Welcome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class PageWelcome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_welcome);

        // Instantiate views
        Welcome welcome = new Welcome(findViewById(R.id.page_welcome_view_id));

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Activity2_MenuView.class);
        startActivity(intent);
        finish();
    }
}
