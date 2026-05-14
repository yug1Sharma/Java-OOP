class Practical_33
{
    public static void main(String[] args)
    {

	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        try
        {
            if (args.length < 2)
            {
                System.out.println("Please provide two numbers.");
                return;
            }

            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: Please enter valid integers.");
        }
        catch (Exception e)
        {
            System.out.println("Unexpected Error occurred.");
        }
    }
}