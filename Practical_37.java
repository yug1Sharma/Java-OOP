class BookNotAvailableException extends Exception
{
    BookNotAvailableException(String message)
    {
        super(message);
    }
}

class Library
{
    int availableBooks;

    Library(int books)
    {
        availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException
    {
        if (count <= availableBooks)
        {
            availableBooks = availableBooks - count;
            System.out.println("Book issued successfully");
        }
        else
        {
            throw new BookNotAvailableException("Requested books not available");
        }
    }

    void displayBooks()
    {
        System.out.println("Available Books: " + availableBooks);
    }
}

class Practical_37
{
    public static void main(String[] args)
    {

	System.out.println("Yug Sharma");
	System.out.println("250393107013");

        Library lib = new Library(3);

        try
        {
            lib.displayBooks();

            lib.issueBook(2);
            lib.displayBooks();

            lib.issueBook(2); // This will throw exception
        }
        catch (BookNotAvailableException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}