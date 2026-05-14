import java.util.LinkedList;

class Practical_50
{
    static <T> boolean searchElement(LinkedList<T> list, T element)
    {
        return list.contains(element);
    }

    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");


        LinkedList<Integer> rollList = new LinkedList<>();
        rollList.add(101);
        rollList.add(102);
        rollList.add(103);

        System.out.println(searchElement(rollList, 102));
        System.out.println(searchElement(rollList, 105));

        LinkedList<String> nameList = new LinkedList<>();
        nameList.add("Rahul");
        nameList.add("Priya");
        nameList.add("Amit");

        System.out.println(searchElement(nameList, "Priya"));
        System.out.println(searchElement(nameList, "Yug"));
    }
}