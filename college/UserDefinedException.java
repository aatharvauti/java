import java.lang.*;
import java.io.*;
import java.util.*;

class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

class UserDefinedException {
    public static void main(String args[])
    {
        int age;
        DataInputStream ds = new DataInputStream(System.in);

        try
        {
            System.out.println("Enter your age: (above 18 and below 25)");
            age = Integer.parseInt(ds.readLine());
            if (age < 18 || age > 25)
            {
                throw new MyException("ERR: Entered number is not in the given range");
            }
            System.out.println("Your age: " + age);
        }
        catch(MyException e)
        {
            System.out.println("Caught MyException");
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }    
}
