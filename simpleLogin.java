import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "1234";

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Incorrect credentials.");
        }

        input.close();
    }
}
