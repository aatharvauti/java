import java.lang.*;

class College
{
    College()
    {
        System.out.println("SAKEC");
    }
}

// Single level inheritance
class Department extends College
{
    Department()
    {
        System.out.println("Department of Cyber Security");
    }
}

// Multi level inheritance
class Employee extends Department
{
    int SSN;
    String employeeName;
    Employee(int SSN, String empName)
    {
        this.SSN = SSN;
        this.employeeName = empName;
        System.out.println("SSN: " + SSN);
        System.out.println("Employee Name: " + employeeName);
    }
}

// Hierarchical inheritance
class Student extends Department
{
    int rollNo;
    String studentName;
    Student(int rollNo, String studentName)
    {
        this.rollNo = rollNo;
        this.studentName = studentName;
        System.out.println("Roll no: " + rollNo);
        System.out.println("Student Name: " + studentName);
    }
}

public class InheritanceTypes {
    public static void main(String arg[])
    {
        System.out.println("Single Inheritance");
        Department dept=new Department();
        
        System.out.println("Multi level Inheritance");
        Employee emp=new Employee(4444, "Prof. XYZ");

        System.out.println("Hierarchical Inheritance");
        Student stn=new Student(1, "Mst. ABC");
    }    
}
