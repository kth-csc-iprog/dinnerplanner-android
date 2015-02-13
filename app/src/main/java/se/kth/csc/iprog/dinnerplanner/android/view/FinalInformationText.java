package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;

/**
 * Created by Katrin on 2015-02-11.
 */
public class FinalInformationText {

    View view;
    DinnerModel model;

    public FinalInformationText(View view, DinnerModel model) {

        this.view = view;
        TextView text = (TextView) view.findViewById(R.id.information_text);
        TextView title = (TextView) view.findViewById(R.id.information_title);

        // The following solution of for loops is temporary, for testing the layout, since only two dishes exist right now.
        for (Dish dish : model.getDishesOfType(1)) {
            model.addDishToMenu(dish);
            break;
        }
        for (Dish dish : model.getDishesOfType(2)) {
            model.addDishToMenu(dish);
            break;
        }
        StringBuilder str = new StringBuilder();
        for (Ingredient ingredient : model.getAllIngredients()) {
            str.append(ingredient.getName() + "\t" + ingredient.getQuantity() + ingredient.getUnit() + "\n");
        }
        text.setText(str.toString());
        title.setText("Ingredients");

    }

}
