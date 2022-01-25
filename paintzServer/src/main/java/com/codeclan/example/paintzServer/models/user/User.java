package com.codeclan.example.paintzServer.models.user;

import com.codeclan.example.paintzServer.models.paint.PaintInventory;

public class User {

    private String email;
    private String password;
    private PaintInventory paintInventory;

    public User(String email, String password, PaintInventory paintInventory) {
        this.email = email;
        this.password = password;
        this.paintInventory = paintInventory;
    }

    public User() {}


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PaintInventory getPaintInventory() {
        return paintInventory;
    }

    public void setPaintInventory(PaintInventory paintInventory) {
        this.paintInventory = paintInventory;
    }
}
