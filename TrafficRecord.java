package casestudy.rwandanationalpolice;

public abstract class TrafficRecord {
    protected String driverId;
    protected String driverName;
    protected String vehiclePlate;
    protected String violationType;
    protected double fineAmount;
    protected String paymentStatus;

    public TrafficRecord(String driverId, String driverName, String vehiclePlate, String violationType,
            double fineAmount, String paymentStatus) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate.toUpperCase();
        this.violationType = violationType.toUpperCase();
        this.fineAmount = fineAmount;
        this.paymentStatus = paymentStatus.toUpperCase();
    }

    public abstract void recordViolation();

    public abstract void assessFine();

    public abstract void processPayment();

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status.toUpperCase();
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(double amount) {
        this.fineAmount = amount;
    }
}
