package com.example.android_login;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    Button btnCreateAccount103, btnLogin103;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btnCreateAccount103 = findViewById(R.id.btnCreateAccount103);
        btnLogin103 = findViewById(R.id.btnLogin103);

        btnCreateAccount103.setOnClickListener(v ->
                startActivity(new Intent(this, CreateAccountActivity.class)));
        btnLogin103.setOnClickListener(v ->
                startActivity(new Intent(this, CreateAccountActivity.class)));
       }
}
