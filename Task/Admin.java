package Task;

public class Admin extends User{
    public Admin(int userId, String username, String email) {
        super(userId, username, email);
    }

    public void updateProduct(Product a, double newPrice, int newStock) {
        a.setPrice(newPrice);
        a.setStock(newStock);
        System.out.println(username + " updated the product.");
    }
    @Override
    public String getUserDetails() {
        return "Admin: " + username + ", Email: " + email;
    }

    
}
