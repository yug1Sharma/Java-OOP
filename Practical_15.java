import java.util.Scanner;

class Practical_15
{
    double generateBill(int itemTotal)
    {
        return itemTotal;
    }

    double generateBill(int itemTotal, int discount)
    {
        return itemTotal - discount;
    }

    double generateBill(int itemTotal, double discountPercent)
    {
        double discount = (itemTotal * discountPercent) / 100;
        return itemTotal - discount;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Practical_15 bg = new Practical_15();

        System.out.print("Enter Total Amount: ");
        int total = sc.nextInt();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular Customer");
        System.out.println("2. Privileged Customer");
        System.out.println("3. Festive Offer");

        int choice = sc.nextInt();

        double finalAmount = 0;

        if (choice == 1)
        {
            finalAmount = bg.generateBill(total);
        }
        else if (choice == 2)
        {
            System.out.print("Enter Flat Discount: ");
            int d = sc.nextInt();

            finalAmount = bg.generateBill(total, d);
        }
        else if (choice == 3)
        {
            System.out.print("Enter Discount Percentage: ");
            double p = sc.nextDouble();

            finalAmount = bg.generateBill(total, p);
        }
        else
        {
            System.out.println("Invalid Choice");
            sc.close();
            return;
        }

        System.out.println("Final Bill Amount: " + finalAmount);

        sc.close();
    }
}
