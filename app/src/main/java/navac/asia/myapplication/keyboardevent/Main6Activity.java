package navac.asia.myapplication.keyboardevent;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import navac.asia.myapplication.R;

public class Main6Activity extends AppCompatActivity {

    private static final String TAG ="Main6Activity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


    }



    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Log.d(TAG, "onConfigurationChanged: "+newConfig.keyboardHidden);
        // Checks whether a hardware keyboard is available

        if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_NO) {
            Log.d(TAG, "onConfigurationChanged: HARDKEYBOARDHIDDEN_NO");
        } else if (newConfig.keyboardHidden == Configuration.KEYBOARDHIDDEN_YES) {
            Log.d(TAG, "onConfigurationChanged: HARDKEYBOARDHIDDEN_YES");
        }
    }
}
