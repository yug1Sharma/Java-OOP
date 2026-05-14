import java.io.*;
import java.util.Date;

class Practical_45
{
    public static void main(String[] args)
    {
	System.out.println("Yug Sharma");
	System.out.println("250393107013");


        if (args.length < 2)
        {
            System.out.println("Invalid arguments.");
            return;
        }

        String command = args[0];

        try
        {
            if (command.equalsIgnoreCase("copy"))
            {
                if (args.length != 3)
                {
                    System.out.println("Usage: copy source destination");
                    return;
                }

                File source = new File(args[1]);
                File dest = new File(args[2]);

                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(dest);

                int ch;
                while ((ch = fis.read()) != -1)
                {
                    fos.write(ch);
                }

                fis.close();
                fos.close();

                System.out.println("File copied successfully.");
                displayProperties(dest);
            }
            else if (command.equalsIgnoreCase("delete"))
            {
                File file = new File(args[1]);

                if (file.delete())
                {
                    System.out.println("File deleted successfully.");
                }
                else
                {
                    System.out.println("Unable to delete file.");
                }
            }
            else if (command.equalsIgnoreCase("rename"))
            {
                if (args.length != 3)
                {
                    System.out.println("Usage: rename old new");
                    return;
                }

                File oldFile = new File(args[1]);
                File newFile = new File(args[2]);

                if (oldFile.renameTo(newFile))
                {
                    System.out.println("File renamed successfully.");
                    displayProperties(newFile);
                }
                else
                {
                    System.out.println("Rename failed.");
                }
            }
            else
            {
                System.out.println("Invalid command.");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found.");
        }
        catch (IOException e)
        {
            System.out.println("Error: File operation failed.");
        }
    }

    static void displayProperties(File file)
    {
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last Modified: " + new Date(file.lastModified()));
    }
}