import java.util.List;
import java.util.ArrayList;

public class FirstNameDatabase {
    private List<String> firstNames;

    public FirstNameDatabase() {
        firstNames = new ArrayList<>();
    }

    public void updateFirstName(String email, String firstName) {
        firstNames.add(email + ": " + firstName);
        System.out.println("First name updated to: " + firstName);
    }
}