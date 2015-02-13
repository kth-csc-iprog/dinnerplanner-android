package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.TextView;
import se.kth.csc.iprog.dinnerplanner.android.R;

/**
 * Created by Katrin on 2015-02-11.
 */
public class WelcomeText {

    View view;

    public WelcomeText(View view) {

        this.view = view;
        TextView textView = (TextView) view.findViewById(R.id.welcome_text);

    }

}
