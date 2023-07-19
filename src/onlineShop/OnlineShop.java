package onlineShop;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop {

    private static int lastIdOrder = 0;
    private List<Product> availableProducts;
    private ShoppingCart cart = new ShoppingCart();
    private List<Order> orders = new ArrayList<>();


    public OnlineShop() {
        availableProducts = getProducts();
    }

    public void browseProducts() {
        printAvailableProducts();
    }


    public void addToCart(Product product) {
        cart.addToCart(product);
    }

    public void removeFromCart(Product product) {
        cart.removeFromCart(product);
    }

    public void placeOrder() {
        orders.add(new Order(getOrderId(), "user", cart.getProductsList()));
        System.out.println("Order placed successfully!");
        displayOrder();

    }

    private static int getOrderId() {
        lastIdOrder += 1;
        return lastIdOrder;
    }

    private void displayOrder() {
        for (var order : orders) {
            System.out.println(order.toString());
            System.out.println("Total: " + String.format("%.2f", cart.calculateTotal()));
        }
    }

    private List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "iPhone", 999.99));
        products.add(new Product(2, "MacBooK Pro", 1999.99));
        return products;
    }

    private void printAvailableProducts() {
        System.out.println("Available Products:");
        for (var product : availableProducts)
            System.out.println(product.getProductId() + ". " + product.toString());
    }
}
