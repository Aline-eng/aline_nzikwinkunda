package casestudy.realconstructor;

import java.util.Scanner;

public class RealConstructorMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n--Welcome to the Site Construction Management System--");
        String contractorId = readValidatedString("Enter Contractor ID: ");
        String contractorName = readValidatedString("Enter Contractor Name: ");
        double quantity = readValidatedDouble("Enter Material Quantity from 1 to 10 (in tons): ");
        double balance = readValidatedDouble("Enter Current Material Balance (in tons): ");

        boolean running = true;
        while (running) {
            System.out.println("\nChoose Operation:");
            System.out.println("1. Receive Material");
            System.out.println("2. Use Material");
            System.out.println("3. Estimate Cost");
            System.out.println("4. Exit");

            int choice = (int) readValidatedDouble("Enter your choice (1-4): ");
            switch (choice) {
                case 1:
                    quantity = readValidatedDouble("Enter Material Quantity from 1 to 10 (in tons): ");
                    new MaterialDelivery(contractorId, contractorName, quantity).receiveMaterial();
                    break;
                case 2:
                    quantity = readValidatedDouble("Enter Material Quantity to use (must leave >=2 tons balance): ");
                    new MaterialUsage(contractorId, contractorName, quantity, balance).useMaterial();
                    break;
                case 3:
                    quantity = readValidatedDouble("Enter Material Quantity for Cost Estimation (5-15 tons): ");
                    new CostEstimation(contractorId, contractorName, quantity).estimateCost();
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3 or 4.");
            }
        }

    }

    private static String readValidatedString(String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (!input.matches(".*\\d.*") && !input.isEmpty()) {
                break;
            } else {
                System.out.println("Invalid input! Only letters allowed. Try again.");
            }
        }
        return input;
    }

    private static double readValidatedDouble(String prompt) {
        double num = 0;
        while (true) {
            System.out.print(prompt);
            try {
                num = Double.parseDouble(scanner.nextLine().trim());
                if (num >= 0)
                    break;
                else
                    System.out.println("Negative numbers are not allowed. Try again.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid number! Try again.");
            }
        }
        return num;
    }

}