package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.TextView;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;

/**
 * Created by Katrin on 2015-02-11.
 */
public class FinalInformationText {

    View view;
    DinnerModel model;
    TextView text, title;

    public FinalInformationText(View view, DinnerModel model) {

        this.view = view;
        this.model = model;

        text = (TextView) view.findViewById(R.id.information_text);
        title = (TextView) view.findViewById(R.id.information_title);

    }

}
