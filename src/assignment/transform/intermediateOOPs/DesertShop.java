package assignment.transform.intermediateOOPs;
//
//abstract class DessertItem{
//    public abstract int getCost();
//}
//
//class Candy extends DessertItem{
//
//    @Override
//    public int getCost() {
//        return 0;
//    }
//}
//
//public class DesertShop {
//}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class DessertItem {
    abstract double getCost();
}

class Candy extends DessertItem {
    @Override
    double getCost() {
        // Assume cost in dollars
        return 2.0;
    }
}

class Cookie extends DessertItem {
    @Override
    double getCost() {
        // Assume cost in euros
        return 1.5;
    }
}

class IceCream extends DessertItem {
    @Override
    double getCost() {
        // Assume cost in rupees
        return 100.0;
    }
}

public class DesertShop {
    private static List<DessertItem> storage = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter your role (owner, customer, or exit):");
            String role = scanner.nextLine();

            switch (role.toLowerCase()) {
                case "owner":
                    // Owner functionality
                    System.out.println("You are the owner. Add dessert items to storage.");
                    addItemsToStorage();
                    break;

                case "customer":
                    // Customer functionality
                    System.out.println("You are a customer. Place an order.");
                    placeOrder();
                    break;

                case "exit":
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid role. Please enter 'owner', 'customer', or 'exit'.");
                    break;
            }
        }

        scanner.close();
    }

    private static void addItemsToStorage() {
        System.out.println("Enter the type of dessert item (Candy, Cookie, IceCream):");
        String itemType = scanner.nextLine();

        DessertItem item = null;

        switch (itemType.toLowerCase()) {
            case "candy":
                item = new Candy();
                break;
            case "cookie":
                item = new Cookie();
                break;
            case "icecream":
                item = new IceCream();
                break;
            default:
                System.out.println("Invalid dessert item type.");
                return;
        }

        storage.add(item);
        System.out.println("Dessert item added to storage.");
    }

    private static void placeOrder() {
        if (storage.isEmpty()) {
            System.out.println("No dessert items available for order. Please add items to storage first.");
            return;
        }

        System.out.println("Available dessert items in storage:");
        for (DessertItem item : storage) {
            System.out.println(item.getClass().getSimpleName() + ": $" + item.getCost());
        }

        double totalCost = 0.0;

        while (true) {
            System.out.println("Enter the dessert item to order (type 'done' to finish):");
            String itemType = scanner.nextLine();

            if (itemType.equalsIgnoreCase("done")) {
                break;
            }

            for (DessertItem item : storage) {
                if (item.getClass().getSimpleName().toLowerCase().equals(itemType.toLowerCase())) {
                    totalCost += item.getCost();
                    System.out.println(itemType + " added to the order. Current total cost: $" + totalCost);
                    break;
                }
            }
        }
        System.out.println("Order placed. Total cost: $" + totalCost);
    }
}
