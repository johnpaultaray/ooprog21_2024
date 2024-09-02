import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        String motto = "Sammy's makes it fun in the sun.";
        displayMotto(motto);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes you rented the equipment: ");
        int minutesRented = input.nextInt();
        final int RATE_PER_HOUR = 40;
        
        int hours = minutesRented / 60;
        int additionalMinutes = minutesRented % 60;
        int totalCost = (hours * RATE_PER_HOUR) + additionalMinutes;

        System.out.println("Hours rented: " + hours);
        System.out.println("Additional minutes: " + additionalMinutes);
        System.out.println("The total rental cost is: $" + totalCost);

        input.close(); 
    }

    public static void displayMotto(String motto) {
        int width = motto.length() + 5;
        String border = "S".repeat(width); 

        System.out.println(border);
        System.out.println("S  " + motto + " S");
        System.out.println(border);
    }
}