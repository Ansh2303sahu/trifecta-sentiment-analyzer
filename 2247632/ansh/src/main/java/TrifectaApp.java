import java.util.Scanner;

public class TrifectaApp {
    private Scanner scanner;

    public TrifectaApp() {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        TrifectaApp trifectaApp = new TrifectaApp();
        trifectaApp.start();
    }

    public void start() {
        initApp();
    }

    private void initApp() {
        displaySplashScreen();
    }

    private void displaySplashScreen() {
        System.out.println("WELCOME TO TRIFECTA");
        System.out.println("loading...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        initializeApp();
    }

    private void initializeApp() {
        AuthorizationManager authorizationManager = new AuthorizationManager();
        boolean continueRunning = true;
        while (continueRunning) {
            continueRunning = authorizationManager.showAuthorizationScreen();
        }
    }
}
