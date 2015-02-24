package se.kth.csc.iprog.dinnerplanner.android.view;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import se.kth.csc.iprog.dinnerplanner.android.R;

/**
 * Created by Katrin on 2015-02-24.
 */
public class Welcome {

    View view;

    public Welcome(View view) {

        this.view = view;
        TextView textView = (TextView) view.findViewById(R.id.welcome_text);
        Button button = (Button) view.findViewById(R.id.welcome_button);

    }

}
