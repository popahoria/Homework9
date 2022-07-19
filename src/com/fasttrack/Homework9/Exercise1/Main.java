package com.fasttrack.Homework9.Exercise1;

public class Main {
    public static void main(String[] args) {
        Cosmetics shavingCream = new Cosmetics("Shaving Cream", "White", 4.43, 0.25);
        shavingCream.setQuantity(20);
        shavingCream.setSpecs("shaving Cream- For sensitive skin");
        shavingCream.getDiscount(2);
        shavingCream.toString();
        shavingCream.increaseStock(10);
        System.out.println("===============================================================================");

        Fridge fridge = new Fridge("AEG", 478.99, "NO-Frost", 6);
        System.out.println(fridge);
        fridge.setQuantity(10);
        fridge.setSpecs(" AEG DFa2443-Kj43 No frost");
        fridge.getDiscount(1);
        fridge.toString();
        fridge.increaseStock(2);
        System.out.println("===============================================================================");

        Product laundryMachine = new Product("LG Laundry Machine", 540.32);
        laundryMachine.setSpecs("DFR23466-LH43");
        System.out.println(laundryMachine);


    }

}
