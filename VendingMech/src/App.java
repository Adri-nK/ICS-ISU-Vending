import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");
    private static final Scanner scanner = new Scanner(System.in);

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

    private static final int MENU_EXIT = 0;
    private static final int MENU_ITEM_1 = 1;
    private static final int MENU_ITEM_2 = 2;
    private static final int MENU_ITEM_3 = 3;
    private static final int MENU_ITEM_4 = 4;
    private static final int MENU_ITEM_5 = 5;
    private static final int MENU_ITEM_6 = 6;
    private static final int MENU_ITEM_7 = 7;
    private static final int MENU_ITEM_8 = 8;
    private static final int MENU_ITEM_9 = 9;

    public static void main(String[] args) {
        displayMenu();

        int selection;
        do {
            selection = getUserSelection();

            if (selection == MENU_EXIT) {
                System.out.println("Thank you. See you next time!");
                break;
            }

            double amountTendered;
            switch (selection) {
                case MENU_ITEM_1:
                    amountTendered = processItem(ITEM_1_NAME, ITEM_1_PRICE, ITEM_1_INVENTORY);
                    if (amountTendered > 0) {
                        String changeMessage = "Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_1_PRICE) + ".";
                        showMessage(changeMessage);
                    }
                    break;
                case MENU_ITEM_2:
                    amountTendered = processItem(ITEM_2_NAME, ITEM_2_PRICE, ITEM_2_INVENTORY);
                    if (amountTendered > 0) {
                        String changeMessage = "Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_2_PRICE) + ".";
                        showMessage(changeMessage);
                    }
                    break;
                case MENU_ITEM_3:
                    amountTendered = processItem(ITEM_3_NAME, ITEM_3_PRICE, ITEM_3_INVENTORY);
                    if (amountTendered > 0) {
                        String changeMessage = "Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_3_PRICE) + ".";
                        showMessage(changeMessage);
                    }
                    break;
                case MENU_ITEM_4:
                    amountTendered = processItem(ITEM_4_NAME, ITEM_4_PRICE, ITEM_4_INVENTORY);
                    if (amountTendered > 0) {
                        String changeMessage = "Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_4_PRICE) + ".";
                        showMessage(changeMessage);
                    }
                    break;
                case MENU_ITEM_5:
                    amountTendered = processItem(ITEM_5_NAME, ITEM_5_PRICE, ITEM_5_INVENTORY);
                    if (amountTendered > 0) {
                        String changeMessage = "Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_5_PRICE) + ".";
                        showMessage(changeMessage);
                    }
                    break;
                case MENU_ITEM_6:
                    amountTendered = processItem(ITEM_6_NAME, ITEM_6_PRICE, ITEM_6_INVENTORY);
                    if (amountTendered > 0) {
                        String changeMessage = "Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_6_PRICE) + ".";
                        showMessage(changeMessage);
                    }
                    break;
                case MENU_ITEM_7:
                    amountTendered = processItem(ITEM_7_NAME, ITEM_7_PRICE, ITEM_7_INVENTORY);
                    if (amountTendered > 0) {
                        String changeMessage = "Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_7_PRICE) + ".";
                        showMessage(changeMessage);
                    }
                    break;
                case MENU_ITEM_8:
                    amountTendered = processItem(ITEM_8_NAME, ITEM_8_PRICE, ITEM_8_INVENTORY);
                    if (amountTendered > 0) {
                        String changeMessage = "Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_8_PRICE) + ".";
                        showMessage(changeMessage);
                    }
                    break;
                case MENU_ITEM_9:
                    amountTendered = processItem(ITEM_9_NAME, ITEM_9_PRICE, ITEM_9_INVENTORY);
                    if (amountTendered > 0) {
                        String changeMessage = "Thank you for your purchase! Your change is $" +
                                DECIMAL_FORMAT.format(amountTendered - ITEM_9_PRICE) + ".";
                        showMessage(changeMessage);
                    }
                    break;
                default:
                    showMessage("Invalid selection. Please try again.");
                    break;
            }

            displayMenu();
        } while (true);
    }

    private static void displayMenu() {
        String menuText = "*************************************************************************************************************\n"
                + "Treat Stop\n"
                + "*************************************************************************************************************\n\n"
                + getMenuItemsText() + "\n"
                + "\t\t\t" + MENU_EXIT + ". Exit\n\n"
                + "*************************************************************************************************************";

        showMessage(menuText);
    }

    private static String getMenuItemsText() {
        StringBuilder sb = new StringBuilder();
        sb.append(MENU_ITEM_1).append(". ").append(ITEM_1_NAME).append(" ($").append(ITEM_1_PRICE).append(") - ").append(ITEM_1_INVENTORY).append("\n");
        sb.append(MENU_ITEM_2).append(". ").append(ITEM_2_NAME).append(" ($").append(ITEM_2_PRICE).append(") - ").append(ITEM_2_INVENTORY).append("\n");
        sb.append(MENU_ITEM_3).append(". ").append(ITEM_3_NAME).append(" ($").append(ITEM_3_PRICE).append(") - ").append(ITEM_3_INVENTORY).append("\n");
        sb.append(MENU_ITEM_4).append(". ").append(ITEM_4_NAME).append(" ($").append(ITEM_4_PRICE).append(") - ").append(ITEM_4_INVENTORY).append("\n");
        sb.append(MENU_ITEM_5).append(". ").append(ITEM_5_NAME).append(" ($").append(ITEM_5_PRICE).append(") - ").append(ITEM_5_INVENTORY).append("\n");
        sb.append(MENU_ITEM_6).append(". ").append(ITEM_6_NAME).append(" ($").append(ITEM_6_PRICE).append(") - ").append(ITEM_6_INVENTORY).append("\n");
        sb.append(MENU_ITEM_7).append(". ").append(ITEM_7_NAME).append(" ($").append(ITEM_7_PRICE).append(") - ").append(ITEM_7_INVENTORY).append("\n");
        sb.append(MENU_ITEM_8).append(". ").append(ITEM_8_NAME).append(" ($").append(ITEM_8_PRICE).append(") - ").append(ITEM_8_INVENTORY).append("\n");
        sb.append(MENU_ITEM_9).append(". ").append(ITEM_9_NAME).append(" ($").append(ITEM_9_PRICE).append(") - ").append(ITEM_9_INVENTORY).append("\n");
        return sb.toString();
    }

    private static int getUserSelection() {
        String input = JOptionPane.showInputDialog("Please enter your selection:");
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static double processItem(String itemName, double itemPrice, int itemInventory) {
        if (itemInventory <= 0) {
            showMessage("Sorry, " + itemName + " is out of stock.");
            return 0;
        }

        showMessage("You selected: " + itemName);
        showMessage("Price: $" + DECIMAL_FORMAT.format(itemPrice));

        double amountTendered;
        do {
            String input = JOptionPane.showInputDialog("Please enter the amount tendered:");
            try {
                amountTendered = Double.parseDouble(input);
                if (amountTendered < itemPrice) {
                    showMessage("Insufficient amount. Please try again.");
                }
            } catch (NumberFormatException e) {
                amountTendered = -1;
            }
        } while (amountTendered < itemPrice);

        itemInventory--;
        showMessage("Inventory for " + itemName + " remaining: " + itemInventory);
        return amountTendered;
    }

    private static void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
