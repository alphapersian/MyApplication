package navac.asia.myapplication.binding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;

import java.util.ArrayList;
import java.util.List;

import navac.asia.myapplication.R;
import navac.asia.myapplication.databinding.ActivityMain5Binding;


public class Main5Activity extends AppCompatActivity {


    ActivityMain5Binding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b= DataBindingUtil.setContentView(this, R.layout.activity_main5);

        b.setPerson(new Person("ahmad" ,"mosavi", "i am new in android " , ResourcesCompat.getDrawable(getResources(),R.drawable.example_appwidget_preview,null)));
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("ahmad" ,"mosavi", "i am new in android " , ResourcesCompat.getDrawable(getResources(),R.drawable.example_appwidget_preview,null)));
        persons.add(new Person("kazem" ,"khavanin", "i am new in android " , ResourcesCompat.getDrawable(getResources(),R.drawable.example_appwidget_preview,null)));
        persons.add(new Person("sara" ,"khavanin", "i am new in android " , ResourcesCompat.getDrawable(getResources(),R.drawable.example_appwidget_preview,null)));

        b.actMainTvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = (LayoutInflater)
                        getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                PopupWindow pw = new PopupWindow(
                        inflater.inflate(R.layout.new_app_widget2, null, false),
                        200,
                        200,
                        true);
                // The code below assumes that the root container has an id called 'main'
                pw.showAtLocation(b.activityMain5, Gravity.CENTER, 0, 0);
            }
        });


        b.list.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        b.list.setAdapter(new ListAdapter(persons));


    }


    public class Person {
        String name  ;
        String sureName;
        String status ;
        Drawable img;

        public Person(String name, String sureName, String status, Drawable img) {
            this.name = name;
            this.sureName = sureName;
            this.status = status;
            this.img = img;
        }


        public Drawable getImg() {
            return img;
        }

        public void setImg(Drawable img) {
            this.img = img;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSureName() {
            return sureName;
        }

        public void setSureName(String sureName) {
            this.sureName = sureName;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
