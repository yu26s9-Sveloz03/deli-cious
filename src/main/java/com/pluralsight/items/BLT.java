package com.pluralsight.items;

import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Sauce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BLT extends Sandwich{

    public BLT() {
        super(8,
                "White",
                true,
                new Meat("Bacon",false,8),
                new Cheese("Cheddar",false,8),
                new ArrayList<>(Arrays.asList(new RegularTopping("Lettuce",false),
                        new RegularTopping("Tomatoes",false))),
                new ArrayList<>(Arrays.asList(new Sauce("Ranch",false))));
    }
}
