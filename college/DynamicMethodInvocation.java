class MethodOverloadingClass 
{
    void display(int a, int b) 
    { 
        int result = a + b; 
        System.out.println("The sum of 2 integers is:" +result); 
    }
    
    void display(double a, double b)
    { 
        double result = a + b;
        System.out.println("The sum of 2 floating numbers is: " + result);
    }
    
    void display(int a, int b, int c)
    {
        int result = a + b + c;
        System.out.println("The sum of 3 integers is: " + result); 
    } 
    
    void display(int a, double b) 
    {
        double result = a + b; 
        System.out.println("The sum an integer with a floating number is: " + result); 
    }
}

class MethodOverloading 
{
    public static void main(String d[]) 
    {
        MethodOverloadingClass obj = new MethodOverloadingClass();
   
        obj.display(6,9); 
        obj.display(9.11,4.20); 
        obj.display(6,6,6); 
        obj.display(1,3.14); 
    }
}


