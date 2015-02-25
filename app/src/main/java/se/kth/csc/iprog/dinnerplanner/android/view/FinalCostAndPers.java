package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.TextView;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;

/**
 * Created by Katrin on 2015-02-11.
 */
public class FinalCostAndPers {

    View view;
    DinnerModel model;
    TextView totalCost, pers;

    public FinalCostAndPers(View view, DinnerModel model) {

        this.view = view;
        this.model = model;

        totalCost = (TextView) view.findViewById(R.id.total_cost);
        pers = (TextView) view.findViewById(R.id.pers);

        totalCost.setText("Total cost: " + model.getTotalMenuPrice() + " kr");
        pers.setText(model.getNumberOfGuests() + " pers");

    }

}
