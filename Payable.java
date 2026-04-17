public interface Payable {
    double getFinalPrice();
    double pay(double amount);
    void setPaymentStatus(double amount);
    boolean isPaid();
}