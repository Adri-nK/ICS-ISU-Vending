/*
Vasco L. and Adrian K.
    June 8, 2023
    Final project
    We will be creating a vending machine that will nine options of items and be able to buy these items and restock them
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");
    //setting items
    private static final String ITEM_1_NAME = "Chips";
    private static final double ITEM_1_PRICE = 2.50;
    private static int ITEM_1_INVENTORY = 1;

    private static final String ITEM_2_NAME = "Candy";
    private static final double ITEM_2_PRICE = 1.50;
    private static int ITEM_2_INVENTORY = 2;

    private static final String ITEM_3_NAME = "Gum";
    private static final double ITEM_3_PRICE = 1.00;
    private static int ITEM_3_INVENTORY = 3;

    private static final String ITEM_4_NAME = "Peace Tea";
    private static final double ITEM_4_PRICE = 3.00;
    private static int ITEM_4_INVENTORY = 4;

    private static final String ITEM_5_NAME = "Poky";
    private static final double ITEM_5_PRICE = 2.47;
    private static int ITEM_5_INVENTORY = 5;

    private static final String ITEM_6_NAME = "Milk";
    private static final double ITEM_6_PRICE = 2.00;
    private static int ITEM_6_INVENTORY = 6;

    private static final String ITEM_7_NAME = "Water";
    private static final double ITEM_7_PRICE = 2.75;
    private static int ITEM_7_INVENTORY = 7;

    private static final String ITEM_8_NAME = "Tik Taks";
    private static final double ITEM_8_PRICE = 30.00;
    private static int ITEM_8_INVENTORY = 8;

    private static final String ITEM_9_NAME = "Cake";
    private static final double ITEM_9_PRICE = 1.00;
    private static int ITEM_9_INVENTORY = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayMenu(); // Calls the method to print the menu in the terminal

        int selection;
        do {
            System.out.print("Please enter your selection: ");
            selection = scanner.nextInt();

            // Exit option
            if (selection == 10) {
                System.out.println("Thank you. See you next time!");
                break;
            }

            double amountTendered;
            switch (selection) { // here we select the item to buy and update the inventory
                case 1:
                    amountTendered = processItem(scanner, ITEM_1_NAME, ITEM_1_PRICE);
                    if (amountTendered > 0) {
                        ITEM_1_INVENTORY--;
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_1_PRICE) + ".");
                    }
                    break;
                case 2:
                    amountTendered = processItem(scanner, ITEM_2_NAME, ITEM_2_PRICE);
                    if (amountTendered > 0) {
                        ITEM_2_INVENTORY--;
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_2_PRICE) + ".");
                    }
                    break;
                case 3:
                    amountTendered = processItem(scanner, ITEM_3_NAME, ITEM_3_PRICE);
                    if (amountTendered > 0) {
                        ITEM_3_INVENTORY--;
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_3_PRICE) + ".");
                    }
                    break;
                case 4:
                    amountTendered = processItem(scanner, ITEM_4_NAME, ITEM_4_PRICE);
                    if (amountTendered > 0) {
                        ITEM_4_INVENTORY--;
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_4_PRICE) + ".");
                    }
                    break;
                case 5:
                    amountTendered = processItem(scanner, ITEM_5_NAME, ITEM_5_PRICE);
                    if (amountTendered > 0) {
                        ITEM_5_INVENTORY--;
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_5_PRICE) + ".");
                    }
                    break;
                case 6:
                    amountTendered = processItem(scanner, ITEM_6_NAME, ITEM_6_PRICE);
                    if (amountTendered > 0) {
                        ITEM_6_INVENTORY--;
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_6_PRICE) + ".");
                    }
                    break;
                case 7:
                    amountTendered = processItem(scanner, ITEM_7_NAME, ITEM_7_PRICE);
                    if (amountTendered > 0) {
                        ITEM_7_INVENTORY--;
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_7_PRICE) + ".");
                    }
                    break;
                case 8:
                    amountTendered = processItem(scanner, ITEM_8_NAME, ITEM_8_PRICE);
                    if (amountTendered > 0) {
                        ITEM_8_INVENTORY--;
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_8_PRICE) + ".");
                    }
                    break;
                case 9:
                    amountTendered = processItem(scanner, ITEM_9_NAME, ITEM_9_PRICE);
                    if (amountTendered > 0) {
                        ITEM_9_INVENTORY--;
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_9_PRICE) + ".");
                    }
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    break;
            }

            displayMenu();
        } while (true);
    }

        private static double processItem(Scanner scanner, String itemName, double itemPrice) {
        int itemInventory;
        // here we update the inventory
        switch (itemName) {
            case ITEM_1_NAME:
                itemInventory = ITEM_1_INVENTORY;
                break;
            case ITEM_2_NAME:
                itemInventory = ITEM_2_INVENTORY;
                break;
            case ITEM_3_NAME:
                itemInventory = ITEM_3_INVENTORY;
                break;
            case ITEM_4_NAME:
                itemInventory = ITEM_4_INVENTORY;
                break;
            case ITEM_5_NAME:
                itemInventory = ITEM_5_INVENTORY;
                break;
            case ITEM_6_NAME:
                itemInventory = ITEM_6_INVENTORY;
                break;
            case ITEM_7_NAME:
                itemInventory = ITEM_7_INVENTORY;
                break;
            case ITEM_8_NAME:
                itemInventory = ITEM_8_INVENTORY;
                break;
            case ITEM_9_NAME:
                itemInventory = ITEM_9_INVENTORY;
                break;
            default:
                itemInventory = 0;
                break;
        }

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

        return amountTendered;
    }


    private static void displayMenu() { //menu displayed when selecting item
        System.out.println("*************************************************************************************************************");
        System.out.println("Treat Stop");
        System.out.println("*************************************************************************************************************");
        System.out.println();
        System.out.println("1. " + ITEM_1_NAME + " ($" + ITEM_1_PRICE + ") - " + ITEM_1_INVENTORY +
                "\t\t2. " + ITEM_2_NAME + " ($" + ITEM_2_PRICE + ") - " + ITEM_2_INVENTORY +
                "\t\t3. " + ITEM_3_NAME + " ($" + ITEM_3_PRICE + ") - " + ITEM_3_INVENTORY);
        System.out.println("4. " + ITEM_4_NAME + " ($" + ITEM_4_PRICE + ") - " + ITEM_4_INVENTORY +
                "\t\t5. " + ITEM_5_NAME + " ($" + ITEM_5_PRICE + ") - " + ITEM_5_INVENTORY +
                "\t\t6. " + ITEM_6_NAME + " ($" + ITEM_6_PRICE + ") - " + ITEM_6_INVENTORY);
        System.out.println("7. " + ITEM_7_NAME + " ($" + ITEM_7_PRICE + ") - " + ITEM_7_INVENTORY +
                "\t\t8. " + ITEM_8_NAME + " ($" + ITEM_8_PRICE + ") - " + ITEM_8_INVENTORY +
                "\t\t9. " + ITEM_9_NAME + " ($" + ITEM_9_PRICE + ") - " + ITEM_9_INVENTORY);
        System.out.println();
        System.out.println("\t\t\t10. Exit");
        System.out.println();
        System.out.println("*************************************************************************************************************");
    }
}