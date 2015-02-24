package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;

import se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Ingredient;

/**
 * Created by Katrin on 2015-02-24.
 */
public class FinalPageController implements View.OnClickListener {
    DinnerModel model;
    FinalFoodImages imagesView;
    FinalInformationText textView;

    public FinalPageController(DinnerModel model, FinalFoodImages imagesView, FinalInformationText textView) {
        this.model = model;
        this.imagesView = imagesView;
        this.textView = textView;

        imagesView.ingredientsImage.setOnClickListener(this);
        imagesView.starterImage.setOnClickListener(this);
        imagesView.mainCourseImage.setOnClickListener(this);
        imagesView.dessertImage.setOnClickListener(this);

        setupImages();
        chooseIngredients();
    }

    @Override
    public void onClick(View v) {
        if (v == imagesView.ingredientsImage) {
            chooseIngredients();
        } else if ((v == imagesView.starterImage) && (model.getSelectedDish(1) != null)) {
            imagesView.setupImageBorder(1);
            setTitleAndText("Starter", model.getSelectedDish(1).getDescription());
        } else if ((v == imagesView.mainCourseImage) && (model.getSelectedDish(2) != null)) {
            imagesView.setupImageBorder(2);
            setTitleAndText("Main Course", model.getSelectedDish(2).getDescription());
        } else if ((v == imagesView.dessertImage) && (model.getSelectedDish(3) != null)) {
            imagesView.setupImageBorder(3);
            setTitleAndText("Dessert", model.getSelectedDish(3).getDescription());
        }
    }

    private void chooseIngredients() {
        StringBuilder str = new StringBuilder();
        for (Ingredient ingredient : model.getAllIngredients()) {
            str.append(ingredient.getName() + " " + ingredient.getQuantity() + " " + ingredient.getUnit() + "\n");
        }
        imagesView.setupImageBorder(0);
        setTitleAndText("Ingredients", str.toString());
    }

    private void setTitleAndText(String title, String text) {
        textView.title.setText(title);
        textView.text.setText(text);
    }

    private void setupImages() {
        if (model.getSelectedDish(1) != null) {
            imagesView.setupImageAndTitle(model.getSelectedDish(1).getImage(), imagesView.starterImage);
            imagesView.starterTitle.setText(model.getSelectedDish(1).getName());
        }
        if (model.getSelectedDish(2) != null) {
            imagesView.setupImageAndTitle(model.getSelectedDish(2).getImage(), imagesView.mainCourseImage);
            imagesView.mainCourseTitle.setText(model.getSelectedDish(2).getName());
        }
        if (model.getSelectedDish(3) != null) {
            imagesView.setupImageAndTitle(model.getSelectedDish(3).getImage(), imagesView.dessertImage);
            imagesView.dessertTitle.setText(model.getSelectedDish(3).getName());
        }
    }
}
