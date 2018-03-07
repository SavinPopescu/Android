package com.example.savin_pc.json;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView Mondeo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUpViews();
    }

    private void setUpViews(){
        Mondeo = findViewById(R.id.Mondeo);
        Mondeo.setOnClickListener(this);
    }

    private void goToMondeo(){
        Intent intent = new Intent(this, Mondeo.class);
        startActivity(intent);
    }
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.Mondeo:
                goToMondeo();
                break;

        }

    }
}
