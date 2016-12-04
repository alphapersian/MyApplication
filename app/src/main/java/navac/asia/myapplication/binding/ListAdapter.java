package navac.asia.myapplication.binding;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import navac.asia.myapplication.R;
import navac.asia.myapplication.databinding.RecyclerItemBinding;

/**
 * Created by DITOP on 12/4/2016.
 */

public class ListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {



    List<Main5Activity.Person> items ;

    public ListAdapter(List<Main5Activity.Person> items) {
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, null, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyHolder h = (MyHolder) holder;
        h.getB().setItem(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private class MyHolder extends RecyclerView.ViewHolder {

        RecyclerItemBinding b;

        public MyHolder(View itemView) {
            super(itemView);
            b = DataBindingUtil.bind(itemView);
        }

        public RecyclerItemBinding getB() {
            return b;
        }
    }

}
