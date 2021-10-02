import java.util.*;
class RestoringDivison
{
    public static void lshift(int a[],int q[])
    {
        for(int i = 0; i < 3; i++) {
        a[i]=a[i+1];
        }
        a[3]=q[0];
        
        for(int i = 0; i < 3; i++) {
        q[i]=q[i+1];
        }
        q[3]=0;
    }

    public static int[] add(int a[],int m1[])
    {
        int carry = 0;
        int sum[] = new int [4];
        
        for(int i = 3; i >= 0; i--) {
            sum[i] = (a[i]+m1[i]+carry)%2;
            carry = (a[i]+m1[i]+carry)/2;
        }

    return sum;
    }

    public static int[] comp2(int m1[])
    {
        int z[]={0,0,0,1};
        
        for(int i = 0; i < 3; i++) {
            if(m1[i] == 0)
                m1[i]=1;
            else
                m1[i]=0;
        }

        m1 = add(m1,z);
        
        return m1;
    }

    public static void display(int a[], int q[], int m[])
    {
        for(int i = 0; i < 4; i++) {
            System.out.print(a[i]);
        }
        System.out.print("\t");

        for(int i = 0; i < 4; i++) {
            System.out.print(q[i]);
        }
        System.out.print("\t");

        for(int i = 0; i < 4; i++) {
            System.out.print(m[i]);
        }
        System.out.print("\t");
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = {0,0,0,0};
        int m[] = new int[4];
        int q[] = new int[4];
        int count = 4;
        int m1[] = new int[4];
        
        System.out.println("ENTER DIVISOR:");
        for(int i = 0; i <= 3; i++) {
            m[i] = sc.nextInt();
        }

        System.out.println("ENTER DIVIDEND:");
        for(int i = 0; i <= 3; i++) {
            q[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("A  \t  Q  \t  M  \tOperation");
        display(a,q,m);
        System.out.print("Initial\n");

        for(int i = count; i > 0 ; i--) {
        
            for(int j = 0; j < 4; j++) {
                m1[j] = m[j];
            }

            lshift(a,q);
            display(a,q,m);
            System.out.print("Shift\n");

            int c[] = new int[4];
            c = comp2(m1);
            a = add(a,c);
            display(a,q,m);
            System.out.print("Subtract\n");
            
            if(a[0]==1) {
                q[3]=0;
                a=add(a,m);
                display(a,q,m);
                System.out.print("Restore\n");
            }
            else {
                q[3]=1;
                display(a,q,m);
                System.out.print("Set Q0=1\n");
            }
        }
    }
}