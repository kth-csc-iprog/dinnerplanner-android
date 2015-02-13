package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;

import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;

/**
 * Created by Katrin on 2015-02-11.
 */
public class FinalFoodImages {

    View view;
    DinnerModel model;

    public FinalFoodImages(View view, DinnerModel model) {

        this.view = view;
        this.model = model;

        ImageButton ingredientsImage = (ImageButton) view.findViewById(R.id.ingredients_image);
        ImageButton starterImage = (ImageButton) view.findViewById(R.id.starter_image);
        ImageButton mainCourseImage = (ImageButton) view.findViewById(R.id.main_course_image);
        ImageButton dessertImage = (ImageButton) view.findViewById(R.id.dessert_image);
        TextView instructionsTitle = (TextView) view.findViewById(R.id.instructions_title);
        TextView starterTitle = (TextView) view.findViewById(R.id.starter_title);
        TextView mainCourseTitle = (TextView) view.findViewById(R.id.main_course_title);
        TextView dessertTitle = (TextView) view.findViewById(R.id.dessert_title);

        int drawableResIdIngredients = DinnerPlannerApplication.getDrawable(view.getContext(), "ingredients");
        ingredientsImage.setImageResource(drawableResIdIngredients);

        // The following solution of for loops is temporary, for testing the layout, since only two dishes exist right now.
        for (Dish dish : model.getDishesOfType(1)) {
            model.addDishToMenu(dish);
            break;
        }
        for (Dish dish : model.getDishesOfType(2)) {
            model.addDishToMenu(dish);
            break;
        }
        int drawableResIdStarter = DinnerPlannerApplication.getDrawable(view.getContext(), model.getSelectedDish(1).getImage());
        starterImage.setImageResource(drawableResIdStarter);
        int drawableResIdMainCourse = DinnerPlannerApplication.getDrawable(view.getContext(), model.getSelectedDish(2).getImage());
        mainCourseImage.setImageResource(drawableResIdMainCourse);

        starterTitle.setText(model.getSelectedDish(1).getName());
        mainCourseTitle.setText(model.getSelectedDish(2).getName());
        dessertTitle.setText("");

    }

}
