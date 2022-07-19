package com.fasttrack.Homework9.Exercise1;


//     1) Define the following classes:
//
//        Product : price, name, description, quantity
//
//        Cosmetics: (extends Product): color, weight
//
//        Electronics: (extends Product) type(String), length, width, height, weight
//
//        Fridge: (extends Electronics): temperature
//
//        create a Main where you use them.


public class Product {
    private String name;
    private String specs;
    private double price;
    private int quantity;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }



    public void setSpecs(String specs) {
        this.specs = specs;
        System.out.println(specs);

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        System.out.println(name + " stock: " + quantity);
    }

    public static String print() {
        return "Product";
    }

    public  void increaseStock(int addToStock) {
        this.quantity += addToStock;
        System.out.println(name+ " stock increase with: "+addToStock+ " . New stock is: " + quantity);
    }

    protected void getDiscount(int discount) {

        this.price = this.price - ((discount / 100) * this.price);
        System.out.println("Product discount: " + discount + "%");
    }

    @Override
    public String toString() {
        return "Product " +
                "name= " + name +
                ", specs= " + specs +
                ", price= " + price +
                ", quantity= " + quantity;
    }
}

