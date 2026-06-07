import java.util.List;
import java.util.ArrayList;

public class EmailDatabase {
    private List<String> emailAddresses;

    public EmailDatabase() {
        emailAddresses = new ArrayList<>();
    }

    public void updateEmailAddress(String oldEmail, String newEmail) {
        emailAddresses.add(oldEmail + ": " + newEmail);
        System.out.println("Email address updated to: " + newEmail);
    }
}

