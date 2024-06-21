import java.util.Scanner;

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Credit Card Rewards Converter!!!");

        System.out.println("Enter '1' to convert cash to miles or '2' to convert miles to cash: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Please enter a cash value to convert to airline miles: ");
            double cashValue = scanner.nextDouble();
            RewardValue rewardValue = new RewardValue(cashValue);
            System.out.println("$" + cashValue + " is worth " + rewardValue.getMilesValue() + " miles");
        } else if (choice == 2) {
            System.out.println("Please enter a miles value to convert to cash: ");
            double milesValue = scanner.nextDouble();
            RewardValue rewardValue = new RewardValue(milesValue, true);
            System.out.println(milesValue + " miles are worth $" + rewardValue.getCashValue());
        } else {
            System.out.println("Invalid choice. Please enter either '1' or '2'.");
        }

        scanner.close();
    }
}
