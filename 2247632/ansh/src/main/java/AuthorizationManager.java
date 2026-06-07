
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AuthorizationManager {
    private Scanner scanner;
    private DashboardManager dashboardManager;
    private UserDatabase userDatabase;
    private FirstNameDatabase firstNameDatabase;
    private LastNameDatabase lastNameDatabase;
    private EmailDatabase emailDatabase;
    private AboutDatabase aboutDatabase;
    private History history;

    public AuthorizationManager() {
        scanner = new Scanner(System.in);
        userDatabase = new UserDatabase();
        firstNameDatabase = new FirstNameDatabase();
        lastNameDatabase = new LastNameDatabase();
        emailDatabase = new EmailDatabase();
        aboutDatabase = new AboutDatabase();
        history = new History();
        userDatabase.addUser(new UserCredentials("user1@example.com", "password1"));
        userDatabase.addUser(new UserCredentials("user2@example.com", "password2"));
        dashboardManager = new DashboardManager(history, firstNameDatabase, lastNameDatabase, emailDatabase, aboutDatabase);
    }

    public boolean showAuthorizationScreen() {
        System.out.println("Please choose an option:");
        System.out.println("1. Login");
        System.out.println("2. Signup");
        System.out.println("3. Close");
        System.out.println("Enter Your Choice :");

        int userChoice = scanner.nextInt();
        scanner.nextLine();

        switch (userChoice) {
            case 1:
                login();
                return true;
            case 2:
                signup();
                return true;
            case 3:
                return false;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                return true;
        }
    }

    private void login() {
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (userDatabase.isValidUser(email, password)) {
            System.out.println("Login successful!");
            history.log("User logged in: " + email);
            dashboardManager.showDashboardScreen(email);
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
    }

    private void signup() {
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        if (userDatabase.addUser(new UserCredentials(email, password))) {
            System.out.println("Signup successful!");
            history.log("New user signed up: " + email);
            dashboardManager.showDashboardScreen(email);
        } else {
            System.out.println("Email already exists. Please try again with a different email.");
        }
    }
}
