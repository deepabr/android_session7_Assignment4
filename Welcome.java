package com.example.deepa.welcomescreenproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
        TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tvName = (TextView) findViewById(R.id.tvNameResult);

        Intent getIntentObj=getIntent();
        String Res="Welcome to " + getIntentObj.getExtras().getString("BundleName");

        tvName.setText(Res);

    }
}
