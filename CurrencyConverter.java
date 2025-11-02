import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined exchange rates (for demo)
        double usdToInr = 83.10;
        double eurToInr = 88.50;
        double gbpToInr = 102.30;
        double inrToUsd = 1 / usdToInr;
        double inrToEur = 1 / eurToInr;
        double inrToGbp = 1 / gbpToInr;

        System.out.println("💱 SIMPLE CURRENCY CONVERTER 💱");
        System.out.println("Available currencies: USD, INR, EUR, GBP");
        System.out.print("Enter base currency: ");
        String base = sc.next().toUpperCase();
        System.out.print("Enter target currency: ");
        String target = sc.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();
        double convertedAmount = 0;

        if (base.equals("USD") && target.equals("INR"))
            convertedAmount = amount * usdToInr;
        else if (base.equals("INR") && target.equals("USD"))
            convertedAmount = amount * inrToUsd;
        else if (base.equals("EUR") && target.equals("INR"))
            convertedAmount = amount * eurToInr;
        else if (base.equals("INR") && target.equals("EUR"))
            convertedAmount = amount * inrToEur;
        else if (base.equals("GBP") && target.equals("INR"))
            convertedAmount = amount * gbpToInr;
        else if (base.equals("INR") && target.equals("GBP"))
            convertedAmount = amount * inrToGbp;
        else
            System.out.println("⚠️ Conversion not available for this pair.");

        if (convertedAmount != 0)
            System.out.printf("✅ %.2f %s = %.2f %s%n", amount, base, convertedAmount, target);

        sc.close();
    }
}
