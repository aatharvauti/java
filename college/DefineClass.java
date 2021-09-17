import java.lang.*;

class Employee
{
    String name;
    int id;
    String address;
    
    void getdata(String name, int id, String address)
    {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    void putdata()
    {
        System.out.println("Employee Data: ");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Address: " + address);
    }
}

class DefineClass {
    
    public static void main(String args[]) 
    {
        Employee e = new Employee();
        e.getdata("Atharva",69420,"Mumbai");
        e.putdata();
    }
}
