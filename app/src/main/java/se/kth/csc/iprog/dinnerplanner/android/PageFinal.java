package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.util.SystemUiHider;
import se.kth.csc.iprog.dinnerplanner.android.view.AppTitle;
import se.kth.csc.iprog.dinnerplanner.android.view.FinalBack;
import se.kth.csc.iprog.dinnerplanner.android.view.FinalCostAndPers;
import se.kth.csc.iprog.dinnerplanner.android.view.FinalFoodImages;
import se.kth.csc.iprog.dinnerplanner.android.view.FinalInformationText;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;


public class PageFinal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_final);

        // Instantiate views
        AppTitle appTitle = new AppTitle(findViewById(R.id.page_final_view_id));
        FinalCostAndPers finalCostAndPers = new FinalCostAndPers(findViewById(R.id.page_final_view_id));
        FinalFoodImages finalFoodImages = new FinalFoodImages(findViewById(R.id.page_final_view_id));
        FinalInformationText finalInformationText = new FinalInformationText(findViewById(R.id.page_final_view_id));
        FinalBack finalBack = new FinalBack(findViewById(R.id.page_final_view_id));

    }


}
