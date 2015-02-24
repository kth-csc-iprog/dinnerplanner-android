package se.kth.csc.iprog.dinnerplanner.android.view;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication;
import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;

public class MenuView implements Observer {

    View view = null;
    DinnerModel model = null;

    //total price field
    TextView price = (TextView) view.findViewById(R.id.txtPrice);
    //guest field
    EditText guests = (EditText) view.findViewById(R.id.txtNumberOfGuests);

    LinearLayout Starter;
    LinearLayout MainCourse;
    LinearLayout Dessert;

    Context context;

    public MenuView(View view, DinnerModel model) {

        this.view = view;
        this.model = model;
        context = this.view.getContext();

        //register view to model as observer
        model.addObserver(this);

        //set default guest number
        guests.setText(String.valueOf(model.getNumberOfGuests()));

        //set total price field
        updateCost();

        //load pictures
        //baked brie
        ImageButton d1 = (ImageButton) view.findViewById(R.id.imgStarter1);
        int ResId = DinnerPlannerApplication.getDrawable(view.getContext(), "bakedbrie");
        d1.setImageResource(ResId);

        //sourdough
        ImageButton d2 = (ImageButton) view.findViewById(R.id.imgStarter2);
        int ResId2 = DinnerPlannerApplication.getDrawable(view.getContext(), "sourdough");
        d2.setImageResource(ResId2);

        //toast
        ImageButton d3 = (ImageButton) view.findViewById(R.id.imgStarter3);
        int ResId3 = DinnerPlannerApplication.getDrawable(view.getContext(), "toast");
        d3.setImageResource(ResId3);

        //Meatballs
        ImageButton d4 = (ImageButton) view.findViewById(R.id.imgMain1);
        int ResId4 = DinnerPlannerApplication.getDrawable(view.getContext(), "meatballs");
        d4.setImageResource(ResId4);

        //Ice Cream
        ImageButton d5 = (ImageButton) view.findViewById(R.id.imgDessert1);
        int ResId5 = DinnerPlannerApplication.getDrawable(view.getContext(), "icecream");
        d5.setImageResource(ResId5);

        // Add dishes to Starter/ Main/ Dessert list accordingly
        //Starter = (LinearLayout) view.findViewById(R.id.Starter);
        //MainCourse = (LinearLayout) view.findViewById(R.id.MainCourse);
        //Dessert = (LinearLayout) view.findViewById(R.id.Dessert);

  /*      Set<Dish> allDishes = model.getDishes();
        for (Dish d : allDishes) {
            if (d.getType() == Dish.STARTER)
            {
                ItemView item = new ItemView(context, d);
                Starter.addView(item);
            }
            else if (d.getType() == Dish.MAIN)
            {
                ItemView item = new ItemView(context, d);
                MainCourse.addView(item);
            }
            else if (d.getType() == Dish.DESERT)
            {
                ItemView item = new ItemView(context, d);
                Dessert.addView(item);
            }



        }*/
    }
    public void update(Observable o, Object updatedItem) {

            DinnerModel model = (DinnerModel) o;
            //check if dish changed
            if (updatedItem instanceof Dish)
            {
                Dish changedDish = (Dish) updatedItem;
                //change dish in model
                model.selectDish(changedDish);
            }
            //check if guests changed
            else if(updatedItem instanceof TextView)
            {
                //change guests in model
                model.setNumberOfGuests(Integer.parseInt(guests.getText().toString()));
            }

       /*         if(changedList != null){
                    //Unhightlight all dishes
                    //Highlight selected dishes
                    for (int i = 0; i < changedList.getChildCount(); i++) {
                        DishItemView eachDishView = (DishItemView) changedList.getChildAt(i);
                        if(eachDishView.dish != selectedDish){
                            eachDishView.setHighlight(false);
                        }
                    }
                }*/

            
        //update price
        this.updateCost();
    }
    //TODO: update cost

public void updateCost() {
    price.setText(String.valueOf(model.getTotalMenuPrice()));
}

    //TODO: display popup
    //TODO: Highlighting items
    //TODO: Make Controllers




}