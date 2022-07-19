package com.fasttrack.Homework9.Exercise1;


public class Fridge extends Electronics {
    private int temp;

    public Fridge(String name, double price, String type, int temp) {
        super(name,price,type,temp);
        this.temp = temp;
    }


    public void lowerTemp() {
        this.temp--;
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "temperature=" + temp +
                '}';
    }
}

