import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Practical_42
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");


        if (args.length < 1)
        {
            System.out.println("Please provide file name as command-line argument.");
            return;
        }

        String fileName = args[0];

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null)
            {
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0)
                {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);
        }
        catch (IOException e)
        {
            System.out.println("Error: File not found or cannot be read.");
        }
    }
}