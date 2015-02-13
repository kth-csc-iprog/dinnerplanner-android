package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;

/**
 * Created by Katrin on 2015-02-11.
 */
public class FinalCostAndPers {

    View view;
    DinnerModel model;

    public FinalCostAndPers(View view, DinnerModel model) {

        this.view = view;
        TextView totalCost = (TextView) view.findViewById(R.id.total_cost);
        TextView pers = (TextView) view.findViewById(R.id.pers);

        // The following solution of for loops is temporary, for testing the layout, since only two dishes exist right now.
        for (Dish dish : model.getDishesOfType(1)) {
            model.addDishToMenu(dish);
            break;
        }
        for (Dish dish : model.getDishesOfType(2)) {
            model.addDishToMenu(dish);
            break;
        }

        totalCost.setText("Total cost: " + model.getTotalMenuPrice() + " kr");
        // Temporary solution for layout demonstration
        model.setNumberOfGuests(4);
        pers.setText(model.getNumberOfGuests() + " pers");

    }

}
