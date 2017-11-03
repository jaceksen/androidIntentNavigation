package com.example.jsen.nawigacjamiedzystronami;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etUserName;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUserName = (EditText) findViewById(R.id.etLogin);
        etPassword = (EditText) findViewById(R.id.etPassword);
    }

    String userName="admin";
    String userPassword="1111";
    String name="Jacek Seń";

    public void przejdDalej(View view) {

        if(userName.equals(etUserName.getText().toString()) && userPassword.equals(etPassword.getText().toString())){
            //go to second activity
            Intent intent = new Intent(this,Home.class);
            //przekazywanie wartości
            intent.putExtra("name",name);
            //odpalenie drugiego intentu
            startActivity(intent);
            finish();
        }

    }
}
