package com.example.mamadou.a101tutoring;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by mamadou on 7/2/16.
 */
public class StudentLoginPage extends Activity {
    private EditText email;
    private EditText password;
    private Button login;
    int numberTentation = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_login_page);
        email = (EditText) findViewById(R.id.input_email);
        password = (EditText) findViewById(R.id.input_password);
        login = (Button) findViewById(R.id.btn_login);
    }
    public void registerPage(View view) {
        // go to the register page
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
    public void loginButton(View view) {
        String username = email.getText().toString();
        if (username.equals("mamadou") && password.getText().toString().equals("mamadou")) {
            Toast.makeText(getApplicationContext(), "Readering ..", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

            email.setVisibility(View.VISIBLE);
            email.setBackgroundColor(Color.RED);
            numberTentation--;
            email.setText(Integer.toString(numberTentation));

            if (numberTentation == 0) {
                login.setEnabled(false);
            }
        }
    }
}
