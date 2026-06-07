Element 011
SID - 2247632 (Ansh Sahu)
Trifecta App Sentiment Analyzer.



The Trifecta application offers users a comprehensive platform for managing their profiles and performing sentiment analysis. To utilize the program effectively, a user can follow these steps:

Launching the Application: Upon launching the application, the user is greeted with a welcoming splash screen, providing a visually appealing start to the experience.
Authorization:The user is prompted to choose between logging in, signing up for a new account, or closing the application. If new to Trifecta, the user can sign up by providing their email and creating a password. For returning users, logging in with existing credentials grants access to their account.
Dashboard Navigation: Once logged in, the user is presented with a dashboard offering various options such as editing profile information (first name, last name, email, about), analyzing sentiment of text input, viewing activity history, and logging out.
Profile Management: Through the dashboard, the user can conveniently update their profile information by editing their first name, last name, email address, and a brief about section.
Sentiment Analysis: The user can input any sentence or text to analyze its sentiment. The program evaluates the provided text for positive or negative sentiment and presents the overall sentiment result.
Activity History: The user can also view their activity history, which logs significant actions performed within the application, providing a record of their interactions.
Logout: Lastly, when the user is finished using the application, they can log out to ensure the security of their account.
In summary, the Trifecta application simplifies user interaction by offering intuitive navigation and versatile features for profile management and sentiment analysis, enhancing the user experience and productivity.


The provided Java code constitutes a program called "Trifecta" designed to manage user authentication, profile editing, sentiment analysis, and activity history tracking. Here's a breakdown of its functionality:

TrifectaApp:
Initializes the application and displays a splash screen.
Calls the AuthorizationManager to handle user authorization.
AuthorizationManager:
Manages user authentication (login and signup) and application exit.
Displays an authorization screen where users can choose between login, signup, or closing the application.
Communicates with the UserDatabase to validate user credentials and manage user data.
Upon successful login or signup, calls the DashboardManager to manage the user dashboard.
DashboardManager:
Manages the user dashboard, offering various functionalities.
Allows users to edit profile information (first name, last name, email, about), analyze sentiment, view activity history, and logout.
Communicates with relevant databases (FirstNameDatabase, LastNameDatabase, EmailDatabase, AboutDatabase) to update user profile information.
Utilizes the SentimentAnalyzer to perform sentiment analysis on text inputs.
Displays the dashboard screen and handles user interaction until logout.
SentimentAnalyzer:
Analyzes the sentiment of a given sentence based on positive and negative words.
Allows users to input text for sentiment analysis and provides an overall sentiment result.
Logs sentiment analysis activities in the history.
History:
Logs user activities along with timestamps.
Provides methods to log user activities and retrieve activity history entries.
Databases (FirstNameDatabase, LastNameDatabase, EmailDatabase, AboutDatabase):
Manage user profile information (first name, last name, email, about).
Provide methods to update user profile data.
In essence, this code creates a functional application where users can authenticate, manage their profiles, perform sentiment analysis, and track their activity history efficiently.


(PLease notice that this is just a primary project as per a First Year knowledge and a lot of changes and advancements would make this program more enhanced for future use. Right now it is just at a fairly new state of Natural Language processing using certain word use cases, it would rather just use an external library like stanfordcoreNLP for more accurate results)






