package com.pluralsight;

public class Chips implements Item{
    private double price;

    public Chips() {
        this.price = 1.50;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
