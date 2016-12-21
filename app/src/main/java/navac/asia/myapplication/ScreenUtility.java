package navac.asia.myapplication;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

/**
 * Created by Android2 on 19/10/2016.
 */

public class ScreenUtility  {
    private Activity activity;
    private float dpWidth;
    private float dpHeight;

    public ScreenUtility(Activity activity) {
        this.activity = activity;

        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float density = activity.getResources().getDisplayMetrics().density;
        dpHeight = outMetrics.heightPixels;
        dpWidth = outMetrics.widthPixels;
    }

    public float getWidth() {
        return dpWidth;
    }

    public float getHeight() {
        return dpHeight;
    }
}
