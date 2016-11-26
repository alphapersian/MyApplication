package navac.asia.myapplication.volley;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import navac.asia.myapplication.R;

public class Main4Activity extends AppCompatActivity {

    private static final String TAG = "Main4Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        StringRequest stringRequest = new StringRequest(Request.Method.POST, "http://api.androidhive.info/volley/person_object.json"
                , new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Log.d(TAG, "onResponse() called with: response = [" + response + "]");

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "onErrorResponse() called with: error = [" + error + "]");
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {

                Map<String , String> map = new HashMap<>();
                map.put("name" , "alpha");
                map.put("name" , "alpha");
                map.put("name" , "alpha");
                map.put("name" , "alpha");
                map.put("name" , "alpha");
                map.put("name" , "alpha");
                map.put("name" , "alpha");
                return map;
            }
        };


//        AppController.getInstance().addToRequestQueue(stringRequest);


        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, "http://api.androidhive.info/volley/person_object.json", null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d(TAG, "onResponse() called with: response = [" + response + "]");

                Toast.makeText(Main4Activity.this, "this a seconds toast", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "onErrorResponse() called with: error = [" + error + "]");
            }
        });


//        AppController.getInstance().addToRequestQueue(jsonObjectRequest);

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest("http://api.androidhive.info/volley/person_object.json", new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Log.d(TAG, "onResponse() called with: response = [" + response + "]");
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "onErrorResponse() called with: error = [" + error + "]");
            }
        }) ;

        AppController.getInstance().addToRequestQueue(jsonArrayRequest);

    }
}
