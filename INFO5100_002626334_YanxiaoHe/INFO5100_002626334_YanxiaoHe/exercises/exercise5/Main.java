public class Main {
    public static void main(String[] args) {
         ShoppingCart shoppingCart = ShoppingCart.getInstance();
        shoppingCart.addItem("Laptop");
        shoppingCart.addItem("T-shirt");
        shoppingCart.displayItems();

        ProductFactory productFactory = new ProductFactory();
        Product electronicProduct = productFactory.createProduct("ELECTRONIC", "Smartphone");
        Product clothingProduct = productFactory.createProduct("CLOTHING", "Jeans");

        electronicProduct.display();
        clothingProduct.display();

        Order order = new Order();
        OrderObserver customer1 = new Customer("Customer 1");
        OrderObserver customer2 = new Customer("Customer 2");

        order.addObserver(customer1);
        order.addObserver(customer2);

        order.setStatus("Shipped");
    }
}
