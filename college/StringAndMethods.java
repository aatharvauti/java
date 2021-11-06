// Java code to illustrate different constructors and methods
// String class.

import java.io.*;
import java.util.*;
class StringAndMethods
{
	public static void main (String[] args)
	{
		String s = "I use Java";

		// .length returns the length of string
		System.out.println("String length: " + s.length());

		// .charAt returns the character at the given index.
		System.out.println("Character at 4th position: " + s.charAt(4));

		// .substring returns a substring 
		// from the character at given index to the end of the string
		System.out.println("Substring: " + s.substring(4));

		// .substring can also return the substring 
		// from given index to a given index
		// if specified
		System.out.println("Substring: " + s.substring(2,5));

		// .concat concatenates 2 strings
		String s1 = "I like";
		String s2 = "Java";
		System.out.println("Concatenated string: " + s1.concat(s2));

		// .indexOf returns the index within the string
		// of the first occurrence of the specified string
		String s4 = "Java works cross-platform";
		System.out.println("Index of Java: " + s4.indexOf("Java"));

		// .indexOf also returns the index within the string of the
		// first occurrence of the specified string,
		// starting at the specified index
		System.out.println("Index of a: " + s4.indexOf('a',3));

		// .equals checks the equality of strings
		Boolean out = "I like".equals("I LIKE"); // bool to return true or false
		System.out.println("1. Checking Equality: " + out); // returns false
		
		out = "I like Java".equals("I like Java");
		System.out.println("2. Checking Equality: " + out); // returns true

		// .equalsIgnoreCase ignores case
		out = "I like Java".equalsIgnoreCase("I LIKE JAVA");
		System.out.println("3. Checking Equality: " + out); // returns true

		// if ASCII difference is zero then the two strings are similar
		int out_diff = s1.compareTo(s2);

		System.out.println("The difference between ASCII value is: "+ out_diff);

		// .toLowerCase converts the string to Lowercase
		String s5 = "I like Java";
		System.out.println("Lower Case: " + s5.toLowerCase());

		// .toUpperCase converts the string to UpperCase
		String s6 = "I like Java";
		System.out.println("Upper Case: " + s6.toUpperCase());

		// .trim returns a copy of the string, with leading and trailing whitespace omitted
		String s7 = "        I like Java ";
		System.out.println("Trim: " + s7.trim());

		// Replacing characters
		String s8 = "Coxdpxay";
		System.out.println("Original String: " + s8);

		String s9 = s8.replace('x' ,'l') ;
		System.out.println("Replaced x with l: " + s9);
	}
}
