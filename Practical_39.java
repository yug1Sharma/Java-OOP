class T1 extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 100; i++)
        {
            System.out.print(i + " ");
        }
    }
}

class T2 extends Thread
{
    public void run()
    {
        for (int i = 101; i <= 200; i++)
        {
            System.out.print(i + " ");
        }
    }
}

class T3 extends Thread
{
    public void run()
    {
        for (int i = 201; i <= 300; i++)
        {
            System.out.print(i + " ");
        }
    }
}

class Practical_39
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        T1 t1 = new T1();
        T2 t2 = new T2();
        T3 t3 = new T3();

        try
        {
            t1.start();
            t1.join();   // wait for T1 to finish

            t2.start();
            t2.join();   // wait for T2 to finish

            t3.start();
            t3.join();   // wait for T3 to finish
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }
}