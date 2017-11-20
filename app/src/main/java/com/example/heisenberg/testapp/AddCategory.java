package com.example.heisenberg.testapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AddCategory extends AppCompatActivity {

    private String id;
    private String name;

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

//                HttpClient httpclient = new DefaultHttpClient();
//                HttpPost httppost = new HttpPost("http://<ip address>:3000");
//
//                try {
//                    //add data
//                    List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
//                    nameValuePairs.add(new BasicNameValuePair("data", data[0]));
//                    httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
//                    //execute http post
//                    HttpResponse response = httpclient.execute(httppost);
//
//                } catch (ClientProtocolException e) {
//
//                } catch (IOException e) {
//
//                }


            }
        });
    }

}











