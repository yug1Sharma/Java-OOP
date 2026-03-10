class Practical_18
{
    String account_holder_name;
    double balance;

    static double interest_rate = 5.0;

    Practical_18(String name, double bal)
    {
        account_holder_name = name;
        balance = bal;
    }

    double calculateInterest()
    {
        return (balance * interest_rate) / 100;
    }

    void display()
    {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    static void updateInterestRate(double newRate)
    {
        interest_rate = newRate;
    }

    public static void main(String[] args)
    {
        Practical_18 a1 = new Practical_18("Yug", 10000);
        Practical_18 a2 = new Practical_18("Hardik", 20000);

        System.out.println("Initial Interest Rate: " + interest_rate + "%");
        a1.display();
        a2.display();

        Practical_18.updateInterestRate(8.0);

        System.out.println("Updated Interest Rate: " + interest_rate + "%");
        a1.display();
        a2.display();
    }
}