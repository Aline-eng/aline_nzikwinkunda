package casestudy.lemigohotel;

public class Billing extends HotelService {
    public Billing(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
    }

    @Override
    public void checkoutGuest() {

    }

    @Override
    public void generateBill() {
        int rate = switch (roomType) {
            case "STANDARD" -> 50000;
            case "DELUXE" -> 80000;
            case "SUITE" -> 120000;
            default -> {
                System.out.println(" Error: Invalid room type.");
                yield 0;
            }
        };

        if (rate > 0) {
            int total = rate * stayDays;
            System.out.println("\n BILL DETAILS:");
            System.out.println("Guest Name: " + guestName);
            System.out.println("Room Type: " + roomType);
            System.out.println("Stay Duration: " + stayDays + " days");
            System.out.printf("Total Bill: %,d RWF\n", total);
            System.out.println("Thank you for choosing Lemigo Hotel!");
        }
    }
}
