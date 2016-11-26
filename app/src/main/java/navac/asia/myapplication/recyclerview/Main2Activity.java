package navac.asia.myapplication.recyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import navac.asia.myapplication.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        RecyclerView view = (RecyclerView) findViewById(R.id.mylist);
        assert view != null;
        view.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


        List<RecycleItem> items = new ArrayList<>();
        items.add(new RecycleItem("ahmad", "ahmademosavi@gmail.com", R.mipmap.ic_launcher));
        items.add(new RecycleItem("kazem", "ahmademosavi@gmail.com", R.mipmap.ic_launcher));
        items.add(new RecycleItem("sara", "ahmademosavi@gmail.com", R.mipmap.ic_launcher));
        items.add(new RecycleItem("ahmad", "ahmademosavi@gmail.com", R.mipmap.ic_launcher));
        items.add(new RecycleItem("ahmad", "ahmademosavi@gmail.com", R.mipmap.ic_launcher));
        items.add(new RecycleItem("ahmad", "ahmademosavi@gmail.com", R.mipmap.ic_launcher));
        items.add(new RecycleItem("ahmad", "ahmademosavi@gmail.com", R.mipmap.ic_launcher));


        RecyclerAdapter adapter = new RecyclerAdapter(items, getApplicationContext());
        view.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
