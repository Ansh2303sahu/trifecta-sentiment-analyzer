import java.util.Scanner;

public class SentimentAnalyzer {
    private Scanner scanner;

    public SentimentAnalyzer() {
        scanner = new Scanner(System.in);
    }

    public void analyzeSentiment(History history) {
        System.out.println("Enter a sentence to analyze its sentiment:");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        String overallSentiment = analyzeOverallSentiment(words);
        System.out.println("Overall Sentiment: " + overallSentiment);
        history.log("User analyzed sentiment");
    }

    private String analyzeOverallSentiment(String[] words) {
        int positiveCount = 0;
        int negativeCount = 0;

        for (String word : words) {
            if (isPositive(word)) {
                positiveCount++;
            } else if (isNegative(word)) {
                negativeCount++;
            }
        }

        if (positiveCount > negativeCount) {
            return "Positive";
        } else if (negativeCount > positiveCount) {
            return "Negative";
        } else {
            return "Neutral";
        }
    }

    private boolean isPositive(String word) {
        return word.contains("good") || word.contains("excellent");
    }

    private boolean isNegative(String word) {
        return word.contains("bad") || word.contains("terrible");
    }
}

