package com.fasttrack.Homework9.Exercise1;

public class Electronics extends Product {


    private String type;
    private double length;
    private double width;
    private double height;
    private double weight;



    public Electronics(String name, double price, String type, int temp) {
        super(name, price);
        this.type = type;
    }


    public void increaseStock(int addToStock) {
        super.increaseStock(addToStock);
    }

    void increaseStock() {
        super.increaseStock(1);
    }
}
