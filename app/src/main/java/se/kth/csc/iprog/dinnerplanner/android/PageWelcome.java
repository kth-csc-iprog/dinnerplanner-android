package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.util.SystemUiHider;
import se.kth.csc.iprog.dinnerplanner.android.view.WelcomeButton;
import se.kth.csc.iprog.dinnerplanner.android.view.WelcomeText;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;


public class PageWelcome extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_welcome);

        // Instantiate views
        WelcomeText welcomeText = new WelcomeText(findViewById(R.id.page_welcome_view_id));
        WelcomeButton welcomeButton = new WelcomeButton(findViewById(R.id.page_welcome_view_id));

    }

}
