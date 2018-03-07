package com.example.savin_pc.json;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Mondeo extends AppCompatActivity implements View.OnClickListener
{
    private TextView getVolley;
    private RequestQueue q;
    private StringRequest s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mondeo);
        setUpViews();
    }

    public void setUpViews()
    {
        getVolley = findViewById(R.id.getVolleyRequest);
        getVolley.setOnClickListener(this);

    }
        public void volleyRequest()
    {
        q = Volley.newRequestQueue(this);
    }

        public void onClick(View view)
        {
            switch(view.getId())
            {
                case R.id.getVolleyRequest:
                    volleyRequest();
                    break;
            }
        }
    }
}
