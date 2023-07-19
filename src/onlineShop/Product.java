package onlineShop;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name+ " - $" + String.format("%.2f", price);
    }


    public boolean isEquals(Product p2) {
        if (p2 == null)
            return false;
        return p2.getProductId() == this.productId;
    }
}
