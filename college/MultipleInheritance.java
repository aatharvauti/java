
import java.lang.*;

interface Citizen
{
    String Name = "Mr. XYZ";
    abstract void showCitizen();
}

interface Employee
{
    int SSN = 4444;
    int salary = 80000;
    abstract void showEmployee();
}

class Professor implements Citizen, Employee
{
    int publications=50;
    
    public void showCitizen()
    {
        System.out.println("Name: " + Name);
    }
    
    public void showEmployee()
    {
        System.out.println("SSN: " + SSN);
        System.out.println("Salary: " + salary);
    }
    public void showProfessor()
    {
        System.out.println("Publications: " + publications);
    }
}

public class MultipleInheritance {
    public static void main(String args[])
    {
        Professor pro = new Professor();
        pro.showCitizen();
        pro.showEmployee();
        pro.showProfessor();
    }
}
