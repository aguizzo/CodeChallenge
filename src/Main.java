import onlineShop.OnlineShop;
import onlineShop.Product;

public class Main {

    public static void main(String[] args) {
            validation();
        }

        public static void Demo(){
            var onlineShop = new OnlineShop();
            onlineShop.browseProducts();

            Product product1 = new Product(1, "iPhone", 999.99);
            onlineShop.addToCart(product1);

            Product product2 = new Product(2, "MacBooK Pro", 1999.99);
            onlineShop.addToCart(product2);

            onlineShop.removeFromCart(product1);

            onlineShop.placeOrder();
        }

        public static void validation() {
            var onlineShop = new OnlineShop();
            onlineShop.browseProducts();

            Product product1 = new Product(1, "iPhone", 999.99);
            Product product2 = new Product(1, "iPhone", 999.99);
            onlineShop.addToCart(product1);
            onlineShop.addToCart(product2);

            Product product3 = new Product(2, "Macbook", 999.99);
            onlineShop.removeFromCart(product3);
        }
}