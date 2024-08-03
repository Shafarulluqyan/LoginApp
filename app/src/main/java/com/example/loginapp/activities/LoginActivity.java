package com.example.loginapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.loginapp.R;
import com.example.loginapp.models.User;
import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setupViews();
    }

    private void setupViews() {
        emailEditText = findViewById(R.id.emailEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (validateUser(email, password)) {
                    Toast.makeText(LoginActivity.this, "Selamat Anda Berhasil Login", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Email atau Password salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean validateUser(String email, String password) {
        List<User> validUsers = getValidUsers();
        for (User user : validUsers) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    private List<User> getValidUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("luqy", "luqy@mail.com", "081283129444", "test1"));
        users.add(new User("madun", "madun@mail.com", "123456789", "test2"));
        users.add(new User("jajang standing", "jajang@mail.com", "0987654321", "test3"));
        return users;
    }
}
