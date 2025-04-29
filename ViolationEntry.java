package casestudy.rwandanationalpolice;

public class ViolationEntry extends TrafficRecord {
    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType,
            double fineAmount, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType, fineAmount, paymentStatus);
    }

    public void recordViolation() {
        if (violationType.equalsIgnoreCase("SPEEDING") ||
                violationType.equalsIgnoreCase("RED_LIGHT") ||
                violationType.equalsIgnoreCase("NO_HELMET") ||
                violationType.equalsIgnoreCase("DUI")) {
            paymentStatus = "UNPAID";
            System.out.println("\n---WELCOME TO RWANDA NATIONAL POLICE TRAFFIC VIOLATION REPORT SYSTEM-----");
            System.out.println("Driver ID: " + driverId);
            System.out.println("Driver Name: " + driverName);
            System.out.println("Vehicle Plate: " + vehiclePlate);
            System.out.println("Violation Type: " + violationType);
            System.out.println("The payment status is: " + paymentStatus);
            System.out.println("Violation recorded successfully for driver " + driverName);
            System.out.println("Please driver " + driverName + ", assess the fine amount to be paid.");
        } else {
            System.out.println(" Error: Invalid violation type entered.");
        }
    }

    public void assessFine() {
    }

    public void processPayment() {
    }
}