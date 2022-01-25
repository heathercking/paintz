package com.codeclan.example.paintzServer.models.paint;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.PaintType;

import java.util.ArrayList;
import java.util.List;

public class Humbrol extends Paint {

    private List<Revell> revellMix;
    private List<Tamiya> tamiyaMix;

    public Humbrol(String paintNum, String modelNum, String name, PaintType paintType, ColourType colourCategory, String hexValue, String size, double price) {
        super(paintNum, modelNum, name, paintType, colourCategory, hexValue, size, price);
        this.revellMix = new ArrayList<>();
        this.tamiyaMix = new ArrayList<>();
    }

    public Humbrol() {}


    public List<Revell> getRevellMix() {
        return revellMix;
    }

    public void setRevellMix(List<Revell> revellMix) {
        this.revellMix = revellMix;
    }

    public List<Tamiya> getTamiyaMix() {
        return tamiyaMix;
    }

    public void setTamiyaMix(List<Tamiya> tamiyaMix) {
        this.tamiyaMix = tamiyaMix;
    }
}
