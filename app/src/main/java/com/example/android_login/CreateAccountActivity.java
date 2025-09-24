package com.example.android_login;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    EditText etFullName103, etEmail103, etPassword103;
    Button btnCreate103, btnCancel103;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        etFullName103 = findViewById(R.id.etFullName103);
        etEmail103    = findViewById(R.id.etEmail103);
        etPassword103 = findViewById(R.id.etPassword103);
        btnCreate103  = findViewById(R.id.btnCreate103);
        btnCancel103  = findViewById(R.id.btnCancel103);

        btnCreate103.setOnClickListener(v -> {
            String name = etFullName103.getText().toString().trim();
            String email = etEmail103.getText().toString().trim();
            String pass = etPassword103.getText().toString();

            if (TextUtils.isEmpty(name) || TextUtils.isEmpty(email) || TextUtils.isEmpty(pass)) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }
            Toast.makeText(this, "Created (mock)", Toast.LENGTH_SHORT).show();
            finish();
        });

        btnCancel103.setOnClickListener(v -> finish());
    }
}