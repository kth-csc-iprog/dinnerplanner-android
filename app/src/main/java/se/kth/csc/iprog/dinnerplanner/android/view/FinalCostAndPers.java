package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.android.R;

/**
 * Created by Katrin on 2015-02-11.
 */
public class FinalCostAndPers {

    View view;

    public FinalCostAndPers(View view) {

        this.view = view;
        TextView totalCost = (TextView) view.findViewById(R.id.total_cost);
        TextView pers = (TextView) view.findViewById(R.id.pers);

    }

}
