import java.util.*;
class matrix
{
    public static void main(String args[])
    {
        int m, n, p, q, sum = 0, i, j, k;
        Scanner sc = new Scanner(System.in);
        
        // 1st Matrix
        System.out.println("\nEnter the number of Rows (i) and Columns (j) of the 1st Martix: ");
        m = sc.nextInt();
        n = sc.nextInt();
        
        int first[][] = new int[m][n];
        System.out.println("\nEnter the elements of 1st Matrix:\n");
        
        for(i = 0; i < m; i++) {
            for(j = 0; j < n; j++) {
                first[i][j] = sc.nextInt();
            }
        }

        // 2nd Matrix
        System.out.println("\nEnter the number of Rows (i) and Columns (j) of the 2nd Martix: ");
        p=sc.nextInt();
        q=sc.nextInt();
        
        int second[][]=new int[p][q];
        System.out.println("\nEnter the elements of 2nd Matrix:");
        
        for(i = 0; i < p; i++) {
            for(j = 0; j < q; j++) {
                second[i][j] = sc.nextInt();
            }
        }


        // Print out elements 
        System.out.println("\n\n1st Matrix:\n");
        for(i = 0; i < m; i++) {
            for(j = 0; j < n; j++) {
                System.out.print(first[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("\n\n2nd Matrix:\n");
        for(i = 0; i < p; i++) {
            for(j = 0; j < q; j++) {
                System.out.print(second[i][j]+" ");
            }
            System.out.println("\n");
        }


        // Multiplication
        int prod[][]=new int[m][q];

        System.out.println("\n\nProduct of the Matrices:\n");
        for(i = 0; i < m; i++) {
            for(j = 0; j < q; j++) {
                for(k = 0; k < p; k++) {
                    sum = sum + first[i][k]*second[k][j];
                }
                prod[i][j] = sum;
                sum = 0;
            }
        }

        for(i = 0; i < m; i++) {
            for(j = 0; j < q; j++) {
                System.out.print(prod[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}