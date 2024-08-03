package com.example.loginapp.activities;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.loginapp.R;
import com.example.loginapp.adapters.UserAdapter;
import com.example.loginapp.models.User;
import com.example.loginapp.utils.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MasterActivity extends BaseActivity {

    private RecyclerView rvUsers;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        setupViews();
    }

    @Override
    protected void setupViews() {
        rvUsers = findViewById(R.id.rvUsers);
        rvUsers.setLayoutManager(new LinearLayoutManager(this));

        List<User> userList = getUsers();
        userAdapter = new UserAdapter(userList);
        rvUsers.setAdapter(userAdapter);
    }

    private List<User> getUsers() {
        // Return a list of dummy users for demonstration
        List<User> users = new ArrayList<>();
        users.add(new User("luqy", "luqy@mail.com", "081283129444", "test1"));
        users.add(new User("madun", "madun@mail.com", "123456789", "test2"));
        users.add(new User("jajang standing", "jajang@mail.com", "0987654321", "password3"));
        return users;
    }
}
