import java.util.HashMap;
class Product {
    String name;
    int quantity;
    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}

public class _16ProductStorage {
    public static void main(String[] args) {
        HashMap<String, Product> products = new HashMap<>();
        products.put("P001", new Product("Laptop", 10));
        products.put("P002", new Product("Smartphone", 50));
        Product p = products.get("P001");
        System.out.println("Product Name: " + p.name + ", Quantity: " + p.quantity);
        System.out.println("Is product P003 available? " + products.containsKey("P003"));
    }
}
