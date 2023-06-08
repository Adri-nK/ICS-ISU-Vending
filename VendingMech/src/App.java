import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    // Constants
    private static final int MAX_ITEMS = 9;
    private static final double CHIPS_PRICE = 2.50;
    private static final double CANDY_PRICE = 1.50;
    private static final double GUM_PRICE = 1.00;

    // Variables
    private static int chipsInventory = 5;
    private static int candyInventory = 5;
    private static int gumInventory = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        displayMenu();

        int selection;
        do {
            System.out.print("Please enter your selection: ");
            selection = scanner.nextInt();

            if (selection == 10) {
                System.out.println("Thank you. See you next time!");
                break;
            }

            double amountTendered;
            switch (selection) {
                case 1:
                    amountTendered = processItem(scanner, CHIPS_PRICE, chipsInventory);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                decimalFormat.format(amountTendered - CHIPS_PRICE) + ".");
                    }
                    break;
                case 2:
                    amountTendered = processItem(scanner, CANDY_PRICE, candyInventory);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                decimalFormat.format(amountTendered - CANDY_PRICE) + ".");
                    }
                    break;
                case 3:
                    amountTendered = processItem(scanner, GUM_PRICE, gumInventory);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                decimalFormat.format(amountTendered - GUM_PRICE) + ".");
                    }
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }

            displayMenu();
        } while (true);
    }

    private static void displayMenu() {
        System.out.println("*************************************************************************************************************");
        System.out.println("Treat Stop");
        System.out.println("*************************************************************************************************************");
        System.out.println();
        System.out.println("1. Chips ($" + CHIPS_PRICE + ") - " + chipsInventory + "\t\t2. Candy ($" + CANDY_PRICE + ") - " + candyInventory + "\t\t3. Gum ($" + GUM_PRICE + ") - " + gumInventory);
        System.out.println("... need " + (MAX_ITEMS - (chipsInventory + candyInventory + gumInventory)) + " items");
        System.out.println();
        System.out.println("\t\t\t10. Exit");
        System.out.println();
        System.out.println("*************************************************************************************************************");
    }

    private static double processItem(Scanner scanner, double itemPrice, int itemInventory) {
        if (itemInventory <= 0) {
            System.out.println("Sorry, this item is out of stock.");
            return 0;
        }

        System.out.print("Please enter amount tendered ($): ");
        double amountTendered = scanner.nextDouble();

        if (amountTendered < itemPrice) {
            System.out.println("Insufficient amount. Please try again.");
            return 0;
        }

        itemInventory--;
        return amountTendered;
    }
}
/*



/*
Vasco L. Adrian K.
June 8, 2023
ISU
Creating a interactable vending machine in terminal.
*


import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner customer = new Scanner(System.in);
        Product peaceTea = new Product("Peace Tea", 3.00, 100);
        
        
        
    }
}

 /* *
  vending Mech got vvvvv
- to String what its got
- item item with name, amout and value/cost also tax
- dispense item
- stock itmes
- display (gui to be extra)
- 
  
  */
  