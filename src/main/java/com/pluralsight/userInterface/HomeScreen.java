package com.pluralsight.userInterface;

import com.pluralsight.Meat;

import java.util.Scanner;

public class HomeScreen {
    Scanner scanner = new Scanner(System.in);
//    Console console = new Console();

    public void homeScreen() {
        System.out.println("-----Sam's Bodega-----\n\t" +
                "1) New Order\n\t" +
                "0) Exit");
        int command = Console.promptForInt("What would you like to do?");
        while (true) {
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
        System.out.println("-----Order Screen-----\n\t" +
                "1) Add Sandwich\n\t" +
                "2) Add Drink\n\t" +
                "3) Add Chips\n\t" +
                "4) Checkout\n\t" +
                "0) Cancel Order");
        while (true) {
            int command = Console.promptForInt("What would you like to do?");
            switch (command) {
                case 1 -> addSandwich();
                case 2 -> addDrink();
                case 3 -> addChips();
                case 4 -> checkout();
                case 0 -> {
                    System.out.println("Thank you! Have a nice day!");
                    return;
                }
                default -> System.out.println("Invalid input. Please try again");
            }
        }
    }

    public void addSandwich() {
        String bread = selectBread();
        int size = selectSize();
        Meat meat = selectMeat(size);

        //create sandwich down here..
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
                "3) Large\n\t");
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

    public Meat selectMeat(int size) {

    }
}
