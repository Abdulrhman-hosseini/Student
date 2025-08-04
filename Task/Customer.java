package Task;

public class Customer extends User {
    public Customer(int userId, String username, String email) {
        super(userId, username, email);
    }
    public void placeOrder() {
        System.out.println(username + " placed an order.");
    }

    @Override
    public String getUserDetails() {
        return "Customer: " + username;
    }

    public void placeOrder(int productId) {
        System.out.println(username + " placed an order for product ID: " + productId);
    }

    public void placeOrder(int productId, int quantity) {
        System.out.println(username + " placed an order for product ID: " + productId + " (Quantity: " + quantity + ")");
    }
}
