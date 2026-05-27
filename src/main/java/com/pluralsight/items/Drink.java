package com.pluralsight.items;

public class Drink implements Item {
    private String name;
    private String size;

    public Drink(String size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public double getPrice() {
        switch (size.toLowerCase()) {
            case "small" -> {return 2.00;}
            case "medium" -> {return 2.50;}
            case "large" -> {return 3.00;}
            default -> {return 0.0;}
        }
    }

    @Override
    public String printInfo() {
        String info = "\n 1x " + getName() + "Drink---------------" + getPrice() + "\n\t" +
                "Size: " + getSize();
        return info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
