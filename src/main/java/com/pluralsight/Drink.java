package com.pluralsight;

public class Drink implements Item{
    private String name;
    private String size;

    public Drink(String size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    public double getPrice() {
        switch (size.toLowerCase()) {
            case "small" -> {return 0.50;}
            case "medium" -> {return 1.00;}
            case "large" -> {return 1.50;}
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
