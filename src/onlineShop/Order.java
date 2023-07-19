package onlineShop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private String user;
    private List<Product> products = new ArrayList<>();

    public Order(int orderId, String user, List<Product> products) {
        this.orderId = orderId;
        this.user = user;
        this.products = products;
    }

    @Override
    public String toString() {
        String str = "Order ID: " + orderId + "\n"
                + "User: [" + user + "]\n"
                + "Products: \n";
        String productList = "";
        for (var product : products)
            productList += "- " + product.toString() + "\n";
        return str + productList;
    }
}
