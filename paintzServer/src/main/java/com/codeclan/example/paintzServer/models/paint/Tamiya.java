package com.codeclan.example.paintzServer.models.paint;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.PaintType;

import java.util.ArrayList;
import java.util.List;

public class Tamiya extends Paint {

    private List<Humbrol> humbrolMix;
    private List<Revell> revellMix;

    public Tamiya(String paintNum, String modelNum, String name, PaintType paintType, ColourType colourCategory, String hexValue, String size, double price) {
        super(paintNum, modelNum, name, paintType, colourCategory, hexValue, size, price);
        this.humbrolMix = new ArrayList<>();
        this.revellMix = new ArrayList<>();
    }

    public Tamiya() {}

    public List<Humbrol> getHumbrolMix() {
        return humbrolMix;
    }

    public void setHumbrolMix(List<Humbrol> humbrolMix) {
        this.humbrolMix = humbrolMix;
    }

    public List<Revell> getRevellMix() {
        return revellMix;
    }

    public void setRevellMix(List<Revell> revellMix) {
        this.revellMix = revellMix;
    }
}
