package domain;

public class Order {

    private final int orderId;
    private Computer computers[];
    private static int orderCounter;
    private int computerCounter;
    private static final int MAX_COMPUTERS = 10;

    public Order() {
        this.orderId = ++Order.orderCounter;
        computers = new Computer[Order.MAX_COMPUTERS];
    }

    public void addComputer(Computer computer) {
        if (this.computerCounter < Order.MAX_COMPUTERS) {
            computers[this.computerCounter++] = computer;
        } else {
            System.out.println("You already have " + MAX_COMPUTERS + " ,can't buy more.");
        }
    }

    public void showOrder() {
        System.out.println("Order: " + this.orderId);

        System.out.println("Computers of the order " + this.orderId + ":");
        for (int i = 0; i < this.computerCounter; i++) {
            System.out.println(computers[i]);
        }
    }
}
