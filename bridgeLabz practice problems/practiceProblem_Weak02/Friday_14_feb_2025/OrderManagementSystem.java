package practiceProblem_Weak02.Friday_14_feb_2025;

// Online Retail Order Management
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    void getOrderStatus() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate + " - Status: Order Placed");
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber + " - Status: Shipped");
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate + " - Status: Delivered");
    }
}

public class OrderManagementSystem {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(101, "2025-03-04", "TRK123456", "2025-03-06");
        order.getOrderStatus();
    }
}
