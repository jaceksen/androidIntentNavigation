package com.example.jsen.nawigacjamiedzystronami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    TextView tvHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        //Read from intent
        Bundle b = getIntent().getExtras();
        String name = b.getString("name");

        tvHome = (TextView) findViewById(R.id.textView);
        tvHome.setText(name);
    }

    public void powrot(View view) {
        Intent powrot = new Intent(this,MainActivity.class);
        startActivity(powrot);
        finish();
    }

    public void buClose(View view) {
        finish();
    }
}
