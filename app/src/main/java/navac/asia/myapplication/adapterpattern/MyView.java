package navac.asia.myapplication.adapterpattern;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by DITOP on 12/12/2016.
 */

public class MyView implements ViewPresenter {

    MyViewAuthority  myViewAuthority  = new MyViewAuthority();

    @Override
    public void show(Context context, View view, ViewGroup parent) {
        myViewAuthority.append(context,view,parent);
    }
}
