class Student 
{
    String name, location; 
    int postcode; 
    
    Student()  
    { 
        name = "Virat"; 
        location = "Mumbai"; 
        postcode = 400002;
    }
    
    Student(String name, String location,int postcode)
    {
        this.name = name;
        this.location = location; 
        this.postcode = postcode; 
    }    
    
    void display()
    {
        System.out.println(name +"\t"+ location + "\t" + postcode); 
    }
}

class Constructors 
{
    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Rohit", "Mumbai", 400001); 
        s1.display(); 
        s2.display();
    } 
}