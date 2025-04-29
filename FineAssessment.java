package casestudy.rwandanationalpolice;

public class FineAssessment extends TrafficRecord {
    public FineAssessment(String driverId, String driverName, String vehiclePlate, String violationType,
            double fineAmount, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType, fineAmount, paymentStatus);
    }

    @Override
    public void recordViolation() {

    }

    @Override
    public void assessFine() {
        switch (violationType.toUpperCase()) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            default:
                System.out.println("Error: Invalid violation type. Cannot access fine.");
                return;
        }
        System.out.println("/nFine assessment recorded successfully");
        System.out.println("Driver ID: " + driverId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Vehicle Plate: " + vehiclePlate);
        System.out.println("Violation Type: " + violationType);
        System.out.println("Fine amount to be paid: " + fineAmount);
        System.out.println("Dear Driver, Please pay the fine");

    }

    @Override
    public void processPayment() {

    }

}
