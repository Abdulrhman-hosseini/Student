package Task;

public class MainTest {
    public static void main(String[] args) {
        Customer c = new Customer(1, "Ali", "ali@example.com");
        Admin a = new Admin(2, "AdminOne", "admin@example.com");

        System.out.println(c.getUserDetails());  // Polymorphism
        System.out.println(a.getUserDetails());

        c.placeOrder(101);
        c.placeOrder(101, 3);


        Payment payment1 = new CreditCardPayment();
        payment1.processPayment(200.0);
        System.out.println("Card Valid? " + payment1.validateCard("4123456789"));

        Payment payment2 = new PayPalPayment();
        payment2.processPayment(150.0);
        System.out.println("Card Valid? " + payment2.validateCard("PP12345678"));
    }
}
