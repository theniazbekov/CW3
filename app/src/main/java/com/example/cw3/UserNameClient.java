package com.example.cw3;

import com.example.cw3.ui.data.UserNameModel;

import java.util.ArrayList;

public class UserNameClient {
    public static ArrayList<UserNameModel> namesList = new ArrayList<>();

    public static ArrayList<UserNameModel> getListOfNames() {

        namesList.add(new UserNameModel("Первый вопрос"));
        return namesList;
}}
