package navac.asia.myapplication.adapterpattern;

import android.content.Context;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.view.ViewGroup.LayoutParams;
import android.widget.Toast;

import navac.asia.myapplication.R;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

/**
 * Created by DITOP on 12/12/2016.
 */

public class MyViewAuthority {

    private View view = null;
    private Context mContext;
    private PopupWindow mPopupWindow;

    public MyViewAuthority() {
    }

    public void append(Context context, View view, ViewGroup parent) {
        this.view = view;
        this.mContext = context;


//        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(LAYOUT_INFLATER_SERVICE);

        View customView = view;

        mPopupWindow = new PopupWindow(
                customView,
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT
        );

        if (Build.VERSION.SDK_INT >= 21) {
            mPopupWindow.setElevation(5.0f);
        }



        mPopupWindow = new PopupWindow(
                customView,
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT
        );

        if (Build.VERSION.SDK_INT >= 21) {
            mPopupWindow.setElevation(5.0f);
        }




//        mPopupWindow.showAtLocation(parent, Gravity.CENTER, 0, 0);
        Toast.makeText(context, "hiiiiiiiiiiiiii", Toast.LENGTH_SHORT).show();

    }


}
