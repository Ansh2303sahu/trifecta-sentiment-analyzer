import java.util.Scanner;
import java.util.List;

public class DashboardManager {
    private Scanner scanner;
    private SentimentAnalyzer sentimentAnalyzer;
    private History history;
    private FirstNameDatabase firstNameDatabase;
    private LastNameDatabase lastNameDatabase;
    private EmailDatabase emailDatabase;
    private AboutDatabase aboutDatabase;

    public DashboardManager(History history, FirstNameDatabase firstNameDatabase,
                            LastNameDatabase lastNameDatabase, EmailDatabase emailDatabase,
                            AboutDatabase aboutDatabase) {
        scanner = new Scanner(System.in);
        sentimentAnalyzer = new SentimentAnalyzer();
        this.history = history;
        this.firstNameDatabase = firstNameDatabase;
        this.lastNameDatabase = lastNameDatabase;
        this.emailDatabase = emailDatabase;
        this.aboutDatabase = aboutDatabase;
    }

    public void showDashboardScreen(String email) {
        boolean continueRunning = true;
        while (continueRunning) {
            System.out.println("Dashboard screen displayed.");
            System.out.println("1. Edit First Name");
            System.out.println("2. Edit Last Name");
            System.out.println("3. Edit Email Address");
            System.out.println("4. Edit About");
            System.out.println("5. Analyze Sentiment");
            System.out.println("6. View History");
            System.out.println("7. Logout");

            System.out.println("Enter your choice:");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice) {
                case 1:
                    editFirstName(email);
                    break;
                case 2:
                    editLastName(email);
                    break;
                case 3:
                    editEmailAddress(email);
                    break;
                case 4:
                    editAbout(email);
                    break;
                case 5:
                    sentimentAnalyzer.analyzeSentiment(history);
                    break;
                case 6:
                    viewHistory();
                    break;
                case 7:
                    System.out.println("Logging out...");
                    continueRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private void editFirstName(String email) {
        System.out.println("Enter your new first name:");
        String firstName = scanner.nextLine();
        firstNameDatabase.updateFirstName(email, firstName);
        history.log("User edited first name");
    }

    private void editLastName(String email) {
        System.out.println("Enter your new last name:");
        String lastName = scanner.nextLine();
        lastNameDatabase.updateLastName(email, lastName);
        history.log("User edited last name");
    }

    private void editEmailAddress(String email) {
        System.out.println("Enter your new email address:");
        String newEmail = scanner.nextLine();
        emailDatabase.updateEmailAddress(email, newEmail);
        history.log("User edited email address");
    }

    private void editAbout(String email) {
        System.out.println("Enter your new about information:");
        String about = scanner.nextLine();
        aboutDatabase.updateAbout(email, about);
        history.log("User edited about information");
    }

    private void viewHistory() {
        List<String> historyEntries = history.getHistoryEntries();
        if (historyEntries.isEmpty()) {
            System.out.println("History is empty.");
        } else {
            System.out.println("History:");
            for (String entry : historyEntries) {
                System.out.println(entry);
            }
        }
    }
}

