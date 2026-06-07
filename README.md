# Trifecta Sentiment Analyzer

A Java console application that allows users to create an account, log in, manage profile details, analyze the sentiment of text, and view activity history.

## Features

- User login and signup
- Profile editing for first name, last name, email address, and about information
- Basic sentiment analysis for positive, negative, and neutral text
- Activity history with timestamps
- Console-based menu navigation

## Project Structure

```text
trifecta-sentiment-analyzer/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── AboutDatabase.java
│   │   │   ├── AuthorizationManager.java
│   │   │   ├── DashboardManager.java
│   │   │   ├── EmailDatabase.java
│   │   │   ├── FirstNameDatabase.java
│   │   │   ├── History.java
│   │   │   ├── LastNameDatabase.java
│   │   │   ├── SentimentAnalyzer.java
│   │   │   ├── TrifectaApp.java
│   │   │   ├── UserCredentials.java
│   │   │   └── UserDatabase.java
│   │   └── resources/
│   └── test/
│       └── java/
├── .gitignore
├── pom.xml
└── README.md
Requirements
Java 17 or later
Maven, optional but recommended
How to Run
Option 1: Run with Maven
mvn compile
mvn exec:java
Option 2: Run with Java commands
javac src/main/java/*.java
java -cp src/main/java TrifectaApp
Demo Login Details

The application includes sample users for testing:

Email: user1@example.com
Password: password1

Email: user2@example.com
Password: password2

You can also create a new account using the signup option.

Sentiment Analysis

The sentiment analyzer checks user text for simple positive and negative keywords.

Examples:

good or excellent → Positive
bad or terrible → Negative
Equal or no matches → Neutral
Notes

This is a beginner-friendly Java console project covering user authentication, profile management, activity history, and simple sentiment analysis.

Future improvements could include:

File or database storage
Stronger input validation
A graphical user interface
More advanced sentiment analysis

Use this repo name:

```text
trifecta-sentiment-analyzer
