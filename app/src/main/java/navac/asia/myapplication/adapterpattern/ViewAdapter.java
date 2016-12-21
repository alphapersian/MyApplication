package navac.asia.myapplication.adapterpattern;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by DITOP on 12/12/2016.
 */

public class ViewAdapter implements ViewPresenter{
    Context context;
    View view;

    public ViewAdapter(Context context, View view) {
        this.context = context;
        this.view = view;
    }

    @Override
    public void show(Context context, View view, ViewGroup parent) {

    }
}
