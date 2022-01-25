package com.codeclan.example.paintzServer.models.paint;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.enums.PaintType;

public class Paint {

    private Long id;
    private ManufacturerType manufacturer;
    private String paintNum;
    private String modelNum;
    private String name;
    private PaintType paintType;
    private ColourType colourCategory;
    private String hexValue;
    private String size;
    private double price;

    public Paint(ManufacturerType manufacturer, String paintNum, String modelNum, String name, PaintType paintType, ColourType colourCategory, String hexValue, String size, double price) {
        this.manufacturer = manufacturer;
        this.paintNum = paintNum;
        this.modelNum = modelNum;
        this.name = name;
        this.paintType = paintType;
        this.colourCategory = colourCategory;
        this.hexValue = hexValue;
        this.size = size;
        this.price = price;
    }

    public Paint() {}

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

    public String getPaintNum() {
        return paintNum;
    }

    public void setPaintNum(String paintNum) {
        this.paintNum = paintNum;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaintType getPaintType() {
        return paintType;
    }

    public void setPaintType(PaintType paintType) {
        this.paintType = paintType;
    }

    public ColourType getColourCategory() {
        return colourCategory;
    }

    public void setColourCategory(ColourType colourCategory) {
        this.colourCategory = colourCategory;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
