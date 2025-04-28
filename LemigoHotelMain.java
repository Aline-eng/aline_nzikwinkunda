package casestudy.lemigohotel;

import java.util.Scanner;

public class LemigoHotelMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\n--Welcome to the Lemigo Hotel Management System--");
        String guestId = readValidatedString("Enter Guest ID: ");
        String guestName = readValidatedString("Enter Guest Name: ");
        String roomType = readRoomType("Enter Room Type (STANDARD/DELUXE/SUITE): ");
        int stayDays = readValidatedInt("Enter Stay Duration (1-30): ");

        String roomStatus = "AVAILABLE";

        boolean running = true;
        while (running) {
            System.out.println("\nLEMIGO HOTEL Menu:");
            System.out.println("\nChoose Hotel Operation:");
            System.out.println("1. Book Room");
            System.out.println("2. Checkout Guest");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");

            int choice = readValidatedInt("Enter your choice (1-4): ");

            switch (choice) {
                case 1 -> {
                    RoomBooking booking = new RoomBooking(guestId, guestName, roomType, stayDays, roomStatus);
                    booking.bookRoom();
                    roomStatus = booking.getRoomStatus();
                }
                case 2 -> {
                    GuestCheckout checkout = new GuestCheckout(guestId, guestName, roomType, stayDays, roomStatus);
                    checkout.checkoutGuest();
                    roomStatus = checkout.getRoomStatus();
                }
                case 3 -> new Billing(guestId, guestName, roomType, stayDays, roomStatus).generateBill();
                case 4 -> {
                    System.out.println(" Exiting hotel system. Goodbye!");
                    running = false;
                }
                default -> System.out.println(" Invalid choice. Try again.");
            }
        }
    }

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

    private static String readRoomType(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("STANDARD") || input.equals("DELUXE") || input.equals("SUITE"))
                return input;
            System.out.println(" Invalid room type. Try again.");
        }
    }
}