import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class History {
    private List<String> logEntries;

    public History() {
        logEntries = new ArrayList<>();
    }

    public void log(String activity) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        logEntries.add(formattedDateTime + " - " + activity);
        System.out.println("Activity logged: " + activity);
    }

    public List<String> getHistoryEntries() {
        return logEntries;
    }
}

