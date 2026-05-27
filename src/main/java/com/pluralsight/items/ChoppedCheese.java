package com.pluralsight.items;

import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Sauce;

import java.util.List;

public class ChoppedCheese extends Sandwich{

    public ChoppedCheese() {
        super(12,
                "White",
                false,
                new Meat("Ground Beef",false,12),
                new Cheese("American",false,12),
                List.of(new RegularTopping("Lettuce",false),
                        new RegularTopping("Peppers",false),
                        new RegularTopping("Onions",false),
                        new RegularTopping("Tomatoes",false)),
                List.of(new Sauce("Mayo",false),
                        new Sauce("Ketchup",false)));
    }
}
