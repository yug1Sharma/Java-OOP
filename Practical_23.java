import java.util.Scanner;

class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal)
    {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
    }

    void withdraw(double amount)
    {
        if(balance >= amount)
            balance = balance - amount;
        else
            System.out.println("Insufficient Balance");
    }

    void checkBalance()
    {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount
{
    double calculateInterest()
    {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends BankAccount
{
    double maturityAmount(int years)
    {
        double rate = 0.06;
        return balance + (balance * rate * years);
    }
}

class Practical_23
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        SavingAccount s = new SavingAccount();

        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        s.openAccount(acc, name, bal);

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();
        s.deposit(dep);

        System.out.print("Enter Withdraw Amount: ");
        double wd = sc.nextDouble();
        s.withdraw(wd);

        s.checkBalance();

        System.out.println("Savings Interest: " + s.calculateInterest());

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(acc, name, bal);

        System.out.print("Enter FD Years: ");
        int y = sc.nextInt();

        System.out.println("FD Maturity Amount: " + f.maturityAmount(y));

        sc.close();
    }
}