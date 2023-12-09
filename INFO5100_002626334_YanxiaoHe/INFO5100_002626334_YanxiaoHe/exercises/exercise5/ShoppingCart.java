import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private static ShoppingCart instance;
    private List<String> items;

    private ShoppingCart() {
        items = new ArrayList<>();
    }

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to the shopping cart.");
    }

    public void displayItems() {
        System.out.println("Shopping Cart Items: " + items);
    }
}

interface Product {
    void display();
}

class ElectronicProduct implements Product {
    private String name;

    public ElectronicProduct(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Electronic Product: " + name);
    }
}

class ClothingProduct implements Product {
    private String name;

    public ClothingProduct(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Clothing Product: " + name);
    }
}

class ProductFactory {
    public Product createProduct(String type, String name) {
        if (type.equalsIgnoreCase("ELECTRONIC")) {
            return new ElectronicProduct(name);
        } else if (type.equalsIgnoreCase("CLOTHING")) {
            return new ClothingProduct(name);
        }
        return null;
    }
}

interface OrderObserver {
    void update(String message);
}

class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + ", Order Status: " + message);
    }
}

class Order {
    private List<OrderObserver> observers = new ArrayList<>();
    private String status;

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(status);
        }
    }
}