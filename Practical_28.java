class Practical_28
{
    public static void main(String[] args)
    {
        Result r = new Result();

        int marks = 50;
        double avg = 65.5;

        System.out.println("Passed: " + r.isPassed(marks));
        System.out.println("Division: " + r.getDivision(avg));
    }
}

interface Exam
{
    boolean isPassed(int mark);
}

interface Classify
{
    String getDivision(double average);
}

class Result implements Exam, Classify
{
    public boolean isPassed(int mark)
    {
        if (mark >= 40)
            return true;
        else
            return false;
    }

    public String getDivision(double average)
    {
        if (average >= 60)
            return "First Division";
        else
            return "No Division";
    }
}