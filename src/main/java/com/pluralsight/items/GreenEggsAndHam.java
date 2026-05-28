package com.pluralsight.items;

import com.pluralsight.toppings.Cheese;
import com.pluralsight.toppings.Meat;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Sauce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreenEggsAndHam extends Sandwich{

    public GreenEggsAndHam() {
        super(4,
                "Rye",
                false,
                new Meat("Ham",false,4),
                new Cheese("Provolone",false,4),
                new ArrayList<>(Arrays.asList(new RegularTopping("Scrambled Eggs",false),
                        new RegularTopping("Spinach",false),
                        new RegularTopping("Broccoli",false))),
                new ArrayList<>(Arrays.asList(new Sauce("Pesto",false))));
    }
}
