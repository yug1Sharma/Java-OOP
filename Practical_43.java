import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class Practical_43
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");


        FileWriter fw = null;
        BufferedReader br = null;

        try
        {
            // Create and write to file
            fw = new FileWriter("students.txt");

            fw.write("101 Rahul 85\n");
            fw.write("102 Priya 90\n");
            fw.write("103 Amit 78\n");

            fw.close();

            // Read from file
            br = new BufferedReader(new FileReader("students.txt"));

            String line;

            System.out.println("Student Records:");

            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            try
            {
                if (fw != null)
                    fw.close();

                if (br != null)
                    br.close();
            }
            catch (IOException e)
            {
                System.out.println("Error closing file.");
            }

            System.out.println("File operation completed.");
        }
    }
}