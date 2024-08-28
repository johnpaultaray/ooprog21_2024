import java.util.Scanner;

public class warmup_sleepin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Is it a weekday? \n(true or false) ");
        boolean weekday = scanner.nextBoolean();
        System.out.print("Are we on vacation? (true or false): ");
        boolean vacation = scanner.nextBoolean();
        boolean result = sleepIn(weekday, vacation);
        System.out.println("Do we sleep in? " + result);
        scanner.close();
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}