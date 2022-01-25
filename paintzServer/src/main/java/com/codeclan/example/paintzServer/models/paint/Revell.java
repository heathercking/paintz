package com.codeclan.example.paintzServer.models.paint;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.PaintType;

import java.util.ArrayList;
import java.util.List;

public class Revell extends Paint {

    private List<Humbrol> humbrolMix;
    private List<Tamiya> tamiyaMix;

    public Revell(String paintNum, String modelNum, String name, PaintType paintType, ColourType colourCategory, String hexValue, String size, double price) {
        super(paintNum, modelNum, name, paintType, colourCategory, hexValue, size, price);
        this.humbrolMix = new ArrayList<>();
        this.tamiyaMix = new ArrayList<>();
    }

    public Revell() {}

    public List<Humbrol> getHumbrolMix() {
        return humbrolMix;
    }

    public void setHumbrolMix(List<Humbrol> humbrolMix) {
        this.humbrolMix = humbrolMix;
    }

    public List<Tamiya> getTamiyaMix() {
        return tamiyaMix;
    }

    public void setTamiyaMix(List<Tamiya> tamiyaMix) {
        this.tamiyaMix = tamiyaMix;
    }
}
