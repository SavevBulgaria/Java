package test2;

import java.util.Comparator;
import java.util.PriorityQueue;

enum Priority {
    HIGH, MEDIUM, LOW
}
class Order {
    private String name;
    private Priority priority;

    Order(String name,Priority priority){
        this.name=name;
        this.priority=priority;
    }
    public String getName(){
        return name;
    }
    public Priority getPriority(){
        return priority;
    }
}
public class Main {

    public static void main(String[] args) {
        // Create below processedOrders collection

        PriorityQueue<Order> processedOrders = new PriorityQueue<>((o1, o2) -> o2.getPriority().compareTo(o1.getPriority()));

        Order order1= new Order("Order1",Priority.HIGH);
        Order order2= new Order("Order2",Priority.MEDIUM);
        Order order3= new Order("Order3",Priority.LOW);



    }

}