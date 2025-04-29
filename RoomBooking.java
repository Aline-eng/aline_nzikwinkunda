package casestudy.lemigohotel;

public class RoomBooking extends HotelService {
    public RoomBooking(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    public void bookRoom() {
        if (stayDays < 1 || stayDays > 30) {
            System.out.println("Error: Stay duration must be between 1 and 30 days.");
        } else if (!roomStatus.equals("AVAILABLE")) {
            System.out.println("Room is not available for booking.");
        } else {
            roomStatus = "OCCUPIED";
            System.out.println("The Booking confirmation for " + guestName
                    + " is successfully recorded. Room status changed to OCCUPIED.");
            System.out.println("You have booked your room in Lemigo Hotel on : " + java.time.LocalDate.now());
            System.out.println("Your room type is: " + roomType);
            System.out.println("Thank you for choosing Lemigo Hotel! Enjoy your stay!");
            System.out.println(
                    "Check the finance department(Number 3 on Hotel menu) for bill amount and payment confirmation.");
        }
    }

    public void checkoutGuest() {
    }

    public void generateBill() {
    }
}
