Banking System - A Practical Example
This repository demonstrates a simple banking system built with object-oriented design principles. The system includes functionality for creating an account, checking balance, withdrawing money, and displaying account details. Each feature is implemented step by step, following best practices for maintainability, flexibility, and scalability.

Structure
Account Creation: Users can create a new account by providing their name and deposit amount.
View Balance: Users can view the current balance of their account.
Withdraw Money: Users can withdraw money from their account if sufficient balance is available.
Display Account Details: Displays the account holder's name, balance, and account number.
Exit: Exits the banking system.
Each feature is structured as follows:

1. Account Creation
Before: The BankAccount class directly takes input and handles the creation process within a single method, leading to tightly coupled code.
After: The creation logic is separated into a method responsible for gathering user input and instantiating the BankAccount object, improving readability and maintainability.
2. View Balance
Before: The balance checking logic is directly implemented within the main program, tightly coupled with the rest of the system.
After: The BankAccount class exposes a viewBalance() method that is solely responsible for balance retrieval, making the code easier to maintain.
3. Withdraw Money
Before: The withdrawal logic is embedded in the main program, leading to tight coupling between user interaction and account functionality.
After: The BankAccount class has a withdrawMoney() method, which encapsulates the withdrawal logic and maintains separation of concerns.
4. Display Account Details
Before: The details are printed directly in the main program, making it harder to manage and extend.
After: The BankAccount class includes a method displayAccDetails() for encapsulating the logic, which improves modularity and reusability.
5. Exit
Before: The exit logic is handled in the main program, with direct calls to System.exit().
After: The exit functionality remains unchanged, but encapsulated properly within the main loop for better structure.
Benefits
Maintainability: Following best practices for separation of concerns makes it easier to update and extend the system without affecting existing code.
Flexibility: The system is more flexible, allowing for easy addition of new features (e.g., interest calculations, account transfers).
Scalability: The system can be easily extended to support multiple accounts or different types of banking operations.
Testability: The modular design makes it easier to write unit tests for individual components, like BankAccount.
Future Enhancements
Multiple Accounts: Support for managing multiple bank accounts in one system.
Interest Calculation: Implement interest on account balance and add methods for calculating and applying it.
Bank Transfers: Allow transfers between different accounts.
Error Handling: Improve validation for user inputs and transactions.
