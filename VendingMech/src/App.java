import java.text.DecimalFormat;
import java.util.Scanner;
/*
Vasco L. Adrian K.
June 8, 2023
ISU
Creating a interactable vending machine in terminal.
*/
public class App {
    // Constants
    private static final int MAX_ITEMS = 9;
    private static final double CHIPS_PRICE = 2.50;
    private static final double CANDY_PRICE = 1.50;
    private static final double PEACE_TEA = 3.00;
    private static final double POKY = 2.47;
    private static final double MILK = 2.00;
    private static final double WATER = 2.75;
    private static final double TIK_TAKS = 30.00;
    private static final double CAKE = 1.00;
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
                case 4:
                    amountTendered = processItem(scanner, GUM_PRICE, gumInventory);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                decimalFormat.format(amountTendered - PEACE_TEA) + ".");
                    }
                    break;
                case 5:
                    amountTendered = processItem(scanner, GUM_PRICE, gumInventory);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                decimalFormat.format(amountTendered - POKY) + ".");
                    }
                    break;
                case 6:
                    amountTendered = processItem(scanner, GUM_PRICE, gumInventory);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                decimalFormat.format(amountTendered - MILK) + ".");
                    }
                    break;
                case 7:
                    amountTendered = processItem(scanner, GUM_PRICE, gumInventory);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                decimalFormat.format(amountTendered - WATER) + ".");
                    }
                    break;
                case 8:
                    amountTendered = processItem(scanner, GUM_PRICE, gumInventory);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                decimalFormat.format(amountTendered - TIK_TAKS) + ".");
                    }
                    break;
                case 9:
                    amountTendered = processItem(scanner, GUM_PRICE, gumInventory);
                    if (amountTendered > 0) {
                        System.out.println("Thank you for your purchase! Your change is $" +
                                decimalFormat.format(amountTendered - CAKE) + ".");
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