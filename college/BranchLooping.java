import java.util.*;

public class BranchLooping
{
    public static void main(String[] args) {
        // Define Variables
        int i, j, b, n; 
        // n is the number to perform operations on
        // b is the choice of operation to be performed
        String c;
        // c for the choice to continue the program [y/n]
        int fact = 1;
        Scanner sc = new Scanner(System.in);

        // Ask User to Enter a Number to perform operations on
        System.out.println("Enter a Number");
        n = sc.nextInt();

        do
        {
            System.out.println("Select the operation to perform: ");
            System.out.println("1. Factorial");
            System.out.println("2. Print Pattern");

            b = sc.nextInt();

            switch(b)
            {
                case 1:
                    for(i = 1; i <= n; i++)
                    {
                        fact = fact * i;
                    }
                    System.out.println("Factorial of "+ n +" is: "+fact);
                    break;

                case 2:
                    for(i = 1; i <= n; i++)
                    {
                        for(j = 1; j <= i; j++)
                        {
                            System.out.print("*");
                        }
                    System.out.print("\n");
                    }
                    break;

                default:
                    System.out.println("Please Enter a Valid Option");
            }
            System.out.println("Do you want to Continue? [y/n]");
            c = sc.next();
        }
        while(c.equals("y"));
    }
}