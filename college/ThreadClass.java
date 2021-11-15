import java.lang.Thread;

class A extends Thread 
{
	public void run() 
	{	
		System.out.println("Thread A has started");

		for(int i = 1; i <= 5; i++)
			System.out.println("\tFrom Thread A: i = " + i);

		System.out.println("Thread A: EXIT");
	}
}

class B extends Thread 
{
	public void run() 
	{	
		System.out.println("Thread B has started");

		for(int j = 1; j <= 5; j++)
			System.out.println("\tFrom Thread B: j = " + j);

		System.out.println("Thread B: EXIT");
	}
}

class C extends Thread 
{
	public void run() 
	{	
		System.out.println("Thread C has started");

		for(int k = 1; k <= 5; k++)
			System.out.println("\tFrom Thread C: k = " + k);

		System.out.println("Thread C: EXIT");
	}
}

class ThreadClass
{
	public static void main(String arg[])
	{
		new A().start();
		new B().start();
		new C().start();
	}
}