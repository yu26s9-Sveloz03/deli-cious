package com.pluralsight;

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
        int command = Console.promptForInt("What would you like to do?");
    }
}
