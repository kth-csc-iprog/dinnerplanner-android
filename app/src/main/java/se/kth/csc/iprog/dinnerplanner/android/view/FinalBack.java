package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.Button;
import se.kth.csc.iprog.dinnerplanner.android.R;

/**
 * Created by Katrin on 2015-02-12.
 */
public class FinalBack {

    View view;

    public FinalBack(View view) {

        this.view = view;
        Button button = (Button) view.findViewById(R.id.back_button);

    }

}
