import java.util.LinkedList;
import java.util.List;

public class OrderController {
    public static List<Order> getData(){
        List<Order> orders = new LinkedList<>();
        orders.add(new Order(1, "Order 1", "Products 1"));
        orders.add(new Order(2, "Order 2", "Products 2"));
        orders.add(new Order(3, "Order 3", "Products 3"));
        orders.add(new Order(4, "Order 4", "Products 4"));
        orders.add(new Order(5, "Order 5", "Products 5"));

        return orders;
    }
}
