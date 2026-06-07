import java.util.List;
import java.util.ArrayList;

public class UserDatabase {
    private List<UserCredentials> users;

    public UserDatabase() {
        users = new ArrayList<>();
    }

    public boolean addUser(UserCredentials user) {
        for (UserCredentials existingUser : users) {
            if (existingUser.getEmail().equals(user.getEmail())) {
                return false;
            }
        }
        users.add(user);
        return true;
    }

    public boolean isValidUser(String email, String password) {
        for (UserCredentials user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

