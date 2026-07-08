import java.util.*;

public class CustomerQueue {
    Queue<String> queue = new LinkedList<>();

    void addCustomer(String name) {
        queue.offer(name);
        System.out.println(name + " added to the queue.");
    }

    void serveNextCustomer() {
        String customer = queue.poll();
        if (customer != null) {
            System.out.println("Serving: " + customer);
        } else {
            System.out.println("Queue is empty. No customer to serve.");
        }
    }

    void viewNextCustomer() {
        String customer = queue.peek();
        if (customer != null) {
            System.out.println("Next in line: " + customer);
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public static void main(String[] args) {
        CustomerQueue cq = new CustomerQueue();
        cq.addCustomer("Amaka");
        cq.addCustomer("Bayo");
        cq.addCustomer("Chiamaka");

        cq.viewNextCustomer();      // Next in line: Amaka
        cq.serveNextCustomer();     // Serving: Amaka
        cq.viewNextCustomer();      // Next in line: Bayo
        cq.serveNextCustomer();     // Serving: Bayo
        cq.serveNextCustomer();     // Serving: Chiamaka
        cq.serveNextCustomer();     // Queue is empty. No customer to serve.
    }
}