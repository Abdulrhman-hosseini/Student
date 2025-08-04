package Task;

public class CreditCardPayment implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
    }

    @Override
    public boolean validateCard(String cardNumber) {
        return cardNumber.startsWith("4");  // Just an example
    }
}
