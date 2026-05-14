class NotSufficientFundException extends Exception
{
    NotSufficientFundException(String message)
    {
        super(message);
    }
}

class BankAccount
{
    double balance;

    BankAccount()
    {
        balance = 1000.00;
    }

    void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) throws NotSufficientFundException
    {
        if (amount > balance)
        {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
        else
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void displayBalance()
    {
        System.out.println("Balance: " + balance);
    }
}

class Practical_36
{
    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount();

	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        try
        {
            acc.displayBalance();

            acc.deposit(1000.00);
            acc.displayBalance();

            acc.withdraw(400.00);
            acc.displayBalance();

            acc.withdraw(300.00);
            acc.displayBalance();

            acc.withdraw(500.00); // This will throw exception
        }
        catch (NotSufficientFundException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}