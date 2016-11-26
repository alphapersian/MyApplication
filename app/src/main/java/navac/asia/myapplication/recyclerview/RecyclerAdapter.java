package navac.asia.myapplication.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import navac.asia.myapplication.R;

/**
 * Created by DITOP on 11/15/2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<RecycleItem> items;
    Context mContext;

    public RecyclerAdapter(List<RecycleItem> items, Context mContext) {
        this.items = items;
        this.mContext = mContext;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyHolder h = (MyHolder) holder;
        h.view1.setText(items.get(position).getName());
        h.view2.setText(items.get(position).getEmail());
        h.imageView.setImageResource(items.get(position).getImageSource());

    }

    @Override
    public int getItemCount() {
        return 10;
    }


    class MyHolder extends RecyclerView.ViewHolder {

        TextView view1;
        TextView view2;
        ImageView imageView;


        public MyHolder(View v) {
            super(v);
            view1 = (TextView) v.findViewById(R.id.textView3);
            view2 = (TextView) v.findViewById(R.id.textView2);
            imageView = (ImageView) v.findViewById(R.id.imageView);
        }
    }
}

