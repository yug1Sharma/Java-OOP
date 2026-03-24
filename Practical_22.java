import java.util.Scanner;

class Shape
{
    double d1, d2;

    void getData(double a, double b)
    {
        d1 = a;
        d2 = b;
    }
}

class Triangle extends Shape
{
    double getArea()
    {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape
{
    double getArea()
    {
        return d1 * d2;
    }
}

class Practical_22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        System.out.print("Enter base and height of triangle: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        Triangle t = new Triangle();
        t.getData(b, h);

        System.out.println("Area of Triangle: " + t.getArea());

        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();

        Rectangle r = new Rectangle();
        r.getData(l, w);

        System.out.println("Area of Rectangle: " + r.getArea());

        sc.close();
    }
}