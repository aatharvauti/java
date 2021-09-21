import java.util.*;
class booth
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int a[] = {0,0,0,0};
		int Q1 = 0, m1, q1;
		int count=4;
		
		System.out.println("Enter 2 Numbers: ");
		m1 = sc.nextInt();
		q1 = sc.nextInt();

		
		int m[] = new int[4];
		int m2[] = new int[4];
		int q[] = new int[4];

		decimal(m1,m);
		decimal(q1,q);

		for(int i=count;i > 0;i--)
		{
			for(int j=0;j < 4;j++)
			{
				m2[j]=m[j];
			}
			if(q[3]==0 && Q1==1)
			{
				a=add(a,m2);
				display(a,q,Q1,m);
				System.out.println();
			}
			if((q[3]==1&&Q1==1)||(q[3]==0&&Q1==0))
			{}
			if(q[3]==1 && Q1==0)
			{
				int c[]=comp(m2);
				a=add(a,c);
				display(a,q,Q1,m);
				System.out.println();
			}

			Q1=q[3];
			shift(a,q);
			display(a,q,Q1,m);
			System.out.println();
		}
	}
	
	static void decimal(int t,int m[])
	{
		int i=0, c = 0;
		int a[] = new int[100];
		for(i = 0; i < 3; i++, t = t/2)
		{
			a[i]=t%2; 
			c++;
		}
		for(int j=c,b=0;j >= 0;j--,b++)
			m[b]=a[j];
	}
	
	static void display(int a[],int q[],int Q1,int m[])
	{
		for(int i=0;i < 4;i++)
			System.out.print(a[i]);
		System.out.print("\t");
		for(int i=0;i < 4;i++)
			System.out.print(q[i]);
		System.out.print("\t");
		System.out.print(Q1);
		System.out.print("\t");
	}

	static int[] add(int a[],int m1[])
	{
		int carry=0;
		int sum[]=new int [4];
		for(int i=3;i >= 0;i--)
		{
			sum[i]=(a[i]+m1[i]+carry)%2;
			carry=(a[i]+m1[i]+carry)/2;
		}
		return sum;
	}
	
	static int[] comp(int m1[])
	{
		int z[]={0,0,0,1};
		for(int i=0;i < 4;i++)
		{
			if(m1[i]==0)
				m1[i]=1;
			else
				m1[i]=0;
		}
		int c[]=add(m1,z);
		return c;
	}
	
	static void shift(int a[],int q[])
	{
		int b=a[3];
		for(int i=2;i >= 0;i--)
		{
			a[i+1]=a[i];
			q[i+1]=q[i]; 
		}
		q[0]=b;
	}
}
