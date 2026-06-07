import java.util.List;
import java.util.ArrayList;

public class LastNameDatabase {
    private List<String> lastNames;

    public LastNameDatabase() {
        lastNames = new ArrayList<>();
    }

    public void updateLastName(String email, String lastName) {
        lastNames.add(email + ": " + lastName);
        System.out.println("Last name updated to: " + lastName);
    }
}

