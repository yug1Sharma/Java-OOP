import java.util.Scanner;

class Practical_34
{
    void checkEligibility(int age)
    {
        if (age < 18)
        {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        }
        else
        {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Practical_34 v = new Practical_34();

	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        try
        {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            v.checkEligibility(age);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
        finally
        {
            System.out.println("Validation process completed");
        }

        sc.close();
    }
}