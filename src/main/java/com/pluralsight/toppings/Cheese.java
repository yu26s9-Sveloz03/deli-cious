package com.pluralsight.toppings;

public class Cheese extends Topping {

    private int size;

    public Cheese(String name, boolean extra, int size) {
        super(name, extra);
        this.size = size;
    }

    public double getExtraPrice() {
        switch (size) {
            case 4 -> {return 0.30;}
            case 8 -> {return 0.60;}
            case 12 -> {return 0.90;}
            default -> {return 0.0;}
        }
    }

    @Override
    public double getPrice() {
        double price = 0.0;
        switch (size) {
            case 4 -> price = 0.75;
            case 8 -> price = 1.50;
            case 12 -> price = 2.25;
        }
        if (isExtra()) {
            price += getExtraPrice();
        }
        return price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
