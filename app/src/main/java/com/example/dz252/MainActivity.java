package com.example.dz252;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usernameET;
    EditText passwordET;
    Button SignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameET = (EditText) findViewById(R.id.username);
        passwordET = (EditText) findViewById(R.id.password);
        SignIn = (Button) findViewById(R.id.signin);
    }

    public void SignIn(View view) {

        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();

        if (username.equals("VAN") && password.equals("DARKHOLME")) {
            TextView tv1 = (TextView)findViewById(R.id.textView);
            tv1.setText("Success");
            tv1.setBackgroundColor(Color.GREEN);
        } else {
            TextView tv1 = (TextView)findViewById(R.id.textView);
            tv1.setText("Failure");
            tv1.setBackgroundColor(Color.RED);
        }
    }
}