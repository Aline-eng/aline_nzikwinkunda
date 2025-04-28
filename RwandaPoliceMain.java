package casestudy.rwandanationalpolice;

import java.util.Scanner;

public class RwandaPoliceMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n ----- Welcome to the Rwandan National Police Traffic Fine System!-----\n");
        String driverId = readDriverId("Enter Driver ID (16-digit national ID): ");
        String driverName = readValidatedString("Enter Driver Name: ");
        String vehiclePlate = readVehiclePlate("Enter Vehicle Plate (Format: RAB123D): ");
        String violationType = readViolationType("Enter Violation Type (SPEEDING, RED_LIGHT, NO_HELMET, DUI): ");
        double fineAmount = 0;
        String paymentStatus = "UNPAID";

        boolean running = true;
        while (running) {
            System.out.println("\n Menu:");
            System.out.println("1. Record Violation");
            System.out.println("2. Assess Fine");
            System.out.println("3. Process Payment");
            System.out.println("4. Exit");

            int choice = readValidatedInt("Enter your choice (1-4): ");

            switch (choice) {
                case 1 -> {
                    ViolationEntry entry = new ViolationEntry(driverId, driverName, vehiclePlate, violationType,
                            fineAmount, paymentStatus);
                    entry.recordViolation();
                    paymentStatus = entry.getPaymentStatus();
                }
                case 2 -> {
                    FineAssessment assessment = new FineAssessment(driverId, driverName, vehiclePlate, violationType,
                            fineAmount, paymentStatus);
                    assessment.assessFine();
                    fineAmount = assessment.getFineAmount();
                }
                case 3 -> {
                    FinePayment payment = new FinePayment(driverId, driverName, vehiclePlate, violationType, fineAmount,
                            paymentStatus);
                    payment.processPayment();
                    paymentStatus = payment.getPaymentStatus();
                }
                case 4 -> {
                    System.out.println("Exiting traffic fine system. Goodbye!");
                    running = false;
                }
                default -> System.out.println(" Invalid choice. Try again.");
            }
        }
    }

    // Input Validation Methods
    private static String readValidatedString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.matches(".*\\d.*") && !input.isEmpty())
                return input;
            System.out.println(" Only letters allowed. Try again.");
        }
    }

    private static int readValidatedInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int val = Integer.parseInt(scanner.nextLine());
                if (val >= 1)
                    return val;
                System.out.println(" Value must be 1 or more.");
            } catch (NumberFormatException e) {
                System.out.println(" Invalid number. Try again.");
            }
        }
    }

    private static String readDriverId(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (input.matches("\\d{16}"))
                return input;
            System.out.println(" Driver ID must be exactly 16 digits. Try again.");
        }
    }

    private static String readVehiclePlate(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.matches("[A-Z]{3}\\d{3}[A-Z]{1}"))
                return input;
            System.out.println(" Invalid plate format. Correct example: RAB123D");
        }
    }

    private static String readViolationType(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("SPEEDING") || input.equals("RED_LIGHT") || input.equals("NO_HELMET")
                    || input.equals("DUI"))
                return input;
            System.out.println(" Invalid violation type. Try again.");
        }
    }
}