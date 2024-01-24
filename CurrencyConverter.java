import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter!");
        System.out.print("Enter the amount in USD: ");

        // Read the amount in USD from the user
        double usdAmount = scanner.nextDouble();

        // Define the exchange rate (you can update these rates accordingly)
        double exchangeRate = 1.18;  // Example: USD to EUR exchange rate

        // Convert USD to another currency
        double convertedAmount = usdAmount * exchangeRate;

        // Display the result

        System.out.println("Equivalent amount in another currency: " + convertedAmount);

        // Close the scanner
        scanner.close();
    }
}
