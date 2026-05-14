class Thread1 extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Thread 1: " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for (int i = 11; i <= 20; i++)
        {
            System.out.println("Thread 2: " + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class Practical_38
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}