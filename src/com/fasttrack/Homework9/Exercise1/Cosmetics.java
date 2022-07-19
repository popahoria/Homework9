package com.fasttrack.Homework9.Exercise1;

public class Cosmetics extends Product {
    private String color;
    private double weight;

    public Cosmetics(String name, String color, double price, double weight) {
        super(name, price);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cosmetics " +
                "color = " + color +
                ", weight = " + weight;
    }
}
