package com.example.myfirstapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;


    @SuppressLint({"CutPasteId", "MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.btnLogin);

        // on click event
        login.setOnClickListener(v -> {
            String user_name = username.getText().toString().trim();
            String pass_word = password.getText().toString().trim();

            if (user_name.equals("")) {
                username.setError("username cannot be empty");
                username.requestFocus();
                return;
            }

            if (pass_word.equals("")) {
                password.setError("password cannot be empty");
                password.requestFocus();
                return;
            }

            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
            }else
                Toast.makeText(MainActivity.this,"LOGIN FAILED", Toast.LENGTH_SHORT ).show();
            });

        }
    }
