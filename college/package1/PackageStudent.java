package package1;
import java.util.*;

public class PackageStudent {

    int regno;
    String name;

    public void getdata(int r, String s)
    {
        regno = r;
        name = s;
    }

    public void putdata()
    {
        System.out.println("Registration Number: " + regno);
        System.out.println("Name: " + name);
    }

}
