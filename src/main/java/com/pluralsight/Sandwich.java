package com.pluralsight;

import java.util.List;

public class Sandwich implements Item{

    private int size;
    private String bread;
    private boolean toasted;
    private Meat meat;
    private Cheese cheese;
    private List<RegularTopping> toppings;
    private List<Sauce> sauces;

    public Sandwich(int size, String bread, boolean toasted, Meat meat, Cheese cheese, List<RegularTopping> toppings, List<Sauce> sauces) {
        this.size = size;
        this.bread = bread;
        this.toasted = toasted;
        this.meat = meat;
        this.cheese = cheese;
        this.toppings = toppings;
        this.sauces = sauces;
    }

    public double getPrice() {
        double price = 0.00;
        switch (size) {
            case 4 -> price = 5.50;
            case 8 -> price = 7.00;
            case 12 -> price = 8.50;
        }
        price += meat.getPrice();
        price += cheese.getPrice();
        return price;
    }

    @Override
    public void printInfo() {
        System.out.println(" 1x Sandwich---------------" + getPrice() + "\n\t" +
                "Size: " + getSize() + "\n\t" +
                "Bread: " + getBread() + "\n\t" +
                "Toasted: " + isToasted());
        if(getMeat().isExtra()){
            System.out.println("\tMeat: EXTRA " + getMeat().getName());
        } else {
            System.out.println("\tMeat: " + getMeat().getName());
        }
        if(getCheese().isExtra()){
            System.out.println("\tCheese: EXTRA " + getCheese().getName());
        } else {
            System.out.println("\tCheese: " + getCheese().getName());
        }
        System.out.println("\tToppings: ");
        for (RegularTopping topping : this.toppings){
            if(topping.isExtra()){
                System.out.println("\t\tEXTRA " + topping.getName());
            } else {
                System.out.println("\t\t" + topping.getName());
            }
        }
        System.out.println("\tSauces: ");
        for (Sauce sauce : this.sauces) {
            if(sauce.isExtra()){
                System.out.println("\t\tEXTRA " + sauce.getName());
            } else {
                System.out.println("\t\t" + sauce.getName());
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public Meat getMeat() {
        return meat;
    }

    public void setMeat(Meat meat) {
        this.meat = meat;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public List<RegularTopping> getToppings() {
        return toppings;
    }

    public void setToppings(List<RegularTopping> toppings) {
        this.toppings = toppings;
    }

    public List<Sauce> getSauces() {
        return sauces;
    }

    public void setSauces(List<Sauce> sauces) {
        this.sauces = sauces;
    }
}
