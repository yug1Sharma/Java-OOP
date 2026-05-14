import java.util.ArrayList;

class Box<T>
{
    ArrayList<T> items = new ArrayList<>();

    void addItem(T item)
    {
        items.add(item);
    }

    void displayItems()
    {
        for (T item : items)
        {
            System.out.println(item);
        }
    }
}

class Practical_49
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        Box<String> nameBox = new Box<>();
        nameBox.addItem("Rahul");
        nameBox.addItem("Priya");
        nameBox.addItem("Amit");

        System.out.println("Names:");
        nameBox.displayItems();

        Box<Integer> rollBox = new Box<>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);

        System.out.println("\nRoll Numbers:");
        rollBox.displayItems();
    }
}