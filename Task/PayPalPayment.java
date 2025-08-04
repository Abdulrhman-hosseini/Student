package Task;

public class PayPalPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }

    @Override
    public boolean validateCard(String cardNumber) {
        return cardNumber.length() >= 10;  // Example validation
    }
}
