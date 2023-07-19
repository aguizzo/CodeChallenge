package onlineShop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productsList = new ArrayList<>();
    public void addToCart(Product product) {
        if (productAlreadyExists(product))
            System.out.println("The product is already in the cart");
        else {
            productsList.add(product);
            System.out.println("Product added to the cart: " + product.toString());
        }
    }

    public void removeFromCart(Product product) {
        if(!productAlreadyExists(product))
            System.out.println("This product is not in the cart");
        else {
            productsList.remove(product);
            System.out.println("Product removed from the cart: " + product.toString());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (var product : productsList)
            total += product.getPrice();
        return total;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    private boolean productAlreadyExists(Product product) {
        for (var p : productsList) {
            if (p.isEquals(product))
                return true;
        }
        return false;
    }

}

