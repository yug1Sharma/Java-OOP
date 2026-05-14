class SumThread1 extends Thread
{
    long sum = 0;

    public void run()
    {
        for (int i = 1; i <= 1000; i++)
        {
            sum += i;
        }
    }

    long getSum()
    {
        return sum;
    }
}

class SumThread2 extends Thread
{
    long sum = 0;

    public void run()
    {
        for (int i = 1001; i <= 2000; i++)
        {
            sum += i;
        }
    }

    long getSum()
    {
        return sum;
    }
}

class Practical_41
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");


        SumThread1 t1 = new SumThread1();
        SumThread2 t2 = new SumThread2();

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }

        long total = t1.getSum() + t2.getSum();

        System.out.println("Sum from 1 to 2000 = " + total);
    }
}