package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;

    public Order() {
        this.items = new ArrayList<Item>();
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String printReceipt(){
        String receipt = "";
        for (Item item: getItems()) {
            if (item instanceof Sandwich){
                receipt += item.printInfo();
            }
        }
        for (Item item: getItems()) {
            if (item instanceof Drink){
                receipt += item.printInfo();
            }
        }
        for (Item item: getItems()) {
            if (item instanceof Chips){
                receipt += item.printInfo();
            }
        }
        receipt += "\nTotal Price: --------------- " + getTotalPrice();
        return receipt;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
