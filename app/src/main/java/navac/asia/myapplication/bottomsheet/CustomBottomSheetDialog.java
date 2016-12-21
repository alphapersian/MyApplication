package navac.asia.myapplication.bottomsheet;

/**
 * Created by DITOP on 12/13/2016.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import navac.asia.myapplication.R;

/**
 * Created by mayowa.adegeye on 28/06/2016.
 */
public class CustomBottomSheetDialog extends BottomSheetDialogFragment {
    public static CustomBottomSheetDialog getInstance() {
        return new CustomBottomSheetDialog();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_custom_bottom_sheet, container, false);
    }
}