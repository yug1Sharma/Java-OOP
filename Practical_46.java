import java.util.ArrayList;
import java.util.Collections;

class Practical_46
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");


        ArrayList<Integer> marks = new ArrayList<>();

        // Add at least 5 marks
        marks.add(75);
        marks.add(88);
        marks.add(92);
        marks.add(67);
        marks.add(81);

        // Display all marks
        System.out.println("Marks: " + marks);

        // Highest and Lowest
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
    }
}