package com.example.loginapp.activities;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.loginapp.R;

public class ProfileActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView emailTextView;
    private TextView phoneTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupViews();
        populateUserInfo();
    }

    private void setupViews() {
        nameTextView = findViewById(R.id.tvName);
        emailTextView = findViewById(R.id.tvEmail);
        phoneTextView = findViewById(R.id.tvPhone);
    }

    private void populateUserInfo() {
        // Hardcoded user data
        String name = "Luqy";
        String email = "luqy@mail.com";
        String phone = "089614774123";

        nameTextView.setText(name);
        emailTextView.setText(email);
        phoneTextView.setText(phone);
    }
}
