import java.util.*;

public class UnsignedRightShift {
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive value for x: ");
        a = sc.nextInt();
        System.out.println("Enter a negative value for y: ");
        b = sc.nextInt();
        System.out.println(a >>> 2);
        System.out.println(b >>> 24);
    }
}
