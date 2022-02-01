package com.codeclan.example.paintzServer.models.paint;

import java.util.ArrayList;
import java.util.List;

public class PaintInventory {

    private List<Paint> userInventory;

    public PaintInventory() {
        this.userInventory = new ArrayList<>();
    }

    public List<Paint> getUserInventory() {
        return userInventory;
    }

    public void setUserInventory(List<Paint> userInventory) {
        this.userInventory = userInventory;
    }

    public void addPaintToInventory(Paint paint) {
        this.userInventory.add(paint);
    }
}
