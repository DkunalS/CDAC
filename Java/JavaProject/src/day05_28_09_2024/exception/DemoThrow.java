package day05_28_09_2024.exception;

import java.io.File;
import java.io.IOException;

public class DemoThrow
{
    public static void main(String[] args)
    {
        try
        {
            File f = new File("data.txt");
            if(!f.exists())
            {
                throw new IOException("File is Not Present");
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
