package casestudy.rwandanationalpolice;

class FinePayment extends TrafficRecord {
    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount,
            String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType, fineAmount, paymentStatus);
    }

    public void processPayment() {
        if (paymentStatus.equalsIgnoreCase("UNPAID")) {
            paymentStatus = "PAID";
            System.out.println("\n---WELCOME TO RWANDA NATIONAL POLICE TRAFFIC FINE PAYMENT SYSTEM-----");
            System.out.println("Payment successful for driver " + driverName + ".");
            System.out.println("Vehicle Plate: " + vehiclePlate);
            System.out.printf("Amount Paid: %, .0f RWF\n", fineAmount);
            System.out.println("Payment Status: " + paymentStatus);
        } else {
            System.out.println(" Error: Fine is already paid.");
        }
    }

    public void recordViolation() {
    }

    public void assessFine() {
    }
}
