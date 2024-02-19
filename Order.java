public class Order {
    private String item;
    private int quantity;
    private double unitPrice;
    private double totalAmount;
    private PaymentMode payment;

    //default constructor
    public Order() {
    }

    //constructor
    public Order(String item, int quantity, double unitPrice, PaymentMode payment) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.payment = payment;
    }

    //setter methods
    public void setItem(String item) {
        this.item = item;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPayment(PaymentMode payment) {
        this.payment = payment;
    }

    //getter methods
    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalAmount() {
        double initialAmount = 0.0;
        double discount = 0.0;
        double totalAmount = 0.0;

        initialAmount = getQuantity() * getUnitPrice();
        discount = initialAmount * getPayment().determineDiscountRate();
        totalAmount = initialAmount - discount;
        return totalAmount;
    }

    public PaymentMode getPayment() {
        return payment;
    }
}