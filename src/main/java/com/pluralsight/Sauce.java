package com.pluralsight;

public class Sauce extends Topping{

    public Sauce(String name, boolean extra) {
        super(name, extra);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
