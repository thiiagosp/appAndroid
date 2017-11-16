package com.example.heisenberg.testapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class AddCategoryActivity extends AppCompatActivity {

    String mockCategory = "{\"id\":7,\"nome\":\"Sport\",\"descricao\":\"Sport test category\"}"

    RequestQueue queue = Volley.newRequestQueue(this);

    String url ="http://localhost:4567/category/create";

    HttpClient client = new DefaultHttpClient();
    HttpPost httppost = new HttpPost(url);

    List<NameValuePair> pairs = new ArrayList<NameValuePair>();
    pairs.add(new BasicNameValuePair("id", 11));
    pairs.add(new BasicNameValuePair("nome", "cerveja"));
    pairs.add(new BasicNameValuePair("descricao", "massa djhow"));
    post.setEntity(new UrlEncodedFormEntity(pairs));

    HttpResponse response = client.execute(post);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
