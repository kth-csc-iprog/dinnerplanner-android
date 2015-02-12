package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;
import se.kth.csc.iprog.dinnerplanner.android.R;

/**
 * Created by Katrin on 2015-02-11.
 */
public class FinalFoodImages {

    View view;

    public FinalFoodImages(View view) {

        this.view = view;
        ImageButton ingredientsImage = (ImageButton) view.findViewById(R.id.ingredients_image);
        ImageButton starterImage = (ImageButton) view.findViewById(R.id.starter_image);
        ImageButton mainCourseImage = (ImageButton) view.findViewById(R.id.main_course_image);
        ImageButton dessertImage = (ImageButton) view.findViewById(R.id.dessert_image);
        TextView instructionsTitle = (TextView) view.findViewById(R.id.instructions_title);
        TextView starterTitle = (TextView) view.findViewById(R.id.starter_title);
        TextView mainCourseTitle = (TextView) view.findViewById(R.id.main_course_title);
        TextView dessertTitle = (TextView) view.findViewById(R.id.dessert_title);

    }

}
