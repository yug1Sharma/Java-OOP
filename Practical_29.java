import java.util.Scanner;

interface Order
{
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order
{
    String item;
    int qty;
    int orderId = 101;

    public void placeOrder(String i, int q)
    {
        item = i;
        qty = q;
        System.out.println("Order Placed Successfully. Order ID: " + orderId);
    }
}

class FinalOrder extends PartialOrder
{
    public void cancelOrder(int orderId)
    {
        System.out.println("Order " + orderId + " has been cancelled.");
    }

    public void generateBill()
    {
        int price = 100;
        int total = qty * price;

        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Bill: Rs. " + total);
    }
}

class Practical_29
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        FinalOrder fo = new FinalOrder();

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        fo.placeOrder(item, qty);

        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");

        int choice = sc.nextInt();

        if (choice == 1)
        {
            fo.generateBill();
        }
        else if (choice == 2)
        {
            fo.cancelOrder(fo.orderId);
        }
        else
        {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}