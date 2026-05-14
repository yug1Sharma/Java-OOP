import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class Practical_44
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");


        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        BufferedReader br = null;

        try
        {
            br = new BufferedReader(new FileReader("Intro.txt"));

            String line;

            while ((line = br.readLine()) != null)
            {
                lineCount++;

                String trimmed = line.trim();

                if (trimmed.length() > 0)
                {
                    String[] words = trimmed.split("\\s+");
                    wordCount += words.length;
                }

                for (int i = 0; i < line.length(); i++)
                {
                    char ch = line.charAt(i);

                    if (ch != ' ' && ch != '\t')
                    {
                        charCount++;
                    }
                }
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces/newlines): " + charCount);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        }
        catch (IOException e)
        {
            System.out.println("Error reading file.");
        }
        finally
        {
            try
            {
                if (br != null)
                    br.close();
            }
            catch (IOException e)
            {
                System.out.println("Error closing file.");
            }

            System.out.println("File processing completed.");
        }
    }
}