package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageButton;

import se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;

/**
 * Created by Katrin on 2015-02-11.
 */
public class FinalFoodImages {

    View view;
    DinnerModel model;
    ImageButton ingredientsImage, starterImage, mainCourseImage, dessertImage;
    ImageView ingredientsImageBorder, starterImageBorder, mainCourseImageBorder, dessertImageBorder;
    TextView instructionsTitle, starterTitle, mainCourseTitle, dessertTitle;

    public FinalFoodImages(View view, DinnerModel model) {

        this.view = view;
        this.model = model;

        ingredientsImage = (ImageButton) view.findViewById(R.id.ingredients_image);
        starterImage = (ImageButton) view.findViewById(R.id.starter_image);
        mainCourseImage = (ImageButton) view.findViewById(R.id.main_course_image);
        dessertImage = (ImageButton) view.findViewById(R.id.dessert_image);

        ingredientsImageBorder = (ImageView) view.findViewById(R.id.ingredients_image_border);
        starterImageBorder = (ImageView) view.findViewById(R.id.starter_image_border);
        mainCourseImageBorder = (ImageView) view.findViewById(R.id.main_course_image_border);
        dessertImageBorder = (ImageView) view.findViewById(R.id.dessert_image_border);

        instructionsTitle = (TextView) view.findViewById(R.id.instructions_title);
        starterTitle = (TextView) view.findViewById(R.id.starter_title);
        mainCourseTitle = (TextView) view.findViewById(R.id.main_course_title);
        dessertTitle = (TextView) view.findViewById(R.id.dessert_title);

        int drawableResIdIngredients = DinnerPlannerApplication.getDrawable(view.getContext(), "ingredients");
        ingredientsImage.setImageResource(drawableResIdIngredients);

    }

    public void setupImageAndTitle(String image, ImageButton button) {
        int drawableResId = DinnerPlannerApplication.getDrawable(view.getContext(), image);
        button.setImageResource(drawableResId);
    }

    public void setupImageBorder(int type) {
        ingredientsImageBorder.setVisibility(View.INVISIBLE);
        starterImageBorder.setVisibility(View.INVISIBLE);
        mainCourseImageBorder.setVisibility(View.INVISIBLE);
        dessertImageBorder.setVisibility(View.INVISIBLE);
        if (type == 0) {
            ingredientsImageBorder.setVisibility(View.VISIBLE);
        } else if (type == 1) {
            starterImageBorder.setVisibility(View.VISIBLE);
        } else if (type == 2) {
            mainCourseImageBorder.setVisibility(View.VISIBLE);
        } else if (type == 3) {
            dessertImageBorder.setVisibility(View.VISIBLE);
        }
    }

}
