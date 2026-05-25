package com.pluralsight;

public class RegularTopping extends Topping{

    public RegularTopping(String name, boolean extra) {
        super(name, extra);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
