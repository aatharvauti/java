import java.util.*;

import package1.PackageStudent; // package is a collection of similar types of classes

public class PackageImport {
    public static void main(String arg[])
    {
        PackageStudent s = new PackageStudent();
        s.getdata(4444, "Atharva Auti");
        s.putdata();
    }
}