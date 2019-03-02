import java.text.NumberFormat;
import java.util.Random;

public class MenuItem {

    /**
     * Member Variables
     */
    private String itemName;
    private double itemPrice;

    /**
     * Constructor
     */
    MenuItem() {

        itemName = foodOption();
        itemPrice = totalCost(itemName);
    }

    /**
     * Methods
     */
    private static String foodOption() {

        String itemName;

        Random rand = new Random();
        int choice = rand.nextInt(3) + 1;

        if (choice == 1) {
            itemName = "Ribeye Steak";
        } else if (choice == 2) {
            itemName = "Rotisserie chicken";
        } else if (choice == 3) {
            itemName = "Roasted veggies";
        } else {
            itemName = "none";
        }

        return itemName;

    }

    private static double totalCost(String choice) {

        double cost;

        if (choice.equals("Ribeye Steak")) {
            cost = 20.00;
        } else if (choice.equals("Rotisserie chicken")) {
            cost = 15.00;
        } else if (choice.equals("Roasted veggies")) {
            cost = 10.00;
        } else {
            cost = 0.00;
        }

        return cost;

    }

    public void displayReceipt() {

        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println(itemName + " " + formatter.format(itemPrice));

    }


}
