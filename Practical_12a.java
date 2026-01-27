import java.util.Scanner;

class Practical_12a
{
    int x;
    int y;

    Practical_12a()
    {
        x = 5;
        y = 5;
    }

    Practical_12a(int a, int b)
    {
        x = a;
        y = b;
    }

    Practical_12a(Practical_12a P)
    {
        x = P.x;
        y = P.y;
    }

    void Display()
    {
        System.out.println("Point : (" + x + ", " + y + ")");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        Practical_12a P1 = new Practical_12a();
        Practical_12a P2 = new Practical_12a(x, y);
        Practical_12a P3 = new Practical_12a(P2);

        System.out.println("Default Point:");
        P1.Display();

        System.out.println("User Point:");
        P2.Display();

        System.out.println("Copied Point:");
        P3.Display();

        sc.close();
    }
}
