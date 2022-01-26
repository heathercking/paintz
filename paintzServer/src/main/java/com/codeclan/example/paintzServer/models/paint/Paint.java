package com.codeclan.example.paintzServer.models.paint;

import com.codeclan.example.paintzServer.models.enums.ColourType;
import com.codeclan.example.paintzServer.models.enums.ManufacturerType;
import com.codeclan.example.paintzServer.models.enums.PaintType;

import javax.persistence.*;

@Entity
@Table(name = "paints")
public class Paint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "manufacturer")
    private ManufacturerType manufacturer;

    @Column(name = "paint_number")
    private String paintNum;

    @Column(name="model_number")
    private String modelNum;

    @Column(name="name")
    private String name;

    @Column(name = "paint_type")
    private PaintType paintType;

    @Column(name = "colour_category")
    private ColourType colourCategory;

    @Column(name = "hex_value")
    private String hexValue;

    @Column(name = "size")
    private String size;

    @Column(name = "price")
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
