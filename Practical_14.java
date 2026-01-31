import java.util.Scanner;

class Practical_14
{
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal)
    {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues()
    {
        System.out.println("Account ID: " + accountId);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Practical_14[] acc = new Practical_14[5];

        for (int i = 0; i < 5; i++)
        {
            acc[i] = new Practical_14();

            System.out.println("Enter details for Account " + (i + 1));

            System.out.print("Account ID: ");
            String id = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Balance: ");
            double bal = sc.nextDouble();

            acc[i].assignValues(id, name, bal);

            System.out.println();
        }

        System.out.println("All Account Details:");
        System.out.println("---------------------");

        for (int i = 0; i < 5; i++)
        {
            acc[i].displayValues();
        }

        System.out.print("Enter Account ID to Search: ");
        String searchId = sc.next();

        boolean found = false;

        for (int i = 0; i < 5; i++)
        {
            if (acc[i].accountId.equals(searchId))
            {
                System.out.println("Account Found:");
                acc[i].displayValues();
                found = true;
                break;
            }
        }

        if (found == false)
        {
            System.out.println("Account Not Found.");
        }

        sc.close();
    }
}
