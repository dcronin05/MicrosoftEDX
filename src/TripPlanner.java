import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        intro();
        budget();
        time();
        area();
    }

    private static void intro() {
        System.out.println("Welcome to Vacation Planner!");
        String name = input("What is your name?");
        String destination = input("Nice to meet you " + name + ", where are you travelling to?");
        System.out.println("Great! " + destination + " sounds like a great trip.\n\n************\n");
    }

    private static void budget() {
        int days = Integer.parseInt(input("How many days are you going to spend travelling?"));
        int money = Integer.parseInt(input("How much money, in USD, are you planning to spend on your trip?"));
        String currency = input("What is the tree letter currency symbol for your travel destination?");
        double convert = Double.parseDouble(input("How many " + currency + " are there in 1 USD?"));
        int hours = days * 24;
        int minutes = days * 24 * 60;

        String travelDays = String.format("\nIf you are travelling for %d days that is the same as %d hours or %d minutes",
                days, hours, minutes);
        String moneySpent = String.format("If you are going to spend $%d USD that means per day you can spend up to $%.2f USD",
                money, money / (double) days);
        String foreignSpent = String.format("Your total budget in %s is %.2f, which per day is %.2f %s",
                currency, money * convert, money * convert / (double) days, currency);

        System.out.println(travelDays + "\n" + moneySpent + "\n" + foreignSpent + "\n\n************\n");
    }

    private static void time() {
//        int[] time = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
//        int arrayIndex = (difference >= 0) ? time[-1 + difference] : time[time.length + difference];
//        int nonArrayIndex = (difference >= 0) ? time[11 + difference] : time[time.length - 12 + difference];

        int difference = Integer.parseInt(input("What is the time difference, in hours, between your home and your destination?"));
        difference = (difference <= 0) ? 24 + difference : difference;

        System.out.println(
                String.format("That means that when it is midnight at home it will be %02d:00 in your travel destination"
                                + "\nand when it is noon at home it will be %02d:00"
                        , difference % 24
                        , difference % 12
                )
                        + "\n\n************\n");
    }

    private static void area() {
        int area = Integer.parseInt(input("What is the square area of your destination country in km?"));
        System.out.println(String.format(
                "In miles2 that is %.2f",
                (area / 2.59))
                + "\n\n************\n");
    }

    private static String input(String message) {
        Scanner input = new Scanner(System.in);
        System.out.print(message + " ");
        return input.nextLine();
    }
}
