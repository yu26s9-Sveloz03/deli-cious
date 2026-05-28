package com.pluralsight.items;

import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Sauce;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Item {

    private int size;
    private String bread;
    private boolean toasted;
    private Meat meat;
    private Cheese cheese;
    private ArrayList<RegularTopping> toppings;
    private ArrayList<Sauce> sauces;

    public Sandwich(int size, String bread, boolean toasted, Meat meat, Cheese cheese, ArrayList<RegularTopping> toppings, ArrayList<Sauce> sauces) {
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
    public String printInfo() {
        String info = " 1x Sandwich---------------" + getPrice() + "\n\t" +
                "Size: " + getSize() + "\"\n\t" +
                "Bread: " + getBread() + "\n\t" +
                "Toasted: " + isToasted();
        if(getMeat().isExtra()){
            info += "\n\tMeat: EXTRA " + getMeat().getName();
        } else {
            info += "\n\tMeat: " + getMeat().getName();
        }
        if(getCheese().isExtra()){
            info += "\n\tCheese: EXTRA " + getCheese().getName();
        } else {
            info += "\n\tCheese: " + getCheese().getName();
        }
        info += "\n\tToppings: ";
        for (RegularTopping topping : this.toppings){
            if(topping.isExtra()){
                info += "\n\t\tEXTRA " + topping.getName();
            } else {
                info += "\n\t\t" + topping.getName();
            }
        }
        info += "\n\tSauces: ";
        for (Sauce sauce : this.sauces) {
            if(sauce.isExtra()){
                info += "\n\t\tEXTRA " + sauce.getName();
            } else {
                info += "\n\t\t" + sauce.getName();
            }
        }
        return info;
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

    public void setToppings(ArrayList<RegularTopping> toppings) {
        this.toppings = toppings;
    }

    public List<Sauce> getSauces() {
        return sauces;
    }

    public void setSauces(ArrayList<Sauce> sauces) {
        this.sauces = sauces;
    }
}
