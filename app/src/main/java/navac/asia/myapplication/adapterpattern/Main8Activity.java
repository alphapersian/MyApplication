package navac.asia.myapplication.adapterpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import navac.asia.myapplication.R;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        MyView myView = new MyView();

        View  v = LayoutInflater.from(getApplicationContext()).inflate(R.layout.new_app_widget2 , null);
        ViewGroup parent = (ViewGroup) LayoutInflater.from(getApplicationContext()).inflate(R.layout.activity_main8 , null);
        myView.show(getApplicationContext() ,v,parent);


    }
}
