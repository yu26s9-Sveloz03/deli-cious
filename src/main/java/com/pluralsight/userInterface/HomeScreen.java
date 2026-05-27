package com.pluralsight.userInterface;

import com.pluralsight.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeScreen {
    Scanner scanner = new Scanner(System.in);
//    Console console = new Console();

    public void homeScreen() {
        while (true) {
            System.out.println("-----Sam's Bodega-----\n\t" +
                    "1) New Order\n\t" +
                    "0) Exit");
            int command = Console.promptForInt("What would you like to do? ");
            switch (command) {
                case 1 -> newOrder();
                case 0 -> {
                    System.out.println("Thank you! Have a nice day!");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public void newOrder() {
        Order order = new Order();
        while (true) {
            System.out.println("-----Order Screen-----\n\t" +
                    "1) Add Sandwich\n\t" +
                    "2) Add Drink\n\t" +
                    "3) Add Chips\n\t" +
                    "4) Checkout\n\t" +
                    "0) Cancel Order");
            int command = Console.promptForInt("What would you like to do? ");
            switch (command) {
                case 1 -> addSandwich(order);
                case 2 -> addDrink(order);
                case 3 -> addChips(order);
                case 4 -> checkout(order);
                case 0 -> {
                    System.out.println("Thank you! Have a nice day!");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again");
            }
        }
    }

    public void addSandwich(Order order) {
        int size = selectSize();
        String bread = selectBread();
        boolean isToasted = selectToasted();
        Meat meat = selectMeat(size);
        Cheese cheese = selectCheese(size);
        List<RegularTopping> toppings = selectToppings();
        List<Sauce> sauces = selectSauces();
        //create sandwich down here
        Sandwich sandwich = new Sandwich(size,bread,isToasted,meat,cheese,toppings,sauces);
        order.addItem(sandwich);
        System.out.println("Sandwich Added!");
    }

    public void addDrink(Order order) {
        String name = selectDrinkName();
        String size = selectDrinkSize();
        Drink drink = new Drink(size,name);
        order.addItem(drink);
        System.out.println(drink.getSize() + " " + drink.getName() + " Added!");
    }

    public void addChips(Order order) {
        String name = selectChipsName();
        Chips chips = new Chips(name);
        order.addItem(chips);
        System.out.println(chips.getName() + " Added!");
    }

    public void checkout(Order order) {
        System.out.println("-----Checkout-----");
        for (Item item: order.getItems()) {
            if (item instanceof Sandwich){
                item.printInfo();
            }
        }
        for (Item item: order.getItems()) {
            if (item instanceof Drink){
                item.printInfo();
            }
        }
        for (Item item: order.getItems()) {
            if (item instanceof Chips){
                item.printInfo();
            }
        }
    }

    //helper methods
    public String selectChipsName(){
        System.out.println("Choose a chips option:\n\t" +
                "1) Doritos\n\t" +
                "2) Lays\n\t" +
                "3) Cheetos\n\t" +
                "4) Pringles\n\t" +
                "5) Takis");
        while (true) {
            int command = Console.promptForInt("Please choose one: ");
            switch (command) {
                case 1 -> {return "Doritos";}
                case 2 -> {return "Lays";}
                case 3 -> {return "Cheetos";}
                case 4 -> {return "Pringles";}
                case 5 -> {return "Takis";}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
    }

    public String selectDrinkName() {
        System.out.println("Choose a drink option:\n\t" +
                "1) Coca-Cola\n\t" +
                "2) Sprite\n\t" +
                "3) Dr. Pepper\n\t" +
                "4) Fanta\n\t" +
                "5) Mountain Dew");
        while (true) {
            int command = Console.promptForInt("Please choose one: ");
            switch (command) {
                case 1 -> {return "Coca-Cola";}
                case 2 -> {return "Sprite";}
                case 3 -> {return "Dr. Pepper";}
                case 4 -> {return "Fanta";}
                case 5 -> {return "Mountain Dew";}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
    }

    public String selectDrinkSize(){
        System.out.println("Choose a drink size:\n\t" +
                "1) Small\n\t" +
                "2) Medium\n\t" +
                "3) Large\n\t");
        while (true) {
            int command = Console.promptForInt("Please choose one: ");
            switch (command) {
                case 1 -> {return "Small";}
                case 2 -> {return "Medium";}
                case 3 -> {return "Large";}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
    }

    public String selectBread() {
        System.out.println("Choose a bread option:\n\t" +
                "1) White\n\t" +
                "2) Wheat\n\t" +
                "3) Rye\n\t" +
                "4) Wrap");
        while (true) {
            int command = Console.promptForInt("Please choose one: ");
            switch (command) {
                case 1 -> {return "White";}
                case 2 -> {return "Wheat";}
                case 3 -> {return "Rye";}
                case 4 -> {return "Wrap";}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
    }

    public int selectSize() {
        System.out.println("Choose a size:\n\t" +
                "1) Small\n\t" +
                "2) Medium\n\t" +
                "3) Large");
        while (true) {
            int command = Console.promptForInt("Please choose one: ");
            switch (command) {
                case 1 -> {return 4;}
                case 2 -> {return 8;}
                case 3 -> {return 12;}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
    }

    public boolean selectToasted(){
        while(true){
            int toasted = Console.promptForInt("Would you like the bread toasted?\n\t" +
                    "1) Yes\n\t" +
                    "2) No\n" +
                    "What would you like? ");
            switch (toasted) {
                case 1 -> {return true;}
                case 2 -> {return false;}
                default -> System.out.println("Invalid input. Please try again.");
            }

        }
    }

    public Meat selectMeat(int size) {
        String name = "";
        boolean extra = false;
        System.out.println("Choose a meat:\n\t" +
                "1) Steak\n\t" +
                "2) Ham\n\t" +
                "3) Salami\n\t" +
                "4) Roast Beef\n\t" +
                "5) Chicken\n\t" +
                "6) Bacon");
        boolean valid = true;
        while (valid) {
            int command = Console.promptForInt("Please choose one: ");
            switch (command) {
                case 1 -> {name = "Steak"; valid = false;}
                case 2 -> {name = "Ham"; valid = false;}
                case 3 -> {name = "Salami"; valid = false;}
                case 4 -> {name = "Roast Beef"; valid = false;}
                case 5 -> {name = "Chicken"; valid = false;}
                case 6 -> {name = "Bacon"; valid = false;}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
        System.out.println("Do you want extra protein?:\n\t" +
                "1) Yes\n\t" +
                "2) No");
        boolean valid2 = true;
        while (valid2) {
            int command = Console.promptForInt("Please choose one: ");
            switch (command) {
                case 1 -> {extra = true; valid2 = false;}
                case 2 -> {extra = false; valid2 = false;}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
        return new Meat(name,extra,size);
    }

    public Cheese selectCheese(int size) {
        String name = "";
        boolean extra = false;
        System.out.println("Choose a cheese:\n\t" +
                "1) American\n\t" +
                "2) Provolone\n\t" +
                "3) Cheddar\n\t" +
                "4) Swiss\n\t");
        boolean valid = true;
        while (valid) {
            int command = Console.promptForInt("Please choose one: ");
            switch (command) {
                case 1 -> {name = "American"; valid = false;}
                case 2 -> {name = "Provolone"; valid = false;}
                case 3 -> {name = "Cheddar"; valid = false;}
                case 4 -> {name = "Swiss"; valid = false;}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
        System.out.println("Do you want extra?:\n\t" +
                "1) Yes\n\t" +
                "2) No");
        boolean valid2 = true;
        while (valid2) {
            int command = Console.promptForInt("Please choose one: ");
            switch (command) {
                case 1 -> {extra = true; valid2 = false;}
                case 2 -> {extra = false; valid2 = false;}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
        return new Cheese(name,extra,size);
    }

    public List<RegularTopping> selectToppings() {
        List<RegularTopping> toppings = new ArrayList<>();
        System.out.println("Here are our list of ingredients:\n\t" +
                "1) Lettuce\n\t" +
                "2) Peppers\n\t" +
                "3) Onions\n\t" +
                "4) Tomatoes\n\t" +
                "5) Jalapenos\n\t" +
                "6) Cucumbers\n\t" +
                "7) Pickles\n\t" +
                "8) Guacamole\n\t" +
                "9) Mushrooms");
        String allToppings = Console.promptForMultipleInts("Which toppings would you like? You can choose multiple using commas. ");
        if ( allToppings.contains("1")){
            RegularTopping lettuce = new RegularTopping("Lettuce",false);
            toppings.add(lettuce);
        }
        if ( allToppings.contains("2")){
            RegularTopping peppers = new RegularTopping("Peppers",false);
            toppings.add(peppers);
        }
        if ( allToppings.contains("3")){
            RegularTopping onions = new RegularTopping("Onions",false);
            toppings.add(onions);
        }
        if ( allToppings.contains("4")){
            RegularTopping tomatoes = new RegularTopping("Tomatoes",false);
            toppings.add(tomatoes);
        }
        if ( allToppings.contains("5")){
            RegularTopping jalapenos = new RegularTopping("Jalapenos",false);
            toppings.add(jalapenos);
        }
        if ( allToppings.contains("6")){
            RegularTopping cucumbers = new RegularTopping("Cucumbers",false);
            toppings.add(cucumbers);
        }
        if ( allToppings.contains("7")){
            RegularTopping pickles = new RegularTopping("Pickles",false);
            toppings.add(pickles);
        }
        if ( allToppings.contains("8")){
            RegularTopping guacamole = new RegularTopping("Guacamole",false);
            toppings.add(guacamole);
        }
        if ( allToppings.contains("9")){
            RegularTopping mushrooms = new RegularTopping("Mushrooms",false);
            toppings.add(mushrooms);
        }
        System.out.print("Here are all of your toppings:\n\t");
        String pickedToppings = "";
        for (int i = 1; i <= toppings.size(); i++){
            pickedToppings += i + ") " + toppings.get(i-1).getName() + "\n\t";
        }
        System.out.println(pickedToppings);
        System.out.println("\t0) No Extra Toppings");
        String allExtras = Console.promptForMultipleInts("Which topping would you like extra of? You can choose multiple using commas.");
        if (allExtras.contains("0")){
            return toppings;
        }

        for (int i = 1; i <= 9; i++){
            if (allExtras.contains(String.valueOf(i))) {
                toppings.get(i-1).setExtra(true);
            }
        }
        return toppings;
    }

    public List<Sauce> selectSauces() {
        List<Sauce> sauces = new ArrayList<>();
        System.out.println("Here are our list of sauces:\n\t" +
                "1) Mayo\n\t" +
                "2) Mustard\n\t" +
                "3) Ketchup\n\t" +
                "4) Ranch\n\t" +
                "5) Thousand Islands\n\t" +
                "6) Vinaigrette\n\t" +
                "7) Au Jus");
        String allSauces = Console.promptForMultipleInts("Which sauces would you like? You can choose multiple using commas. ");
        if ( allSauces.contains("1")){
            Sauce mayo = new Sauce("Mayo",false);
            sauces.add(mayo);
        }
        if ( allSauces.contains("2")){
            Sauce mustard = new Sauce("Mustard",false);
            sauces.add(mustard);
        }
        if ( allSauces.contains("3")){
            Sauce ketchup = new Sauce("Ketchup",false);
            sauces.add(ketchup);
        }
        if ( allSauces.contains("4")){
            Sauce ranch = new Sauce("Ranch",false);
            sauces.add(ranch);
        }
        if ( allSauces.contains("5")){
            Sauce thousandIslands = new Sauce("Thousand Islands",false);
            sauces.add(thousandIslands);
        }
        if ( allSauces.contains("6")){
            Sauce vinaigrette = new Sauce("Vinaigrette",false);
            sauces.add(vinaigrette);
        }
        if ( allSauces.contains("7")){
            Sauce auJus = new Sauce("Au Jus",false);
            sauces.add(auJus);
        }
        System.out.print("Here are all of your sauces:\n\t");
        String pickedSauces = "";
        for (int i = 1; i <= sauces.size(); i++){
            pickedSauces += i + ") " + sauces.get(i-1).getName() + "\n\t";
        }
        System.out.println(pickedSauces);
        System.out.println("\t0) No Extra Toppings");
        String allExtras = Console.promptForMultipleInts("Which sauce would you like extra of? You can choose multiple using commas.");
        if (allExtras.contains("0")){
            return sauces;
        }
        for (int i = 1; i <= 9; i++){
            if (allExtras.contains(String.valueOf(i))) {
                sauces.get(i-1).setExtra(true);
            }
        }
        return sauces;
    }
}
