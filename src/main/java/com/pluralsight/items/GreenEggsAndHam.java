package com.pluralsight.items;

import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Sauce;

import java.util.List;

public class GreenEggsAndHam extends Sandwich{

    public GreenEggsAndHam() {
        super(4,
                "Rye",
                false,
                new Meat("Ham",false,4),
                new Cheese("Provolone",false,4),
                List.of(new RegularTopping("Scrambled Eggs",false),
                        new RegularTopping("Spinach",false),
                        new RegularTopping("Broccoli",false)),
                List.of(new Sauce("Pesto",false)));
    }
}
