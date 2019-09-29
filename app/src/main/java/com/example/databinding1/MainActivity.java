package com.example.databinding1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    User user;
    MyClickHandlers handlers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        user.setName("shimaa");
        user.setEmail("shemo@gmail.com");
        handlers=new MyClickHandlers(this);
        binding.content.setHandlers(handlers);

        binding.setUser(user);
    }
}