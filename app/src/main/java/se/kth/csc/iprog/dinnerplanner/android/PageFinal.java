package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.util.SystemUiHider;
import se.kth.csc.iprog.dinnerplanner.android.view.FinalBack;
import se.kth.csc.iprog.dinnerplanner.android.view.FinalCostAndPers;
import se.kth.csc.iprog.dinnerplanner.android.view.FinalFoodImages;
import se.kth.csc.iprog.dinnerplanner.android.view.FinalInformationText;
import se.kth.csc.iprog.dinnerplanner.android.view.FinalPageController;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
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
        DinnerModel model = ((DinnerPlannerApplication) this.getApplication()).getModel();
        setContentView(R.layout.activity_page_final);

        // Instantiate views
        FinalCostAndPers finalCostAndPers = new FinalCostAndPers(findViewById(R.id.page_final_view_id), model);
        FinalFoodImages finalFoodImages = new FinalFoodImages(findViewById(R.id.page_final_view_id), model);
        FinalInformationText finalInformationText = new FinalInformationText(findViewById(R.id.page_final_view_id), model);
        FinalBack finalBack = new FinalBack(findViewById(R.id.page_final_view_id));

        FinalPageController finalPageController = new FinalPageController(model, finalFoodImages, finalInformationText);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Activity2_MenuView.class);
        startActivity(intent);
        finish();
    }

}
