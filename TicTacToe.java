import java.util.Scanner;

public class TicTacToe {

    // Function to get user input
    public static int getUserInput(Scanner sc) {
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");

            // Check if input is integer
            if (sc.hasNextInt()) {
                slot = sc.nextInt();

                if (slot >= 1 && slot <= 9) {
                    return slot; // valid input
                } else {
                    System.out.println("Invalid choice! Enter between 1 and 9.");
                }
            } else {
                System.out.println("Invalid input! Enter a number.");
                sc.next(); // discard invalid input
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userSlot = getUserInput(sc);
        System.out.println("You selected slot: " + userSlot);

        sc.close();
    }
}