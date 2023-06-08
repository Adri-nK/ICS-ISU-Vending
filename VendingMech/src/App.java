import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    private static final int MAX_ITEMS = 9;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");

    private static final String ITEM_1_NAME = "Chips";
    private static final double ITEM_1_PRICE = 2.50;
    private static int ITEM_1_INVENTORY = 5;

    private static final String ITEM_2_NAME = "Candy";
    private static final double ITEM_2_PRICE = 1.50;
    private static int ITEM_2_INVENTORY = 5;

    private static final String ITEM_3_NAME = "Gum";
    private static final double ITEM_3_PRICE = 1.00;
    private static int ITEM_3_INVENTORY = 5;

    private static final String ITEM_4_NAME = "Peace Tea";
    private static final double ITEM_4_PRICE = 3.00;
    private static int ITEM_4_INVENTORY = 5;

    private static final String ITEM_5_NAME = "Poky";
    private static final double ITEM_5_PRICE = 2.47;
    private static int ITEM_5_INVENTORY = 5;

    private static final String ITEM_6_NAME = "Milk";
    private static final double ITEM_6_PRICE = 2.00;
    private static int ITEM_6_INVENTORY = 5;

    private static final String ITEM_7_NAME = "Water";
    private static final double ITEM_7_PRICE = 2.75;
    private static int ITEM_7_INVENTORY = 5;

    private static final String ITEM_8_NAME = "Tik Taks";
    private static final double ITEM_8_PRICE = 30.00;
    private static int ITEM_8_INVENTORY = 5;

    private static final String ITEM_9_NAME = "Cake";
    private static final double ITEM_9_PRICE = 1.00;
    private static int ITEM_9_INVENTORY = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                    amountTendered = processItem(scanner, ITEM_1_NAME, ITEM_1_PRICE, ITEM_1_INVENTORY);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_1_PRICE) + ".");
                    }
                    break;
                case 2:
                    amountTendered = processItem(scanner, ITEM_2_NAME, ITEM_2_PRICE, ITEM_2_INVENTORY);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_2_PRICE) + ".");
                    }
                    break;
                case 3:
                    amountTendered = processItem(scanner, ITEM_3_NAME, ITEM_3_PRICE, ITEM_3_INVENTORY);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_3_PRICE) + ".");
                    }
                    break;
                case 4:
                    amountTendered = processItem(scanner, ITEM_4_NAME, ITEM_4_PRICE, ITEM_4_INVENTORY);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_4_PRICE) + ".");
                    }
                    break;
                case 5:
                    amountTendered = processItem(scanner, ITEM_5_NAME, ITEM_5_PRICE, ITEM_5_INVENTORY);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_5_PRICE) + ".");
                    }
                    break;
                case 6:
                    amountTendered = processItem(scanner, ITEM_6_NAME, ITEM_6_PRICE, ITEM_6_INVENTORY);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_6_PRICE) + ".");
                    }
                    break;
                case 7:
                    amountTendered = processItem(scanner, ITEM_7_NAME, ITEM_7_PRICE, ITEM_7_INVENTORY);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_7_PRICE) + ".");
                    }
                    break;
                case 8:
                    amountTendered = processItem(scanner, ITEM_8_NAME, ITEM_8_PRICE, ITEM_8_INVENTORY);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_8_PRICE) + ".");
                    }
                    break;
                case 9:
                    amountTendered = processItem(scanner, ITEM_9_NAME, ITEM_9_PRICE, ITEM_9_INVENTORY);
                    if (amountTendered > 0) {
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

    private static void displayMenu() {
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

    private static double processItem(Scanner scanner, String itemName, double itemPrice, int itemInventory) {
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

    private static int getTotalInventory() {
        return ITEM_1_INVENTORY + ITEM_2_INVENTORY + ITEM_3_INVENTORY + ITEM_4_INVENTORY +
                ITEM_5_INVENTORY + ITEM_6_INVENTORY + ITEM_7_INVENTORY + ITEM_8_INVENTORY + ITEM_9_INVENTORY;
    }
}
