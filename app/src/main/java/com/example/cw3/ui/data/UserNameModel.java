package com.example.cw3.ui.data;

import java.io.Serializable;

public class UserNameModel implements Serializable {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public UserNameModel(String userName) {
        this.userName = userName;

    }
}
