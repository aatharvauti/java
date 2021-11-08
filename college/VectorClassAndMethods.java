import java.lang.*;
import java.util.Vector;
import java.util.Enumeration;
class VectorClassAndMethods
{
public static void main(String arg[])
{
Vector v=new Vector();
v.addElement("one");
v.addElement("two");
v.addElement("three");
v.insertElementAt("zero",0);
v.insertElementAt("oops",3);
v.insertElementAt("four",5);
System.out.println("Vector Size :"+v.size());
System.out.println("Vector apacity :"+v.capacity());
System.out.println("The elements of a vector are :");
Enumeration e=v.elements();
while(e.hasMoreElements())

System.out.println(e.nextElement() +" ");
System.out.println();
System.out.println("The first element is : " +v.firstElement());
System.out.println("The last element is : " +v.lastElement());
System.out.println("The object oops is found at position : "+v.indexOf("oops"));
v.removeElement("oops");
v.removeElementAt(1);
System.out.println("After removing 2 elements ");
System.out.println("Vector Size :"+v.size());
System.out.println("The elements of vector are :");
for(int i=0;i<v.size();i++)
System.out.println(v.elementAt(i)+" ");
}
}