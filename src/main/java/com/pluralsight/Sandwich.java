package com.pluralsight;

public class Sandwich implements Item{

    private int size;
    private String bread;
    private boolean toasted;
    private Meat meat;
    private Cheese cheese;
    private List<RegularTopping> toppings;
    private List<Sauce> sauces;
}
