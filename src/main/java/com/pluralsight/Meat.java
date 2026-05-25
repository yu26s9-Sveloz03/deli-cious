package com.pluralsight;

public class Meat extends Topping{
    private int size;

    public Meat(String name, boolean extra, int size) {
        super(name, extra);
        this.size = size;
    }

    public double getExtraPrice() {
        switch (size) {
            case 4 -> {return 0.50;}
            case 8 -> {return 1.00;}
            case 12 -> {return 1.50;}
            default -> {return 0.0;}
        }
    }

    @Override
    public double getPrice() {
        double price = 0.0;
        switch (size) {
            case 4 -> price = 1.00;
            case 8 -> price = 2.00;
            case 12 -> price = 3.00;
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
