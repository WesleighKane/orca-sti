import java.util.Scanner;

public class DemoParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DinnerParty dinnerParty = new DinnerParty();

        System.out.print("Enter the number of guests for the dinner party: ");
        int guests = scanner.nextInt();
        dinnerParty.setNumGuests(guests);

        System.out.print("Enter the menu option (1 for chicken or 2 for beef): ");
        int menuOption = scanner.nextInt();
        dinnerParty.setFoodChoice(menuOption);

        System.out.println("\nThe dinner party has " + dinnerParty.getNumGuests() + " guests.");
        System.out.println("Menu option " + dinnerParty.getFoodChoice() + " will be served.");

        dinnerParty.showInvitation();
    }
}