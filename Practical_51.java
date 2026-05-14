import java.util.*;

class Practical_51
{
    static <T extends Comparable<T>> void sortList(List<T> list)
    {
        Collections.sort(list);
    }

    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(78);
        numbers.add(23);

        System.out.println("Before Sorting Numbers: " + numbers);
        sortList(numbers);
        System.out.println("After Sorting Numbers: " + numbers);

        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Priya");
        names.add("Amit");
        names.add("Yug");

        System.out.println("\nBefore Sorting Names: " + names);
        sortList(names);
        System.out.println("After Sorting Names: " + names);
    }
}