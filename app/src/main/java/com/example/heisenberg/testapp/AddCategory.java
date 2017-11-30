package com.example.heisenberg.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Request;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONStringer;
import com.android.volley.NetworkResponse;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AddCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);







        Button addCategoryButton=(Button)findViewById(R.id.add_category_button);

        addCategoryButton.setOnClickListener(new Button.OnClickListener(){




            public void onClick(View v)
            {
                addCategoryRequest();
            }
        });
    }

    private void addCategoryRequest() {

        final TextView mCategoryName = (TextView) findViewById(R.id.categoryName);
        final TextView mTextView = (TextView) findViewById(R.id.responseText);
        RequestQueue queue = Volley.newRequestQueue(this);
        JSONStringer json = new JSONStringer();
        String url = "http://172.20.10.3:4567/category/create";


        StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        mTextView.setText("Response is: "+ response.substring(0,500));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                NetworkResponse networkResponse = error.networkResponse;
                mTextView.setText(String.valueOf(mCategoryName) + networkResponse.statusCode);

            }
        }){
            @Override
            protected Map<String,String> getParams(){
                Random randomNumber = new Random();

                int idNumber = randomNumber.nextInt(100000);
                Map<String,String> params = new HashMap<String, String>();
                params.put("id", "22");
                params.put("nome", "teste");

                return params;
            }

            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String,String> params = new HashMap<String, String>();
                params.put("Content-Type","application/x-www-form-urlencoded");
                return params;
            }
        };
        // Add the request to the RequestQueue.
        queue.add(stringRequest);


    }

}











