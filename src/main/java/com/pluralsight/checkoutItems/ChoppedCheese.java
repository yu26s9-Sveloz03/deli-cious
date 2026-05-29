package com.pluralsight.checkoutItems;

import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Sauce;

import java.util.ArrayList;
import java.util.Arrays;

public class ChoppedCheese extends Sandwich{

    public ChoppedCheese() {
        super(12,
                "White",
                false,
                new Meat("Ground Beef",false,12),
                new Cheese("American",false,12),
                new ArrayList<>(Arrays.asList(new RegularTopping("Lettuce",false),
                        new RegularTopping("Peppers",false),
                        new RegularTopping("Onions",false),
                        new RegularTopping("Tomatoes",false))),
                new ArrayList<>(Arrays.asList(new Sauce("Mayo",false),
                        new Sauce("Ketchup",false))));
    }
}
