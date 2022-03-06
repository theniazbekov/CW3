package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cw3.databinding.ActivityMainBinding;
import com.example.cw3.ui.data.UserNameModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    UserNameAdapter userNameAdapter;
    ArrayList<UserNameModel> namesList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initialization();

    }


    private void initialization() {
        namesList = (ArrayList<UserNameModel>) UserNameClient.getListOfNames();
        userNameAdapter = new UserNameAdapter(namesList);
        binding.recycler.setAdapter(userNameAdapter);

    }}