class Practical_09
{
    double width = 1;
    double height = 1;

    Practical_09()
    {
    }

    Practical_09(double w, double h)
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
        Practical_09 r1 = new Practical_09();

        Practical_09 r2 = new Practical_09(4, 5);

        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.width);
        System.out.println("Height = " + r1.height);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println();

        System.out.println("Rectangle 2:");
        System.out.println("Width = " + r2.width);
        System.out.println("Height = " + r2.height);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}
