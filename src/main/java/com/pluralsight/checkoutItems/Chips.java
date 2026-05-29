package com.pluralsight.checkoutItems;

public class Chips implements Item {
    private String name;
    private double price;

    public Chips(String name) {
        this.name = name;
        this.price = 1.50;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String printInfo() {
        String info = String.format("\n 1x " + getName() + " Bag---------------$%.2f",getPrice());
        return info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
