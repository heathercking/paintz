package com.codeclan.example.paintzServer.models.paint;

import com.codeclan.example.paintzServer.models.enums.ManufacturerType;

import java.util.ArrayList;
import java.util.List;

public class PaintMix {

    private Long id;
    private ManufacturerType manufacturer;
    private Paint paintToMix;
    private List<Paint> mix;

    public PaintMix(ManufacturerType manufacturer, Paint paintToMix) {
        this.manufacturer = manufacturer;
        this.paintToMix = paintToMix;
        this.mix = new ArrayList<>();
    }

    public PaintMix() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ManufacturerType getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ManufacturerType manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Paint getPaintToMix() {
        return paintToMix;
    }

    public void setPaintToMix(Paint paintToMix) {
        this.paintToMix = paintToMix;
    }

    public List<Paint> getMix() {
        return mix;
    }

    public void setMix(List<Paint> mix) {
        this.mix = mix;
    }
}
