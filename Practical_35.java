class Practical_35
{
    static double average(String[] values) throws NullPointerException, NumberFormatException
    {
        double sum = 0;

        for (int i = 0; i < values.length; i++)
        {
            if (values[i] == null)
            {
                throw new NullPointerException("Null value found");
            }

            double num = Double.parseDouble(values[i]);
            sum = sum + num;
        }

        return sum / values.length;
    }

    public static void main(String[] args)
    {
        String[] validData = {"10.5", "20", "30"};
        String[] invalidData = {"10", "abc", "30"};
        String[] nullData = {"10", null, "30"};

	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        try
        {
            System.out.println("Average (Valid): " + average(validData));
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        finally
        {
            System.out.println("Validation completed (Valid Data)");
        }

        System.out.println();

        try
        {
            System.out.println("Average (Invalid Number): " + average(invalidData));
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error: Invalid number format");
        }
        finally
        {
            System.out.println("Validation completed (Invalid Number)");
        }

        System.out.println();

        try
        {
            System.out.println("Average (Null Data): " + average(nullData));
        }
        catch (NullPointerException e)
        {
            System.out.println("Error: Null value encountered");
        }
        finally
        {
            System.out.println("Validation completed (Null Data)");
        }
    }
}