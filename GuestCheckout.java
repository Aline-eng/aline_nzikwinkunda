package casestudy.lemigohotel;

public class GuestCheckout extends HotelService {
    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    public void checkoutGuest() {
        if (roomStatus.equals("OCCUPIED")) {
            roomStatus = "AVAILABLE";
            System.out.println("----CHECKOUT STATUS----");
            System.out.println("Guest " + guestName + " checked out. Room is now AVAILABLE.");
        } else {
            System.out.println("Error: Room is already AVAILABLE.");
        }
    }

    public void bookRoom() {
    }

    public void generateBill() {
    }
}
