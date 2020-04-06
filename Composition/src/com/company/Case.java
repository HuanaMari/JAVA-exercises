package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private String PowerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        PowerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void  pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return PowerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
