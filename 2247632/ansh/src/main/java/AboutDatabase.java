import java.util.List;
import java.util.ArrayList;

public class AboutDatabase {
    private List<String> aboutInfo;

    public AboutDatabase() {
        aboutInfo = new ArrayList<>();
    }

    public void updateAbout(String email, String about) {
        aboutInfo.add(email + ": " + about);
        System.out.println("About information updated.");
    }
}
