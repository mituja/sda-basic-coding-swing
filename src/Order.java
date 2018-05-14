public class Order {
    private int number;
    private String name;
    private String products;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public Order(int number, String name, String products) {
        this.number = number;
        this.name = name;
        this.products = products;
    }
}
