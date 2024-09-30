package day05_28_09_2024.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoThrows
{
    public static void checkFile(String path) throws IOException
    {
        File f = new File(path);
        if (!f.exists()) {
            throw new IOException("File is Not Present");
        }
    }

    public static void main(String[] args)

    {
        try
        {
            File f = new File("data.txt");
            if (!f.exists())
            {
                throw new IOException("File is Not Present");
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            checkFile("abc.text");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
