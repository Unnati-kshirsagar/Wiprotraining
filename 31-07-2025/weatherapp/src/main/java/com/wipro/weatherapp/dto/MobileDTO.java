package com.wipro.weatherapp.dto;

public class MobileDTO {
    private String make;
    private String modelNumber;
    private double price;

    // Default constructor
    public MobileDTO() {}

    // All-args constructor
    public MobileDTO(String make, String modelNumber, double price) {
        this.make = make;
        this.modelNumber = modelNumber;
        this.price = price;
    }

    // Getters and setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString for printing object details
    @Override
    public String toString() {
        return "MobileDTO [make=" + make + ", modelNumber=" + modelNumber + ", price=" + price + "]";
    }
}
