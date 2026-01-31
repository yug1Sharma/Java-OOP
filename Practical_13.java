class Practical_13
{
    double width;
    double height;

    Practical_13(double w, double h)
    {
        width = w;
        height = h;
    }

    double getArea()
    {
        return width * height;
    }

    double getPerimeter()
    {
        return 2 * (width + height);
    }

    public static void main(String[] args)
    {
        Practical_13 p1 = new Practical_13(4, 40);
        Practical_13 p2 = new Practical_13(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width = " + p1.width);
        System.out.println("Height = " +p1.height);
        System.out.println("Area = " + p1.getArea());
        System.out.println("Perimeter = " + p1.getPerimeter());

        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width = " + p2.width);
        System.out.println("Height = " + p2.height);
        System.out.println("Area = " + p2.getArea());
        System.out.println("Perimeter = " + p2.getPerimeter());

        System.out.println();

        if (p1.getArea() > p2.getArea())
        {
            System.out.println("Rectangle 1 has larger area.");
        }
        else if (p2.getArea() > p1.getArea())
        {
            System.out.println("Rectangle 2 has larger area.");
        }
        else
        {
            System.out.println("Both rectangles have equal area.");
        }
    }
}
