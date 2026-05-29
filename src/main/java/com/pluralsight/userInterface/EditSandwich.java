package com.pluralsight.userInterface;

import com.pluralsight.checkoutItems.Sandwich;
import com.pluralsight.toppings.RegularTopping;
import com.pluralsight.toppings.Sauce;
import com.pluralsight.toppings.Topping;

import java.util.ArrayList;

public class EditSandwich {

    public EditSandwich() {
    }

    public void editSandwich(Sandwich sandwich) {
        while (true) {
            int command = Console.promptForInt("Would you like to edit this sandwich?\n\t" +
                    "1) Yes\n\t" +
                    "2) No\n" +
                    "Please choose one: ");
            System.out.println();
            switch (command) {
                case 1 -> editAttribute(sandwich);
                case 2 -> {return;}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
    }

    public void editAttribute(Sandwich sandwich){
        while (true) {
            int command = Console.promptForInt("Which attribute would you like to edit?\n\t" +
                    "1) Size\n\t" +
                    "2) Bread\n\t" +
                    "3) Toasted\n\t" +
                    "4) Meat\n\t" +
                    "5) Cheese\n\t" +
                    "6) Toppings\n\t" +
                    "7) Sauces\n\t" +
                    "0) Exit\n" +
                    "Please choose one: ");
            System.out.println();
            switch (command) {
                case 1 -> editSize(sandwich);
                case 2 -> editBread(sandwich);
                case 3 -> editToasted(sandwich);
                case 4 -> editMeat(sandwich);
                case 5 -> editCheese(sandwich);
                case 6 -> editToppings(sandwich);
                case 7 -> editSauces(sandwich);
                case 0 -> {return;}
                default -> System.out.println("Invalid input. Please try again");
            }
        }
    }

    public void editSize(Sandwich sandwich) {
        while (true) {
            int command = Console.promptForInt("What size do you want your sandwich to be?\n\t" +
                    "1) Small (4\")\n\t" +
                    "2) Medium (8\")\n\t" +
                    "3) Large (12\")\n" +
                    "Please choose one: ");
            System.out.println();
            switch (command) {
                case 1 -> {
                    sandwich.setSize(4);
                    sandwich.getMeat().setSize(4);
                    sandwich.getCheese().setSize(4);
                    System.out.println("Size changed!");
                    return;
                }
                case 2 -> {
                    sandwich.setSize(8);
                    sandwich.getMeat().setSize(8);
                    sandwich.getCheese().setSize(8);
                    System.out.println("Size changed!");
                    return;
                }
                case 3 -> {
                    sandwich.setSize(12);
                    sandwich.getMeat().setSize(12);
                    sandwich.getCheese().setSize(12);
                    System.out.println("Size changed!");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again");
            }

        }
    }

    public void editBread(Sandwich sandwich) {
        while (true) {
            int command = Console.promptForInt("What bread do you want?\n\t" +
                    "1) White\n\t" +
                    "2) Wheat\n\t" +
                    "3) Rye\n\t" +
                    "4) Wrap\n" +
                    "Please choose one: ");
            System.out.println();
            switch (command) {
                case 1 -> {
                    sandwich.setBread("White");
                    System.out.println("Bread changed!");
                    return;
                }
                case 2 -> {
                    sandwich.setBread("Wheat");
                    System.out.println("Bread changed!");
                    return;
                }
                case 3 -> {
                    sandwich.setBread("Rye");
                    System.out.println("Bread changed!");
                    return;
                }
                case 4 -> {
                    sandwich.setBread("Wrap");
                    System.out.println("Bread changed!");
                }
                default -> System.out.println("Invalid input. Please try again");
            }

        }
    }

    public void editToasted(Sandwich sandwich) {
        while (true) {
            int command = Console.promptForInt("Do you want the bread to be toasted?\n\t" +
                    "1) Yes\n\t" +
                    "2) No\n" +
                    "Please choose one: ");
            System.out.println();
            switch (command) {
                case 1 -> {
                    sandwich.setToasted(true);
                    System.out.println("Status changed!");
                    return;
                }
                case 2 -> {
                    sandwich.setToasted(false);
                    System.out.println("Status changed!");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again");
            }

        }
    }

    public void editMeat(Sandwich sandwich) {
        while (true) {
            int command = Console.promptForInt("What kind of meat do you want?\n\t" +
                    "1) Steak\n\t" +
                    "2) Ham\n\t" +
                    "3) Salami\n\t" +
                    "4) Roast Beef\n\t" +
                    "5) Chicken\n\t" +
                    "6) Bacon\n" +
                    "Please choose one: ");
            System.out.println();
            switch (command) {
                case 1 -> {
                    sandwich.getMeat().setName("Steak");
                    editExtra(sandwich.getMeat());
                    System.out.println("Status changed!");
                    return;
                }
                case 2 -> {
                    sandwich.getMeat().setName("Ham");
                    editExtra(sandwich.getMeat());
                    System.out.println("Status changed!");
                    return;
                }
                case 3 -> {
                    sandwich.getMeat().setName("Salami");
                    editExtra(sandwich.getMeat());
                    System.out.println("Status changed!");
                    return;
                }
                case 4 -> {
                    sandwich.getMeat().setName("Roast Beef");
                    editExtra(sandwich.getMeat());
                    System.out.println("Status changed!");
                    return;
                }
                case 5 -> {
                    sandwich.getMeat().setName("Chicken");
                    editExtra(sandwich.getMeat());
                    System.out.println("Status changed!");
                    return;
                }
                case 6 -> {
                    sandwich.getMeat().setName("Bacon");
                    editExtra(sandwich.getMeat());
                    System.out.println("Status changed!");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again");
            }

        }
    }

    public void editCheese(Sandwich sandwich){
        while (true) {
            int command = Console.promptForInt("What kind of cheese do you want?\n\t" +
                    "1) American\n\t" +
                    "2) Provolone\n\t" +
                    "3) Cheddar\n\t" +
                    "4) Swiss\n" +
                    "Please choose one: ");
            System.out.println();
            switch (command) {
                case 1 -> {
                    sandwich.getCheese().setName("American");
                    editExtra(sandwich.getCheese());
                    System.out.println("Status changed!");
                    return;
                }
                case 2 -> {
                    sandwich.getCheese().setName("Provolone");
                    editExtra(sandwich.getCheese());
                    System.out.println("Status changed!");
                    return;
                }
                case 3 -> {
                    sandwich.getCheese().setName("Cheddar");
                    editExtra(sandwich.getCheese());
                    System.out.println("Status changed!");
                    return;
                }
                case 4 -> {
                    sandwich.getCheese().setName("Swiss");
                    editExtra(sandwich.getCheese());
                    System.out.println("Status changed!");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again");
            }

        }
    }

    public void editToppings(Sandwich sandwich) {
        while (true) {
            int command = Console.promptForInt("Do you want to add toppings or remove toppings?\n\t" +
                    "1) Add toppings\n\t" +
                    "2) Remove toppings\n" +
                    "Please choose one: ");
            System.out.println();
            switch (command) {
                case 1 -> {
                    addToppings(sandwich);
                    System.out.println("Toppings added!");
                    return;
                }
                case 2 -> {
                    removeToppings(sandwich);
                    System.out.println("Toppings removed!");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again");
            }

        }
    }

    public void editSauces(Sandwich sandwich) {
        while (true) {
            int command = Console.promptForInt("Do you want to add sauces or remove sauces?\n\t" +
                    "1) Add sauces\n\t" +
                    "2) Remove sauces\n" +
                    "Please choose one: ");
            System.out.println();
            switch (command) {
                case 1 -> {
                    addSauces(sandwich);
                    System.out.println("Sauces added!");
                    return;
                }
                case 2 -> {
                    removeSauces(sandwich);
                    System.out.println("Sauces removed!");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again");
            }

        }
    }

    public void addSauces(Sandwich sandwich) {
        System.out.println("Here are our list of ingredients:\n\t" +
                "1) Mayo\n\t" +
                "2) Mustard\n\t" +
                "3) Ketchup\n\t" +
                "4) Ranch\n\t" +
                "5) Thousand Islands\n\t" +
                "6) Vinaigrette\n\t" +
                "7) Au Jus");
        String allSauces = Console.promptForMultipleInts("Which toppings would you like? You can choose multiple using commas. ");
        System.out.println();
        ArrayList<String> saucesNames = new ArrayList<>();
        for (Sauce sauce: sandwich.getSauces()){
            saucesNames.add(sauce.getName());
        }
        if ( allSauces.contains("1") && saucesNames.contains("Mayo")){
            for (Sauce sauce : sandwich.getSauces()){
                if (sauce.getName().equalsIgnoreCase("Mayo")){
                    sauce.setExtra(true);
                }
            }
        } else if (allSauces.contains("1")) {
            sandwich.getSauces().add(new Sauce("Mayo",false));
        }
        if ( allSauces.contains("2") && saucesNames.contains("Mustard")){
            for (Sauce sauce : sandwich.getSauces()){
                if (sauce.getName().equalsIgnoreCase("Mustard")){
                    sauce.setExtra(true);
                }
            }
        } else if (allSauces.contains("2")) {
            sandwich.getSauces().add(new Sauce("Mustard",false));
        }
        if ( allSauces.contains("3") && saucesNames.contains("Ketchup")){
            for (Sauce sauce : sandwich.getSauces()){
                if (sauce.getName().equalsIgnoreCase("Ketchup")){
                    sauce.setExtra(true);
                }
            }
        } else if (allSauces.contains("3")) {
            sandwich.getSauces().add(new Sauce("Ketchup",false));
        }
        if ( allSauces.contains("4") && saucesNames.contains("Ranch")){
            for (Sauce sauce : sandwich.getSauces()){
                if (sauce.getName().equalsIgnoreCase("Ranch")){
                    sauce.setExtra(true);
                }
            }
        } else if (allSauces.contains("4")) {
            sandwich.getSauces().add(new Sauce("Ranch",false));
        }
        if ( allSauces.contains("5") && saucesNames.contains("Thousand Islands")){
            for (Sauce sauce : sandwich.getSauces()){
                if (sauce.getName().equalsIgnoreCase("Thousand Islands")){
                    sauce.setExtra(true);
                }
            }
        } else if (allSauces.contains("5")) {
            sandwich.getSauces().add(new Sauce("Thousand Islands",false));
        }
        if ( allSauces.contains("6") && saucesNames.contains("Vinaigrette")){
            for (Sauce sauce : sandwich.getSauces()){
                if (sauce.getName().equalsIgnoreCase("Vinaigrette")){
                    sauce.setExtra(true);
                }
            }
        } else if (allSauces.contains("6")) {
            sandwich.getSauces().add(new Sauce("Vinaigrette",false));
        }
        if ( allSauces.contains("7") && saucesNames.contains("Au Jus")){
            for (Sauce sauce : sandwich.getSauces()){
                if (sauce.getName().equalsIgnoreCase("Au Jus")){
                    sauce.setExtra(true);
                }
            }
        } else if (allSauces.contains("7")) {
            sandwich.getSauces().add(new Sauce("Au Jus",false));
        }
    }

    public void removeSauces(Sandwich sandwich) {
        System.out.print("Here are all the current options:\n\t ");
        for (int i = 1; i <= sandwich.getSauces().size(); i++){
            System.out.print("\t" + i + ") " + sandwich.getSauces().get(i-1).getName() + "\n\t");
        }
        String saucesToRemove = Console.promptForMultipleInts("Which sauces would you like to remove? You can choose multiple using commas. ");
        System.out.println();
        for (int i = sandwich.getSauces().size(); i > 0; i--) {
            if (saucesToRemove.contains(String.valueOf(i))) {
                sandwich.getSauces().remove(sandwich.getSauces().get(i-1));
            }
        }
    }

    public void addToppings(Sandwich sandwich) {
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
        System.out.println();
        ArrayList<String> toppingNames = new ArrayList<>();
        for (RegularTopping topping: sandwich.getToppings()){
            toppingNames.add(topping.getName());
        }
        if ( allToppings.contains("1") && toppingNames.contains("Lettuce")){
            for (RegularTopping topping : sandwich.getToppings()){
                if (topping.getName().equalsIgnoreCase("Lettuce")){
                    topping.setExtra(true);
                }
            }
        } else if (allToppings.contains("1")) {
            sandwich.getToppings().add(new RegularTopping("Lettuce",false));
        }
        if ( allToppings.contains("2") && toppingNames.contains("Peppers")){
            for (RegularTopping topping : sandwich.getToppings()){
                if (topping.getName().equalsIgnoreCase("Peppers")){
                    topping.setExtra(true);
                }
            }
        } else if (allToppings.contains("2")) {
            sandwich.getToppings().add(new RegularTopping("Peppers",false));
        }
        if ( allToppings.contains("3") && toppingNames.contains("Onions")){
            for (RegularTopping topping : sandwich.getToppings()){
                if (topping.getName().equalsIgnoreCase("Onions")){
                    topping.setExtra(true);
                }
            }
        } else if (allToppings.contains("3")) {
            sandwich.getToppings().add(new RegularTopping("Onions",false));
        }
        if ( allToppings.contains("4") && toppingNames.contains("Tomatoes")){
            for (RegularTopping topping : sandwich.getToppings()){
                if (topping.getName().equalsIgnoreCase("Tomatoes")){
                    topping.setExtra(true);
                }
            }
        } else if (allToppings.contains("4")) {
            sandwich.getToppings().add(new RegularTopping("Tomatoes",false));
        }
        if ( allToppings.contains("5") && toppingNames.contains("Jalapenos")){
            for (RegularTopping topping : sandwich.getToppings()){
                if (topping.getName().equalsIgnoreCase("Jalapenos")){
                    topping.setExtra(true);
                }
            }
        } else if (allToppings.contains("5")) {
            sandwich.getToppings().add(new RegularTopping("Jalapenos",false));
        }
        if ( allToppings.contains("6") && toppingNames.contains("Cucumbers")){
            for (RegularTopping topping : sandwich.getToppings()){
                if (topping.getName().equalsIgnoreCase("Cucumbers")){
                    topping.setExtra(true);
                }
            }
        } else if (allToppings.contains("6")) {
            sandwich.getToppings().add(new RegularTopping("Cucumbers",false));
        }
        if ( allToppings.contains("7") && toppingNames.contains("Pickles")){
            for (RegularTopping topping : sandwich.getToppings()){
                if (topping.getName().equalsIgnoreCase("Pickles")){
                    topping.setExtra(true);
                }
            }
        } else if (allToppings.contains("7")) {
            sandwich.getToppings().add(new RegularTopping("Pickles",false));
        }
        if ( allToppings.contains("8") && toppingNames.contains("Guacamole")){
            for (RegularTopping topping : sandwich.getToppings()){
                if (topping.getName().equalsIgnoreCase("Guacamole")){
                    topping.setExtra(true);
                }
            }
        } else if (allToppings.contains("8")) {
            sandwich.getToppings().add(new RegularTopping("Guacamole",false));
        }
        if ( allToppings.contains("9") && toppingNames.contains("Mushrooms")){
            for (RegularTopping topping : sandwich.getToppings()){
                if (topping.getName().equalsIgnoreCase("Mushrooms")){
                    topping.setExtra(true);
                }
            }
        } else if (allToppings.contains("9")) {
            sandwich.getToppings().add(new RegularTopping("Mushrooms",false));
        }
    }

    public void removeToppings(Sandwich sandwich) {
        System.out.print("Here are all the current options:\n\t ");
        for (int i = 1; i <= sandwich.getToppings().size(); i++){
            System.out.print("\t" + i + ") " + sandwich.getToppings().get(i-1).getName() + "\n\t");
        }
        String toppingsToRemove = Console.promptForMultipleInts("Which toppings would you like to remove? You can choose multiple using commas. ");
        System.out.println();
        for (int i = sandwich.getToppings().size(); i > 0; i--) {
            if (toppingsToRemove.contains(String.valueOf(i))) {
                sandwich.getToppings().remove(sandwich.getToppings().get(i-1));
            }
        }
    }

    public void editExtra(Topping topping) {
        while (true) {
            int command = Console.promptForInt("Do you want this to be extra?\n\t" +
                    "1) Yes\n\t" +
                    "2) No \n" +
                    "Please choose one:");
            System.out.println();
            switch (command) {
                case 1 -> {
                    topping.setExtra(true);
                    System.out.println("Topping is now extra");
                    return;
                }
                case 2 -> {
                    topping.setExtra(false);
                    System.out.println("Topping is now normal proportions");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again");
            }
        }

    }
}
