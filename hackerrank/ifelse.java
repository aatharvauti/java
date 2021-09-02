import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifelse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        String ANS = new String();
        
        if(N%2==1 || (N>=6 && N <= 20)){
            ANS = "Weird";
        } else {
            ANS = "Not Weird";
        }
        
        System.out.println(ANS);
    }
}
