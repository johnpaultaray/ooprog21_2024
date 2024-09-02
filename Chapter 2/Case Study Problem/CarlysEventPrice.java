import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        String motto = "Carly's makes the food that makes it a party.";
        displayMotto(motto);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of guests: ");
        int numberOfGuests = input.nextInt();
        final int PRICE_PER_PERSON = 35;
        int totalCost = numberOfGuests * PRICE_PER_PERSON;
        boolean isBigEvent = numberOfGuests >= 50;

        // Print the cost details
        System.out.println("Number of Guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_PERSON);
        System.out.println("Total price: $" + totalCost);
        System.out.println("Big event? " + isBigEvent);
    }

    public static void displayMotto(String motto) {
        int width = motto.length() + 6;
        String border = "*".repeat(width);  
        System.out.println(border);
        System.out.println("*  " + motto + "  *");
        System.out.println(border);  
    }
}