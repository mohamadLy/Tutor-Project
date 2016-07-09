package com.example.mamadou.a101tutoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void studingLoginPage (View view) {
        // go to student login page
        Intent intent = new Intent(this, StudentLoginPage.class);
        startActivity(intent);
    }
    public void tutorLoginPage (View view) {
        // go to student login page
    }
}
