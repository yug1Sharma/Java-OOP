class Practical_17
{
    static int totalStudents;
    static String universityName;

    static
    {
        universityName = "ABC University";
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    Practical_17()
    {
        totalStudents++;
        System.out.println("Constructor Executed");
    }

    static int getTotalStudents()
    {
        return totalStudents;
    }

    public static void main(String[] args)
    {
        System.out.println("University Name: " + universityName);

        Practical_17 s1 = new Practical_17();
        Practical_17 s2 = new Practical_17();
        Practical_17 s3 = new Practical_17();

        System.out.println("Total Students: " + getTotalStudents());
    }
}
